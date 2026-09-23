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

public class ControlFlowAnalysis_handleDo_175974498549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795;
     Object term864;

    public ControlFlowAnalysis_handleDo_175974498549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term797 = new HashMap();
        Object term806 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term806, term806.getClass(), "elementData", null);
        setIntField(term806, term806.getClass(), "size", 548228925);
        setIntField(term806, term806.getClass(), "modCount", -749861210);
        Object term809 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term809, term809.getClass(), "elementData", null);
        setIntField(term809, term809.getClass(), "size", 1694224101);
        setIntField(term809, term809.getClass(), "modCount", 937859191);
        Object term812 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term812, term812.getClass(), "elementData", null);
        setIntField(term812, term812.getClass(), "size", -916584829);
        setIntField(term812, term812.getClass(), "modCount", -2131181468);
        Object term815 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term815, term815.getClass(), "elementData", null);
        setIntField(term815, term815.getClass(), "size", 282916351);
        setIntField(term815, term815.getClass(), "modCount", 880977281);
        Object term818 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term818, term818.getClass(), "elementData", null);
        setIntField(term818, term818.getClass(), "size", 371943306);
        setIntField(term818, term818.getClass(), "modCount", 982388293);
        Object term821 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term821, term821.getClass(), "elementData", null);
        setIntField(term821, term821.getClass(), "size", -159494544);
        setIntField(term821, term821.getClass(), "modCount", -75206835);
        Object term824 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term824, term824.getClass(), "elementData", null);
        setIntField(term824, term824.getClass(), "size", -1618206977);
        setIntField(term824, term824.getClass(), "modCount", -1747406163);
        Object term827 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term827, term827.getClass(), "elementData", null);
        setIntField(term827, term827.getClass(), "size", 388157121);
        setIntField(term827, term827.getClass(), "modCount", 1684998508);
        Object term830 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term830, term830.getClass(), "elementData", null);
        setIntField(term830, term830.getClass(), "size", -1476644457);
        setIntField(term830, term830.getClass(), "modCount", 1270666529);
        ArrayDeque term804 = new ArrayDeque();
        ((ArrayDeque) term804).add(term806);
        ((ArrayDeque) term804).add(term809);
        ((ArrayDeque) term804).add(term812);
        ((ArrayDeque) term804).add(term815);
        ((ArrayDeque) term804).add(term818);
        ((ArrayDeque) term804).add(term821);
        ((ArrayDeque) term804).add(term824);
        ((ArrayDeque) term804).add(term827);
        ((ArrayDeque) term804).add(term830);
        Object term837 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term837, term837.getClass(), "elementData", null);
        setIntField(term837, term837.getClass(), "size", -1146679443);
        setIntField(term837, term837.getClass(), "modCount", -860131894);
        ArrayDeque term835 = new ArrayDeque();
        ((ArrayDeque) term835).add(term837);
        ((ArrayDeque) term835).add(term827);
        ((ArrayDeque) term835).add(term830);
        ((ArrayDeque) term835).add(term812);
        ((ArrayDeque) term835).add(term809);
        HashMap term842 = new HashMap();
        HashMap term855 = new HashMap();
        term795 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term796 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term795, term795.getClass(), "compiler", null);
        setField(term796, term796.getClass(), "implicitReturn", null);
        setField(term796, term796.getClass(), "entry", null);
        setField(term796, term796.getClass(), "nodes", term797);
        setBooleanField(term796, term796.getClass(), "useNodeAnnotations", true);
        setBooleanField(term796, term796.getClass(), "useEdgeAnnotations", true);
        setField(term796, term796.getClass(), "nodeAnnotationStack", term804);
        setField(term796, term796.getClass(), "edgeAnnotationStack", term835);
        setField(term795, term795.getClass(), "cfg", term796);
        setField(term795, term795.getClass(), "astPosition", term842);
        setField(term795, term795.getClass(), "nodePriorities", term855);
        setField(term795, term795.getClass(), "priorityComparator", null);
        setIntField(term795, term795.getClass(), "astPositionCounter", 0);
        setIntField(term795, term795.getClass(), "priorityCounter", 0);
        setBooleanField(term795, term795.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term795, term795.getClass(), "edgeAnnotations", false);
        setField(term795, term795.getClass(), "root", null);
        setField(term795, term795.getClass(), "exceptionHandler", null);
        setField(term795, term795.getClass(), "finallyMap", null);
        term864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term864, term864.getClass(), "type", -1692331299);
        setIntField(term866, term866.getClass(), "type", 479531250);
        setIntField(term868, term868.getClass(), "type", 1320570890);
        setIntField(term870, term870.getClass(), "type", -130649791);
        setIntField(term872, term872.getClass(), "type", 534834644);
        setField(term872, term872.getClass(), "next", null);
        setField(term872, term872.getClass(), "first", null);
        setField(term872, term872.getClass(), "last", null);
        setField(term872, term872.getClass(), "propListHead", null);
        setIntField(term872, term872.getClass(), "sourcePosition", 0);
        setField(term872, term872.getClass(), "jsType", null);
        setField(term872, term872.getClass(), "parent", null);
        setField(term870, term870.getClass(), "next", term872);
        setIntField(term875, term875.getClass(), "type", 1959097203);
        setField(term875, term875.getClass(), "next", null);
        setField(term875, term875.getClass(), "first", null);
        setField(term875, term875.getClass(), "last", term872);
        setField(term875, term875.getClass(), "propListHead", null);
        setIntField(term875, term875.getClass(), "sourcePosition", 0);
        setField(term875, term875.getClass(), "jsType", null);
        setField(term875, term875.getClass(), "parent", null);
        setField(term870, term870.getClass(), "first", term875);
        setField(term870, term870.getClass(), "last", term868);
        setField(term870, term870.getClass(), "propListHead", null);
        setIntField(term870, term870.getClass(), "sourcePosition", 0);
        setField(term870, term870.getClass(), "jsType", null);
        setField(term870, term870.getClass(), "parent", null);
        setField(term868, term868.getClass(), "next", term870);
        setField(term868, term868.getClass(), "first", term872);
        setIntField(term879, term879.getClass(), "type", 477625804);
        setIntField(term881, term881.getClass(), "type", 252575029);
        setField(term881, term881.getClass(), "next", null);
        setField(term881, term881.getClass(), "first", term875);
        setField(term881, term881.getClass(), "last", term870);
        setField(term881, term881.getClass(), "propListHead", null);
        setIntField(term881, term881.getClass(), "sourcePosition", 0);
        setField(term881, term881.getClass(), "jsType", null);
        setField(term881, term881.getClass(), "parent", null);
        setField(term879, term879.getClass(), "next", term881);
        setField(term879, term879.getClass(), "first", term866);
        setField(term879, term879.getClass(), "last", term866);
        setField(term879, term879.getClass(), "propListHead", null);
        setIntField(term879, term879.getClass(), "sourcePosition", 0);
        setField(term879, term879.getClass(), "jsType", null);
        setField(term879, term879.getClass(), "parent", null);
        setField(term868, term868.getClass(), "last", term879);
        setField(term868, term868.getClass(), "propListHead", null);
        setIntField(term868, term868.getClass(), "sourcePosition", 0);
        setField(term868, term868.getClass(), "jsType", null);
        setField(term868, term868.getClass(), "parent", null);
        setField(term866, term866.getClass(), "next", term868);
        setIntField(term886, term886.getClass(), "type", 57189932);
        setField(term886, term886.getClass(), "next", term879);
        setField(term886, term886.getClass(), "first", term881);
        setField(term886, term886.getClass(), "last", term864);
        setField(term886, term886.getClass(), "propListHead", null);
        setIntField(term886, term886.getClass(), "sourcePosition", 0);
        setField(term886, term886.getClass(), "jsType", null);
        setField(term886, term886.getClass(), "parent", null);
        setField(term866, term866.getClass(), "first", term886);
        setField(term866, term866.getClass(), "last", term886);
        setField(term866, term866.getClass(), "propListHead", null);
        setIntField(term866, term866.getClass(), "sourcePosition", 0);
        setField(term866, term866.getClass(), "jsType", null);
        setField(term866, term866.getClass(), "parent", null);
        setField(term864, term864.getClass(), "next", term866);
        setField(term864, term864.getClass(), "first", term870);
        setField(term864, term864.getClass(), "last", term872);
        setField(term864, term864.getClass(), "propListHead", null);
        setIntField(term864, term864.getClass(), "sourcePosition", 0);
        setField(term864, term864.getClass(), "jsType", null);
        setField(term864, term864.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term864;
        try {
            callMethod(klass, "handleDo", argTypes, term795, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


