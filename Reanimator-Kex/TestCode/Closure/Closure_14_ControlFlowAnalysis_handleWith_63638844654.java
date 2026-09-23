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

public class ControlFlowAnalysis_handleWith_63638844654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1245;
     Object term1305;

    public ControlFlowAnalysis_handleWith_63638844654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1247 = new HashMap();
        Object term1256 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1256, term1256.getClass(), "elementData", null);
        setIntField(term1256, term1256.getClass(), "size", 794568325);
        setIntField(term1256, term1256.getClass(), "modCount", -434468428);
        Object term1259 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1259, term1259.getClass(), "elementData", null);
        setIntField(term1259, term1259.getClass(), "size", 1559605714);
        setIntField(term1259, term1259.getClass(), "modCount", 1146601902);
        Object term1262 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1262, term1262.getClass(), "elementData", null);
        setIntField(term1262, term1262.getClass(), "size", -1938881385);
        setIntField(term1262, term1262.getClass(), "modCount", -1629418973);
        ArrayDeque term1254 = new ArrayDeque();
        ((ArrayDeque) term1254).add(term1256);
        ((ArrayDeque) term1254).add(term1259);
        ((ArrayDeque) term1254).add(term1262);
        Object term1269 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1269, term1269.getClass(), "elementData", null);
        setIntField(term1269, term1269.getClass(), "size", -100825168);
        setIntField(term1269, term1269.getClass(), "modCount", 768407648);
        Object term1272 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1272, term1272.getClass(), "elementData", null);
        setIntField(term1272, term1272.getClass(), "size", -350454594);
        setIntField(term1272, term1272.getClass(), "modCount", -1148142995);
        Object term1275 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1275, term1275.getClass(), "elementData", null);
        setIntField(term1275, term1275.getClass(), "size", -233024044);
        setIntField(term1275, term1275.getClass(), "modCount", 1820784228);
        Object term1278 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term1278, term1278.getClass(), "elementData", null);
        setIntField(term1278, term1278.getClass(), "size", 1390820006);
        setIntField(term1278, term1278.getClass(), "modCount", -828982065);
        ArrayDeque term1267 = new ArrayDeque();
        ((ArrayDeque) term1267).add(term1269);
        ((ArrayDeque) term1267).add(term1272);
        ((ArrayDeque) term1267).add(term1275);
        ((ArrayDeque) term1267).add(term1278);
        HashMap term1283 = new HashMap();
        HashMap term1296 = new HashMap();
        term1245 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term1246 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1245, term1245.getClass(), "compiler", null);
        setField(term1246, term1246.getClass(), "implicitReturn", null);
        setField(term1246, term1246.getClass(), "entry", null);
        setField(term1246, term1246.getClass(), "nodes", term1247);
        setBooleanField(term1246, term1246.getClass(), "useNodeAnnotations", false);
        setBooleanField(term1246, term1246.getClass(), "useEdgeAnnotations", false);
        setField(term1246, term1246.getClass(), "nodeAnnotationStack", term1254);
        setField(term1246, term1246.getClass(), "edgeAnnotationStack", term1267);
        setField(term1245, term1245.getClass(), "cfg", term1246);
        setField(term1245, term1245.getClass(), "astPosition", term1283);
        setField(term1245, term1245.getClass(), "nodePriorities", term1296);
        setField(term1245, term1245.getClass(), "priorityComparator", null);
        setIntField(term1245, term1245.getClass(), "astPositionCounter", 0);
        setIntField(term1245, term1245.getClass(), "priorityCounter", 0);
        setBooleanField(term1245, term1245.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term1245, term1245.getClass(), "edgeAnnotations", false);
        setField(term1245, term1245.getClass(), "root", null);
        setField(term1245, term1245.getClass(), "exceptionHandler", null);
        setField(term1245, term1245.getClass(), "finallyMap", null);
        term1305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1305, term1305.getClass(), "type", 2063762142);
        setIntField(term1307, term1307.getClass(), "type", 1658391716);
        setIntField(term1309, term1309.getClass(), "type", 2143282300);
        setIntField(term1311, term1311.getClass(), "type", 1137624258);
        setIntField(term1313, term1313.getClass(), "type", 977862393);
        setField(term1313, term1313.getClass(), "next", null);
        setField(term1313, term1313.getClass(), "first", null);
        setField(term1313, term1313.getClass(), "last", null);
        setField(term1313, term1313.getClass(), "propListHead", null);
        setIntField(term1313, term1313.getClass(), "sourcePosition", 0);
        setField(term1313, term1313.getClass(), "jsType", null);
        setField(term1313, term1313.getClass(), "parent", null);
        setField(term1311, term1311.getClass(), "next", term1313);
        setIntField(term1316, term1316.getClass(), "type", 301401782);
        setField(term1316, term1316.getClass(), "next", null);
        setField(term1316, term1316.getClass(), "first", null);
        setField(term1316, term1316.getClass(), "last", term1313);
        setField(term1316, term1316.getClass(), "propListHead", null);
        setIntField(term1316, term1316.getClass(), "sourcePosition", 0);
        setField(term1316, term1316.getClass(), "jsType", null);
        setField(term1316, term1316.getClass(), "parent", null);
        setField(term1311, term1311.getClass(), "first", term1316);
        setField(term1311, term1311.getClass(), "last", term1309);
        setField(term1311, term1311.getClass(), "propListHead", null);
        setIntField(term1311, term1311.getClass(), "sourcePosition", 0);
        setField(term1311, term1311.getClass(), "jsType", null);
        setField(term1311, term1311.getClass(), "parent", null);
        setField(term1309, term1309.getClass(), "next", term1311);
        setField(term1309, term1309.getClass(), "first", term1313);
        setIntField(term1320, term1320.getClass(), "type", 808203320);
        setIntField(term1322, term1322.getClass(), "type", -544382127);
        setField(term1322, term1322.getClass(), "next", null);
        setField(term1322, term1322.getClass(), "first", term1316);
        setField(term1322, term1322.getClass(), "last", term1311);
        setField(term1322, term1322.getClass(), "propListHead", null);
        setIntField(term1322, term1322.getClass(), "sourcePosition", 0);
        setField(term1322, term1322.getClass(), "jsType", null);
        setField(term1322, term1322.getClass(), "parent", null);
        setField(term1320, term1320.getClass(), "next", term1322);
        setField(term1320, term1320.getClass(), "first", term1307);
        setField(term1320, term1320.getClass(), "last", term1307);
        setField(term1320, term1320.getClass(), "propListHead", null);
        setIntField(term1320, term1320.getClass(), "sourcePosition", 0);
        setField(term1320, term1320.getClass(), "jsType", null);
        setField(term1320, term1320.getClass(), "parent", null);
        setField(term1309, term1309.getClass(), "last", term1320);
        setField(term1309, term1309.getClass(), "propListHead", null);
        setIntField(term1309, term1309.getClass(), "sourcePosition", 0);
        setField(term1309, term1309.getClass(), "jsType", null);
        setField(term1309, term1309.getClass(), "parent", null);
        setField(term1307, term1307.getClass(), "next", term1309);
        setIntField(term1327, term1327.getClass(), "type", -1830198043);
        setField(term1327, term1327.getClass(), "next", term1320);
        setField(term1327, term1327.getClass(), "first", term1322);
        setField(term1327, term1327.getClass(), "last", term1305);
        setField(term1327, term1327.getClass(), "propListHead", null);
        setIntField(term1327, term1327.getClass(), "sourcePosition", 0);
        setField(term1327, term1327.getClass(), "jsType", null);
        setField(term1327, term1327.getClass(), "parent", null);
        setField(term1307, term1307.getClass(), "first", term1327);
        setField(term1307, term1307.getClass(), "last", term1327);
        setField(term1307, term1307.getClass(), "propListHead", null);
        setIntField(term1307, term1307.getClass(), "sourcePosition", 0);
        setField(term1307, term1307.getClass(), "jsType", null);
        setField(term1307, term1307.getClass(), "parent", null);
        setField(term1305, term1305.getClass(), "next", term1307);
        setField(term1305, term1305.getClass(), "first", term1311);
        setField(term1305, term1305.getClass(), "last", term1313);
        setField(term1305, term1305.getClass(), "propListHead", null);
        setIntField(term1305, term1305.getClass(), "sourcePosition", 0);
        setField(term1305, term1305.getClass(), "jsType", null);
        setField(term1305, term1305.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1305;
        try {
            callMethod(klass, "handleWith", argTypes, term1245, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


