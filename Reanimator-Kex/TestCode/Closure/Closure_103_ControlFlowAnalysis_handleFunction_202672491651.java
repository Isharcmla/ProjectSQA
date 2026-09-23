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

public class ControlFlowAnalysis_handleFunction_202672491651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1336;
     Object term1393;

    public ControlFlowAnalysis_handleFunction_202672491651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1338 = new HashMap();
        Object term1345 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1345, term1345.getClass(), "elementData", null);
        setIntField(term1345, term1345.getClass(), "size", 202214133);
        setIntField(term1345, term1345.getClass(), "modCount", 1543091617);
        Object term1348 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1348, term1348.getClass(), "elementData", null);
        setIntField(term1348, term1348.getClass(), "size", -763166094);
        setIntField(term1348, term1348.getClass(), "modCount", -222941705);
        Object term1351 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1351, term1351.getClass(), "elementData", null);
        setIntField(term1351, term1351.getClass(), "size", 291864719);
        setIntField(term1351, term1351.getClass(), "modCount", -1549607466);
        Object term1354 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1354, term1354.getClass(), "elementData", null);
        setIntField(term1354, term1354.getClass(), "size", 853609788);
        setIntField(term1354, term1354.getClass(), "modCount", -197820800);
        Object term1357 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1357, term1357.getClass(), "elementData", null);
        setIntField(term1357, term1357.getClass(), "size", 723812297);
        setIntField(term1357, term1357.getClass(), "modCount", 1639448749);
        Object term1360 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1360, term1360.getClass(), "elementData", null);
        setIntField(term1360, term1360.getClass(), "size", 873659088);
        setIntField(term1360, term1360.getClass(), "modCount", -975748721);
        ArrayDeque term1343 = new ArrayDeque();
        ((ArrayDeque) term1343).add(term1345);
        ((ArrayDeque) term1343).add(term1348);
        ((ArrayDeque) term1343).add(term1351);
        ((ArrayDeque) term1343).add(term1354);
        ((ArrayDeque) term1343).add(term1357);
        ((ArrayDeque) term1343).add(term1360);
        Object term1367 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1367, term1367.getClass(), "elementData", null);
        setIntField(term1367, term1367.getClass(), "size", 433248783);
        setIntField(term1367, term1367.getClass(), "modCount", -507944154);
        ArrayDeque term1365 = new ArrayDeque();
        ((ArrayDeque) term1365).add(term1367);
        HashMap term1372 = new HashMap();
        HashMap term1385 = new HashMap();
        term1336 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1337 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1336, term1336.getClass(), "compiler", null);
        setField(term1337, term1337.getClass(), "implicitReturn", null);
        setField(term1337, term1337.getClass(), "entry", null);
        setField(term1337, term1337.getClass(), "nodes", term1338);
        setField(term1337, term1337.getClass(), "nodeAnnotationStack", term1343);
        setField(term1337, term1337.getClass(), "edgeAnnotationStack", term1365);
        setField(term1336, term1336.getClass(), "cfg", term1337);
        setField(term1336, term1336.getClass(), "astPosition", term1372);
        setField(term1336, term1336.getClass(), "nodePriorities", term1385);
        setField(term1336, term1336.getClass(), "priorityComparator", null);
        setIntField(term1336, term1336.getClass(), "astPositionCounter", 0);
        setIntField(term1336, term1336.getClass(), "priorityCounter", 0);
        setBooleanField(term1336, term1336.getClass(), "shouldTraverseFunctions", false);
        setField(term1336, term1336.getClass(), "root", null);
        setField(term1336, term1336.getClass(), "exceptionHandler", null);
        setField(term1336, term1336.getClass(), "finallyMap", null);
        term1393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1406 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1416 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1393, term1393.getClass(), "type", -1097563716);
        setIntField(term1395, term1395.getClass(), "type", -2143043890);
        setIntField(term1397, term1397.getClass(), "type", 0);
        setField(term1397, term1397.getClass(), "next", null);
        setField(term1397, term1397.getClass(), "first", null);
        setField(term1397, term1397.getClass(), "last", null);
        setField(term1397, term1397.getClass(), "propListHead", null);
        setIntField(term1397, term1397.getClass(), "sourcePosition", 0);
        setField(term1397, term1397.getClass(), "jsType", null);
        setField(term1397, term1397.getClass(), "parent", null);
        setField(term1395, term1395.getClass(), "next", term1397);
        setIntField(term1400, term1400.getClass(), "type", 0);
        setField(term1400, term1400.getClass(), "next", null);
        setField(term1400, term1400.getClass(), "first", null);
        setField(term1400, term1400.getClass(), "last", null);
        setField(term1400, term1400.getClass(), "propListHead", null);
        setIntField(term1400, term1400.getClass(), "sourcePosition", 0);
        setField(term1400, term1400.getClass(), "jsType", null);
        setField(term1400, term1400.getClass(), "parent", null);
        setField(term1395, term1395.getClass(), "first", term1400);
        setIntField(term1403, term1403.getClass(), "type", 0);
        setField(term1403, term1403.getClass(), "next", null);
        setField(term1403, term1403.getClass(), "first", null);
        setField(term1403, term1403.getClass(), "last", null);
        setField(term1403, term1403.getClass(), "propListHead", null);
        setIntField(term1403, term1403.getClass(), "sourcePosition", 0);
        setField(term1403, term1403.getClass(), "jsType", null);
        setField(term1403, term1403.getClass(), "parent", null);
        setField(term1395, term1395.getClass(), "last", term1403);
        setField(term1406, term1406.getClass(), "next", null);
        setIntField(term1406, term1406.getClass(), "type", 0);
        setIntField(term1406, term1406.getClass(), "intValue", 0);
        setField(term1406, term1406.getClass(), "objectValue", null);
        setField(term1395, term1395.getClass(), "propListHead", term1406);
        setIntField(term1395, term1395.getClass(), "sourcePosition", -27944011);
        setField(term1395, term1395.getClass(), "jsType", null);
        setField(term1395, term1395.getClass(), "parent", null);
        setField(term1393, term1393.getClass(), "next", term1395);
        setIntField(term1410, term1410.getClass(), "type", 0);
        setField(term1410, term1410.getClass(), "next", null);
        setField(term1410, term1410.getClass(), "first", null);
        setField(term1410, term1410.getClass(), "last", null);
        setField(term1410, term1410.getClass(), "propListHead", null);
        setIntField(term1410, term1410.getClass(), "sourcePosition", 0);
        setField(term1410, term1410.getClass(), "jsType", null);
        setField(term1410, term1410.getClass(), "parent", null);
        setField(term1393, term1393.getClass(), "first", term1410);
        setIntField(term1413, term1413.getClass(), "type", 0);
        setField(term1413, term1413.getClass(), "next", null);
        setField(term1413, term1413.getClass(), "first", null);
        setField(term1413, term1413.getClass(), "last", null);
        setField(term1413, term1413.getClass(), "propListHead", null);
        setIntField(term1413, term1413.getClass(), "sourcePosition", 0);
        setField(term1413, term1413.getClass(), "jsType", null);
        setField(term1413, term1413.getClass(), "parent", null);
        setField(term1393, term1393.getClass(), "last", term1413);
        setField(term1416, term1416.getClass(), "next", null);
        setIntField(term1416, term1416.getClass(), "type", 0);
        setIntField(term1416, term1416.getClass(), "intValue", 0);
        setField(term1416, term1416.getClass(), "objectValue", null);
        setField(term1393, term1393.getClass(), "propListHead", term1416);
        setIntField(term1393, term1393.getClass(), "sourcePosition", -20614472);
        setField(term1393, term1393.getClass(), "jsType", null);
        setField(term1393, term1393.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1393;
        try {
            callMethod(klass, "handleFunction", argTypes, term1336, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


