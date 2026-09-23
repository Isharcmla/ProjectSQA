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

public class TypeCheck_getFunctionType_86107567078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8085;
     Object term8139;

    public TypeCheck_getFunctionType_86107567078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8089 = new HashMap();
        HashMap term8096 = new HashMap();
        Set<Object> term23239 =  ((Map) term8096).keySet();
        HashSet term8095 = new HashSet((Collection<? extends Object>) term23239);
        HashMap term8102 = new HashMap();
        Set<Object> term23240 =  ((Map) term8102).keySet();
        HashSet term8101 = new HashSet((Collection<? extends Object>) term23240);
        HashMap term8108 = new HashMap();
        Set<Object> term23241 =  ((Map) term8108).keySet();
        HashSet term8107 = new HashSet((Collection<? extends Object>) term23241);
        HashMap term8113 = new HashMap();
        HashMap term8119 = new HashMap();
        HashMap term8124 = new HashMap();
        term8085 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term8086 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term8087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8088 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term8085, term8085.getClass(), "compiler", null);
        setField(term8086, term8086.getClass(), "compiler", null);
        setField(term8087, term8087.getClass(), "reporter", null);
        setField(term8087, term8087.getClass(), "nativeTypes", term8088);
        setField(term8087, term8087.getClass(), "namesToTypes", term8089);
        setField(term8087, term8087.getClass(), "namespaces", term8095);
        setField(term8087, term8087.getClass(), "nonNullableTypeNames", term8101);
        setField(term8087, term8087.getClass(), "forwardDeclaredTypes", term8107);
        setField(term8087, term8087.getClass(), "typesIndexedByProperty", term8113);
        setField(term8087, term8087.getClass(), "eachRefTypeIndexedByProperty", term8119);
        setField(term8087, term8087.getClass(), "greatestSubtypeByProperty", term8124);
        setField(term8087, term8087.getClass(), "interfaceToImplementors", null);
        setField(term8087, term8087.getClass(), "unresolvedNamedTypes", null);
        setField(term8087, term8087.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8087, term8087.getClass(), "lastGeneration", false);
        setField(term8087, term8087.getClass(), "templateTypeName", null);
        setField(term8087, term8087.getClass(), "templateType", null);
        setBooleanField(term8087, term8087.getClass(), "tolerateUndefinedValues", false);
        setField(term8087, term8087.getClass(), "resolveMode", null);
        setField(term8086, term8086.getClass(), "typeRegistry", term8087);
        setField(term8086, term8086.getClass(), "allValueTypes", null);
        setBooleanField(term8086, term8086.getClass(), "shouldReport", false);
        setField(term8086, term8086.getClass(), "nullOrUndefined", null);
        setField(term8086, term8086.getClass(), "mismatches", null);
        setField(term8085, term8085.getClass(), "validator", term8086);
        setField(term8085, term8085.getClass(), "reverseInterpreter", null);
        setField(term8085, term8085.getClass(), "typeRegistry", null);
        setField(term8085, term8085.getClass(), "topScope", null);
        setField(term8085, term8085.getClass(), "scopeCreator", null);
        setField(term8085, term8085.getClass(), "reportMissingOverride", null);
        setField(term8085, term8085.getClass(), "reportUnknownTypes", null);
        setBooleanField(term8085, term8085.getClass(), "reportMissingProperties", false);
        setField(term8085, term8085.getClass(), "inferJSDocInfo", null);
        setIntField(term8085, term8085.getClass(), "typedCount", 0);
        setIntField(term8085, term8085.getClass(), "nullCount", 0);
        setIntField(term8085, term8085.getClass(), "unknownCount", 0);
        setBooleanField(term8085, term8085.getClass(), "inExterns", false);
        setIntField(term8085, term8085.getClass(), "noTypeCheckSection", 0);
        term8139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8152 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8162 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8139, term8139.getClass(), "type", -1212399479);
        setIntField(term8141, term8141.getClass(), "type", 1059930704);
        setIntField(term8143, term8143.getClass(), "type", 0);
        setField(term8143, term8143.getClass(), "next", null);
        setField(term8143, term8143.getClass(), "first", null);
        setField(term8143, term8143.getClass(), "last", null);
        setField(term8143, term8143.getClass(), "propListHead", null);
        setIntField(term8143, term8143.getClass(), "sourcePosition", 0);
        setField(term8143, term8143.getClass(), "jsType", null);
        setField(term8143, term8143.getClass(), "parent", null);
        setField(term8141, term8141.getClass(), "next", term8143);
        setIntField(term8146, term8146.getClass(), "type", 0);
        setField(term8146, term8146.getClass(), "next", null);
        setField(term8146, term8146.getClass(), "first", null);
        setField(term8146, term8146.getClass(), "last", null);
        setField(term8146, term8146.getClass(), "propListHead", null);
        setIntField(term8146, term8146.getClass(), "sourcePosition", 0);
        setField(term8146, term8146.getClass(), "jsType", null);
        setField(term8146, term8146.getClass(), "parent", null);
        setField(term8141, term8141.getClass(), "first", term8146);
        setIntField(term8149, term8149.getClass(), "type", 0);
        setField(term8149, term8149.getClass(), "next", null);
        setField(term8149, term8149.getClass(), "first", null);
        setField(term8149, term8149.getClass(), "last", null);
        setField(term8149, term8149.getClass(), "propListHead", null);
        setIntField(term8149, term8149.getClass(), "sourcePosition", 0);
        setField(term8149, term8149.getClass(), "jsType", null);
        setField(term8149, term8149.getClass(), "parent", null);
        setField(term8141, term8141.getClass(), "last", term8149);
        setField(term8152, term8152.getClass(), "next", null);
        setIntField(term8152, term8152.getClass(), "type", 0);
        setIntField(term8152, term8152.getClass(), "intValue", 0);
        setField(term8152, term8152.getClass(), "objectValue", null);
        setField(term8141, term8141.getClass(), "propListHead", term8152);
        setIntField(term8141, term8141.getClass(), "sourcePosition", -796934571);
        setField(term8141, term8141.getClass(), "jsType", null);
        setField(term8141, term8141.getClass(), "parent", null);
        setField(term8139, term8139.getClass(), "next", term8141);
        setIntField(term8156, term8156.getClass(), "type", 0);
        setField(term8156, term8156.getClass(), "next", null);
        setField(term8156, term8156.getClass(), "first", null);
        setField(term8156, term8156.getClass(), "last", null);
        setField(term8156, term8156.getClass(), "propListHead", null);
        setIntField(term8156, term8156.getClass(), "sourcePosition", 0);
        setField(term8156, term8156.getClass(), "jsType", null);
        setField(term8156, term8156.getClass(), "parent", null);
        setField(term8139, term8139.getClass(), "first", term8156);
        setIntField(term8159, term8159.getClass(), "type", 0);
        setField(term8159, term8159.getClass(), "next", null);
        setField(term8159, term8159.getClass(), "first", null);
        setField(term8159, term8159.getClass(), "last", null);
        setField(term8159, term8159.getClass(), "propListHead", null);
        setIntField(term8159, term8159.getClass(), "sourcePosition", 0);
        setField(term8159, term8159.getClass(), "jsType", null);
        setField(term8159, term8159.getClass(), "parent", null);
        setField(term8139, term8139.getClass(), "last", term8159);
        setField(term8162, term8162.getClass(), "next", null);
        setIntField(term8162, term8162.getClass(), "type", 0);
        setIntField(term8162, term8162.getClass(), "intValue", 0);
        setField(term8162, term8162.getClass(), "objectValue", null);
        setField(term8139, term8139.getClass(), "propListHead", term8162);
        setIntField(term8139, term8139.getClass(), "sourcePosition", 405295896);
        setField(term8139, term8139.getClass(), "jsType", null);
        setField(term8139, term8139.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8139;
        try {
            callMethod(klass, "getFunctionType", argTypes, term8085, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


