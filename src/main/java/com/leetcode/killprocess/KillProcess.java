package com.leetcode.killprocess;

import java.util.*;

class KillProcess {

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {

        var parentChildProcessMapping = new HashMap<Integer, List<Integer>>();

        for (int i = 0; i < ppid.size(); i++) {
            if (!parentChildProcessMapping.containsKey(ppid.get(i))) {
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

        if (!childPidsToBeKilled.isEmpty()) {
            processesKilled.addAll(childPidsToBeKilled);
        }

        return processesKilled;

    }

    private List<Integer> getChildProcessesOf(Integer pid, Map<Integer, List<Integer>> parentChildProcessMapping) {
        var collatedChildProcesses = new ArrayList<Integer>();

        var childProcesses = parentChildProcessMapping.get(pid);

        if (childProcesses != null && !childProcesses.isEmpty()) {
            collatedChildProcesses.addAll(childProcesses);
            for (Integer childProcess : childProcesses) {
                collatedChildProcesses.addAll(getChildProcessesOf(childProcess, parentChildProcessMapping));
            }
        }

        return collatedChildProcesses;
    }
}