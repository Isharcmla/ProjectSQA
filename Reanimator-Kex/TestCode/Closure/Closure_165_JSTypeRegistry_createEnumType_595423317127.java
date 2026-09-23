package com.google.javascript.rhino.jstype;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_createEnumType_595423317127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8833;
     Object term8926;

    public JSTypeRegistry_createEnumType_595423317127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8835 = new HashMap();
        HashMap term8845 = new HashMap();
        Set<Object> term491124 =  ((Map) term8845).keySet();
        HashSet term8844 = new HashSet((Collection<? extends Object>) term491124);
        HashMap term8860 = new HashMap();
        Set<Object> term491125 =  ((Map) term8860).keySet();
        HashSet term8859 = new HashSet((Collection<? extends Object>) term491125);
        HashMap term8871 = new HashMap();
        Set<Object> term491126 =  ((Map) term8871).keySet();
        HashSet term8870 = new HashSet((Collection<? extends Object>) term491126);
        HashMap term8883 = new HashMap();
        HashMap term8898 = new HashMap();
        HashMap term8903 = new HashMap();
        term8833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8834 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term8833, term8833.getClass(), "reporter", null);
        setField(term8833, term8833.getClass(), "nativeTypes", term8834);
        setField(term8833, term8833.getClass(), "namesToTypes", term8835);
        setField(term8833, term8833.getClass(), "namespaces", term8844);
        setField(term8833, term8833.getClass(), "nonNullableTypeNames", term8859);
        setField(term8833, term8833.getClass(), "forwardDeclaredTypes", term8870);
        setField(term8833, term8833.getClass(), "typesIndexedByProperty", term8883);
        setField(term8833, term8833.getClass(), "eachRefTypeIndexedByProperty", term8898);
        setField(term8833, term8833.getClass(), "greatestSubtypeByProperty", term8903);
        setField(term8833, term8833.getClass(), "interfaceToImplementors", null);
        setField(term8833, term8833.getClass(), "unresolvedNamedTypes", null);
        setField(term8833, term8833.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8833, term8833.getClass(), "lastGeneration", false);
        setField(term8833, term8833.getClass(), "templateTypeName", null);
        setField(term8833, term8833.getClass(), "templateType", null);
        setBooleanField(term8833, term8833.getClass(), "tolerateUndefinedValues", false);
        setField(term8833, term8833.getClass(), "resolveMode", null);
        term8926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8926, term8926.getClass(), "type", 34470066);
        setIntField(term8928, term8928.getClass(), "type", 2058711405);
        setIntField(term8930, term8930.getClass(), "type", 1743683601);
        setIntField(term8932, term8932.getClass(), "type", -945116798);
        setIntField(term8934, term8934.getClass(), "type", 1593461795);
        setField(term8934, term8934.getClass(), "next", null);
        setField(term8934, term8934.getClass(), "first", null);
        setField(term8934, term8934.getClass(), "last", null);
        setField(term8934, term8934.getClass(), "propListHead", null);
        setIntField(term8934, term8934.getClass(), "sourcePosition", 0);
        setField(term8934, term8934.getClass(), "jsType", null);
        setField(term8934, term8934.getClass(), "parent", null);
        setField(term8932, term8932.getClass(), "next", term8934);
        setIntField(term8937, term8937.getClass(), "type", 515182546);
        setField(term8937, term8937.getClass(), "next", null);
        setField(term8937, term8937.getClass(), "first", null);
        setField(term8937, term8937.getClass(), "last", term8934);
        setField(term8937, term8937.getClass(), "propListHead", null);
        setIntField(term8937, term8937.getClass(), "sourcePosition", 0);
        setField(term8937, term8937.getClass(), "jsType", null);
        setField(term8937, term8937.getClass(), "parent", null);
        setField(term8932, term8932.getClass(), "first", term8937);
        setField(term8932, term8932.getClass(), "last", term8930);
        setField(term8932, term8932.getClass(), "propListHead", null);
        setIntField(term8932, term8932.getClass(), "sourcePosition", 0);
        setField(term8932, term8932.getClass(), "jsType", null);
        setField(term8932, term8932.getClass(), "parent", null);
        setField(term8930, term8930.getClass(), "next", term8932);
        setField(term8930, term8930.getClass(), "first", term8934);
        setIntField(term8941, term8941.getClass(), "type", -129547140);
        setIntField(term8943, term8943.getClass(), "type", 199287428);
        setField(term8943, term8943.getClass(), "next", null);
        setField(term8943, term8943.getClass(), "first", term8937);
        setField(term8943, term8943.getClass(), "last", term8932);
        setField(term8943, term8943.getClass(), "propListHead", null);
        setIntField(term8943, term8943.getClass(), "sourcePosition", 0);
        setField(term8943, term8943.getClass(), "jsType", null);
        setField(term8943, term8943.getClass(), "parent", null);
        setField(term8941, term8941.getClass(), "next", term8943);
        setField(term8941, term8941.getClass(), "first", term8928);
        setField(term8941, term8941.getClass(), "last", term8928);
        setField(term8941, term8941.getClass(), "propListHead", null);
        setIntField(term8941, term8941.getClass(), "sourcePosition", 0);
        setField(term8941, term8941.getClass(), "jsType", null);
        setField(term8941, term8941.getClass(), "parent", null);
        setField(term8930, term8930.getClass(), "last", term8941);
        setField(term8930, term8930.getClass(), "propListHead", null);
        setIntField(term8930, term8930.getClass(), "sourcePosition", 0);
        setField(term8930, term8930.getClass(), "jsType", null);
        setField(term8930, term8930.getClass(), "parent", null);
        setField(term8928, term8928.getClass(), "next", term8930);
        setIntField(term8948, term8948.getClass(), "type", -1195339592);
        setField(term8948, term8948.getClass(), "next", term8941);
        setField(term8948, term8948.getClass(), "first", term8943);
        setField(term8948, term8948.getClass(), "last", term8926);
        setField(term8948, term8948.getClass(), "propListHead", null);
        setIntField(term8948, term8948.getClass(), "sourcePosition", 0);
        setField(term8948, term8948.getClass(), "jsType", null);
        setField(term8948, term8948.getClass(), "parent", null);
        setField(term8928, term8928.getClass(), "first", term8948);
        setField(term8928, term8928.getClass(), "last", term8948);
        setField(term8928, term8928.getClass(), "propListHead", null);
        setIntField(term8928, term8928.getClass(), "sourcePosition", 0);
        setField(term8928, term8928.getClass(), "jsType", null);
        setField(term8928, term8928.getClass(), "parent", null);
        setField(term8926, term8926.getClass(), "next", term8928);
        setField(term8926, term8926.getClass(), "first", term8932);
        setField(term8926, term8926.getClass(), "last", term8934);
        setField(term8926, term8926.getClass(), "propListHead", null);
        setIntField(term8926, term8926.getClass(), "sourcePosition", 0);
        setField(term8926, term8926.getClass(), "jsType", null);
        setField(term8926, term8926.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = "nVXCBYnEcg";
        args[1] = term8926;
        args[2] = null;
        try {
            callMethod(klass, "createEnumType", argTypes, term8833, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


