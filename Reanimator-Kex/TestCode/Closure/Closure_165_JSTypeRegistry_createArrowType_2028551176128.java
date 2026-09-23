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

public class JSTypeRegistry_createArrowType_2028551176128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8966;
     Object term9065;

    public JSTypeRegistry_createArrowType_2028551176128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8968 = new HashMap();
        HashMap term8978 = new HashMap();
        Set<Object> term491488 =  ((Map) term8978).keySet();
        HashSet term8977 = new HashSet((Collection<? extends Object>) term491488);
        HashMap term8997 = new HashMap();
        Set<Object> term491489 =  ((Map) term8997).keySet();
        HashSet term8996 = new HashSet((Collection<? extends Object>) term491489);
        HashMap term9018 = new HashMap();
        Set<Object> term491490 =  ((Map) term9018).keySet();
        HashSet term9017 = new HashSet((Collection<? extends Object>) term491490);
        HashMap term9034 = new HashMap();
        HashMap term9049 = new HashMap();
        HashMap term9054 = new HashMap();
        term8966 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8967 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term8966, term8966.getClass(), "reporter", null);
        setField(term8966, term8966.getClass(), "nativeTypes", term8967);
        setField(term8966, term8966.getClass(), "namesToTypes", term8968);
        setField(term8966, term8966.getClass(), "namespaces", term8977);
        setField(term8966, term8966.getClass(), "nonNullableTypeNames", term8996);
        setField(term8966, term8966.getClass(), "forwardDeclaredTypes", term9017);
        setField(term8966, term8966.getClass(), "typesIndexedByProperty", term9034);
        setField(term8966, term8966.getClass(), "eachRefTypeIndexedByProperty", term9049);
        setField(term8966, term8966.getClass(), "greatestSubtypeByProperty", term9054);
        setField(term8966, term8966.getClass(), "interfaceToImplementors", null);
        setField(term8966, term8966.getClass(), "unresolvedNamedTypes", null);
        setField(term8966, term8966.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8966, term8966.getClass(), "lastGeneration", false);
        setField(term8966, term8966.getClass(), "templateTypeName", null);
        setField(term8966, term8966.getClass(), "templateType", null);
        setBooleanField(term8966, term8966.getClass(), "tolerateUndefinedValues", false);
        setField(term8966, term8966.getClass(), "resolveMode", null);
        term9065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9065, term9065.getClass(), "type", 1050765721);
        setIntField(term9067, term9067.getClass(), "type", 474518942);
        setIntField(term9069, term9069.getClass(), "type", -1656687479);
        setIntField(term9071, term9071.getClass(), "type", -249614216);
        setIntField(term9073, term9073.getClass(), "type", 1870727665);
        setField(term9073, term9073.getClass(), "next", null);
        setField(term9073, term9073.getClass(), "first", null);
        setField(term9073, term9073.getClass(), "last", null);
        setField(term9073, term9073.getClass(), "propListHead", null);
        setIntField(term9073, term9073.getClass(), "sourcePosition", 0);
        setField(term9073, term9073.getClass(), "jsType", null);
        setField(term9073, term9073.getClass(), "parent", null);
        setField(term9071, term9071.getClass(), "next", term9073);
        setIntField(term9076, term9076.getClass(), "type", -519881101);
        setField(term9076, term9076.getClass(), "next", null);
        setField(term9076, term9076.getClass(), "first", null);
        setField(term9076, term9076.getClass(), "last", term9073);
        setField(term9076, term9076.getClass(), "propListHead", null);
        setIntField(term9076, term9076.getClass(), "sourcePosition", 0);
        setField(term9076, term9076.getClass(), "jsType", null);
        setField(term9076, term9076.getClass(), "parent", null);
        setField(term9071, term9071.getClass(), "first", term9076);
        setField(term9071, term9071.getClass(), "last", term9069);
        setField(term9071, term9071.getClass(), "propListHead", null);
        setIntField(term9071, term9071.getClass(), "sourcePosition", 0);
        setField(term9071, term9071.getClass(), "jsType", null);
        setField(term9071, term9071.getClass(), "parent", null);
        setField(term9069, term9069.getClass(), "next", term9071);
        setField(term9069, term9069.getClass(), "first", term9073);
        setIntField(term9080, term9080.getClass(), "type", -916335264);
        setIntField(term9082, term9082.getClass(), "type", -919416536);
        setField(term9082, term9082.getClass(), "next", null);
        setField(term9082, term9082.getClass(), "first", term9076);
        setField(term9082, term9082.getClass(), "last", term9071);
        setField(term9082, term9082.getClass(), "propListHead", null);
        setIntField(term9082, term9082.getClass(), "sourcePosition", 0);
        setField(term9082, term9082.getClass(), "jsType", null);
        setField(term9082, term9082.getClass(), "parent", null);
        setField(term9080, term9080.getClass(), "next", term9082);
        setField(term9080, term9080.getClass(), "first", term9067);
        setField(term9080, term9080.getClass(), "last", term9067);
        setField(term9080, term9080.getClass(), "propListHead", null);
        setIntField(term9080, term9080.getClass(), "sourcePosition", 0);
        setField(term9080, term9080.getClass(), "jsType", null);
        setField(term9080, term9080.getClass(), "parent", null);
        setField(term9069, term9069.getClass(), "last", term9080);
        setField(term9069, term9069.getClass(), "propListHead", null);
        setIntField(term9069, term9069.getClass(), "sourcePosition", 0);
        setField(term9069, term9069.getClass(), "jsType", null);
        setField(term9069, term9069.getClass(), "parent", null);
        setField(term9067, term9067.getClass(), "next", term9069);
        setIntField(term9087, term9087.getClass(), "type", -43417861);
        setField(term9087, term9087.getClass(), "next", term9080);
        setField(term9087, term9087.getClass(), "first", term9082);
        setField(term9087, term9087.getClass(), "last", term9065);
        setField(term9087, term9087.getClass(), "propListHead", null);
        setIntField(term9087, term9087.getClass(), "sourcePosition", 0);
        setField(term9087, term9087.getClass(), "jsType", null);
        setField(term9087, term9087.getClass(), "parent", null);
        setField(term9067, term9067.getClass(), "first", term9087);
        setField(term9067, term9067.getClass(), "last", term9087);
        setField(term9067, term9067.getClass(), "propListHead", null);
        setIntField(term9067, term9067.getClass(), "sourcePosition", 0);
        setField(term9067, term9067.getClass(), "jsType", null);
        setField(term9067, term9067.getClass(), "parent", null);
        setField(term9065, term9065.getClass(), "next", term9067);
        setField(term9065, term9065.getClass(), "first", term9071);
        setField(term9065, term9065.getClass(), "last", term9073);
        setField(term9065, term9065.getClass(), "propListHead", null);
        setIntField(term9065, term9065.getClass(), "sourcePosition", 0);
        setField(term9065, term9065.getClass(), "jsType", null);
        setField(term9065, term9065.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term9065;
        args[1] = null;
        try {
            callMethod(klass, "createArrowType", argTypes, term8966, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


