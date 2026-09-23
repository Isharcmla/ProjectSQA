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
import java.lang.String;
import java.util.HashMap;
import java.util.ArrayDeque;

public class AnalyzePrototypeProperties_init_88448886315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18046;

    public AnalyzePrototypeProperties_init_88448886315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18088 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term18087 = ((Class) term18088).getDeclaredField((String) "PROPERTY");
        ((Field) term18087).setAccessible(true);
        Object enum19 = ((Field) term18087).get((Object) null);
        Object term10948 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object term11380 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term10948, term10948.getClass(), "PROPERTY", null);
        setField(term10948, term10948.getClass(), "VAR", enum19);
        setField(term10948, term10948.getClass(), "symbolGraph", null);
        setField(term10948, term10948.getClass(), "globalNode", null);
        setField(term10948, term10948.getClass(), "externNode", null);
        setField(term10948, term10948.getClass(), "anonymousNode", null);
        setField(term10948, term10948.getClass(), "propertyNameInfo", null);
        setField(term10948, term10948.getClass(), "varNameInfo", null);
        setField(term10948, term10948.getClass(), "compiler", term11380);
        setField(term10948, term10948.getClass(), "moduleGraph", null);
        setBooleanField(term10948, term10948.getClass(), "canModifyExterns", false);
        setBooleanField(term10948, term10948.getClass(), "anchorUnusedVars", false);
        Class<? extends Object> term18449 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term18448 = ((Class) term18449).getDeclaredField((String) "PROPERTY");
        ((Field) term18448).setAccessible(true);
        Object enum20 = ((Field) term18448).get((Object) null);
        Class<? extends Object> term18810 = Class.forName((String) "com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Field term18809 = ((Class) term18810).getDeclaredField((String) "VAR");
        ((Field) term18809).setAccessible(true);
        Object enum21 = ((Field) term18809).get((Object) null);
        HashMap term18054 = new HashMap();
        ArrayDeque term18063 = new ArrayDeque();
        ArrayDeque term18068 = new ArrayDeque();
        ArrayDeque term18073 = new ArrayDeque();
        HashMap term18075 = new HashMap();
        HashMap term18086 = new HashMap();
        term18046 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object term18053 = newInstance(Class.forName("com.google.javascript.jscomp.graph.LinkedDirectedGraph"));
        Object term18060 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        Object term18065 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        Object term18070 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(term18046, term18046.getClass(), "PROPERTY", enum20);
        setField(term18046, term18046.getClass(), "VAR", enum21);
        setField(term18046, term18046.getClass(), "compiler", null);
        setBooleanField(term18046, term18046.getClass(), "canModifyExterns", true);
        setBooleanField(term18046, term18046.getClass(), "anchorUnusedVars", true);
        setField(term18046, term18046.getClass(), "moduleGraph", null);
        setField(term18046, term18046.getClass(), "firstModule", null);
        setField(term18053, term18053.getClass(), "nodes", term18054);
        setBooleanField(term18053, term18053.getClass(), "useNodeAnnotations", false);
        setBooleanField(term18053, term18053.getClass(), "useEdgeAnnotations", false);
        setField(term18053, term18053.getClass(), "nodeAnnotationStack", null);
        setField(term18053, term18053.getClass(), "edgeAnnotationStack", null);
        setField(term18046, term18046.getClass(), "symbolGraph", term18053);
        setField(term18060, term18060.getClass(), "name", "[global]");
        setBooleanField(term18060, term18060.getClass(), "referenced", true);
        setField(term18060, term18060.getClass(), "declarations", term18063);
        setField(term18060, term18060.getClass(), "deepestCommonModuleRef", null);
        setBooleanField(term18060, term18060.getClass(), "readClosureVariables", false);
        setField(term18060, term18060.getClass(), "this$0", term18046);
        setField(term18046, term18046.getClass(), "globalNode", term18060);
        setField(term18065, term18065.getClass(), "name", "[extern]");
        setBooleanField(term18065, term18065.getClass(), "referenced", true);
        setField(term18065, term18065.getClass(), "declarations", term18068);
        setField(term18065, term18065.getClass(), "deepestCommonModuleRef", null);
        setBooleanField(term18065, term18065.getClass(), "readClosureVariables", false);
        setField(term18065, term18065.getClass(), "this$0", term18046);
        setField(term18046, term18046.getClass(), "externNode", term18065);
        setField(term18070, term18070.getClass(), "name", "[anonymous]");
        setBooleanField(term18070, term18070.getClass(), "referenced", false);
        setField(term18070, term18070.getClass(), "declarations", term18073);
        setField(term18070, term18070.getClass(), "deepestCommonModuleRef", null);
        setBooleanField(term18070, term18070.getClass(), "readClosureVariables", false);
        setField(term18070, term18070.getClass(), "this$0", term18046);
        setField(term18046, term18046.getClass(), "anonymousNode", term18070);
        setField(term18046, term18046.getClass(), "propertyNameInfo", term18075);
        setField(term18046, term18046.getClass(), "varNameInfo", term18086);
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
        assertTrue(recursiveEquals(instance, term18046));
    }

};


