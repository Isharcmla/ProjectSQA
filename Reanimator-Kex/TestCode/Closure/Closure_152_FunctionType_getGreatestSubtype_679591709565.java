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

public class FunctionType_getGreatestSubtype_679591709565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534242;
     Object term534920;

    public FunctionType_getGreatestSubtype_679591709565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term535791 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term535790 = ((Class) term535791).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term535790).setAccessible(true);
        Object enum840 = ((Field) term535790).get((Object) null);
        term534242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term534810 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term534242, term534242.getClass(), "kind", enum840);
        setField(term534242, term534242.getClass(), "typeOfThis", term534810);
        term534920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term534920, term534920.getClass(), "kind", enum840);
        setField(term534920, term534920.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term534920;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term534242, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


