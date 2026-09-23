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

public class ControlFlowAnalysis_handleCase_121639230852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1062;
     Object term1131;

    public ControlFlowAnalysis_handleCase_121639230852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1064 = new HashMap();
        Object term1073 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1073, term1073.getClass(), "elementData", null);
        setIntField(term1073, term1073.getClass(), "size", 803925431);
        setIntField(term1073, term1073.getClass(), "modCount", 76929641);
        Object term1076 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1076, term1076.getClass(), "elementData", null);
        setIntField(term1076, term1076.getClass(), "size", -2003192918);
        setIntField(term1076, term1076.getClass(), "modCount", -1362856620);
        Object term1079 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1079, term1079.getClass(), "elementData", null);
        setIntField(term1079, term1079.getClass(), "size", -1835839814);
        setIntField(term1079, term1079.getClass(), "modCount", -1404350380);
        Object term1082 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1082, term1082.getClass(), "elementData", null);
        setIntField(term1082, term1082.getClass(), "size", -2013924238);
        setIntField(term1082, term1082.getClass(), "modCount", 579006268);
        Object term1085 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1085, term1085.getClass(), "elementData", null);
        setIntField(term1085, term1085.getClass(), "size", -1694747156);
        setIntField(term1085, term1085.getClass(), "modCount", 1466373988);
        Object term1088 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1088, term1088.getClass(), "elementData", null);
        setIntField(term1088, term1088.getClass(), "size", -358526505);
        setIntField(term1088, term1088.getClass(), "modCount", 1843268026);
        Object term1091 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1091, term1091.getClass(), "elementData", null);
        setIntField(term1091, term1091.getClass(), "size", 954660603);
        setIntField(term1091, term1091.getClass(), "modCount", -1351605385);
        Object term1094 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1094, term1094.getClass(), "elementData", null);
        setIntField(term1094, term1094.getClass(), "size", 278355793);
        setIntField(term1094, term1094.getClass(), "modCount", -310648604);
        Object term1097 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1097, term1097.getClass(), "elementData", null);
        setIntField(term1097, term1097.getClass(), "size", -648200466);
        setIntField(term1097, term1097.getClass(), "modCount", 2007134147);
        ArrayDeque term1071 = new ArrayDeque();
        ((ArrayDeque) term1071).add(term1073);
        ((ArrayDeque) term1071).add(term1076);
        ((ArrayDeque) term1071).add(term1079);
        ((ArrayDeque) term1071).add(term1082);
        ((ArrayDeque) term1071).add(term1085);
        ((ArrayDeque) term1071).add(term1088);
        ((ArrayDeque) term1071).add(term1091);
        ((ArrayDeque) term1071).add(term1094);
        ((ArrayDeque) term1071).add(term1097);
        Object term1104 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1104, term1104.getClass(), "elementData", null);
        setIntField(term1104, term1104.getClass(), "size", 993388358);
        setIntField(term1104, term1104.getClass(), "modCount", -765191335);
        ArrayDeque term1102 = new ArrayDeque();
        ((ArrayDeque) term1102).add(term1104);
        ((ArrayDeque) term1102).add(term1085);
        ((ArrayDeque) term1102).add(term1088);
        ((ArrayDeque) term1102).add(term1076);
        ((ArrayDeque) term1102).add(term1094);
        ((ArrayDeque) term1102).add(term1097);
        HashMap term1109 = new HashMap();
        HashMap term1122 = new HashMap();
        term1062 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1063 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1062, term1062.getClass(), "compiler", null);
        setField(term1063, term1063.getClass(), "implicitReturn", null);
        setField(term1063, term1063.getClass(), "entry", null);
        setField(term1063, term1063.getClass(), "nodes", term1064);
        setBooleanField(term1063, term1063.getClass(), "useNodeAnnotations", true);
        setBooleanField(term1063, term1063.getClass(), "useEdgeAnnotations", true);
        setField(term1063, term1063.getClass(), "nodeAnnotationStack", term1071);
        setField(term1063, term1063.getClass(), "edgeAnnotationStack", term1102);
        setField(term1062, term1062.getClass(), "cfg", term1063);
        setField(term1062, term1062.getClass(), "astPosition", term1109);
        setField(term1062, term1062.getClass(), "nodePriorities", term1122);
        setField(term1062, term1062.getClass(), "priorityComparator", null);
        setIntField(term1062, term1062.getClass(), "astPositionCounter", 0);
        setIntField(term1062, term1062.getClass(), "priorityCounter", 0);
        setBooleanField(term1062, term1062.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term1062, term1062.getClass(), "edgeAnnotations", false);
        setField(term1062, term1062.getClass(), "root", null);
        setField(term1062, term1062.getClass(), "exceptionHandler", null);
        setField(term1062, term1062.getClass(), "finallyMap", null);
        term1131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1131, term1131.getClass(), "type", -1972436591);
        setIntField(term1133, term1133.getClass(), "type", 68922753);
        setIntField(term1135, term1135.getClass(), "type", -220791533);
        setIntField(term1137, term1137.getClass(), "type", 1741500243);
        setIntField(term1139, term1139.getClass(), "type", -2070466617);
        setField(term1139, term1139.getClass(), "next", null);
        setField(term1139, term1139.getClass(), "first", null);
        setField(term1139, term1139.getClass(), "last", null);
        setField(term1139, term1139.getClass(), "propListHead", null);
        setIntField(term1139, term1139.getClass(), "sourcePosition", 0);
        setField(term1139, term1139.getClass(), "jsType", null);
        setField(term1139, term1139.getClass(), "parent", null);
        setField(term1137, term1137.getClass(), "next", term1139);
        setIntField(term1142, term1142.getClass(), "type", -1127721881);
        setField(term1142, term1142.getClass(), "next", null);
        setField(term1142, term1142.getClass(), "first", null);
        setField(term1142, term1142.getClass(), "last", term1139);
        setField(term1142, term1142.getClass(), "propListHead", null);
        setIntField(term1142, term1142.getClass(), "sourcePosition", 0);
        setField(term1142, term1142.getClass(), "jsType", null);
        setField(term1142, term1142.getClass(), "parent", null);
        setField(term1137, term1137.getClass(), "first", term1142);
        setField(term1137, term1137.getClass(), "last", term1135);
        setField(term1137, term1137.getClass(), "propListHead", null);
        setIntField(term1137, term1137.getClass(), "sourcePosition", 0);
        setField(term1137, term1137.getClass(), "jsType", null);
        setField(term1137, term1137.getClass(), "parent", null);
        setField(term1135, term1135.getClass(), "next", term1137);
        setField(term1135, term1135.getClass(), "first", term1139);
        setIntField(term1146, term1146.getClass(), "type", -146054762);
        setIntField(term1148, term1148.getClass(), "type", 798043553);
        setField(term1148, term1148.getClass(), "next", null);
        setField(term1148, term1148.getClass(), "first", term1142);
        setField(term1148, term1148.getClass(), "last", term1137);
        setField(term1148, term1148.getClass(), "propListHead", null);
        setIntField(term1148, term1148.getClass(), "sourcePosition", 0);
        setField(term1148, term1148.getClass(), "jsType", null);
        setField(term1148, term1148.getClass(), "parent", null);
        setField(term1146, term1146.getClass(), "next", term1148);
        setField(term1146, term1146.getClass(), "first", term1133);
        setField(term1146, term1146.getClass(), "last", term1133);
        setField(term1146, term1146.getClass(), "propListHead", null);
        setIntField(term1146, term1146.getClass(), "sourcePosition", 0);
        setField(term1146, term1146.getClass(), "jsType", null);
        setField(term1146, term1146.getClass(), "parent", null);
        setField(term1135, term1135.getClass(), "last", term1146);
        setField(term1135, term1135.getClass(), "propListHead", null);
        setIntField(term1135, term1135.getClass(), "sourcePosition", 0);
        setField(term1135, term1135.getClass(), "jsType", null);
        setField(term1135, term1135.getClass(), "parent", null);
        setField(term1133, term1133.getClass(), "next", term1135);
        setIntField(term1153, term1153.getClass(), "type", 533197381);
        setField(term1153, term1153.getClass(), "next", term1146);
        setField(term1153, term1153.getClass(), "first", term1148);
        setField(term1153, term1153.getClass(), "last", term1131);
        setField(term1153, term1153.getClass(), "propListHead", null);
        setIntField(term1153, term1153.getClass(), "sourcePosition", 0);
        setField(term1153, term1153.getClass(), "jsType", null);
        setField(term1153, term1153.getClass(), "parent", null);
        setField(term1133, term1133.getClass(), "first", term1153);
        setField(term1133, term1133.getClass(), "last", term1153);
        setField(term1133, term1133.getClass(), "propListHead", null);
        setIntField(term1133, term1133.getClass(), "sourcePosition", 0);
        setField(term1133, term1133.getClass(), "jsType", null);
        setField(term1133, term1133.getClass(), "parent", null);
        setField(term1131, term1131.getClass(), "next", term1133);
        setField(term1131, term1131.getClass(), "first", term1137);
        setField(term1131, term1131.getClass(), "last", term1139);
        setField(term1131, term1131.getClass(), "propListHead", null);
        setIntField(term1131, term1131.getClass(), "sourcePosition", 0);
        setField(term1131, term1131.getClass(), "jsType", null);
        setField(term1131, term1131.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1131;
        try {
            callMethod(klass, "handleCase", argTypes, term1062, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


