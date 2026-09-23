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

public class FunctionType_getLeastSupertype_418850886201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105092;
     Object term105646;

    public FunctionType_getLeastSupertype_418850886201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term106649 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term106648 = ((Class) term106649).getDeclaredField((String) "ORDINARY");
        ((Field) term106648).setAccessible(true);
        Object enum214 = ((Field) term106648).get((Object) null);
        term105092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term105092, term105092.getClass(), "kind", enum214);
        Class<? extends Object> term106940 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term106939 = ((Class) term106940).getDeclaredField((String) "INTERFACE");
        ((Field) term106939).setAccessible(true);
        Object enum215 = ((Field) term106939).get((Object) null);
        term105646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term105646, term105646.getClass(), "kind", enum215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term105646;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term105092, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


