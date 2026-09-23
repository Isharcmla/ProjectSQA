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

public class FunctionType_getLeastSupertype_418850886359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252202;
     Object term252564;

    public FunctionType_getLeastSupertype_418850886359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term253637 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term253636 = ((Class) term253637).getDeclaredField((String) "INTERFACE");
        ((Field) term253636).setAccessible(true);
        Object enum440 = ((Field) term253636).get((Object) null);
        term252202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term252454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term252202, term252202.getClass(), "kind", enum440);
        setField(term252202, term252202.getClass(), "registry", term252454);
        Class<? extends Object> term253931 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term253930 = ((Class) term253931).getDeclaredField((String) "ORDINARY");
        ((Field) term253930).setAccessible(true);
        Object enum441 = ((Field) term253930).get((Object) null);
        term252564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term252564, term252564.getClass(), "kind", enum441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term252564;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term252202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


