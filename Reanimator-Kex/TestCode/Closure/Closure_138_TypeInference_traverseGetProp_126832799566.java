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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeInference_traverseGetProp_126832799566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10889;
     Object term10974;

    public TypeInference_traverseGetProp_126832799566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10892 = new HashMap();
        HashMap term10901 = new HashMap();
        Set<Object> term39781 =  ((Map) term10901).keySet();
        HashSet term10900 = new HashSet((Collection<? extends Object>) term39781);
        HashMap term10908 = new HashMap();
        Set<Object> term39782 =  ((Map) term10908).keySet();
        HashSet term10907 = new HashSet((Collection<? extends Object>) term39782);
        HashMap term10914 = new HashMap();
        Set<Object> term39783 =  ((Map) term10914).keySet();
        HashSet term10913 = new HashSet((Collection<? extends Object>) term39783);
        HashMap term10920 = new HashMap();
        HashMap term10925 = new HashMap();
        Class<? extends Object> term39805 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term39804 = ((Class) term39805).getDeclaredField((String) "PRIVATE");
        ((Field) term39804).setAccessible(true);
        Object enum88 = ((Field) term39804).get((Object) null);
        term10889 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term10890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10891 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term10946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term10960 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10961 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term10962 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term10967 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10968 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10972 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term10889, term10889.getClass(), "compiler", null);
        setField(term10890, term10890.getClass(), "reporter", null);
        setField(term10890, term10890.getClass(), "nativeTypes", term10891);
        setField(term10890, term10890.getClass(), "namesToTypes", term10892);
        setField(term10890, term10890.getClass(), "namespaces", term10900);
        setField(term10890, term10890.getClass(), "enumTypeNames", term10907);
        setField(term10890, term10890.getClass(), "forwardDeclaredTypes", term10913);
        setField(term10890, term10890.getClass(), "typesIndexedByProperty", term10920);
        setField(term10890, term10890.getClass(), "greatestSubtypeByProperty", term10925);
        setField(term10890, term10890.getClass(), "interfaceToImplementors", null);
        setField(term10890, term10890.getClass(), "unresolvedNamedTypes", null);
        setField(term10890, term10890.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10890, term10890.getClass(), "lastGeneration", false);
        setField(term10890, term10890.getClass(), "templateTypeName", "rwKoAngzCu");
        setField(term10946, term10946.getClass(), "name", "VUkRVwROTl");
        setField(term10946, term10946.getClass(), "referencedType", null);
        setBooleanField(term10946, term10946.getClass(), "visited", true);
        setField(term10961, term10961.getClass(), "baseType", null);
        setField(term10961, term10961.getClass(), "implementedInterfaces", null);
        setField(term10961, term10961.getClass(), "parameters", null);
        setField(term10961, term10961.getClass(), "thrownTypes", null);
        setField(term10961, term10961.getClass(), "templateTypeName", null);
        setField(term10961, term10961.getClass(), "description", null);
        setField(term10961, term10961.getClass(), "deprecated", null);
        setField(term10961, term10961.getClass(), "license", null);
        setField(term10961, term10961.getClass(), "suppressions", null);
        setField(term10960, term10960.getClass(), "info", term10961);
        setField(term10962, term10962.getClass(), "markers", null);
        setField(term10962, term10962.getClass(), "parameters", null);
        setField(term10962, term10962.getClass(), "throwsDescriptions", null);
        setField(term10962, term10962.getClass(), "blockDescription", null);
        setField(term10962, term10962.getClass(), "fileOverview", null);
        setField(term10962, term10962.getClass(), "returnDescription", null);
        setField(term10962, term10962.getClass(), "version", null);
        setField(term10962, term10962.getClass(), "authors", null);
        setField(term10962, term10962.getClass(), "sees", null);
        setField(term10960, term10960.getClass(), "documentation", term10962);
        setField(term10960, term10960.getClass(), "sourceName", "");
        setField(term10960, term10960.getClass(), "visibility", enum88);
        setIntField(term10960, term10960.getClass(), "bitset", -1865023308);
        setField(term10967, term10967.getClass(), "root", null);
        setField(term10967, term10967.getClass(), "sourceName", null);
        setField(term10967, term10967.getClass(), "registry", null);
        setField(term10960, term10960.getClass(), "type", term10967);
        setField(term10968, term10968.getClass(), "root", null);
        setField(term10968, term10968.getClass(), "sourceName", null);
        setField(term10968, term10968.getClass(), "registry", null);
        setField(term10960, term10960.getClass(), "thisType", term10968);
        setBooleanField(term10960, term10960.getClass(), "includeDocumentation", false);
        setField(term10946, term10946.getClass(), "docInfo", term10960);
        setBooleanField(term10946, term10946.getClass(), "unknown", false);
        setBooleanField(term10946, term10946.getClass(), "resolved", true);
        setField(term10946, term10946.getClass(), "resolveResult", null);
        setField(term10946, term10946.getClass(), "registry", null);
        setField(term10890, term10890.getClass(), "templateType", term10946);
        setField(term10889, term10889.getClass(), "registry", term10890);
        setField(term10889, term10889.getClass(), "reverseInterpreter", null);
        setField(term10972, term10972.getClass(), "vars", null);
        setField(term10972, term10972.getClass(), "parent", null);
        setField(term10972, term10972.getClass(), "rootNode", null);
        setField(term10972, term10972.getClass(), "thisType", null);
        setBooleanField(term10972, term10972.getClass(), "isBottom", false);
        setField(term10889, term10889.getClass(), "syntacticScope", term10972);
        setField(term10889, term10889.getClass(), "functionScope", null);
        setField(term10889, term10889.getClass(), "bottomScope", null);
        setField(term10889, term10889.getClass(), "assignedOuterLocalVars", null);
        setField(term10889, term10889.getClass(), "unflowableVarNames", null);
        setField(term10889, term10889.getClass(), "cfg", null);
        setField(term10889, term10889.getClass(), "joinOp", null);
        setField(term10889, term10889.getClass(), "orderedWorkSet", null);
        term10974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10987 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10997 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10974, term10974.getClass(), "type", -434468428);
        setIntField(term10976, term10976.getClass(), "type", -1629418973);
        setIntField(term10978, term10978.getClass(), "type", 0);
        setField(term10978, term10978.getClass(), "next", null);
        setField(term10978, term10978.getClass(), "first", null);
        setField(term10978, term10978.getClass(), "last", null);
        setField(term10978, term10978.getClass(), "propListHead", null);
        setIntField(term10978, term10978.getClass(), "sourcePosition", 0);
        setField(term10978, term10978.getClass(), "jsType", null);
        setField(term10978, term10978.getClass(), "parent", null);
        setField(term10976, term10976.getClass(), "next", term10978);
        setIntField(term10981, term10981.getClass(), "type", 0);
        setField(term10981, term10981.getClass(), "next", null);
        setField(term10981, term10981.getClass(), "first", null);
        setField(term10981, term10981.getClass(), "last", null);
        setField(term10981, term10981.getClass(), "propListHead", null);
        setIntField(term10981, term10981.getClass(), "sourcePosition", 0);
        setField(term10981, term10981.getClass(), "jsType", null);
        setField(term10981, term10981.getClass(), "parent", null);
        setField(term10976, term10976.getClass(), "first", term10981);
        setIntField(term10984, term10984.getClass(), "type", 0);
        setField(term10984, term10984.getClass(), "next", null);
        setField(term10984, term10984.getClass(), "first", null);
        setField(term10984, term10984.getClass(), "last", null);
        setField(term10984, term10984.getClass(), "propListHead", null);
        setIntField(term10984, term10984.getClass(), "sourcePosition", 0);
        setField(term10984, term10984.getClass(), "jsType", null);
        setField(term10984, term10984.getClass(), "parent", null);
        setField(term10976, term10976.getClass(), "last", term10984);
        setField(term10987, term10987.getClass(), "next", null);
        setIntField(term10987, term10987.getClass(), "type", 0);
        setIntField(term10987, term10987.getClass(), "intValue", 0);
        setField(term10987, term10987.getClass(), "objectValue", null);
        setField(term10976, term10976.getClass(), "propListHead", term10987);
        setIntField(term10976, term10976.getClass(), "sourcePosition", -350454594);
        setField(term10976, term10976.getClass(), "jsType", null);
        setField(term10976, term10976.getClass(), "parent", null);
        setField(term10974, term10974.getClass(), "next", term10976);
        setIntField(term10991, term10991.getClass(), "type", 0);
        setField(term10991, term10991.getClass(), "next", null);
        setField(term10991, term10991.getClass(), "first", null);
        setField(term10991, term10991.getClass(), "last", null);
        setField(term10991, term10991.getClass(), "propListHead", null);
        setIntField(term10991, term10991.getClass(), "sourcePosition", 0);
        setField(term10991, term10991.getClass(), "jsType", null);
        setField(term10991, term10991.getClass(), "parent", null);
        setField(term10974, term10974.getClass(), "first", term10991);
        setIntField(term10994, term10994.getClass(), "type", 0);
        setField(term10994, term10994.getClass(), "next", null);
        setField(term10994, term10994.getClass(), "first", null);
        setField(term10994, term10994.getClass(), "last", null);
        setField(term10994, term10994.getClass(), "propListHead", null);
        setIntField(term10994, term10994.getClass(), "sourcePosition", 0);
        setField(term10994, term10994.getClass(), "jsType", null);
        setField(term10994, term10994.getClass(), "parent", null);
        setField(term10974, term10974.getClass(), "last", term10994);
        setField(term10997, term10997.getClass(), "next", null);
        setIntField(term10997, term10997.getClass(), "type", 0);
        setIntField(term10997, term10997.getClass(), "intValue", 0);
        setField(term10997, term10997.getClass(), "objectValue", null);
        setField(term10974, term10974.getClass(), "propListHead", term10997);
        setIntField(term10974, term10974.getClass(), "sourcePosition", -1148142995);
        setField(term10974, term10974.getClass(), "jsType", null);
        setField(term10974, term10974.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term10974;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term10889, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


