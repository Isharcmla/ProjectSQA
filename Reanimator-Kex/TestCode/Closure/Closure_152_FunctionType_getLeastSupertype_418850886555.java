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

public class FunctionType_getLeastSupertype_418850886555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519592;
     Object term519954;

    public FunctionType_getLeastSupertype_418850886555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term520676 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term520675 = ((Class) term520676).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term520675).setAccessible(true);
        Object enum822 = ((Field) term520675).get((Object) null);
        term519592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term519844 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term519592, term519592.getClass(), "kind", enum822);
        setField(term519592, term519592.getClass(), "registry", term519844);
        term519954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term519954, term519954.getClass(), "kind", enum822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term519954;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term519592, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


