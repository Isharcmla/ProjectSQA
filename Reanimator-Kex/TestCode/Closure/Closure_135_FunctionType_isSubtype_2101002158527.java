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

public class FunctionType_isSubtype_2101002158527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395377;
     Object term395743;

    public FunctionType_isSubtype_2101002158527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term396880 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term396879 = ((Class) term396880).getDeclaredField((String) "ORDINARY");
        ((Field) term396879).setAccessible(true);
        Object enum729 = ((Field) term396879).get((Object) null);
        term395377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term395633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term395377, term395377.getClass(), "kind", enum729);
        setField(term395377, term395377.getClass(), "typeOfThis", term395633);
        Class<? extends Object> term397171 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term397170 = ((Class) term397171).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term397170).setAccessible(true);
        Object enum730 = ((Field) term397170).get((Object) null);
        term395743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term395743, term395743.getClass(), "kind", enum730);
        setField(term395743, term395743.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term395743;
        try {
            callMethod(klass, "isSubtype", argTypes, term395377, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


