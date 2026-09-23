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

public class FunctionType_getGreatestSubtype_679591709585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478166;
     Object term478826;

    public FunctionType_getGreatestSubtype_679591709585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term479838 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term479837 = ((Class) term479838).getDeclaredField((String) "INTERFACE");
        ((Field) term479837).setAccessible(true);
        Object enum886 = ((Field) term479837).get((Object) null);
        term478166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term478718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term478166, term478166.getClass(), "kind", enum886);
        setField(term478166, term478166.getClass(), "typeOfThis", term478718);
        Class<? extends Object> term480132 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term480131 = ((Class) term480132).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term480131).setAccessible(true);
        Object enum887 = ((Field) term480131).get((Object) null);
        term478826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term478826, term478826.getClass(), "kind", enum887);
        setField(term478826, term478826.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term478826;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term478166, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


