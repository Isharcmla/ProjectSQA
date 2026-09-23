package com.google.javascript.jscomp;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayDeque;

public class ControlFlowAnalysis_handleExpr_113796990352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420;
     Object term1477;

    public ControlFlowAnalysis_handleExpr_113796990352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1422 = new HashMap();
        Object term1429 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1429, term1429.getClass(), "elementData", null);
        setIntField(term1429, term1429.getClass(), "size", 1126618861);
        setIntField(term1429, term1429.getClass(), "modCount", 947449400);
        Object term1432 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1432, term1432.getClass(), "elementData", null);
        setIntField(term1432, term1432.getClass(), "size", -763799087);
        setIntField(term1432, term1432.getClass(), "modCount", 1207142014);
        ArrayDeque term1427 = new ArrayDeque();
        ((ArrayDeque) term1427).add(term1429);
        ((ArrayDeque) term1427).add(term1432);
        Object term1439 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1439, term1439.getClass(), "elementData", null);
        setIntField(term1439, term1439.getClass(), "size", -876426634);
        setIntField(term1439, term1439.getClass(), "modCount", 213831054);
        Object term1442 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1442, term1442.getClass(), "elementData", null);
        setIntField(term1442, term1442.getClass(), "size", 330043745);
        setIntField(term1442, term1442.getClass(), "modCount", -509349195);
        Object term1445 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1445, term1445.getClass(), "elementData", null);
        setIntField(term1445, term1445.getClass(), "size", -1639041228);
        setIntField(term1445, term1445.getClass(), "modCount", 2027686272);
        Object term1448 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1448, term1448.getClass(), "elementData", null);
        setIntField(term1448, term1448.getClass(), "size", -1494356104);
        setIntField(term1448, term1448.getClass(), "modCount", -695279311);
        Object term1451 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1451, term1451.getClass(), "elementData", null);
        setIntField(term1451, term1451.getClass(), "size", 114279242);
        setIntField(term1451, term1451.getClass(), "modCount", 990883365);
        ArrayDeque term1437 = new ArrayDeque();
        ((ArrayDeque) term1437).add(term1439);
        ((ArrayDeque) term1437).add(term1442);
        ((ArrayDeque) term1437).add(term1445);
        ((ArrayDeque) term1437).add(term1448);
        ((ArrayDeque) term1437).add(term1451);
        HashMap term1456 = new HashMap();
        HashMap term1469 = new HashMap();
        term1420 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1421 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1420, term1420.getClass(), "compiler", null);
        setField(term1421, term1421.getClass(), "implicitReturn", null);
        setField(term1421, term1421.getClass(), "entry", null);
        setField(term1421, term1421.getClass(), "nodes", term1422);
        setField(term1421, term1421.getClass(), "nodeAnnotationStack", term1427);
        setField(term1421, term1421.getClass(), "edgeAnnotationStack", term1437);
        setField(term1420, term1420.getClass(), "cfg", term1421);
        setField(term1420, term1420.getClass(), "astPosition", term1456);
        setField(term1420, term1420.getClass(), "nodePriorities", term1469);
        setField(term1420, term1420.getClass(), "priorityComparator", null);
        setIntField(term1420, term1420.getClass(), "astPositionCounter", 0);
        setIntField(term1420, term1420.getClass(), "priorityCounter", 0);
        setBooleanField(term1420, term1420.getClass(), "shouldTraverseFunctions", false);
        setField(term1420, term1420.getClass(), "root", null);
        setField(term1420, term1420.getClass(), "exceptionHandler", null);
        setField(term1420, term1420.getClass(), "finallyMap", null);
        term1477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1490 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1500 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1477, term1477.getClass(), "type", -1539747985);
        setIntField(term1479, term1479.getClass(), "type", -1945635750);
        setIntField(term1481, term1481.getClass(), "type", 0);
        setField(term1481, term1481.getClass(), "next", null);
        setField(term1481, term1481.getClass(), "first", null);
        setField(term1481, term1481.getClass(), "last", null);
        setField(term1481, term1481.getClass(), "propListHead", null);
        setIntField(term1481, term1481.getClass(), "sourcePosition", 0);
        setField(term1481, term1481.getClass(), "jsType", null);
        setField(term1481, term1481.getClass(), "parent", null);
        setField(term1479, term1479.getClass(), "next", term1481);
        setIntField(term1484, term1484.getClass(), "type", 0);
        setField(term1484, term1484.getClass(), "next", null);
        setField(term1484, term1484.getClass(), "first", null);
        setField(term1484, term1484.getClass(), "last", null);
        setField(term1484, term1484.getClass(), "propListHead", null);
        setIntField(term1484, term1484.getClass(), "sourcePosition", 0);
        setField(term1484, term1484.getClass(), "jsType", null);
        setField(term1484, term1484.getClass(), "parent", null);
        setField(term1479, term1479.getClass(), "first", term1484);
        setIntField(term1487, term1487.getClass(), "type", 0);
        setField(term1487, term1487.getClass(), "next", null);
        setField(term1487, term1487.getClass(), "first", null);
        setField(term1487, term1487.getClass(), "last", null);
        setField(term1487, term1487.getClass(), "propListHead", null);
        setIntField(term1487, term1487.getClass(), "sourcePosition", 0);
        setField(term1487, term1487.getClass(), "jsType", null);
        setField(term1487, term1487.getClass(), "parent", null);
        setField(term1479, term1479.getClass(), "last", term1487);
        setField(term1490, term1490.getClass(), "next", null);
        setIntField(term1490, term1490.getClass(), "type", 0);
        setIntField(term1490, term1490.getClass(), "intValue", 0);
        setField(term1490, term1490.getClass(), "objectValue", null);
        setField(term1479, term1479.getClass(), "propListHead", term1490);
        setIntField(term1479, term1479.getClass(), "sourcePosition", -1556527718);
        setField(term1479, term1479.getClass(), "jsType", null);
        setField(term1479, term1479.getClass(), "parent", null);
        setField(term1477, term1477.getClass(), "next", term1479);
        setIntField(term1494, term1494.getClass(), "type", 0);
        setField(term1494, term1494.getClass(), "next", null);
        setField(term1494, term1494.getClass(), "first", null);
        setField(term1494, term1494.getClass(), "last", null);
        setField(term1494, term1494.getClass(), "propListHead", null);
        setIntField(term1494, term1494.getClass(), "sourcePosition", 0);
        setField(term1494, term1494.getClass(), "jsType", null);
        setField(term1494, term1494.getClass(), "parent", null);
        setField(term1477, term1477.getClass(), "first", term1494);
        setIntField(term1497, term1497.getClass(), "type", 0);
        setField(term1497, term1497.getClass(), "next", null);
        setField(term1497, term1497.getClass(), "first", null);
        setField(term1497, term1497.getClass(), "last", null);
        setField(term1497, term1497.getClass(), "propListHead", null);
        setIntField(term1497, term1497.getClass(), "sourcePosition", 0);
        setField(term1497, term1497.getClass(), "jsType", null);
        setField(term1497, term1497.getClass(), "parent", null);
        setField(term1477, term1477.getClass(), "last", term1497);
        setField(term1500, term1500.getClass(), "next", null);
        setIntField(term1500, term1500.getClass(), "type", 0);
        setIntField(term1500, term1500.getClass(), "intValue", 0);
        setField(term1500, term1500.getClass(), "objectValue", null);
        setField(term1477, term1477.getClass(), "propListHead", term1500);
        setIntField(term1477, term1477.getClass(), "sourcePosition", 895255351);
        setField(term1477, term1477.getClass(), "jsType", null);
        setField(term1477, term1477.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1477;
        try {
            callMethod(klass, "handleExpr", argTypes, term1420, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


