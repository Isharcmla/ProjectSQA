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

public class FunctionType_setPrototype_1918602805235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112597;
     Object term112863;

    public FunctionType_setPrototype_1918602805235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term114589 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term114588 = ((Class) term114589).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term114588).setAccessible(true);
        Object enum222 = ((Field) term114588).get((Object) null);
        term112597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term112597, term112597.getClass(), "kind", enum222);
        setField(term112597, term112597.getClass(), "typeOfThis", null);
        setField(term112597, term112597.getClass(), "prototype", null);
        term112863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term112969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term112863, term112863.getClass(), "implicitPrototype", term112969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term112863;
        try {
            callMethod(klass, "setPrototype", argTypes, term112597, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


