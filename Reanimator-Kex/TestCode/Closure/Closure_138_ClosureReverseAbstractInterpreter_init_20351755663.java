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
import java.util.ArrayList;
import java.lang.String;

public class ClosureReverseAbstractInterpreter_init_20351755663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ClosureReverseAbstractInterpreter_init_20351755663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        HashMap term13 = new HashMap();
        Set<Object> term1054 =  ((Map) term13).keySet();
        HashSet term12 = new HashSet((Collection<? extends Object>) term1054);
        HashMap term26 = new HashMap();
        Set<Object> term1055 =  ((Map) term26).keySet();
        HashSet term25 = new HashSet((Collection<? extends Object>) term1055);
        HashMap term39 = new HashMap();
        Set<Object> term1056 =  ((Map) term39).keySet();
        HashSet term38 = new HashSet((Collection<? extends Object>) term1056);
        HashMap term53 = new HashMap();
        HashMap term58 = new HashMap();
        ArrayList term97 = new ArrayList();
        ((ArrayList) term97).add((Object)null);
        HashMap term100 = new HashMap();
        ArrayList term105 = new ArrayList();
        ((ArrayList) term105).add((Object)null);
        ((ArrayList) term105).add((Object)null);
        ((ArrayList) term105).add((Object)null);
        ((ArrayList) term105).add((Object)null);
        ((ArrayList) term105).add((Object)null);
        ((ArrayList) term105).add((Object)null);
        HashSet term112 = new HashSet();
        ArrayList term114 = new ArrayList();
        ((ArrayList) term114).add((Object)null);
        ((ArrayList) term114).add((Object)null);
        ((ArrayList) term114).add((Object)null);
        ((ArrayList) term114).add((Object)null);
        ((ArrayList) term114).add((Object)null);
        ((ArrayList) term114).add((Object)null);
        HashMap term117 = new HashMap();
        HashMap term122 = new HashMap();
        ArrayList term131 = new ArrayList();
        ((ArrayList) term131).add((Object)null);
        ((ArrayList) term131).add((Object)null);
        ((ArrayList) term131).add((Object)null);
        ((ArrayList) term131).add((Object)null);
        ((ArrayList) term131).add((Object)null);
        ((ArrayList) term131).add((Object)null);
        ((ArrayList) term131).add((Object)null);
        ArrayList term134 = new ArrayList();
        ((ArrayList) term134).add((Object)null);
        Class<? extends Object> term1088 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term1087 = ((Class) term1088).getDeclaredField((String) "INHERITED");
        ((Field) term1087).setAccessible(true);
        Object enum1 = ((Field) term1087).get((Object) null);
        term1 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term80 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term94 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term95 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term96 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term113 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term153 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term160 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term165 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1, term1.getClass(), "reporter", null);
        setField(term1, term1.getClass(), "nativeTypes", term2);
        setField(term1, term1.getClass(), "namesToTypes", term3);
        setField(term1, term1.getClass(), "namespaces", term12);
        setField(term1, term1.getClass(), "enumTypeNames", term25);
        setField(term1, term1.getClass(), "forwardDeclaredTypes", term38);
        setField(term1, term1.getClass(), "typesIndexedByProperty", term53);
        setField(term1, term1.getClass(), "greatestSubtypeByProperty", term58);
        setField(term1, term1.getClass(), "interfaceToImplementors", null);
        setField(term1, term1.getClass(), "unresolvedNamedTypes", null);
        setField(term1, term1.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1, term1.getClass(), "lastGeneration", false);
        setField(term1, term1.getClass(), "templateTypeName", "LQFpaHEwXR");
        setField(term80, term80.getClass(), "name", "oVcInYnLWB");
        setField(term80, term80.getClass(), "referencedType", null);
        setBooleanField(term80, term80.getClass(), "visited", false);
        setField(term96, term96.getClass(), "root", null);
        setField(term96, term96.getClass(), "sourceName", null);
        setField(term96, term96.getClass(), "registry", null);
        setField(term95, term95.getClass(), "baseType", term96);
        setField(term95, term95.getClass(), "implementedInterfaces", term97);
        setField(term95, term95.getClass(), "parameters", term100);
        setField(term95, term95.getClass(), "thrownTypes", term105);
        setField(term95, term95.getClass(), "templateTypeName", "");
        setField(term95, term95.getClass(), "description", "");
        setField(term95, term95.getClass(), "deprecated", "");
        setField(term95, term95.getClass(), "license", "");
        setField(term95, term95.getClass(), "suppressions", term112);
        setField(term94, term94.getClass(), "info", term95);
        setField(term113, term113.getClass(), "markers", term114);
        setField(term113, term113.getClass(), "parameters", term117);
        setField(term113, term113.getClass(), "throwsDescriptions", term122);
        setField(term113, term113.getClass(), "blockDescription", "");
        setField(term113, term113.getClass(), "fileOverview", "");
        setField(term113, term113.getClass(), "returnDescription", "");
        setField(term113, term113.getClass(), "version", "");
        setField(term113, term113.getClass(), "authors", term131);
        setField(term113, term113.getClass(), "sees", term134);
        setField(term94, term94.getClass(), "documentation", term113);
        setField(term94, term94.getClass(), "sourceName", "LvtrsXUliU");
        setField(term94, term94.getClass(), "visibility", enum1);
        setIntField(term94, term94.getClass(), "bitset", 568599855);
        setIntField(term154, term154.getClass(), "type", 0);
        setField(term154, term154.getClass(), "next", null);
        setField(term154, term154.getClass(), "first", null);
        setField(term154, term154.getClass(), "last", null);
        setField(term154, term154.getClass(), "propListHead", null);
        setIntField(term154, term154.getClass(), "sourcePosition", 0);
        setField(term154, term154.getClass(), "jsType", null);
        setField(term154, term154.getClass(), "parent", null);
        setField(term153, term153.getClass(), "root", term154);
        setField(term153, term153.getClass(), "sourceName", "");
        setField(term158, term158.getClass(), "reporter", null);
        setField(term158, term158.getClass(), "nativeTypes", null);
        setField(term158, term158.getClass(), "namesToTypes", null);
        setField(term158, term158.getClass(), "namespaces", null);
        setField(term158, term158.getClass(), "enumTypeNames", null);
        setField(term158, term158.getClass(), "forwardDeclaredTypes", null);
        setField(term158, term158.getClass(), "typesIndexedByProperty", null);
        setField(term158, term158.getClass(), "greatestSubtypeByProperty", null);
        setField(term158, term158.getClass(), "interfaceToImplementors", null);
        setField(term158, term158.getClass(), "unresolvedNamedTypes", null);
        setField(term158, term158.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term158, term158.getClass(), "lastGeneration", false);
        setField(term158, term158.getClass(), "templateTypeName", null);
        setField(term158, term158.getClass(), "templateType", null);
        setField(term153, term153.getClass(), "registry", term158);
        setField(term94, term94.getClass(), "type", term153);
        setIntField(term161, term161.getClass(), "type", 0);
        setField(term161, term161.getClass(), "next", null);
        setField(term161, term161.getClass(), "first", null);
        setField(term161, term161.getClass(), "last", null);
        setField(term161, term161.getClass(), "propListHead", null);
        setIntField(term161, term161.getClass(), "sourcePosition", 0);
        setField(term161, term161.getClass(), "jsType", null);
        setField(term161, term161.getClass(), "parent", null);
        setField(term160, term160.getClass(), "root", term161);
        setField(term160, term160.getClass(), "sourceName", "");
        setField(term165, term165.getClass(), "reporter", null);
        setField(term165, term165.getClass(), "nativeTypes", null);
        setField(term165, term165.getClass(), "namesToTypes", null);
        setField(term165, term165.getClass(), "namespaces", null);
        setField(term165, term165.getClass(), "enumTypeNames", null);
        setField(term165, term165.getClass(), "forwardDeclaredTypes", null);
        setField(term165, term165.getClass(), "typesIndexedByProperty", null);
        setField(term165, term165.getClass(), "greatestSubtypeByProperty", null);
        setField(term165, term165.getClass(), "interfaceToImplementors", null);
        setField(term165, term165.getClass(), "unresolvedNamedTypes", null);
        setField(term165, term165.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term165, term165.getClass(), "lastGeneration", false);
        setField(term165, term165.getClass(), "templateTypeName", null);
        setField(term165, term165.getClass(), "templateType", null);
        setField(term160, term160.getClass(), "registry", term165);
        setField(term94, term94.getClass(), "thisType", term160);
        setBooleanField(term94, term94.getClass(), "includeDocumentation", false);
        setField(term80, term80.getClass(), "docInfo", term94);
        setBooleanField(term80, term80.getClass(), "unknown", false);
        setBooleanField(term80, term80.getClass(), "resolved", true);
        setField(term80, term80.getClass(), "resolveResult", null);
        setField(term170, term170.getClass(), "reporter", null);
        setField(term170, term170.getClass(), "nativeTypes", null);
        setField(term170, term170.getClass(), "namesToTypes", null);
        setField(term170, term170.getClass(), "namespaces", null);
        setField(term170, term170.getClass(), "enumTypeNames", null);
        setField(term170, term170.getClass(), "forwardDeclaredTypes", null);
        setField(term170, term170.getClass(), "typesIndexedByProperty", null);
        setField(term170, term170.getClass(), "greatestSubtypeByProperty", null);
        setField(term170, term170.getClass(), "interfaceToImplementors", null);
        setField(term170, term170.getClass(), "unresolvedNamedTypes", null);
        setField(term170, term170.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term170, term170.getClass(), "lastGeneration", false);
        setField(term170, term170.getClass(), "templateTypeName", null);
        setField(term170, term170.getClass(), "templateType", null);
        setField(term80, term80.getClass(), "registry", term170);
        setField(term1, term1.getClass(), "templateType", term80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


