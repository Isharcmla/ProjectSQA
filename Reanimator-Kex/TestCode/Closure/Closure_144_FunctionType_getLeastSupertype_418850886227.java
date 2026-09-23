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

public class FunctionType_getLeastSupertype_418850886227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119806;
     Object term120174;

    public FunctionType_getLeastSupertype_418850886227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term121253 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term121252 = ((Class) term121253).getDeclaredField((String) "ORDINARY");
        ((Field) term121252).setAccessible(true);
        Object enum244 = ((Field) term121252).get((Object) null);
        term119806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term120064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term119806, term119806.getClass(), "kind", enum244);
        setField(term119806, term119806.getClass(), "typeOfThis", term120064);
        Class<? extends Object> term121544 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term121543 = ((Class) term121544).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term121543).setAccessible(true);
        Object enum245 = ((Field) term121543).get((Object) null);
        term120174 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term120174, term120174.getClass(), "kind", enum245);
        setField(term120174, term120174.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term120174;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term119806, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


