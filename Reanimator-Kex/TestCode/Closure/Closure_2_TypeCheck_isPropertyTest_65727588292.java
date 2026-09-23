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

public class TypeCheck_isPropertyTest_65727588292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7864;
     Object term7918;

    public TypeCheck_isPropertyTest_65727588292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7868 = new HashMap();
        HashMap term7875 = new HashMap();
        Set<Object> term22453 =  ((Map) term7875).keySet();
        HashSet term7874 = new HashSet((Collection<? extends Object>) term22453);
        HashMap term7881 = new HashMap();
        Set<Object> term22454 =  ((Map) term7881).keySet();
        HashSet term7880 = new HashSet((Collection<? extends Object>) term22454);
        HashMap term7887 = new HashMap();
        Set<Object> term22455 =  ((Map) term7887).keySet();
        HashSet term7886 = new HashSet((Collection<? extends Object>) term22455);
        HashMap term7892 = new HashMap();
        HashMap term7898 = new HashMap();
        HashMap term7903 = new HashMap();
        term7864 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term7865 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term7866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7867 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term7864, term7864.getClass(), "compiler", null);
        setField(term7865, term7865.getClass(), "compiler", null);
        setField(term7866, term7866.getClass(), "reporter", null);
        setField(term7866, term7866.getClass(), "nativeTypes", term7867);
        setField(term7866, term7866.getClass(), "namesToTypes", term7868);
        setField(term7866, term7866.getClass(), "namespaces", term7874);
        setField(term7866, term7866.getClass(), "nonNullableTypeNames", term7880);
        setField(term7866, term7866.getClass(), "forwardDeclaredTypes", term7886);
        setField(term7866, term7866.getClass(), "typesIndexedByProperty", term7892);
        setField(term7866, term7866.getClass(), "eachRefTypeIndexedByProperty", term7898);
        setField(term7866, term7866.getClass(), "greatestSubtypeByProperty", term7903);
        setField(term7866, term7866.getClass(), "interfaceToImplementors", null);
        setField(term7866, term7866.getClass(), "unresolvedNamedTypes", null);
        setField(term7866, term7866.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7866, term7866.getClass(), "lastGeneration", false);
        setField(term7866, term7866.getClass(), "templateTypes", null);
        setBooleanField(term7866, term7866.getClass(), "tolerateUndefinedValues", false);
        setField(term7866, term7866.getClass(), "resolveMode", null);
        setField(term7865, term7865.getClass(), "typeRegistry", term7866);
        setField(term7865, term7865.getClass(), "allValueTypes", null);
        setBooleanField(term7865, term7865.getClass(), "shouldReport", false);
        setField(term7865, term7865.getClass(), "nullOrUndefined", null);
        setField(term7865, term7865.getClass(), "mismatches", null);
        setField(term7864, term7864.getClass(), "validator", term7865);
        setField(term7864, term7864.getClass(), "reverseInterpreter", null);
        setField(term7864, term7864.getClass(), "typeRegistry", null);
        setField(term7864, term7864.getClass(), "topScope", null);
        setField(term7864, term7864.getClass(), "scopeCreator", null);
        setField(term7864, term7864.getClass(), "reportMissingOverride", null);
        setField(term7864, term7864.getClass(), "reportUnknownTypes", null);
        setBooleanField(term7864, term7864.getClass(), "reportMissingProperties", false);
        setField(term7864, term7864.getClass(), "inferJSDocInfo", null);
        setIntField(term7864, term7864.getClass(), "typedCount", 0);
        setIntField(term7864, term7864.getClass(), "nullCount", 0);
        setIntField(term7864, term7864.getClass(), "unknownCount", 0);
        setBooleanField(term7864, term7864.getClass(), "inExterns", false);
        setIntField(term7864, term7864.getClass(), "noTypeCheckSection", 0);
        term7918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7918, term7918.getClass(), "type", -1079020032);
        setIntField(term7920, term7920.getClass(), "type", -1973791064);
        setIntField(term7922, term7922.getClass(), "type", -2072158633);
        setIntField(term7924, term7924.getClass(), "type", -355469363);
        setIntField(term7926, term7926.getClass(), "type", 1465188553);
        setField(term7926, term7926.getClass(), "next", null);
        setField(term7926, term7926.getClass(), "first", null);
        setField(term7926, term7926.getClass(), "last", null);
        setField(term7926, term7926.getClass(), "propListHead", null);
        setIntField(term7926, term7926.getClass(), "sourcePosition", 0);
        setField(term7926, term7926.getClass(), "jsType", null);
        setField(term7926, term7926.getClass(), "parent", null);
        setField(term7924, term7924.getClass(), "next", term7926);
        setIntField(term7929, term7929.getClass(), "type", 1633913667);
        setField(term7929, term7929.getClass(), "next", null);
        setField(term7929, term7929.getClass(), "first", null);
        setField(term7929, term7929.getClass(), "last", term7926);
        setField(term7929, term7929.getClass(), "propListHead", null);
        setIntField(term7929, term7929.getClass(), "sourcePosition", 0);
        setField(term7929, term7929.getClass(), "jsType", null);
        setField(term7929, term7929.getClass(), "parent", null);
        setField(term7924, term7924.getClass(), "first", term7929);
        setField(term7924, term7924.getClass(), "last", term7922);
        setField(term7924, term7924.getClass(), "propListHead", null);
        setIntField(term7924, term7924.getClass(), "sourcePosition", 0);
        setField(term7924, term7924.getClass(), "jsType", null);
        setField(term7924, term7924.getClass(), "parent", null);
        setField(term7922, term7922.getClass(), "next", term7924);
        setField(term7922, term7922.getClass(), "first", term7926);
        setIntField(term7933, term7933.getClass(), "type", -1415256843);
        setIntField(term7935, term7935.getClass(), "type", 612177768);
        setField(term7935, term7935.getClass(), "next", null);
        setField(term7935, term7935.getClass(), "first", term7929);
        setField(term7935, term7935.getClass(), "last", term7924);
        setField(term7935, term7935.getClass(), "propListHead", null);
        setIntField(term7935, term7935.getClass(), "sourcePosition", 0);
        setField(term7935, term7935.getClass(), "jsType", null);
        setField(term7935, term7935.getClass(), "parent", null);
        setField(term7933, term7933.getClass(), "next", term7935);
        setField(term7933, term7933.getClass(), "first", term7920);
        setField(term7933, term7933.getClass(), "last", term7920);
        setField(term7933, term7933.getClass(), "propListHead", null);
        setIntField(term7933, term7933.getClass(), "sourcePosition", 0);
        setField(term7933, term7933.getClass(), "jsType", null);
        setField(term7933, term7933.getClass(), "parent", null);
        setField(term7922, term7922.getClass(), "last", term7933);
        setField(term7922, term7922.getClass(), "propListHead", null);
        setIntField(term7922, term7922.getClass(), "sourcePosition", 0);
        setField(term7922, term7922.getClass(), "jsType", null);
        setField(term7922, term7922.getClass(), "parent", null);
        setField(term7920, term7920.getClass(), "next", term7922);
        setIntField(term7940, term7940.getClass(), "type", -1626451656);
        setField(term7940, term7940.getClass(), "next", term7933);
        setField(term7940, term7940.getClass(), "first", term7935);
        setField(term7940, term7940.getClass(), "last", term7918);
        setField(term7940, term7940.getClass(), "propListHead", null);
        setIntField(term7940, term7940.getClass(), "sourcePosition", 0);
        setField(term7940, term7940.getClass(), "jsType", null);
        setField(term7940, term7940.getClass(), "parent", null);
        setField(term7920, term7920.getClass(), "first", term7940);
        setField(term7920, term7920.getClass(), "last", term7940);
        setField(term7920, term7920.getClass(), "propListHead", null);
        setIntField(term7920, term7920.getClass(), "sourcePosition", 0);
        setField(term7920, term7920.getClass(), "jsType", null);
        setField(term7920, term7920.getClass(), "parent", null);
        setField(term7918, term7918.getClass(), "next", term7920);
        setField(term7918, term7918.getClass(), "first", term7924);
        setField(term7918, term7918.getClass(), "last", term7926);
        setField(term7918, term7918.getClass(), "propListHead", null);
        setIntField(term7918, term7918.getClass(), "sourcePosition", 0);
        setField(term7918, term7918.getClass(), "jsType", null);
        setField(term7918, term7918.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7918;
        try {
            callMethod(klass, "isPropertyTest", argTypes, term7864, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


