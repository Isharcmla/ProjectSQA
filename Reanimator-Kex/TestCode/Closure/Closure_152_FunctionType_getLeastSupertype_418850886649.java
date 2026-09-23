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

public class FunctionType_getLeastSupertype_418850886649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term656173;
     Object term656827;

    public FunctionType_getLeastSupertype_418850886649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term657967 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term657966 = ((Class) term657967).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term657966).setAccessible(true);
        Object enum1012 = ((Field) term657966).get((Object) null);
        term656173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term656717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term656173, term656173.getClass(), "kind", enum1012);
        setField(term656173, term656173.getClass(), "typeOfThis", term656717);
        Class<? extends Object> term658267 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term658266 = ((Class) term658267).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term658266).setAccessible(true);
        Object enum1013 = ((Field) term658266).get((Object) null);
        term656827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term657011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term656827, term656827.getClass(), "kind", enum1013);
        setField(term656827, term656827.getClass(), "typeOfThis", term657011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term656827;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term656173, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


