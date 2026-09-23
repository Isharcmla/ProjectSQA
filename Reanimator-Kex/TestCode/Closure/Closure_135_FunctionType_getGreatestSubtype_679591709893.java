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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_getGreatestSubtype_679591709893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949299;
     Object term949963;

    public FunctionType_getGreatestSubtype_679591709893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term953764 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term953763 = ((Class) term953764).getDeclaredField((String) "INTERFACE");
        ((Field) term953763).setAccessible(true);
        Object enum1778 = ((Field) term953763).get((Object) null);
        term949299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term949855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term949299, term949299.getClass(), "kind", enum1778);
        setField(term949299, term949299.getClass(), "typeOfThis", term949855);
        Class<? extends Object> term954058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term954057 = ((Class) term954058).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term954057).setAccessible(true);
        Object enum1779 = ((Field) term954057).get((Object) null);
        term949963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term949963, term949963.getClass(), "kind", enum1779);
        setField(term949963, term949963.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term949963;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term949299, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


