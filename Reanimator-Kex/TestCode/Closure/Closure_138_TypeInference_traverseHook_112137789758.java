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

public class TypeInference_traverseHook_112137789758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6898;
     Object term6984;

    public TypeInference_traverseHook_112137789758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6901 = new HashMap();
        HashMap term6910 = new HashMap();
        Set<Object> term31695 =  ((Map) term6910).keySet();
        HashSet term6909 = new HashSet((Collection<? extends Object>) term31695);
        HashMap term6917 = new HashMap();
        Set<Object> term31696 =  ((Map) term6917).keySet();
        HashSet term6916 = new HashSet((Collection<? extends Object>) term31696);
        HashMap term6924 = new HashMap();
        Set<Object> term31697 =  ((Map) term6924).keySet();
        HashSet term6923 = new HashSet((Collection<? extends Object>) term31697);
        HashMap term6930 = new HashMap();
        HashMap term6935 = new HashMap();
        Class<? extends Object> term31719 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term31718 = ((Class) term31719).getDeclaredField((String) "PROTECTED");
        ((Field) term31718).setAccessible(true);
        Object enum69 = ((Field) term31718).get((Object) null);
        term6898 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term6899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6900 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        Object term6956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term6970 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6971 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term6972 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term6977 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6978 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6982 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term6898, term6898.getClass(), "compiler", null);
        setField(term6899, term6899.getClass(), "reporter", null);
        setField(term6899, term6899.getClass(), "nativeTypes", term6900);
        setField(term6899, term6899.getClass(), "namesToTypes", term6901);
        setField(term6899, term6899.getClass(), "namespaces", term6909);
        setField(term6899, term6899.getClass(), "enumTypeNames", term6916);
        setField(term6899, term6899.getClass(), "forwardDeclaredTypes", term6923);
        setField(term6899, term6899.getClass(), "typesIndexedByProperty", term6930);
        setField(term6899, term6899.getClass(), "greatestSubtypeByProperty", term6935);
        setField(term6899, term6899.getClass(), "interfaceToImplementors", null);
        setField(term6899, term6899.getClass(), "unresolvedNamedTypes", null);
        setField(term6899, term6899.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6899, term6899.getClass(), "lastGeneration", false);
        setField(term6899, term6899.getClass(), "templateTypeName", "riMtzCoxNj");
        setField(term6956, term6956.getClass(), "name", "YAXkVjQZcV");
        setField(term6956, term6956.getClass(), "referencedType", null);
        setBooleanField(term6956, term6956.getClass(), "visited", true);
        setField(term6971, term6971.getClass(), "baseType", null);
        setField(term6971, term6971.getClass(), "implementedInterfaces", null);
        setField(term6971, term6971.getClass(), "parameters", null);
        setField(term6971, term6971.getClass(), "thrownTypes", null);
        setField(term6971, term6971.getClass(), "templateTypeName", null);
        setField(term6971, term6971.getClass(), "description", null);
        setField(term6971, term6971.getClass(), "deprecated", null);
        setField(term6971, term6971.getClass(), "license", null);
        setField(term6971, term6971.getClass(), "suppressions", null);
        setField(term6970, term6970.getClass(), "info", term6971);
        setField(term6972, term6972.getClass(), "markers", null);
        setField(term6972, term6972.getClass(), "parameters", null);
        setField(term6972, term6972.getClass(), "throwsDescriptions", null);
        setField(term6972, term6972.getClass(), "blockDescription", null);
        setField(term6972, term6972.getClass(), "fileOverview", null);
        setField(term6972, term6972.getClass(), "returnDescription", null);
        setField(term6972, term6972.getClass(), "version", null);
        setField(term6972, term6972.getClass(), "authors", null);
        setField(term6972, term6972.getClass(), "sees", null);
        setField(term6970, term6970.getClass(), "documentation", term6972);
        setField(term6970, term6970.getClass(), "sourceName", "");
        setField(term6970, term6970.getClass(), "visibility", enum69);
        setIntField(term6970, term6970.getClass(), "bitset", -1254072822);
        setField(term6977, term6977.getClass(), "root", null);
        setField(term6977, term6977.getClass(), "sourceName", null);
        setField(term6977, term6977.getClass(), "registry", null);
        setField(term6970, term6970.getClass(), "type", term6977);
        setField(term6978, term6978.getClass(), "root", null);
        setField(term6978, term6978.getClass(), "sourceName", null);
        setField(term6978, term6978.getClass(), "registry", null);
        setField(term6970, term6970.getClass(), "thisType", term6978);
        setBooleanField(term6970, term6970.getClass(), "includeDocumentation", false);
        setField(term6956, term6956.getClass(), "docInfo", term6970);
        setBooleanField(term6956, term6956.getClass(), "unknown", false);
        setBooleanField(term6956, term6956.getClass(), "resolved", true);
        setField(term6956, term6956.getClass(), "resolveResult", null);
        setField(term6956, term6956.getClass(), "registry", null);
        setField(term6899, term6899.getClass(), "templateType", term6956);
        setField(term6898, term6898.getClass(), "registry", term6899);
        setField(term6898, term6898.getClass(), "reverseInterpreter", null);
        setField(term6982, term6982.getClass(), "vars", null);
        setField(term6982, term6982.getClass(), "parent", null);
        setField(term6982, term6982.getClass(), "rootNode", null);
        setField(term6982, term6982.getClass(), "thisType", null);
        setBooleanField(term6982, term6982.getClass(), "isBottom", false);
        setField(term6898, term6898.getClass(), "syntacticScope", term6982);
        setField(term6898, term6898.getClass(), "functionScope", null);
        setField(term6898, term6898.getClass(), "bottomScope", null);
        setField(term6898, term6898.getClass(), "assignedOuterLocalVars", null);
        setField(term6898, term6898.getClass(), "unflowableVarNames", null);
        setField(term6898, term6898.getClass(), "cfg", null);
        setField(term6898, term6898.getClass(), "joinOp", null);
        setField(term6898, term6898.getClass(), "orderedWorkSet", null);
        term6984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6997 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7007 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6984, term6984.getClass(), "type", -130649791);
        setIntField(term6986, term6986.getClass(), "type", 477625804);
        setIntField(term6988, term6988.getClass(), "type", 0);
        setField(term6988, term6988.getClass(), "next", null);
        setField(term6988, term6988.getClass(), "first", null);
        setField(term6988, term6988.getClass(), "last", null);
        setField(term6988, term6988.getClass(), "propListHead", null);
        setIntField(term6988, term6988.getClass(), "sourcePosition", 0);
        setField(term6988, term6988.getClass(), "jsType", null);
        setField(term6988, term6988.getClass(), "parent", null);
        setField(term6986, term6986.getClass(), "next", term6988);
        setIntField(term6991, term6991.getClass(), "type", 0);
        setField(term6991, term6991.getClass(), "next", null);
        setField(term6991, term6991.getClass(), "first", null);
        setField(term6991, term6991.getClass(), "last", null);
        setField(term6991, term6991.getClass(), "propListHead", null);
        setIntField(term6991, term6991.getClass(), "sourcePosition", 0);
        setField(term6991, term6991.getClass(), "jsType", null);
        setField(term6991, term6991.getClass(), "parent", null);
        setField(term6986, term6986.getClass(), "first", term6991);
        setIntField(term6994, term6994.getClass(), "type", 0);
        setField(term6994, term6994.getClass(), "next", null);
        setField(term6994, term6994.getClass(), "first", null);
        setField(term6994, term6994.getClass(), "last", null);
        setField(term6994, term6994.getClass(), "propListHead", null);
        setIntField(term6994, term6994.getClass(), "sourcePosition", 0);
        setField(term6994, term6994.getClass(), "jsType", null);
        setField(term6994, term6994.getClass(), "parent", null);
        setField(term6986, term6986.getClass(), "last", term6994);
        setField(term6997, term6997.getClass(), "next", null);
        setIntField(term6997, term6997.getClass(), "type", 0);
        setIntField(term6997, term6997.getClass(), "intValue", 0);
        setField(term6997, term6997.getClass(), "objectValue", null);
        setField(term6986, term6986.getClass(), "propListHead", term6997);
        setIntField(term6986, term6986.getClass(), "sourcePosition", 1460722225);
        setField(term6986, term6986.getClass(), "jsType", null);
        setField(term6986, term6986.getClass(), "parent", null);
        setField(term6984, term6984.getClass(), "next", term6986);
        setIntField(term7001, term7001.getClass(), "type", 0);
        setField(term7001, term7001.getClass(), "next", null);
        setField(term7001, term7001.getClass(), "first", null);
        setField(term7001, term7001.getClass(), "last", null);
        setField(term7001, term7001.getClass(), "propListHead", null);
        setIntField(term7001, term7001.getClass(), "sourcePosition", 0);
        setField(term7001, term7001.getClass(), "jsType", null);
        setField(term7001, term7001.getClass(), "parent", null);
        setField(term6984, term6984.getClass(), "first", term7001);
        setIntField(term7004, term7004.getClass(), "type", 0);
        setField(term7004, term7004.getClass(), "next", null);
        setField(term7004, term7004.getClass(), "first", null);
        setField(term7004, term7004.getClass(), "last", null);
        setField(term7004, term7004.getClass(), "propListHead", null);
        setIntField(term7004, term7004.getClass(), "sourcePosition", 0);
        setField(term7004, term7004.getClass(), "jsType", null);
        setField(term7004, term7004.getClass(), "parent", null);
        setField(term6984, term6984.getClass(), "last", term7004);
        setField(term7007, term7007.getClass(), "next", null);
        setIntField(term7007, term7007.getClass(), "type", 0);
        setIntField(term7007, term7007.getClass(), "intValue", 0);
        setField(term7007, term7007.getClass(), "objectValue", null);
        setField(term6984, term6984.getClass(), "propListHead", term7007);
        setIntField(term6984, term6984.getClass(), "sourcePosition", 1743224434);
        setField(term6984, term6984.getClass(), "jsType", null);
        setField(term6984, term6984.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term6984;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term6898, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


