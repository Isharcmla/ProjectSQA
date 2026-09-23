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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RenameVars_reusePreviouslyUsedVariableMap_185263154315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1269;

    public RenameVars_reusePreviouslyUsedVariableMap_185263154315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1283 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1272, term1272.getClass(), "type", -1034506028);
        setIntField(term1274, term1274.getClass(), "type", -1347665717);
        setField(term1274, term1274.getClass(), "next", null);
        setField(term1274, term1274.getClass(), "first", null);
        setField(term1274, term1274.getClass(), "last", null);
        setField(term1274, term1274.getClass(), "propListHead", null);
        setIntField(term1274, term1274.getClass(), "sourcePosition", -1888585309);
        setField(term1274, term1274.getClass(), "jsType", null);
        setField(term1274, term1274.getClass(), "parent", null);
        setField(term1272, term1272.getClass(), "next", term1274);
        setIntField(term1277, term1277.getClass(), "type", 0);
        setField(term1277, term1277.getClass(), "next", null);
        setField(term1277, term1277.getClass(), "first", null);
        setField(term1277, term1277.getClass(), "last", null);
        setField(term1277, term1277.getClass(), "propListHead", null);
        setIntField(term1277, term1277.getClass(), "sourcePosition", 0);
        setField(term1277, term1277.getClass(), "jsType", null);
        setField(term1277, term1277.getClass(), "parent", null);
        setField(term1272, term1272.getClass(), "first", term1277);
        setIntField(term1280, term1280.getClass(), "type", 0);
        setField(term1280, term1280.getClass(), "next", null);
        setField(term1280, term1280.getClass(), "first", null);
        setField(term1280, term1280.getClass(), "last", null);
        setField(term1280, term1280.getClass(), "propListHead", null);
        setIntField(term1280, term1280.getClass(), "sourcePosition", 0);
        setField(term1280, term1280.getClass(), "jsType", null);
        setField(term1280, term1280.getClass(), "parent", null);
        setField(term1272, term1272.getClass(), "last", term1280);
        setField(term1283, term1283.getClass(), "next", null);
        setIntField(term1283, term1283.getClass(), "type", 0);
        setIntField(term1283, term1283.getClass(), "intValue", 0);
        setField(term1283, term1283.getClass(), "objectValue", null);
        setField(term1272, term1272.getClass(), "propListHead", term1283);
        setIntField(term1272, term1272.getClass(), "sourcePosition", 683666002);
        setField(term1272, term1272.getClass(), "jsType", null);
        setField(term1272, term1272.getClass(), "parent", null);
        Object term1287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1287, term1287.getClass(), "type", 0);
        setField(term1287, term1287.getClass(), "next", null);
        setField(term1287, term1287.getClass(), "first", null);
        setField(term1287, term1287.getClass(), "last", null);
        setField(term1287, term1287.getClass(), "propListHead", null);
        setIntField(term1287, term1287.getClass(), "sourcePosition", 0);
        setField(term1287, term1287.getClass(), "jsType", null);
        setField(term1287, term1287.getClass(), "parent", null);
        ArrayList term1270 = new ArrayList();
        ((ArrayList) term1270).add(term1272);
        ((ArrayList) term1270).add(term1287);
        Object term1294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1294, term1294.getClass(), "type", 0);
        setField(term1294, term1294.getClass(), "next", null);
        setField(term1294, term1294.getClass(), "first", null);
        setField(term1294, term1294.getClass(), "last", null);
        setField(term1294, term1294.getClass(), "propListHead", null);
        setIntField(term1294, term1294.getClass(), "sourcePosition", 0);
        setField(term1294, term1294.getClass(), "jsType", null);
        setField(term1294, term1294.getClass(), "parent", null);
        Object term1297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1297, term1297.getClass(), "type", 0);
        setField(term1297, term1297.getClass(), "next", null);
        setField(term1297, term1297.getClass(), "first", null);
        setField(term1297, term1297.getClass(), "last", null);
        setField(term1297, term1297.getClass(), "propListHead", null);
        setIntField(term1297, term1297.getClass(), "sourcePosition", 0);
        setField(term1297, term1297.getClass(), "jsType", null);
        setField(term1297, term1297.getClass(), "parent", null);
        ArrayList term1292 = new ArrayList();
        ((ArrayList) term1292).add(term1294);
        ((ArrayList) term1292).add(term1297);
        ((ArrayList) term1292).add(term1287);
        ArrayList term1302 = new ArrayList();
        ((ArrayList) term1302).add("bLPjGVBhlX");
        ((ArrayList) term1302).add("whBvTVIIlC");
        ((ArrayList) term1302).add("IgRJUzaCwW");
        ((ArrayList) term1302).add("JUmudUmaaV");
        HashMap term1355 = new HashMap();
        Set<Object> term6223 =  ((Map) term1355).keySet();
        HashSet term1354 = new HashSet((Collection<? extends Object>) term6223);
        HashMap term1378 = new HashMap();
        Set<Object> term6224 =  ((Map) term1378).keySet();
        HashSet term1377 = new HashSet((Collection<? extends Object>) term6224);
        HashMap term1390 = new HashMap();
        term1269 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term1400 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        Object term1414 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1415 = (byte[]) newByteArray(16);
        Object term1434 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1435 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1448 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars$Assignment"));
        char[] term1457 = (char[]) newCharArray(7);
        setField(term1269, term1269.getClass(), "compiler", null);
        setField(term1269, term1269.getClass(), "globalNameNodes", term1270);
        setField(term1269, term1269.getClass(), "localNameNodes", term1292);
        setField(term1269, term1269.getClass(), "localTempNames", term1302);
        setField(term1269, term1269.getClass(), "externNames", term1354);
        setField(term1269, term1269.getClass(), "reservedNames", term1377);
        setField(term1269, term1269.getClass(), "renameMap", term1390);
        setField(term1400, term1400.getClass(), "map", null);
        setField(term1400, term1400.getClass(), "reverseMap", null);
        setField(term1269, term1269.getClass(), "prevUsedRenameMap", term1400);
        setField(term1269, term1269.getClass(), "prefix", "PkWMRdJcBb");
        setIntField(term1269, term1269.getClass(), "assignmentCount", 1596213415);
        setField(term1414, term1414.getClass(), "value", term1415);
        setByteField(term1414, term1414.getClass(), "coder", (byte) 0);
        setIntField(term1414, term1414.getClass(), "count", 0);
        setField(term1269, term1269.getClass(), "assignmentLog", term1414);
        setField(term1434, term1434.getClass(), "comparator", null);
        setField(term1435, term1435.getClass(), "key", "jSpAteRute");
        setField(term1448, term1448.getClass(), "input", null);
        setField(term1448, term1448.getClass(), "oldName", null);
        setIntField(term1448, term1448.getClass(), "orderOfOccurrence", 0);
        setField(term1448, term1448.getClass(), "newName", null);
        setIntField(term1448, term1448.getClass(), "count", 0);
        setField(term1448, term1448.getClass(), "this$0", null);
        setField(term1435, term1435.getClass(), "value", term1448);
        setField(term1435, term1435.getClass(), "left", null);
        setField(term1435, term1435.getClass(), "right", null);
        setField(term1435, term1435.getClass(), "parent", null);
        setBooleanField(term1435, term1435.getClass(), "color", true);
        setField(term1434, term1434.getClass(), "root", term1435);
        setIntField(term1434, term1434.getClass(), "size", 1);
        setIntField(term1434, term1434.getClass(), "modCount", 1);
        setField(term1434, term1434.getClass(), "entrySet", null);
        setField(term1434, term1434.getClass(), "navigableKeySet", null);
        setField(term1434, term1434.getClass(), "descendingMap", null);
        setField(term1434, term1434.getClass(), "keySet", null);
        setField(term1434, term1434.getClass(), "values", null);
        setField(term1269, term1269.getClass(), "assignments", term1434);
        setBooleanField(term1269, term1269.getClass(), "localRenamingOnly", false);
        setBooleanField(term1269, term1269.getClass(), "preserveAnonymousFunctionNames", true);
        setBooleanField(term1269, term1269.getClass(), "generatePseudoNames", true);
        setCharElement(term1457, 0, 'l');
        setCharElement(term1457, 1, 'J');
        setCharElement(term1457, 2, 'A');
        setCharElement(term1457, 3, 'E');
        setCharElement(term1457, 4, 't');
        setCharElement(term1457, 5, 'R');
        setCharElement(term1457, 6, 'r');
        setField(term1269, term1269.getClass(), "reservedCharacters", term1457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reusePreviouslyUsedVariableMap", argTypes, term1269, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


