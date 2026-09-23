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

public class FunctionType_isSubtype_21010021581752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2394263;
     Object term2394815;

    public FunctionType_isSubtype_21010021581752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2395995 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2395994 = ((Class) term2395995).getDeclaredField((String) "ORDINARY");
        ((Field) term2395994).setAccessible(true);
        Object enum4474 = ((Field) term2395994).get((Object) null);
        term2394263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2394263, term2394263.getClass(), "kind", enum4474);
        setField(term2394263, term2394263.getClass(), "typeOfThis", term2394263);
        term2394815 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2395155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term2394815, term2394815.getClass(), "kind", enum4474);
        setField(term2394815, term2394815.getClass(), "typeOfThis", term2395155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2394815;
        try {
            callMethod(klass, "isSubtype", argTypes, term2394263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


