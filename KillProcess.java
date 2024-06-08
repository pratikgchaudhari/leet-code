import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class KillProcess {

    public static void main(String[] args) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("pids: ");

        var pids = Arrays.stream(stdin.readLine().split(",")).distinct().map(Integer::parseInt).toList();

        System.out.print("\nppids: ");

        var ppids = Arrays.stream(stdin.readLine().split(",")).distinct().map(Integer::parseInt).toList();

        System.out.print("\nkill pid: ");

        var killPid = Integer.parseInt(stdin.readLine());


        var processesToBeKilled = killProcess(pids, ppids, killPid);
        System.out.println(processesToBeKilled);
    }

    static List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {

        var parentChildProcessMapping = new HashMap<Integer, List<Integer>>();

        for(int i = 0; i < ppid.size(); i++) {
            if(!parentChildProcessMapping.containsKey(ppid.get(i))) {
                var childPids = new ArrayList<Integer>();
                childPids.add(pid.get(i));
                parentChildProcessMapping.put(ppid.get(i), childPids);
            } else {
                parentChildProcessMapping.get(ppid.get(i)).add(pid.get(i));
            }
        }

        var childPidsToBeKilled = getChildProcessesOf(kill, parentChildProcessMapping);

        var processesKilled = new ArrayList<Integer>();

        processesKilled.add(kill);

        if(!childPidsToBeKilled.isEmpty()) {
            processesKilled.addAll(childPidsToBeKilled);
        }

        return processesKilled;

    }

    static List<Integer> getChildProcessesOf(Integer pid, Map<Integer, List<Integer>> parentChildProcessMapping) {
        var collatedChildProcesses = new ArrayList<Integer>();

        var childProcesses = parentChildProcessMapping.get(pid);

         if(childProcesses != null && !childProcesses.isEmpty()) {
             collatedChildProcesses.addAll(childProcesses);
             for (Integer childProcess : childProcesses) {
                 collatedChildProcesses.addAll(getChildProcessesOf(childProcess, parentChildProcessMapping));
             }
         }

        return collatedChildProcesses;
    }
}