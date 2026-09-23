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

public class ControlFlowAnalysis_handleIf_175960467942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term637;

    public ControlFlowAnalysis_handleIf_175960467942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term573 = new HashMap();
        Object term580 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term580, term580.getClass(), "elementData", null);
        setIntField(term580, term580.getClass(), "size", -1885090354);
        setIntField(term580, term580.getClass(), "modCount", -2066804303);
        Object term583 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term583, term583.getClass(), "elementData", null);
        setIntField(term583, term583.getClass(), "size", -1731761810);
        setIntField(term583, term583.getClass(), "modCount", 197109649);
        Object term586 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term586, term586.getClass(), "elementData", null);
        setIntField(term586, term586.getClass(), "size", -1239406390);
        setIntField(term586, term586.getClass(), "modCount", 1557431527);
        Object term589 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term589, term589.getClass(), "elementData", null);
        setIntField(term589, term589.getClass(), "size", -1504890659);
        setIntField(term589, term589.getClass(), "modCount", 1358829571);
        Object term592 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term592, term592.getClass(), "elementData", null);
        setIntField(term592, term592.getClass(), "size", 991356662);
        setIntField(term592, term592.getClass(), "modCount", -506958186);
        Object term595 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term595, term595.getClass(), "elementData", null);
        setIntField(term595, term595.getClass(), "size", -507387516);
        setIntField(term595, term595.getClass(), "modCount", -1970452551);
        ArrayDeque term578 = new ArrayDeque();
        ((ArrayDeque) term578).add(term580);
        ((ArrayDeque) term578).add(term583);
        ((ArrayDeque) term578).add(term586);
        ((ArrayDeque) term578).add(term589);
        ((ArrayDeque) term578).add(term592);
        ((ArrayDeque) term578).add(term595);
        Object term602 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term602, term602.getClass(), "elementData", null);
        setIntField(term602, term602.getClass(), "size", -1896376975);
        setIntField(term602, term602.getClass(), "modCount", 729658803);
        Object term605 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term605, term605.getClass(), "elementData", null);
        setIntField(term605, term605.getClass(), "size", 114754804);
        setIntField(term605, term605.getClass(), "modCount", 1687361082);
        Object term608 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term608, term608.getClass(), "elementData", null);
        setIntField(term608, term608.getClass(), "size", 584893196);
        setIntField(term608, term608.getClass(), "modCount", 497269071);
        Object term611 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term611, term611.getClass(), "elementData", null);
        setIntField(term611, term611.getClass(), "size", -1899301124);
        setIntField(term611, term611.getClass(), "modCount", -1882480155);
        ArrayDeque term600 = new ArrayDeque();
        ((ArrayDeque) term600).add(term602);
        ((ArrayDeque) term600).add(term605);
        ((ArrayDeque) term600).add(term608);
        ((ArrayDeque) term600).add(term611);
        ((ArrayDeque) term600).add(term611);
        ((ArrayDeque) term600).add(term583);
        ((ArrayDeque) term600).add(term592);
        HashMap term616 = new HashMap();
        HashMap term629 = new HashMap();
        term571 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term572 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term571, term571.getClass(), "compiler", null);
        setField(term572, term572.getClass(), "implicitReturn", null);
        setField(term572, term572.getClass(), "entry", null);
        setField(term572, term572.getClass(), "nodes", term573);
        setField(term572, term572.getClass(), "nodeAnnotationStack", term578);
        setField(term572, term572.getClass(), "edgeAnnotationStack", term600);
        setField(term571, term571.getClass(), "cfg", term572);
        setField(term571, term571.getClass(), "astPosition", term616);
        setField(term571, term571.getClass(), "nodePriorities", term629);
        setField(term571, term571.getClass(), "priorityComparator", null);
        setIntField(term571, term571.getClass(), "astPositionCounter", 0);
        setIntField(term571, term571.getClass(), "priorityCounter", 0);
        setBooleanField(term571, term571.getClass(), "shouldTraverseFunctions", false);
        setField(term571, term571.getClass(), "root", null);
        setField(term571, term571.getClass(), "exceptionHandler", null);
        setField(term571, term571.getClass(), "finallyMap", null);
        term637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term650 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term637, term637.getClass(), "type", -1310015129);
        setIntField(term639, term639.getClass(), "type", -165587447);
        setIntField(term641, term641.getClass(), "type", 0);
        setField(term641, term641.getClass(), "next", null);
        setField(term641, term641.getClass(), "first", null);
        setField(term641, term641.getClass(), "last", null);
        setField(term641, term641.getClass(), "propListHead", null);
        setIntField(term641, term641.getClass(), "sourcePosition", 0);
        setField(term641, term641.getClass(), "jsType", null);
        setField(term641, term641.getClass(), "parent", null);
        setField(term639, term639.getClass(), "next", term641);
        setIntField(term644, term644.getClass(), "type", 0);
        setField(term644, term644.getClass(), "next", null);
        setField(term644, term644.getClass(), "first", null);
        setField(term644, term644.getClass(), "last", null);
        setField(term644, term644.getClass(), "propListHead", null);
        setIntField(term644, term644.getClass(), "sourcePosition", 0);
        setField(term644, term644.getClass(), "jsType", null);
        setField(term644, term644.getClass(), "parent", null);
        setField(term639, term639.getClass(), "first", term644);
        setIntField(term647, term647.getClass(), "type", 0);
        setField(term647, term647.getClass(), "next", null);
        setField(term647, term647.getClass(), "first", null);
        setField(term647, term647.getClass(), "last", null);
        setField(term647, term647.getClass(), "propListHead", null);
        setIntField(term647, term647.getClass(), "sourcePosition", 0);
        setField(term647, term647.getClass(), "jsType", null);
        setField(term647, term647.getClass(), "parent", null);
        setField(term639, term639.getClass(), "last", term647);
        setField(term650, term650.getClass(), "next", null);
        setIntField(term650, term650.getClass(), "type", 0);
        setIntField(term650, term650.getClass(), "intValue", 0);
        setField(term650, term650.getClass(), "objectValue", null);
        setField(term639, term639.getClass(), "propListHead", term650);
        setIntField(term639, term639.getClass(), "sourcePosition", 548228925);
        setField(term639, term639.getClass(), "jsType", null);
        setField(term639, term639.getClass(), "parent", null);
        setField(term637, term637.getClass(), "next", term639);
        setIntField(term654, term654.getClass(), "type", 0);
        setField(term654, term654.getClass(), "next", null);
        setField(term654, term654.getClass(), "first", null);
        setField(term654, term654.getClass(), "last", null);
        setField(term654, term654.getClass(), "propListHead", null);
        setIntField(term654, term654.getClass(), "sourcePosition", 0);
        setField(term654, term654.getClass(), "jsType", null);
        setField(term654, term654.getClass(), "parent", null);
        setField(term637, term637.getClass(), "first", term654);
        setIntField(term657, term657.getClass(), "type", 0);
        setField(term657, term657.getClass(), "next", null);
        setField(term657, term657.getClass(), "first", null);
        setField(term657, term657.getClass(), "last", null);
        setField(term657, term657.getClass(), "propListHead", null);
        setIntField(term657, term657.getClass(), "sourcePosition", 0);
        setField(term657, term657.getClass(), "jsType", null);
        setField(term657, term657.getClass(), "parent", null);
        setField(term637, term637.getClass(), "last", term657);
        setField(term660, term660.getClass(), "next", null);
        setIntField(term660, term660.getClass(), "type", 0);
        setIntField(term660, term660.getClass(), "intValue", 0);
        setField(term660, term660.getClass(), "objectValue", null);
        setField(term637, term637.getClass(), "propListHead", term660);
        setIntField(term637, term637.getClass(), "sourcePosition", -749861210);
        setField(term637, term637.getClass(), "jsType", null);
        setField(term637, term637.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term637;
        try {
            callMethod(klass, "handleIf", argTypes, term571, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


