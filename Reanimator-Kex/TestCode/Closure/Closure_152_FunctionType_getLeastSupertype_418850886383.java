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

public class FunctionType_getLeastSupertype_418850886383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283233;
     Object term283595;

    public FunctionType_getLeastSupertype_418850886383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term284673 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term284672 = ((Class) term284673).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term284672).setAccessible(true);
        Object enum495 = ((Field) term284672).get((Object) null);
        term283233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term283485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term283233, term283233.getClass(), "kind", enum495);
        setField(term283233, term283233.getClass(), "registry", term283485);
        Class<? extends Object> term284973 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term284972 = ((Class) term284973).getDeclaredField((String) "ORDINARY");
        ((Field) term284972).setAccessible(true);
        Object enum496 = ((Field) term284972).get((Object) null);
        term283595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term283595, term283595.getClass(), "kind", enum496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term283595;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term283233, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


