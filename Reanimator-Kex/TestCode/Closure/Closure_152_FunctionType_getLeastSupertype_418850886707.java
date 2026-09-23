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

public class FunctionType_getLeastSupertype_418850886707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748667;
     Object term749373;

    public FunctionType_getLeastSupertype_418850886707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term750763 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term750762 = ((Class) term750763).getDeclaredField((String) "ORDINARY");
        ((Field) term750762).setAccessible(true);
        Object enum1131 = ((Field) term750762).get((Object) null);
        Class<? extends Object> term751054 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term751053 = ((Class) term751054).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term751053).setAccessible(true);
        Object enum1132 = ((Field) term751053).get((Object) null);
        term748667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term748915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term749497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term749621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term748667, term748667.getClass(), "kind", enum1131);
        setField(term748915, term748915.getClass(), "kind", enum1131);
        setField(term749497, term749497.getClass(), "kind", enum1132);
        setField(term749497, term749497.getClass(), "typeOfThis", term749621);
        setField(term748915, term748915.getClass(), "typeOfThis", term749497);
        setField(term748667, term748667.getClass(), "typeOfThis", term748915);
        term749373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term749373, term749373.getClass(), "kind", enum1131);
        setField(term749373, term749373.getClass(), "typeOfThis", term749497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term749373;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term748667, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


