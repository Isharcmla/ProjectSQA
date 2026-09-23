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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayDeque;

public class ControlFlowAnalysis_handleFunction_202672491656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1419;
     Object term1479;

    public ControlFlowAnalysis_handleFunction_202672491656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1421 = new HashMap();
        Object term1430 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1430, term1430.getClass(), "elementData", null);
        setIntField(term1430, term1430.getClass(), "size", 752152965);
        setIntField(term1430, term1430.getClass(), "modCount", -1577069773);
        Object term1433 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1433, term1433.getClass(), "elementData", null);
        setIntField(term1433, term1433.getClass(), "size", -266625190);
        setIntField(term1433, term1433.getClass(), "modCount", 489201218);
        Object term1436 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1436, term1436.getClass(), "elementData", null);
        setIntField(term1436, term1436.getClass(), "size", 464181937);
        setIntField(term1436, term1436.getClass(), "modCount", -1455526612);
        Object term1439 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1439, term1439.getClass(), "elementData", null);
        setIntField(term1439, term1439.getClass(), "size", -941356098);
        setIntField(term1439, term1439.getClass(), "modCount", -201517446);
        Object term1442 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1442, term1442.getClass(), "elementData", null);
        setIntField(term1442, term1442.getClass(), "size", -97742366);
        setIntField(term1442, term1442.getClass(), "modCount", 1638851942);
        Object term1445 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1445, term1445.getClass(), "elementData", null);
        setIntField(term1445, term1445.getClass(), "size", 1374790203);
        setIntField(term1445, term1445.getClass(), "modCount", 1160010161);
        ArrayDeque term1428 = new ArrayDeque();
        ((ArrayDeque) term1428).add(term1430);
        ((ArrayDeque) term1428).add(term1433);
        ((ArrayDeque) term1428).add(term1436);
        ((ArrayDeque) term1428).add(term1439);
        ((ArrayDeque) term1428).add(term1442);
        ((ArrayDeque) term1428).add(term1445);
        Object term1452 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1452, term1452.getClass(), "elementData", null);
        setIntField(term1452, term1452.getClass(), "size", -423900705);
        setIntField(term1452, term1452.getClass(), "modCount", -525570815);
        ArrayDeque term1450 = new ArrayDeque();
        ((ArrayDeque) term1450).add(term1452);
        HashMap term1457 = new HashMap();
        HashMap term1470 = new HashMap();
        term1419 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1420 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1419, term1419.getClass(), "compiler", null);
        setField(term1420, term1420.getClass(), "implicitReturn", null);
        setField(term1420, term1420.getClass(), "entry", null);
        setField(term1420, term1420.getClass(), "nodes", term1421);
        setBooleanField(term1420, term1420.getClass(), "useNodeAnnotations", true);
        setBooleanField(term1420, term1420.getClass(), "useEdgeAnnotations", true);
        setField(term1420, term1420.getClass(), "nodeAnnotationStack", term1428);
        setField(term1420, term1420.getClass(), "edgeAnnotationStack", term1450);
        setField(term1419, term1419.getClass(), "cfg", term1420);
        setField(term1419, term1419.getClass(), "astPosition", term1457);
        setField(term1419, term1419.getClass(), "nodePriorities", term1470);
        setField(term1419, term1419.getClass(), "priorityComparator", null);
        setIntField(term1419, term1419.getClass(), "astPositionCounter", 0);
        setIntField(term1419, term1419.getClass(), "priorityCounter", 0);
        setBooleanField(term1419, term1419.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term1419, term1419.getClass(), "edgeAnnotations", false);
        setField(term1419, term1419.getClass(), "root", null);
        setField(term1419, term1419.getClass(), "exceptionHandler", null);
        setField(term1419, term1419.getClass(), "finallyMap", null);
        term1479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1479, term1479.getClass(), "type", -1867239125);
        setIntField(term1481, term1481.getClass(), "type", 952869601);
        setIntField(term1483, term1483.getClass(), "type", 91958879);
        setIntField(term1485, term1485.getClass(), "type", -645429025);
        setIntField(term1487, term1487.getClass(), "type", -688213483);
        setField(term1487, term1487.getClass(), "next", null);
        setField(term1487, term1487.getClass(), "first", null);
        setField(term1487, term1487.getClass(), "last", null);
        setField(term1487, term1487.getClass(), "propListHead", null);
        setIntField(term1487, term1487.getClass(), "sourcePosition", 0);
        setField(term1487, term1487.getClass(), "jsType", null);
        setField(term1487, term1487.getClass(), "parent", null);
        setField(term1485, term1485.getClass(), "next", term1487);
        setIntField(term1490, term1490.getClass(), "type", 644154104);
        setField(term1490, term1490.getClass(), "next", null);
        setField(term1490, term1490.getClass(), "first", null);
        setField(term1490, term1490.getClass(), "last", term1487);
        setField(term1490, term1490.getClass(), "propListHead", null);
        setIntField(term1490, term1490.getClass(), "sourcePosition", 0);
        setField(term1490, term1490.getClass(), "jsType", null);
        setField(term1490, term1490.getClass(), "parent", null);
        setField(term1485, term1485.getClass(), "first", term1490);
        setField(term1485, term1485.getClass(), "last", term1483);
        setField(term1485, term1485.getClass(), "propListHead", null);
        setIntField(term1485, term1485.getClass(), "sourcePosition", 0);
        setField(term1485, term1485.getClass(), "jsType", null);
        setField(term1485, term1485.getClass(), "parent", null);
        setField(term1483, term1483.getClass(), "next", term1485);
        setField(term1483, term1483.getClass(), "first", term1487);
        setIntField(term1494, term1494.getClass(), "type", 1003743923);
        setIntField(term1496, term1496.getClass(), "type", 1887772522);
        setField(term1496, term1496.getClass(), "next", null);
        setField(term1496, term1496.getClass(), "first", term1490);
        setField(term1496, term1496.getClass(), "last", term1485);
        setField(term1496, term1496.getClass(), "propListHead", null);
        setIntField(term1496, term1496.getClass(), "sourcePosition", 0);
        setField(term1496, term1496.getClass(), "jsType", null);
        setField(term1496, term1496.getClass(), "parent", null);
        setField(term1494, term1494.getClass(), "next", term1496);
        setField(term1494, term1494.getClass(), "first", term1481);
        setField(term1494, term1494.getClass(), "last", term1481);
        setField(term1494, term1494.getClass(), "propListHead", null);
        setIntField(term1494, term1494.getClass(), "sourcePosition", 0);
        setField(term1494, term1494.getClass(), "jsType", null);
        setField(term1494, term1494.getClass(), "parent", null);
        setField(term1483, term1483.getClass(), "last", term1494);
        setField(term1483, term1483.getClass(), "propListHead", null);
        setIntField(term1483, term1483.getClass(), "sourcePosition", 0);
        setField(term1483, term1483.getClass(), "jsType", null);
        setField(term1483, term1483.getClass(), "parent", null);
        setField(term1481, term1481.getClass(), "next", term1483);
        setIntField(term1501, term1501.getClass(), "type", 354196060);
        setField(term1501, term1501.getClass(), "next", term1494);
        setField(term1501, term1501.getClass(), "first", term1496);
        setField(term1501, term1501.getClass(), "last", term1479);
        setField(term1501, term1501.getClass(), "propListHead", null);
        setIntField(term1501, term1501.getClass(), "sourcePosition", 0);
        setField(term1501, term1501.getClass(), "jsType", null);
        setField(term1501, term1501.getClass(), "parent", null);
        setField(term1481, term1481.getClass(), "first", term1501);
        setField(term1481, term1481.getClass(), "last", term1501);
        setField(term1481, term1481.getClass(), "propListHead", null);
        setIntField(term1481, term1481.getClass(), "sourcePosition", 0);
        setField(term1481, term1481.getClass(), "jsType", null);
        setField(term1481, term1481.getClass(), "parent", null);
        setField(term1479, term1479.getClass(), "next", term1481);
        setField(term1479, term1479.getClass(), "first", term1485);
        setField(term1479, term1479.getClass(), "last", term1487);
        setField(term1479, term1479.getClass(), "propListHead", null);
        setIntField(term1479, term1479.getClass(), "sourcePosition", 0);
        setField(term1479, term1479.getClass(), "jsType", null);
        setField(term1479, term1479.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1479;
        try {
            callMethod(klass, "handleFunction", argTypes, term1419, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


