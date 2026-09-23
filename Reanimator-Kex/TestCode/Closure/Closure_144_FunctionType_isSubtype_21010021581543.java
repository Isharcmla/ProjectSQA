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

public class FunctionType_isSubtype_21010021581543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2256356;
     Object term2256708;

    public FunctionType_isSubtype_21010021581543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2257920 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2257919 = ((Class) term2257920).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2257919).setAccessible(true);
        Object enum4029 = ((Field) term2257919).get((Object) null);
        term2256356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2256598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2256356, term2256356.getClass(), "kind", enum4029);
        setField(term2256356, term2256356.getClass(), "call", term2256598);
        Class<? extends Object> term2258220 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2258219 = ((Class) term2258220).getDeclaredField((String) "ORDINARY");
        ((Field) term2258219).setAccessible(true);
        Object enum4030 = ((Field) term2258219).get((Object) null);
        term2256708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2256950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2256708, term2256708.getClass(), "kind", enum4030);
        setField(term2256708, term2256708.getClass(), "call", term2256950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2256708;
        try {
            callMethod(klass, "isSubtype", argTypes, term2256356, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


