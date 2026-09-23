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

public class ControlFlowAnalysis_handleThrow_21183022253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1504;
     Object term1570;

    public ControlFlowAnalysis_handleThrow_21183022253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1506 = new HashMap();
        Object term1513 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1513, term1513.getClass(), "elementData", null);
        setIntField(term1513, term1513.getClass(), "size", -1317044799);
        setIntField(term1513, term1513.getClass(), "modCount", -1428063820);
        Object term1516 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1516, term1516.getClass(), "elementData", null);
        setIntField(term1516, term1516.getClass(), "size", -1271375703);
        setIntField(term1516, term1516.getClass(), "modCount", 1136208236);
        Object term1519 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1519, term1519.getClass(), "elementData", null);
        setIntField(term1519, term1519.getClass(), "size", -1220630391);
        setIntField(term1519, term1519.getClass(), "modCount", -995822131);
        Object term1522 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1522, term1522.getClass(), "elementData", null);
        setIntField(term1522, term1522.getClass(), "size", -687282231);
        setIntField(term1522, term1522.getClass(), "modCount", 1200440315);
        Object term1525 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1525, term1525.getClass(), "elementData", null);
        setIntField(term1525, term1525.getClass(), "size", 40571662);
        setIntField(term1525, term1525.getClass(), "modCount", 1863910269);
        Object term1528 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1528, term1528.getClass(), "elementData", null);
        setIntField(term1528, term1528.getClass(), "size", 864645689);
        setIntField(term1528, term1528.getClass(), "modCount", 279384872);
        Object term1531 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1531, term1531.getClass(), "elementData", null);
        setIntField(term1531, term1531.getClass(), "size", 1427305953);
        setIntField(term1531, term1531.getClass(), "modCount", -781832877);
        Object term1534 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1534, term1534.getClass(), "elementData", null);
        setIntField(term1534, term1534.getClass(), "size", 797203987);
        setIntField(term1534, term1534.getClass(), "modCount", 1973060703);
        ArrayDeque term1511 = new ArrayDeque();
        ((ArrayDeque) term1511).add(term1513);
        ((ArrayDeque) term1511).add(term1516);
        ((ArrayDeque) term1511).add(term1519);
        ((ArrayDeque) term1511).add(term1522);
        ((ArrayDeque) term1511).add(term1525);
        ((ArrayDeque) term1511).add(term1528);
        ((ArrayDeque) term1511).add(term1531);
        ((ArrayDeque) term1511).add(term1534);
        Object term1541 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1541, term1541.getClass(), "elementData", null);
        setIntField(term1541, term1541.getClass(), "size", -138239905);
        setIntField(term1541, term1541.getClass(), "modCount", 1709474063);
        Object term1544 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1544, term1544.getClass(), "elementData", null);
        setIntField(term1544, term1544.getClass(), "size", 1406617209);
        setIntField(term1544, term1544.getClass(), "modCount", 1706047059);
        ArrayDeque term1539 = new ArrayDeque();
        ((ArrayDeque) term1539).add(term1541);
        ((ArrayDeque) term1539).add(term1544);
        ((ArrayDeque) term1539).add(term1516);
        ((ArrayDeque) term1539).add(term1525);
        ((ArrayDeque) term1539).add(term1528);
        ((ArrayDeque) term1539).add(term1516);
        HashMap term1549 = new HashMap();
        HashMap term1562 = new HashMap();
        term1504 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1505 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1504, term1504.getClass(), "compiler", null);
        setField(term1505, term1505.getClass(), "implicitReturn", null);
        setField(term1505, term1505.getClass(), "entry", null);
        setField(term1505, term1505.getClass(), "nodes", term1506);
        setField(term1505, term1505.getClass(), "nodeAnnotationStack", term1511);
        setField(term1505, term1505.getClass(), "edgeAnnotationStack", term1539);
        setField(term1504, term1504.getClass(), "cfg", term1505);
        setField(term1504, term1504.getClass(), "astPosition", term1549);
        setField(term1504, term1504.getClass(), "nodePriorities", term1562);
        setField(term1504, term1504.getClass(), "priorityComparator", null);
        setIntField(term1504, term1504.getClass(), "astPositionCounter", 0);
        setIntField(term1504, term1504.getClass(), "priorityCounter", 0);
        setBooleanField(term1504, term1504.getClass(), "shouldTraverseFunctions", false);
        setField(term1504, term1504.getClass(), "root", null);
        setField(term1504, term1504.getClass(), "exceptionHandler", null);
        setField(term1504, term1504.getClass(), "finallyMap", null);
        term1570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1583 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1593 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1570, term1570.getClass(), "type", 1633913667);
        setIntField(term1572, term1572.getClass(), "type", -1626451656);
        setIntField(term1574, term1574.getClass(), "type", 0);
        setField(term1574, term1574.getClass(), "next", null);
        setField(term1574, term1574.getClass(), "first", null);
        setField(term1574, term1574.getClass(), "last", null);
        setField(term1574, term1574.getClass(), "propListHead", null);
        setIntField(term1574, term1574.getClass(), "sourcePosition", 0);
        setField(term1574, term1574.getClass(), "jsType", null);
        setField(term1574, term1574.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "next", term1574);
        setIntField(term1577, term1577.getClass(), "type", 0);
        setField(term1577, term1577.getClass(), "next", null);
        setField(term1577, term1577.getClass(), "first", null);
        setField(term1577, term1577.getClass(), "last", null);
        setField(term1577, term1577.getClass(), "propListHead", null);
        setIntField(term1577, term1577.getClass(), "sourcePosition", 0);
        setField(term1577, term1577.getClass(), "jsType", null);
        setField(term1577, term1577.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "first", term1577);
        setIntField(term1580, term1580.getClass(), "type", 0);
        setField(term1580, term1580.getClass(), "next", null);
        setField(term1580, term1580.getClass(), "first", null);
        setField(term1580, term1580.getClass(), "last", null);
        setField(term1580, term1580.getClass(), "propListHead", null);
        setIntField(term1580, term1580.getClass(), "sourcePosition", 0);
        setField(term1580, term1580.getClass(), "jsType", null);
        setField(term1580, term1580.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "last", term1580);
        setField(term1583, term1583.getClass(), "next", null);
        setIntField(term1583, term1583.getClass(), "type", 0);
        setIntField(term1583, term1583.getClass(), "intValue", 0);
        setField(term1583, term1583.getClass(), "objectValue", null);
        setField(term1572, term1572.getClass(), "propListHead", term1583);
        setIntField(term1572, term1572.getClass(), "sourcePosition", -1005024758);
        setField(term1572, term1572.getClass(), "jsType", null);
        setField(term1572, term1572.getClass(), "parent", null);
        setField(term1570, term1570.getClass(), "next", term1572);
        setIntField(term1587, term1587.getClass(), "type", 0);
        setField(term1587, term1587.getClass(), "next", null);
        setField(term1587, term1587.getClass(), "first", null);
        setField(term1587, term1587.getClass(), "last", null);
        setField(term1587, term1587.getClass(), "propListHead", null);
        setIntField(term1587, term1587.getClass(), "sourcePosition", 0);
        setField(term1587, term1587.getClass(), "jsType", null);
        setField(term1587, term1587.getClass(), "parent", null);
        setField(term1570, term1570.getClass(), "first", term1587);
        setIntField(term1590, term1590.getClass(), "type", 0);
        setField(term1590, term1590.getClass(), "next", null);
        setField(term1590, term1590.getClass(), "first", null);
        setField(term1590, term1590.getClass(), "last", null);
        setField(term1590, term1590.getClass(), "propListHead", null);
        setIntField(term1590, term1590.getClass(), "sourcePosition", 0);
        setField(term1590, term1590.getClass(), "jsType", null);
        setField(term1590, term1590.getClass(), "parent", null);
        setField(term1570, term1570.getClass(), "last", term1590);
        setField(term1593, term1593.getClass(), "next", null);
        setIntField(term1593, term1593.getClass(), "type", 0);
        setIntField(term1593, term1593.getClass(), "intValue", 0);
        setField(term1593, term1593.getClass(), "objectValue", null);
        setField(term1570, term1570.getClass(), "propListHead", term1593);
        setIntField(term1570, term1570.getClass(), "sourcePosition", 2634669);
        setField(term1570, term1570.getClass(), "jsType", null);
        setField(term1570, term1570.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1570;
        try {
            callMethod(klass, "handleThrow", argTypes, term1504, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


