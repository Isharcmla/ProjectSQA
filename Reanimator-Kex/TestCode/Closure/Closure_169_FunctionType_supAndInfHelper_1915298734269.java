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

public class FunctionType_supAndInfHelper_1915298734269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259657;
     Object term260005;

    public FunctionType_supAndInfHelper_1915298734269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term261137 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term261136 = ((Class) term261137).getDeclaredField((String) "ORDINARY");
        ((Field) term261136).setAccessible(true);
        Object enum472 = ((Field) term261136).get((Object) null);
        term259657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term259905 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term259657, term259657.getClass(), "unknown", false);
        setField(term259657, term259657.getClass(), "kind", enum472);
        setField(term259657, term259657.getClass(), "typeOfThis", term259905);
        Class<? extends Object> term261428 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term261427 = ((Class) term261428).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term261427).setAccessible(true);
        Object enum473 = ((Field) term261427).get((Object) null);
        term260005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term260005, term260005.getClass(), "unknown", false);
        setField(term260005, term260005.getClass(), "kind", enum473);
        setField(term260005, term260005.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term260005;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term259657, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


