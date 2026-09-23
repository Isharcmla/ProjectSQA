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
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeCheck_init_180707525767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term84;
     Object term139;
     Object enum17;
     Object enum18;

    public TypeCheck_init_180707525767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        HashMap term13 = new HashMap();
        Set<Object> term13924 =  ((Map) term13).keySet();
        HashSet term12 = new HashSet((Collection<? extends Object>) term13924);
        HashMap term26 = new HashMap();
        Set<Object> term13925 =  ((Map) term26).keySet();
        HashSet term25 = new HashSet((Collection<? extends Object>) term13925);
        HashMap term39 = new HashMap();
        Set<Object> term13926 =  ((Map) term39).keySet();
        HashSet term38 = new HashSet((Collection<? extends Object>) term13926);
        HashMap term53 = new HashMap();
        HashMap term68 = new HashMap();
        HashMap term73 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1, term1.getClass(), "reporter", null);
        setField(term1, term1.getClass(), "nativeTypes", term2);
        setField(term1, term1.getClass(), "namesToTypes", term3);
        setField(term1, term1.getClass(), "namespaces", term12);
        setField(term1, term1.getClass(), "nonNullableTypeNames", term25);
        setField(term1, term1.getClass(), "forwardDeclaredTypes", term38);
        setField(term1, term1.getClass(), "typesIndexedByProperty", term53);
        setField(term1, term1.getClass(), "eachRefTypeIndexedByProperty", term68);
        setField(term1, term1.getClass(), "greatestSubtypeByProperty", term73);
        setField(term1, term1.getClass(), "interfaceToImplementors", null);
        setField(term1, term1.getClass(), "unresolvedNamedTypes", null);
        setField(term1, term1.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1, term1.getClass(), "lastGeneration", false);
        setField(term1, term1.getClass(), "templateTypes", null);
        setBooleanField(term1, term1.getClass(), "tolerateUndefinedValues", false);
        setField(term1, term1.getClass(), "resolveMode", null);
        HashMap term85 = new HashMap();
        term84 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term99 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term84, term84.getClass(), "vars", term85);
        setField(term99, term99.getClass(), "vars", null);
        setField(term99, term99.getClass(), "parent", null);
        setIntField(term99, term99.getClass(), "depth", 0);
        setField(term99, term99.getClass(), "rootNode", null);
        setBooleanField(term99, term99.getClass(), "isBottom", false);
        setField(term99, term99.getClass(), "arguments", null);
        setField(term84, term84.getClass(), "parent", term99);
        setIntField(term84, term84.getClass(), "depth", 1585847225);
        setIntField(term103, term103.getClass(), "type", 1725571209);
        setIntField(term105, term105.getClass(), "type", -522618178);
        setIntField(term107, term107.getClass(), "type", 1134449235);
        setIntField(term109, term109.getClass(), "type", -883034806);
        setField(term109, term109.getClass(), "next", null);
        setField(term109, term109.getClass(), "first", null);
        setField(term109, term109.getClass(), "last", term109);
        setField(term109, term109.getClass(), "propListHead", null);
        setIntField(term109, term109.getClass(), "sourcePosition", 0);
        setField(term109, term109.getClass(), "jsType", null);
        setField(term109, term109.getClass(), "parent", null);
        setField(term107, term107.getClass(), "next", term109);
        setIntField(term112, term112.getClass(), "type", 0);
        setField(term112, term112.getClass(), "next", null);
        setField(term112, term112.getClass(), "first", null);
        setField(term112, term112.getClass(), "last", null);
        setField(term112, term112.getClass(), "propListHead", null);
        setIntField(term112, term112.getClass(), "sourcePosition", 0);
        setField(term112, term112.getClass(), "jsType", null);
        setField(term112, term112.getClass(), "parent", null);
        setField(term107, term107.getClass(), "first", term112);
        setIntField(term115, term115.getClass(), "type", -1955890973);
        setField(term115, term115.getClass(), "next", null);
        setField(term115, term115.getClass(), "first", term105);
        setField(term115, term115.getClass(), "last", null);
        setField(term115, term115.getClass(), "propListHead", null);
        setIntField(term115, term115.getClass(), "sourcePosition", 0);
        setField(term115, term115.getClass(), "jsType", null);
        setField(term115, term115.getClass(), "parent", null);
        setField(term107, term107.getClass(), "last", term115);
        setField(term107, term107.getClass(), "propListHead", null);
        setIntField(term107, term107.getClass(), "sourcePosition", 0);
        setField(term107, term107.getClass(), "jsType", null);
        setField(term107, term107.getClass(), "parent", null);
        setField(term105, term105.getClass(), "next", term107);
        setField(term105, term105.getClass(), "first", term105);
        setIntField(term119, term119.getClass(), "type", -1339778481);
        setField(term119, term119.getClass(), "next", term103);
        setIntField(term121, term121.getClass(), "type", 0);
        setField(term121, term121.getClass(), "next", null);
        setField(term121, term121.getClass(), "first", null);
        setField(term121, term121.getClass(), "last", null);
        setField(term121, term121.getClass(), "propListHead", null);
        setIntField(term121, term121.getClass(), "sourcePosition", 0);
        setField(term121, term121.getClass(), "jsType", null);
        setField(term121, term121.getClass(), "parent", null);
        setField(term119, term119.getClass(), "first", term121);
        setField(term119, term119.getClass(), "last", term109);
        setField(term119, term119.getClass(), "propListHead", null);
        setIntField(term119, term119.getClass(), "sourcePosition", 0);
        setField(term119, term119.getClass(), "jsType", null);
        setField(term119, term119.getClass(), "parent", null);
        setField(term105, term105.getClass(), "last", term119);
        setField(term105, term105.getClass(), "propListHead", null);
        setIntField(term105, term105.getClass(), "sourcePosition", 0);
        setField(term105, term105.getClass(), "jsType", null);
        setField(term105, term105.getClass(), "parent", null);
        setField(term103, term103.getClass(), "next", term105);
        setIntField(term126, term126.getClass(), "type", -2038273078);
        setIntField(term128, term128.getClass(), "type", 1227103734);
        setField(term128, term128.getClass(), "next", term119);
        setField(term128, term128.getClass(), "first", term109);
        setField(term128, term128.getClass(), "last", term103);
        setField(term128, term128.getClass(), "propListHead", null);
        setIntField(term128, term128.getClass(), "sourcePosition", 0);
        setField(term128, term128.getClass(), "jsType", null);
        setField(term128, term128.getClass(), "parent", null);
        setField(term126, term126.getClass(), "next", term128);
        setField(term126, term126.getClass(), "first", term121);
        setField(term126, term126.getClass(), "last", term109);
        setField(term126, term126.getClass(), "propListHead", null);
        setIntField(term126, term126.getClass(), "sourcePosition", 0);
        setField(term126, term126.getClass(), "jsType", null);
        setField(term126, term126.getClass(), "parent", null);
        setField(term103, term103.getClass(), "first", term126);
        setField(term103, term103.getClass(), "last", term126);
        setField(term103, term103.getClass(), "propListHead", null);
        setIntField(term103, term103.getClass(), "sourcePosition", 0);
        setField(term103, term103.getClass(), "jsType", null);
        setField(term103, term103.getClass(), "parent", null);
        setField(term84, term84.getClass(), "rootNode", term103);
        setBooleanField(term84, term84.getClass(), "isBottom", true);
        setField(term134, term134.getClass(), "name", null);
        setField(term134, term134.getClass(), "nameNode", null);
        setField(term134, term134.getClass(), "type", null);
        setBooleanField(term134, term134.getClass(), "typeInferred", false);
        setField(term134, term134.getClass(), "input", null);
        setIntField(term134, term134.getClass(), "index", 0);
        setField(term134, term134.getClass(), "scope", null);
        setBooleanField(term134, term134.getClass(), "markedEscaped", false);
        setBooleanField(term134, term134.getClass(), "markedAssignedExactlyOnce", false);
        setField(term84, term84.getClass(), "arguments", term134);
        HashMap term140 = new HashMap();
        term139 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(term139, term139.getClass(), "scopes", term140);
        setField(term139, term139.getClass(), "delegate", null);
        Class<? extends Object> term13928 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term13927 = ((Class) term13928).getDeclaredField((String) "WARNING");
        ((Field) term13927).setAccessible(true);
        enum17 = ((Field) term13927).get((Object) null);
        Class<? extends Object> term14151 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term14150 = ((Class) term14151).getDeclaredField((String) "OFF");
        ((Field) term14150).setAccessible(true);
        enum18 = ((Field) term14150).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator");
        argTypes[5] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        argTypes[6] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term1;
        args[3] = term84;
        args[4] = term139;
        args[5] = enum17;
        args[6] = enum18;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


