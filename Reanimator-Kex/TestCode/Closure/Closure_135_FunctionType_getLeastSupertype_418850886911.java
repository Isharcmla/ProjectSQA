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

public class FunctionType_getLeastSupertype_418850886911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term983624;
     Object term984286;

    public FunctionType_getLeastSupertype_418850886911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term985415 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term985414 = ((Class) term985415).getDeclaredField((String) "INTERFACE");
        ((Field) term985414).setAccessible(true);
        Object enum1836 = ((Field) term985414).get((Object) null);
        term983624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term984178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term983624, term983624.getClass(), "kind", enum1836);
        setField(term983624, term983624.getClass(), "typeOfThis", term984178);
        Class<? extends Object> term985709 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term985708 = ((Class) term985709).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term985708).setAccessible(true);
        Object enum1837 = ((Field) term985708).get((Object) null);
        term984286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term984470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term984286, term984286.getClass(), "kind", enum1837);
        setField(term984286, term984286.getClass(), "typeOfThis", term984470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term984286;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term983624, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


