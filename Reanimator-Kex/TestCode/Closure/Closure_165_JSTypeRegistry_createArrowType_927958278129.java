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

public class JSTypeRegistry_createArrowType_927958278129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9095;
     Object term9180;

    public JSTypeRegistry_createArrowType_927958278129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9097 = new HashMap();
        HashMap term9107 = new HashMap();
        Set<Object> term491842 =  ((Map) term9107).keySet();
        HashSet term9106 = new HashSet((Collection<? extends Object>) term491842);
        HashMap term9124 = new HashMap();
        Set<Object> term491843 =  ((Map) term9124).keySet();
        HashSet term9123 = new HashSet((Collection<? extends Object>) term491843);
        HashMap term9133 = new HashMap();
        Set<Object> term491844 =  ((Map) term9133).keySet();
        HashSet term9132 = new HashSet((Collection<? extends Object>) term491844);
        HashMap term9149 = new HashMap();
        HashMap term9164 = new HashMap();
        HashMap term9169 = new HashMap();
        term9095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9096 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term9095, term9095.getClass(), "reporter", null);
        setField(term9095, term9095.getClass(), "nativeTypes", term9096);
        setField(term9095, term9095.getClass(), "namesToTypes", term9097);
        setField(term9095, term9095.getClass(), "namespaces", term9106);
        setField(term9095, term9095.getClass(), "nonNullableTypeNames", term9123);
        setField(term9095, term9095.getClass(), "forwardDeclaredTypes", term9132);
        setField(term9095, term9095.getClass(), "typesIndexedByProperty", term9149);
        setField(term9095, term9095.getClass(), "eachRefTypeIndexedByProperty", term9164);
        setField(term9095, term9095.getClass(), "greatestSubtypeByProperty", term9169);
        setField(term9095, term9095.getClass(), "interfaceToImplementors", null);
        setField(term9095, term9095.getClass(), "unresolvedNamedTypes", null);
        setField(term9095, term9095.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9095, term9095.getClass(), "lastGeneration", false);
        setField(term9095, term9095.getClass(), "templateTypeName", null);
        setField(term9095, term9095.getClass(), "templateType", null);
        setBooleanField(term9095, term9095.getClass(), "tolerateUndefinedValues", false);
        setField(term9095, term9095.getClass(), "resolveMode", null);
        term9180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9180, term9180.getClass(), "type", -1070592289);
        setIntField(term9182, term9182.getClass(), "type", -1464172784);
        setIntField(term9184, term9184.getClass(), "type", 32185364);
        setIntField(term9186, term9186.getClass(), "type", 1768204942);
        setIntField(term9188, term9188.getClass(), "type", 1252951645);
        setField(term9188, term9188.getClass(), "next", null);
        setField(term9188, term9188.getClass(), "first", null);
        setField(term9188, term9188.getClass(), "last", null);
        setField(term9188, term9188.getClass(), "propListHead", null);
        setIntField(term9188, term9188.getClass(), "sourcePosition", 0);
        setField(term9188, term9188.getClass(), "jsType", null);
        setField(term9188, term9188.getClass(), "parent", null);
        setField(term9186, term9186.getClass(), "next", term9188);
        setIntField(term9191, term9191.getClass(), "type", 574481092);
        setField(term9191, term9191.getClass(), "next", null);
        setField(term9191, term9191.getClass(), "first", null);
        setField(term9191, term9191.getClass(), "last", term9188);
        setField(term9191, term9191.getClass(), "propListHead", null);
        setIntField(term9191, term9191.getClass(), "sourcePosition", 0);
        setField(term9191, term9191.getClass(), "jsType", null);
        setField(term9191, term9191.getClass(), "parent", null);
        setField(term9186, term9186.getClass(), "first", term9191);
        setField(term9186, term9186.getClass(), "last", term9184);
        setField(term9186, term9186.getClass(), "propListHead", null);
        setIntField(term9186, term9186.getClass(), "sourcePosition", 0);
        setField(term9186, term9186.getClass(), "jsType", null);
        setField(term9186, term9186.getClass(), "parent", null);
        setField(term9184, term9184.getClass(), "next", term9186);
        setField(term9184, term9184.getClass(), "first", term9188);
        setIntField(term9195, term9195.getClass(), "type", -634976996);
        setIntField(term9197, term9197.getClass(), "type", -1015274146);
        setField(term9197, term9197.getClass(), "next", null);
        setField(term9197, term9197.getClass(), "first", term9191);
        setField(term9197, term9197.getClass(), "last", term9186);
        setField(term9197, term9197.getClass(), "propListHead", null);
        setIntField(term9197, term9197.getClass(), "sourcePosition", 0);
        setField(term9197, term9197.getClass(), "jsType", null);
        setField(term9197, term9197.getClass(), "parent", null);
        setField(term9195, term9195.getClass(), "next", term9197);
        setField(term9195, term9195.getClass(), "first", term9182);
        setField(term9195, term9195.getClass(), "last", term9182);
        setField(term9195, term9195.getClass(), "propListHead", null);
        setIntField(term9195, term9195.getClass(), "sourcePosition", 0);
        setField(term9195, term9195.getClass(), "jsType", null);
        setField(term9195, term9195.getClass(), "parent", null);
        setField(term9184, term9184.getClass(), "last", term9195);
        setField(term9184, term9184.getClass(), "propListHead", null);
        setIntField(term9184, term9184.getClass(), "sourcePosition", 0);
        setField(term9184, term9184.getClass(), "jsType", null);
        setField(term9184, term9184.getClass(), "parent", null);
        setField(term9182, term9182.getClass(), "next", term9184);
        setIntField(term9202, term9202.getClass(), "type", -49052672);
        setField(term9202, term9202.getClass(), "next", term9195);
        setField(term9202, term9202.getClass(), "first", term9197);
        setField(term9202, term9202.getClass(), "last", term9180);
        setField(term9202, term9202.getClass(), "propListHead", null);
        setIntField(term9202, term9202.getClass(), "sourcePosition", 0);
        setField(term9202, term9202.getClass(), "jsType", null);
        setField(term9202, term9202.getClass(), "parent", null);
        setField(term9182, term9182.getClass(), "first", term9202);
        setField(term9182, term9182.getClass(), "last", term9202);
        setField(term9182, term9182.getClass(), "propListHead", null);
        setIntField(term9182, term9182.getClass(), "sourcePosition", 0);
        setField(term9182, term9182.getClass(), "jsType", null);
        setField(term9182, term9182.getClass(), "parent", null);
        setField(term9180, term9180.getClass(), "next", term9182);
        setField(term9180, term9180.getClass(), "first", term9186);
        setField(term9180, term9180.getClass(), "last", term9188);
        setField(term9180, term9180.getClass(), "propListHead", null);
        setIntField(term9180, term9180.getClass(), "sourcePosition", 0);
        setField(term9180, term9180.getClass(), "jsType", null);
        setField(term9180, term9180.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9180;
        try {
            callMethod(klass, "createArrowType", argTypes, term9095, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


