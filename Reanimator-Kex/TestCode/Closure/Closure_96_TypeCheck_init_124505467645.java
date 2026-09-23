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

public class TypeCheck_init_124505467645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2675;

    public TypeCheck_init_124505467645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2677 = new HashMap();
        HashMap term2687 = new HashMap();
        Set<Object> term28292 =  ((Map) term2687).keySet();
        HashSet term2686 = new HashSet((Collection<? extends Object>) term28292);
        HashMap term2710 = new HashMap();
        Set<Object> term28293 =  ((Map) term2710).keySet();
        HashSet term2709 = new HashSet((Collection<? extends Object>) term28293);
        HashMap term2723 = new HashMap();
        Set<Object> term28294 =  ((Map) term2723).keySet();
        HashSet term2722 = new HashSet((Collection<? extends Object>) term28294);
        HashMap term2737 = new HashMap();
        HashMap term2742 = new HashMap();
        ArrayList term2781 = new ArrayList();
        ((ArrayList) term2781).add((Object)null);
        ((ArrayList) term2781).add((Object)null);
        ((ArrayList) term2781).add((Object)null);
        ((ArrayList) term2781).add((Object)null);
        ((ArrayList) term2781).add((Object)null);
        ((ArrayList) term2781).add((Object)null);
        HashMap term2784 = new HashMap();
        ArrayList term2789 = new ArrayList();
        ((ArrayList) term2789).add((Object)null);
        ((ArrayList) term2789).add((Object)null);
        ((ArrayList) term2789).add((Object)null);
        ((ArrayList) term2789).add((Object)null);
        ((ArrayList) term2789).add((Object)null);
        HashSet term2796 = new HashSet();
        ArrayList term2798 = new ArrayList();
        ((ArrayList) term2798).add((Object)null);
        ((ArrayList) term2798).add((Object)null);
        ((ArrayList) term2798).add((Object)null);
        ((ArrayList) term2798).add((Object)null);
        ((ArrayList) term2798).add((Object)null);
        ((ArrayList) term2798).add((Object)null);
        ((ArrayList) term2798).add((Object)null);
        HashMap term2801 = new HashMap();
        HashMap term2806 = new HashMap();
        ArrayList term2815 = new ArrayList();
        ((ArrayList) term2815).add((Object)null);
        ((ArrayList) term2815).add((Object)null);
        ArrayList term2818 = new ArrayList();
        ((ArrayList) term2818).add((Object)null);
        ((ArrayList) term2818).add((Object)null);
        ((ArrayList) term2818).add((Object)null);
        ((ArrayList) term2818).add((Object)null);
        ((ArrayList) term2818).add((Object)null);
        ((ArrayList) term2818).add((Object)null);
        Class<? extends Object> term28326 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term28325 = ((Class) term28326).getDeclaredField((String) "PRIVATE");
        ((Field) term28325).setAccessible(true);
        Object enum59 = ((Field) term28325).get((Object) null);
        Class<? extends Object> term28594 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term28593 = ((Class) term28594).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term28593).setAccessible(true);
        Object enum60 = ((Field) term28593).get((Object) null);
        term2675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2676 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term2764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2778 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2779 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term2780 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2797 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term2837 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2842 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term2675, term2675.getClass(), "reporter", null);
        setField(term2675, term2675.getClass(), "nativeTypes", term2676);
        setField(term2675, term2675.getClass(), "namesToTypes", term2677);
        setField(term2675, term2675.getClass(), "namespaces", term2686);
        setField(term2675, term2675.getClass(), "enumTypeNames", term2709);
        setField(term2675, term2675.getClass(), "forwardDeclaredTypes", term2722);
        setField(term2675, term2675.getClass(), "typesIndexedByProperty", term2737);
        setField(term2675, term2675.getClass(), "greatestSubtypeByProperty", term2742);
        setField(term2675, term2675.getClass(), "interfaceToImplementors", null);
        setField(term2675, term2675.getClass(), "unresolvedNamedTypes", null);
        setField(term2675, term2675.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2675, term2675.getClass(), "lastGeneration", false);
        setField(term2675, term2675.getClass(), "templateTypeName", "sEnIVFtZuQ");
        setField(term2764, term2764.getClass(), "name", "ZVecLZMLHF");
        setField(term2764, term2764.getClass(), "referencedType", null);
        setBooleanField(term2764, term2764.getClass(), "visited", true);
        setField(term2780, term2780.getClass(), "root", null);
        setField(term2780, term2780.getClass(), "sourceName", null);
        setField(term2779, term2779.getClass(), "baseType", term2780);
        setField(term2779, term2779.getClass(), "implementedInterfaces", term2781);
        setField(term2779, term2779.getClass(), "parameters", term2784);
        setField(term2779, term2779.getClass(), "thrownTypes", term2789);
        setField(term2779, term2779.getClass(), "templateTypeName", "");
        setField(term2779, term2779.getClass(), "description", "");
        setField(term2779, term2779.getClass(), "deprecated", "");
        setField(term2779, term2779.getClass(), "license", "");
        setField(term2779, term2779.getClass(), "suppressions", term2796);
        setField(term2778, term2778.getClass(), "info", term2779);
        setField(term2797, term2797.getClass(), "markers", term2798);
        setField(term2797, term2797.getClass(), "parameters", term2801);
        setField(term2797, term2797.getClass(), "throwsDescriptions", term2806);
        setField(term2797, term2797.getClass(), "blockDescription", "");
        setField(term2797, term2797.getClass(), "fileOverview", "");
        setField(term2797, term2797.getClass(), "returnDescription", "");
        setField(term2797, term2797.getClass(), "version", "");
        setField(term2797, term2797.getClass(), "authors", term2815);
        setField(term2797, term2797.getClass(), "sees", term2818);
        setField(term2778, term2778.getClass(), "documentation", term2797);
        setField(term2778, term2778.getClass(), "sourceName", "mvrkADEgpp");
        setField(term2778, term2778.getClass(), "visibility", enum59);
        setIntField(term2778, term2778.getClass(), "bitset", 1585847225);
        setIntField(term2838, term2838.getClass(), "type", 0);
        setField(term2838, term2838.getClass(), "next", null);
        setField(term2838, term2838.getClass(), "first", null);
        setField(term2838, term2838.getClass(), "last", null);
        setField(term2838, term2838.getClass(), "propListHead", null);
        setIntField(term2838, term2838.getClass(), "sourcePosition", 0);
        setField(term2838, term2838.getClass(), "jsType", null);
        setField(term2838, term2838.getClass(), "parent", null);
        setField(term2837, term2837.getClass(), "root", term2838);
        setField(term2837, term2837.getClass(), "sourceName", "");
        setField(term2778, term2778.getClass(), "type", term2837);
        setIntField(term2843, term2843.getClass(), "type", 0);
        setField(term2843, term2843.getClass(), "next", null);
        setField(term2843, term2843.getClass(), "first", null);
        setField(term2843, term2843.getClass(), "last", null);
        setField(term2843, term2843.getClass(), "propListHead", null);
        setIntField(term2843, term2843.getClass(), "sourcePosition", 0);
        setField(term2843, term2843.getClass(), "jsType", null);
        setField(term2843, term2843.getClass(), "parent", null);
        setField(term2842, term2842.getClass(), "root", term2843);
        setField(term2842, term2842.getClass(), "sourceName", "");
        setField(term2778, term2778.getClass(), "thisType", term2842);
        setBooleanField(term2778, term2778.getClass(), "includeDocumentation", false);
        setField(term2764, term2764.getClass(), "docInfo", term2778);
        setBooleanField(term2764, term2764.getClass(), "unknown", false);
        setBooleanField(term2764, term2764.getClass(), "resolved", true);
        setField(term2764, term2764.getClass(), "resolveResult", null);
        setField(term2850, term2850.getClass(), "reporter", null);
        setField(term2850, term2850.getClass(), "nativeTypes", null);
        setField(term2850, term2850.getClass(), "namesToTypes", null);
        setField(term2850, term2850.getClass(), "namespaces", null);
        setField(term2850, term2850.getClass(), "enumTypeNames", null);
        setField(term2850, term2850.getClass(), "forwardDeclaredTypes", null);
        setField(term2850, term2850.getClass(), "typesIndexedByProperty", null);
        setField(term2850, term2850.getClass(), "greatestSubtypeByProperty", null);
        setField(term2850, term2850.getClass(), "interfaceToImplementors", null);
        setField(term2850, term2850.getClass(), "unresolvedNamedTypes", null);
        setField(term2850, term2850.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2850, term2850.getClass(), "lastGeneration", false);
        setField(term2850, term2850.getClass(), "templateTypeName", null);
        setField(term2850, term2850.getClass(), "templateType", null);
        setBooleanField(term2850, term2850.getClass(), "tolerateUndefinedValues", false);
        setField(term2850, term2850.getClass(), "resolveMode", null);
        setField(term2764, term2764.getClass(), "registry", term2850);
        setField(term2675, term2675.getClass(), "templateType", term2764);
        setBooleanField(term2675, term2675.getClass(), "tolerateUndefinedValues", true);
        setField(term2675, term2675.getClass(), "resolveMode", enum60);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term2675;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


