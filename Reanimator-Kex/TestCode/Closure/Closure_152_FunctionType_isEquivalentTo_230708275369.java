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

public class FunctionType_isEquivalentTo_230708275369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264331;
     Object term264995;

    public FunctionType_isEquivalentTo_230708275369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term265822 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term265821 = ((Class) term265822).getDeclaredField((String) "ORDINARY");
        ((Field) term265821).setAccessible(true);
        Object enum465 = ((Field) term265821).get((Object) null);
        term264331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term264885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term264331, term264331.getClass(), "kind", enum465);
        setField(term264331, term264331.getClass(), "typeOfThis", term264885);
        term264995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term264995, term264995.getClass(), "kind", enum465);
        setField(term264995, term264995.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term264995;
        try {
            callMethod(klass, "isEquivalentTo", argTypes, term264331, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


