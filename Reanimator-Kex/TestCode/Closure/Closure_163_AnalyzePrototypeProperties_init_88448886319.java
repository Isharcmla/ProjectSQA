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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.ArrayDeque;

public class AnalyzePrototypeProperties_init_88448886319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16508;

    public AnalyzePrototypeProperties_init_88448886319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11766 = new HashMap();
        Object term11718 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(term11718, term11718.getClass(), "PROPERTY", null);
        setField(term11718, term11718.getClass(), "VAR", null);
        setField(term11718, term11718.getClass(), "symbolGraph", null);
        setField(term11718, term11718.getClass(), "globalNode", null);
        setField(term11718, term11718.getClass(), "externNode", null);
        setField(term11718, term11718.getClass(), "anonymousNode", null);
        setField(term11718, term11718.getClass(), "propertyNameInfo", term11766);
        setField(term11718, term11718.getClass(), "varNameInfo", null);
        setField(term11718, term11718.getClass(), "compiler", null);
        setField(term11718, term11718.getClass(), "moduleGraph", null);
        setBooleanField(term11718, term11718.getClass(), "canModifyExterns", false);
        setBooleanField(term11718, term11718.getClass(), "anchorUnusedVars", false);
        Class<? extends Object> term16551 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term16550 = ((Class) term16551).getDeclaredField((String) "PROPERTY");
        ((Field) term16550).setAccessible(true);
        Object enum18 = ((Field) term16550).get((Object) null);
        Class<? extends Object> term16912 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term16911 = ((Class) term16912).getDeclaredField((String) "VAR");
        ((Field) term16911).setAccessible(true);
        Object enum19 = ((Field) term16911).get((Object) null);
        HashMap term16516 = new HashMap();
        ArrayDeque term16526 = new ArrayDeque();
        ArrayDeque term16531 = new ArrayDeque();
        ArrayDeque term16536 = new ArrayDeque();
        HashMap term16538 = new HashMap();
        HashMap term16549 = new HashMap();
        term16508 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object term16515 = newInstance(Class.forName("com.google.javascript.jscomp.graph.LinkedDirectedGraph"));
        Object term16523 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        Object term16528 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        Object term16533 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(term16508, term16508.getClass(), "PROPERTY", enum18);
        setField(term16508, term16508.getClass(), "VAR", enum19);
        setField(term16508, term16508.getClass(), "compiler", null);
        setBooleanField(term16508, term16508.getClass(), "canModifyExterns", true);
        setBooleanField(term16508, term16508.getClass(), "anchorUnusedVars", true);
        setField(term16508, term16508.getClass(), "moduleGraph", null);
        setField(term16508, term16508.getClass(), "firstModule", null);
        setField(term16515, term16515.getClass(), "nodes", term16516);
        setBooleanField(term16515, term16515.getClass(), "useNodeAnnotations", false);
        setBooleanField(term16515, term16515.getClass(), "useEdgeAnnotations", false);
        setField(term16515, term16515.getClass(), "nodeAnnotationStack", null);
        setField(term16515, term16515.getClass(), "edgeAnnotationStack", null);
        setField(term16508, term16508.getClass(), "symbolGraph", term16515);
        setField(term16523, term16523.getClass(), "name", "[global]");
        setBooleanField(term16523, term16523.getClass(), "referenced", true);
        setField(term16523, term16523.getClass(), "declarations", term16526);
        setField(term16523, term16523.getClass(), "deepestCommonModuleRef", null);
        setBooleanField(term16523, term16523.getClass(), "readClosureVariables", false);
        setField(term16523, term16523.getClass(), "this$0", term16508);
        setField(term16508, term16508.getClass(), "globalNode", term16523);
        setField(term16528, term16528.getClass(), "name", "[extern]");
        setBooleanField(term16528, term16528.getClass(), "referenced", true);
        setField(term16528, term16528.getClass(), "declarations", term16531);
        setField(term16528, term16528.getClass(), "deepestCommonModuleRef", null);
        setBooleanField(term16528, term16528.getClass(), "readClosureVariables", false);
        setField(term16528, term16528.getClass(), "this$0", term16508);
        setField(term16508, term16508.getClass(), "externNode", term16528);
        setField(term16533, term16533.getClass(), "name", "[anonymous]");
        setBooleanField(term16533, term16533.getClass(), "referenced", false);
        setField(term16533, term16533.getClass(), "declarations", term16536);
        setField(term16533, term16533.getClass(), "deepestCommonModuleRef", null);
        setBooleanField(term16533, term16533.getClass(), "readClosureVariables", false);
        setField(term16533, term16533.getClass(), "this$0", term16508);
        setField(term16508, term16508.getClass(), "anonymousNode", term16533);
        setField(term16508, term16508.getClass(), "propertyNameInfo", term16538);
        setField(term16508, term16508.getClass(), "varNameInfo", term16549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSModuleGraph");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = true;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16508));
    }

};


