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

public class FunctionType_isSubtype_21010021581546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2049611;
     Object term2050263;

    public FunctionType_isSubtype_21010021581546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2052940 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2052939 = ((Class) term2052940).getDeclaredField((String) "ORDINARY");
        ((Field) term2052939).setAccessible(true);
        Object enum3822 = ((Field) term2052939).get((Object) null);
        term2049611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2050155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2049611, term2049611.getClass(), "kind", enum3822);
        setField(term2049611, term2049611.getClass(), "typeOfThis", term2050155);
        Class<? extends Object> term2053231 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2053230 = ((Class) term2053231).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2053230).setAccessible(true);
        Object enum3823 = ((Field) term2053230).get((Object) null);
        term2050263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2050425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2050263, term2050263.getClass(), "kind", enum3823);
        setField(term2050263, term2050263.getClass(), "typeOfThis", term2050425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2050263;
        try {
            callMethod(klass, "isSubtype", argTypes, term2049611, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


