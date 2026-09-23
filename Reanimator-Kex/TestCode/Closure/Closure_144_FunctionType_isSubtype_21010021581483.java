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

public class FunctionType_isSubtype_21010021581483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2143674;
     Object term2144326;

    public FunctionType_isSubtype_21010021581483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2147144 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2147143 = ((Class) term2147144).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2147143).setAccessible(true);
        Object enum3822 = ((Field) term2147143).get((Object) null);
        Class<? extends Object> term2147444 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2147443 = ((Class) term2147444).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2147443).setAccessible(true);
        Object enum3823 = ((Field) term2147443).get((Object) null);
        term2143674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2144218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2143674, term2143674.getClass(), "kind", enum3822);
        setField(term2144218, term2144218.getClass(), "kind", enum3823);
        setField(term2143674, term2143674.getClass(), "typeOfThis", term2144218);
        term2144326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2144658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2144326, term2144326.getClass(), "kind", enum3822);
        setField(term2144658, term2144658.getClass(), "kind", enum3823);
        setField(term2144326, term2144326.getClass(), "typeOfThis", term2144658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2144326;
        try {
            callMethod(klass, "isSubtype", argTypes, term2143674, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


