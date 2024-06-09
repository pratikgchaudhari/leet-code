package com.leetcode.killprocess;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KillProcessTest {

    @Test
    void shouldKillProcessWhosePIDIsSpecified() {
        KillProcess killProcess = new KillProcess();
        var pids = List.of(1, 2, 3, 4, 5);
        var ppids = List.of(0, 1, 2, 3, 4);

        var kill = 5;
        var killedProcesses = killProcess.killProcess(pids,ppids,kill);

        assertEquals(List.of(5), killedProcesses);
    }

    @Test
    void shouldKillAllChildProcessesAlongWithTheParentProcessWhosePIDIsSpecified() {
        KillProcess killProcess = new KillProcess();
        var pids = List.of(1, 2, 3, 4, 5);
        var ppids = List.of(0, 1, 2, 3, 4);

        var kill = 1;
        var killedProcesses = killProcess.killProcess(pids,ppids,kill);

        assertEquals(List.of(1,2,3,4,5), killedProcesses);
    }
}