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
import java.lang.Object;
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615658;
     Object term616346;

    public FunctionType_tryMergeFunctionPiecewise_2003411845621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term617863 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term617862 = ((Class) term617863).getDeclaredField((String) "ORDINARY");
        ((Field) term617862).setAccessible(true);
        Object enum953 = ((Field) term617862).get((Object) null);
        term615658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term615752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term615822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term615892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term615992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term616236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term615892, term615892.getClass(), "jsType", null);
        setField(term615892, term615892.getClass(), "next", null);
        setField(term615822, term615822.getClass(), "first", term615892);
        setField(term615752, term615752.getClass(), "parameters", term615822);
        setField(term615992, term615992.getClass(), "kind", enum953);
        setField(term615992, term615992.getClass(), "typeOfThis", term616236);
        setField(term615752, term615752.getClass(), "returnType", term615992);
        setField(term615658, term615658.getClass(), "call", term615752);
        Class<? extends Object> term618154 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term618153 = ((Class) term618154).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term618153).setAccessible(true);
        Object enum954 = ((Field) term618153).get((Object) null);
        term616346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term616440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term616510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term616580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term616680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term616580, term616580.getClass(), "jsType", null);
        setField(term616580, term616580.getClass(), "next", null);
        setField(term616510, term616510.getClass(), "first", term616580);
        setField(term616440, term616440.getClass(), "parameters", term616510);
        setField(term616680, term616680.getClass(), "kind", enum954);
        setField(term616680, term616680.getClass(), "typeOfThis", null);
        setField(term616440, term616440.getClass(), "returnType", term616680);
        setField(term616346, term616346.getClass(), "call", term616440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term616346;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term615658, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


