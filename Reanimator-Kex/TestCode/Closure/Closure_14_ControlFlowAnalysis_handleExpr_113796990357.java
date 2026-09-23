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

public class ControlFlowAnalysis_handleExpr_113796990357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1506;
     Object term1566;

    public ControlFlowAnalysis_handleExpr_113796990357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1508 = new HashMap();
        Object term1517 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1517, term1517.getClass(), "elementData", null);
        setIntField(term1517, term1517.getClass(), "size", -1840305774);
        setIntField(term1517, term1517.getClass(), "modCount", 1365087144);
        Object term1520 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1520, term1520.getClass(), "elementData", null);
        setIntField(term1520, term1520.getClass(), "size", -1537255112);
        setIntField(term1520, term1520.getClass(), "modCount", 934477462);
        ArrayDeque term1515 = new ArrayDeque();
        ((ArrayDeque) term1515).add(term1517);
        ((ArrayDeque) term1515).add(term1520);
        Object term1527 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1527, term1527.getClass(), "elementData", null);
        setIntField(term1527, term1527.getClass(), "size", 4900410);
        setIntField(term1527, term1527.getClass(), "modCount", -1252345779);
        Object term1530 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1530, term1530.getClass(), "elementData", null);
        setIntField(term1530, term1530.getClass(), "size", -2063365430);
        setIntField(term1530, term1530.getClass(), "modCount", 812570053);
        Object term1533 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1533, term1533.getClass(), "elementData", null);
        setIntField(term1533, term1533.getClass(), "size", -1488938905);
        setIntField(term1533, term1533.getClass(), "modCount", 1916544127);
        Object term1536 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1536, term1536.getClass(), "elementData", null);
        setIntField(term1536, term1536.getClass(), "size", -1133405894);
        setIntField(term1536, term1536.getClass(), "modCount", 1289741214);
        Object term1539 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1539, term1539.getClass(), "elementData", null);
        setIntField(term1539, term1539.getClass(), "size", 243280944);
        setIntField(term1539, term1539.getClass(), "modCount", -726681073);
        ArrayDeque term1525 = new ArrayDeque();
        ((ArrayDeque) term1525).add(term1527);
        ((ArrayDeque) term1525).add(term1530);
        ((ArrayDeque) term1525).add(term1533);
        ((ArrayDeque) term1525).add(term1536);
        ((ArrayDeque) term1525).add(term1539);
        HashMap term1544 = new HashMap();
        HashMap term1557 = new HashMap();
        term1506 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1507 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1506, term1506.getClass(), "compiler", null);
        setField(term1507, term1507.getClass(), "implicitReturn", null);
        setField(term1507, term1507.getClass(), "entry", null);
        setField(term1507, term1507.getClass(), "nodes", term1508);
        setBooleanField(term1507, term1507.getClass(), "useNodeAnnotations", true);
        setBooleanField(term1507, term1507.getClass(), "useEdgeAnnotations", true);
        setField(term1507, term1507.getClass(), "nodeAnnotationStack", term1515);
        setField(term1507, term1507.getClass(), "edgeAnnotationStack", term1525);
        setField(term1506, term1506.getClass(), "cfg", term1507);
        setField(term1506, term1506.getClass(), "astPosition", term1544);
        setField(term1506, term1506.getClass(), "nodePriorities", term1557);
        setField(term1506, term1506.getClass(), "priorityComparator", null);
        setIntField(term1506, term1506.getClass(), "astPositionCounter", 0);
        setIntField(term1506, term1506.getClass(), "priorityCounter", 0);
        setBooleanField(term1506, term1506.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term1506, term1506.getClass(), "edgeAnnotations", false);
        setField(term1506, term1506.getClass(), "root", null);
        setField(term1506, term1506.getClass(), "exceptionHandler", null);
        setField(term1506, term1506.getClass(), "finallyMap", null);
        term1566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1566, term1566.getClass(), "type", 291864719);
        setIntField(term1568, term1568.getClass(), "type", -1549607466);
        setIntField(term1570, term1570.getClass(), "type", 853609788);
        setIntField(term1572, term1572.getClass(), "type", -197820800);
        setIntField(term1574, term1574.getClass(), "type", 723812297);
        setField(term1574, term1574.getClass(), "next", null);
        setField(term1574, term1574.getClass(), "first", null);
        setField(term1574, term1574.getClass(), "last", null);
        setField(term1574, term1574.getClass(), "propListHead", null);
        setIntField(term1574, term1574.getClass(), "sourcePosition", 0);
        setField(term1574, term1574.getClass(), "jsType", null);
        setField(term1574, term1574.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "next", term1574);
        setIntField(term1577, term1577.getClass(), "type", 1639448749);
        setField(term1577, term1577.getClass(), "next", null);
        setField(term1577, term1577.getClass(), "first", null);
        setField(term1577, term1577.getClass(), "last", term1574);
        setField(term1577, term1577.getClass(), "propListHead", null);
        setIntField(term1577, term1577.getClass(), "sourcePosition", 0);
        setField(term1577, term1577.getClass(), "jsType", null);
        setField(term1577, term1577.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "first", term1577);
        setField(term1572, term1572.getClass(), "last", term1570);
        setField(term1572, term1572.getClass(), "propListHead", null);
        setIntField(term1572, term1572.getClass(), "sourcePosition", 0);
        setField(term1572, term1572.getClass(), "jsType", null);
        setField(term1572, term1572.getClass(), "parent", null);
        setField(term1570, term1570.getClass(), "next", term1572);
        setField(term1570, term1570.getClass(), "first", term1574);
        setIntField(term1581, term1581.getClass(), "type", -975748721);
        setIntField(term1583, term1583.getClass(), "type", 433248783);
        setField(term1583, term1583.getClass(), "next", null);
        setField(term1583, term1583.getClass(), "first", term1577);
        setField(term1583, term1583.getClass(), "last", term1572);
        setField(term1583, term1583.getClass(), "propListHead", null);
        setIntField(term1583, term1583.getClass(), "sourcePosition", 0);
        setField(term1583, term1583.getClass(), "jsType", null);
        setField(term1583, term1583.getClass(), "parent", null);
        setField(term1581, term1581.getClass(), "next", term1583);
        setField(term1581, term1581.getClass(), "first", term1568);
        setField(term1581, term1581.getClass(), "last", term1568);
        setField(term1581, term1581.getClass(), "propListHead", null);
        setIntField(term1581, term1581.getClass(), "sourcePosition", 0);
        setField(term1581, term1581.getClass(), "jsType", null);
        setField(term1581, term1581.getClass(), "parent", null);
        setField(term1570, term1570.getClass(), "last", term1581);
        setField(term1570, term1570.getClass(), "propListHead", null);
        setIntField(term1570, term1570.getClass(), "sourcePosition", 0);
        setField(term1570, term1570.getClass(), "jsType", null);
        setField(term1570, term1570.getClass(), "parent", null);
        setField(term1568, term1568.getClass(), "next", term1570);
        setIntField(term1588, term1588.getClass(), "type", -507944154);
        setField(term1588, term1588.getClass(), "next", term1581);
        setField(term1588, term1588.getClass(), "first", term1583);
        setField(term1588, term1588.getClass(), "last", term1566);
        setField(term1588, term1588.getClass(), "propListHead", null);
        setIntField(term1588, term1588.getClass(), "sourcePosition", 0);
        setField(term1588, term1588.getClass(), "jsType", null);
        setField(term1588, term1588.getClass(), "parent", null);
        setField(term1568, term1568.getClass(), "first", term1588);
        setField(term1568, term1568.getClass(), "last", term1588);
        setField(term1568, term1568.getClass(), "propListHead", null);
        setIntField(term1568, term1568.getClass(), "sourcePosition", 0);
        setField(term1568, term1568.getClass(), "jsType", null);
        setField(term1568, term1568.getClass(), "parent", null);
        setField(term1566, term1566.getClass(), "next", term1568);
        setField(term1566, term1566.getClass(), "first", term1572);
        setField(term1566, term1566.getClass(), "last", term1574);
        setField(term1566, term1566.getClass(), "propListHead", null);
        setIntField(term1566, term1566.getClass(), "sourcePosition", 0);
        setField(term1566, term1566.getClass(), "jsType", null);
        setField(term1566, term1566.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1566;
        try {
            callMethod(klass, "handleExpr", argTypes, term1506, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


