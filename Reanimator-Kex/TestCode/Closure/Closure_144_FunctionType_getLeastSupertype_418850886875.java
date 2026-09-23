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

public class FunctionType_getLeastSupertype_418850886875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1050668;
     Object term1051428;

    public FunctionType_getLeastSupertype_418850886875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1052564 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1052563 = ((Class) term1052564).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1052563).setAccessible(true);
        Object enum1900 = ((Field) term1052563).get((Object) null);
        term1050668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1051222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1051318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1050668, term1050668.getClass(), "kind", enum1900);
        setField(term1051222, term1051222.getClass(), "kind", enum1900);
        setField(term1051222, term1051222.getClass(), "typeOfThis", term1051318);
        setField(term1050668, term1050668.getClass(), "typeOfThis", term1051222);
        Class<? extends Object> term1052864 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1052863 = ((Class) term1052864).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1052863).setAccessible(true);
        Object enum1901 = ((Field) term1052863).get((Object) null);
        term1051428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1051602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1051428, term1051428.getClass(), "kind", enum1901);
        setField(term1051602, term1051602.getClass(), "kind", enum1901);
        setField(term1051602, term1051602.getClass(), "typeOfThis", null);
        setField(term1051428, term1051428.getClass(), "typeOfThis", term1051602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1051428;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1050668, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


