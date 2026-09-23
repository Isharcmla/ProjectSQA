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

public class TypeCheck_init_122880885443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term179;
     Object enum53;
     Object enum54;

    public TypeCheck_init_122880885443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        HashMap term13 = new HashMap();
        Set<Object> term25432 =  ((Map) term13).keySet();
        HashSet term12 = new HashSet((Collection<? extends Object>) term25432);
        HashMap term26 = new HashMap();
        Set<Object> term25433 =  ((Map) term26).keySet();
        HashSet term25 = new HashSet((Collection<? extends Object>) term25433);
        HashMap term39 = new HashMap();
        Set<Object> term25434 =  ((Map) term39).keySet();
        HashSet term38 = new HashSet((Collection<? extends Object>) term25434);
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
        Class<? extends Object> term25466 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term25465 = ((Class) term25466).getDeclaredField((String) "PRIVATE");
        ((Field) term25465).setAccessible(true);
        Object enum51 = ((Field) term25465).get((Object) null);
        Class<? extends Object> term25734 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term25733 = ((Class) term25734).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term25733).setAccessible(true);
        Object enum52 = ((Field) term25733).get((Object) null);
        term1 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term80 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term94 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term95 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term96 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term113 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term153 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
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
        setField(term94, term94.getClass(), "visibility", enum51);
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
        setField(term94, term94.getClass(), "type", term153);
        setField(term94, term94.getClass(), "thisType", term153);
        setBooleanField(term94, term94.getClass(), "includeDocumentation", false);
        setField(term80, term80.getClass(), "docInfo", term94);
        setBooleanField(term80, term80.getClass(), "unknown", false);
        setBooleanField(term80, term80.getClass(), "resolved", true);
        setField(term80, term80.getClass(), "resolveResult", null);
        setField(term161, term161.getClass(), "reporter", null);
        setField(term161, term161.getClass(), "nativeTypes", null);
        setField(term161, term161.getClass(), "namesToTypes", null);
        setField(term161, term161.getClass(), "namespaces", null);
        setField(term161, term161.getClass(), "enumTypeNames", null);
        setField(term161, term161.getClass(), "forwardDeclaredTypes", null);
        setField(term161, term161.getClass(), "typesIndexedByProperty", null);
        setField(term161, term161.getClass(), "greatestSubtypeByProperty", null);
        setField(term161, term161.getClass(), "interfaceToImplementors", null);
        setField(term161, term161.getClass(), "unresolvedNamedTypes", null);
        setField(term161, term161.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term161, term161.getClass(), "lastGeneration", false);
        setField(term161, term161.getClass(), "templateTypeName", null);
        setField(term161, term161.getClass(), "templateType", null);
        setBooleanField(term161, term161.getClass(), "tolerateUndefinedValues", false);
        setField(term161, term161.getClass(), "resolveMode", null);
        setField(term80, term80.getClass(), "registry", term161);
        setField(term1, term1.getClass(), "templateType", term80);
        setBooleanField(term1, term1.getClass(), "tolerateUndefinedValues", true);
        setField(term1, term1.getClass(), "resolveMode", enum52);
        HashMap term180 = new HashMap();
        term179 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term193 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term179, term179.getClass(), "vars", term180);
        setField(term193, term193.getClass(), "vars", null);
        setField(term193, term193.getClass(), "parent", null);
        setField(term193, term193.getClass(), "rootNode", null);
        setField(term193, term193.getClass(), "thisType", null);
        setBooleanField(term193, term193.getClass(), "isBottom", false);
        setField(term179, term179.getClass(), "parent", term193);
        setIntField(term195, term195.getClass(), "type", 0);
        setField(term195, term195.getClass(), "next", null);
        setField(term195, term195.getClass(), "first", null);
        setField(term195, term195.getClass(), "last", null);
        setField(term195, term195.getClass(), "propListHead", null);
        setIntField(term195, term195.getClass(), "sourcePosition", 0);
        setField(term195, term195.getClass(), "jsType", null);
        setField(term195, term195.getClass(), "parent", null);
        setField(term179, term179.getClass(), "rootNode", term195);
        setField(term179, term179.getClass(), "thisType", null);
        setBooleanField(term179, term179.getClass(), "isBottom", false);
        Class<? extends Object> term26076 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term26075 = ((Class) term26076).getDeclaredField((String) "WARNING");
        ((Field) term26075).setAccessible(true);
        enum53 = ((Field) term26075).get((Object) null);
        Class<? extends Object> term26299 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term26298 = ((Class) term26299).getDeclaredField((String) "OFF");
        ((Field) term26298).setAccessible(true);
        enum54 = ((Field) term26298).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.ScopeCreator");
        argTypes[5] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        argTypes[6] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term1;
        args[3] = term179;
        args[4] = null;
        args[5] = enum53;
        args[6] = enum54;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


