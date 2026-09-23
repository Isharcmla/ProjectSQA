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
import java.lang.Boolean;

public class JSTypeRegistry_createFunctionType_2073774669144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10465;
     Object term10556;
     Object term10558;

    public JSTypeRegistry_createFunctionType_2073774669144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10467 = new HashMap();
        HashMap term10477 = new HashMap();
        Set<Object> term502192 =  ((Map) term10477).keySet();
        HashSet term10476 = new HashSet((Collection<? extends Object>) term502192);
        HashMap term10496 = new HashMap();
        Set<Object> term502193 =  ((Map) term10496).keySet();
        HashSet term10495 = new HashSet((Collection<? extends Object>) term502193);
        HashMap term10505 = new HashMap();
        Set<Object> term502194 =  ((Map) term10505).keySet();
        HashSet term10504 = new HashSet((Collection<? extends Object>) term502194);
        HashMap term10525 = new HashMap();
        HashMap term10540 = new HashMap();
        HashMap term10545 = new HashMap();
        term10465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10466 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term10465, term10465.getClass(), "reporter", null);
        setField(term10465, term10465.getClass(), "nativeTypes", term10466);
        setField(term10465, term10465.getClass(), "namesToTypes", term10467);
        setField(term10465, term10465.getClass(), "namespaces", term10476);
        setField(term10465, term10465.getClass(), "nonNullableTypeNames", term10495);
        setField(term10465, term10465.getClass(), "forwardDeclaredTypes", term10504);
        setField(term10465, term10465.getClass(), "typesIndexedByProperty", term10525);
        setField(term10465, term10465.getClass(), "eachRefTypeIndexedByProperty", term10540);
        setField(term10465, term10465.getClass(), "greatestSubtypeByProperty", term10545);
        setField(term10465, term10465.getClass(), "interfaceToImplementors", null);
        setField(term10465, term10465.getClass(), "unresolvedNamedTypes", null);
        setField(term10465, term10465.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10465, term10465.getClass(), "lastGeneration", false);
        setField(term10465, term10465.getClass(), "templateTypeName", null);
        setField(term10465, term10465.getClass(), "templateType", null);
        setBooleanField(term10465, term10465.getClass(), "tolerateUndefinedValues", false);
        setField(term10465, term10465.getClass(), "resolveMode", null);
        term10556 = new Boolean(false);
        term10558 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        argTypes[2] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term10556;
        args[2] = term10558;
        try {
            callMethod(klass, "createFunctionType", argTypes, term10465, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


