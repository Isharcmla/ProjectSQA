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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class ProcessClosurePrimitives_maybeAddStringNodeToSymbolTable_132536986468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10367;
     Object term10457;

    public ProcessClosurePrimitives_maybeAddStringNodeToSymbolTable_132536986468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10371 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term10371, term10371.getClass(), "name", null);
        setField(term10371, term10371.getClass(), "inputs", null);
        setField(term10371, term10371.getClass(), "deps", null);
        setIntField(term10371, term10371.getClass(), "depth", -314165467);
        Object term10373 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term10373, term10373.getClass(), "name", null);
        setField(term10373, term10373.getClass(), "inputs", null);
        setField(term10373, term10373.getClass(), "deps", null);
        setIntField(term10373, term10373.getClass(), "depth", 0);
        Object term10375 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term10375, term10375.getClass(), "name", null);
        setField(term10375, term10375.getClass(), "inputs", null);
        setField(term10375, term10375.getClass(), "deps", null);
        setIntField(term10375, term10375.getClass(), "depth", 1024134939);
        Object term10377 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term10377, term10377.getClass(), "name", null);
        setField(term10377, term10377.getClass(), "inputs", null);
        setField(term10377, term10377.getClass(), "deps", null);
        setIntField(term10377, term10377.getClass(), "depth", 0);
        Object term10379 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term10379, term10379.getClass(), "name", null);
        setField(term10379, term10379.getClass(), "inputs", null);
        setField(term10379, term10379.getClass(), "deps", null);
        setIntField(term10379, term10379.getClass(), "depth", 0);
        Object term10381 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term10381, term10381.getClass(), "name", null);
        setField(term10381, term10381.getClass(), "inputs", null);
        setField(term10381, term10381.getClass(), "deps", null);
        setIntField(term10381, term10381.getClass(), "depth", 109078154);
        Object term10383 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term10383, term10383.getClass(), "name", null);
        setField(term10383, term10383.getClass(), "inputs", null);
        setField(term10383, term10383.getClass(), "deps", null);
        setIntField(term10383, term10383.getClass(), "depth", 0);
        ArrayList term10369 = new ArrayList();
        ((ArrayList) term10369).add(term10371);
        ((ArrayList) term10369).add(term10373);
        ((ArrayList) term10369).add(term10375);
        ((ArrayList) term10369).add(term10377);
        ((ArrayList) term10369).add(term10379);
        ((ArrayList) term10369).add(term10381);
        ((ArrayList) term10369).add(term10383);
        ((ArrayList) term10369).add(term10379);
        ArrayList term10387 = new ArrayList();
        HashMap term10391 = new HashMap();
        HashMap term10396 = new HashMap();
        ArrayList term10406 = new ArrayList();
        HashMap term10411 = new HashMap();
        Set<Object> term21709 =  ((Map) term10411).keySet();
        HashSet term10410 = new HashSet((Collection<? extends Object>) term21709);
        Class<? extends Object> term21711 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term21710 = ((Class) term21711).getDeclaredField((String) "WARNING");
        ((Field) term21710).setAccessible(true);
        Object enum38 = ((Field) term21710).get((Object) null);
        HashMap term10433 = new HashMap();
        Object term10443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10443, term10443.getClass(), "type", 0);
        setField(term10443, term10443.getClass(), "next", null);
        setField(term10443, term10443.getClass(), "first", null);
        setField(term10443, term10443.getClass(), "last", null);
        setField(term10443, term10443.getClass(), "propListHead", null);
        setIntField(term10443, term10443.getClass(), "sourcePosition", 0);
        setField(term10443, term10443.getClass(), "jsType", null);
        setField(term10443, term10443.getClass(), "parent", null);
        Object term10446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10446, term10446.getClass(), "type", 0);
        setField(term10446, term10446.getClass(), "next", null);
        setField(term10446, term10446.getClass(), "first", null);
        setField(term10446, term10446.getClass(), "last", null);
        setField(term10446, term10446.getClass(), "propListHead", null);
        setIntField(term10446, term10446.getClass(), "sourcePosition", 0);
        setField(term10446, term10446.getClass(), "jsType", null);
        setField(term10446, term10446.getClass(), "parent", null);
        Object term10449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10449, term10449.getClass(), "type", 0);
        setField(term10449, term10449.getClass(), "next", null);
        setField(term10449, term10449.getClass(), "first", null);
        setField(term10449, term10449.getClass(), "last", null);
        setField(term10449, term10449.getClass(), "propListHead", null);
        setIntField(term10449, term10449.getClass(), "sourcePosition", 0);
        setField(term10449, term10449.getClass(), "jsType", null);
        setField(term10449, term10449.getClass(), "parent", null);
        Object term10452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10452, term10452.getClass(), "type", 0);
        setField(term10452, term10452.getClass(), "next", null);
        setField(term10452, term10452.getClass(), "first", null);
        setField(term10452, term10452.getClass(), "last", null);
        setField(term10452, term10452.getClass(), "propListHead", null);
        setIntField(term10452, term10452.getClass(), "sourcePosition", 0);
        setField(term10452, term10452.getClass(), "jsType", null);
        setField(term10452, term10452.getClass(), "parent", null);
        ArrayList term10441 = new ArrayList();
        ((ArrayList) term10441).add(term10443);
        ((ArrayList) term10441).add(term10446);
        ((ArrayList) term10441).add(term10449);
        ((ArrayList) term10441).add(term10452);
        term10367 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term10368 = newInstance(Class.forName("com.google.javascript.jscomp.JSModuleGraph"));
        Object term10432 = newInstance(Class.forName("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(term10367, term10367.getClass(), "compiler", null);
        setField(term10368, term10368.getClass(), "modules", term10369);
        setField(term10368, term10368.getClass(), "modulesByDepth", term10387);
        setField(term10368, term10368.getClass(), "dependencyMap", term10391);
        setField(term10367, term10367.getClass(), "moduleGraph", term10368);
        setField(term10367, term10367.getClass(), "providedNames", term10396);
        setField(term10367, term10367.getClass(), "unrecognizedRequires", term10406);
        setField(term10367, term10367.getClass(), "exportedVariables", term10410);
        setField(term10367, term10367.getClass(), "requiresLevel", enum38);
        setField(term10432, term10432.getClass(), "symbols", term10433);
        setField(term10432, term10432.getClass(), "refs", null);
        setField(term10432, term10432.getClass(), "root", null);
        setField(term10367, term10367.getClass(), "preprocessorSymbolTable", term10432);
        setField(term10367, term10367.getClass(), "defineCalls", term10441);
        term10457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10457, term10457.getClass(), "type", -995785731);
        setIntField(term10459, term10459.getClass(), "type", 1349815364);
        setIntField(term10461, term10461.getClass(), "type", 2128383340);
        setIntField(term10463, term10463.getClass(), "type", 1238598518);
        setIntField(term10465, term10465.getClass(), "type", -558146961);
        setField(term10465, term10465.getClass(), "next", null);
        setField(term10465, term10465.getClass(), "first", null);
        setField(term10465, term10465.getClass(), "last", null);
        setField(term10465, term10465.getClass(), "propListHead", null);
        setIntField(term10465, term10465.getClass(), "sourcePosition", 0);
        setField(term10465, term10465.getClass(), "jsType", null);
        setField(term10465, term10465.getClass(), "parent", null);
        setField(term10463, term10463.getClass(), "next", term10465);
        setIntField(term10468, term10468.getClass(), "type", 1505480070);
        setField(term10468, term10468.getClass(), "next", null);
        setField(term10468, term10468.getClass(), "first", null);
        setField(term10468, term10468.getClass(), "last", term10465);
        setField(term10468, term10468.getClass(), "propListHead", null);
        setIntField(term10468, term10468.getClass(), "sourcePosition", 0);
        setField(term10468, term10468.getClass(), "jsType", null);
        setField(term10468, term10468.getClass(), "parent", null);
        setField(term10463, term10463.getClass(), "first", term10468);
        setField(term10463, term10463.getClass(), "last", term10461);
        setField(term10463, term10463.getClass(), "propListHead", null);
        setIntField(term10463, term10463.getClass(), "sourcePosition", 0);
        setField(term10463, term10463.getClass(), "jsType", null);
        setField(term10463, term10463.getClass(), "parent", null);
        setField(term10461, term10461.getClass(), "next", term10463);
        setField(term10461, term10461.getClass(), "first", term10465);
        setIntField(term10472, term10472.getClass(), "type", -31751777);
        setIntField(term10474, term10474.getClass(), "type", -246967963);
        setField(term10474, term10474.getClass(), "next", null);
        setField(term10474, term10474.getClass(), "first", term10468);
        setField(term10474, term10474.getClass(), "last", term10463);
        setField(term10474, term10474.getClass(), "propListHead", null);
        setIntField(term10474, term10474.getClass(), "sourcePosition", 0);
        setField(term10474, term10474.getClass(), "jsType", null);
        setField(term10474, term10474.getClass(), "parent", null);
        setField(term10472, term10472.getClass(), "next", term10474);
        setField(term10472, term10472.getClass(), "first", term10459);
        setField(term10472, term10472.getClass(), "last", term10459);
        setField(term10472, term10472.getClass(), "propListHead", null);
        setIntField(term10472, term10472.getClass(), "sourcePosition", 0);
        setField(term10472, term10472.getClass(), "jsType", null);
        setField(term10472, term10472.getClass(), "parent", null);
        setField(term10461, term10461.getClass(), "last", term10472);
        setField(term10461, term10461.getClass(), "propListHead", null);
        setIntField(term10461, term10461.getClass(), "sourcePosition", 0);
        setField(term10461, term10461.getClass(), "jsType", null);
        setField(term10461, term10461.getClass(), "parent", null);
        setField(term10459, term10459.getClass(), "next", term10461);
        setIntField(term10479, term10479.getClass(), "type", -1777140369);
        setField(term10479, term10479.getClass(), "next", term10472);
        setField(term10479, term10479.getClass(), "first", term10474);
        setField(term10479, term10479.getClass(), "last", term10457);
        setField(term10479, term10479.getClass(), "propListHead", null);
        setIntField(term10479, term10479.getClass(), "sourcePosition", 0);
        setField(term10479, term10479.getClass(), "jsType", null);
        setField(term10479, term10479.getClass(), "parent", null);
        setField(term10459, term10459.getClass(), "first", term10479);
        setField(term10459, term10459.getClass(), "last", term10479);
        setField(term10459, term10459.getClass(), "propListHead", null);
        setIntField(term10459, term10459.getClass(), "sourcePosition", 0);
        setField(term10459, term10459.getClass(), "jsType", null);
        setField(term10459, term10459.getClass(), "parent", null);
        setField(term10457, term10457.getClass(), "next", term10459);
        setField(term10457, term10457.getClass(), "first", term10463);
        setField(term10457, term10457.getClass(), "last", term10465);
        setField(term10457, term10457.getClass(), "propListHead", null);
        setIntField(term10457, term10457.getClass(), "sourcePosition", 0);
        setField(term10457, term10457.getClass(), "jsType", null);
        setField(term10457, term10457.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10457;
        try {
            callMethod(klass, "maybeAddStringNodeToSymbolTable", argTypes, term10367, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


