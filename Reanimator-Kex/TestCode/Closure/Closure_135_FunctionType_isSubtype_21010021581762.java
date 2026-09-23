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

public class FunctionType_isSubtype_21010021581762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2411613;
     Object term2412219;

    public FunctionType_isSubtype_21010021581762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2413890 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2413889 = ((Class) term2413890).getDeclaredField((String) "ORDINARY");
        ((Field) term2413889).setAccessible(true);
        Object enum4507 = ((Field) term2413889).get((Object) null);
        Class<? extends Object> term2414181 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2414180 = ((Class) term2414181).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2414180).setAccessible(true);
        Object enum4508 = ((Field) term2414180).get((Object) null);
        term2411613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2411869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2412111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2411613, term2411613.getClass(), "kind", enum4507);
        setField(term2411869, term2411869.getClass(), "kind", enum4508);
        setField(term2411869, term2411869.getClass(), "typeOfThis", null);
        setField(term2411869, term2411869.getClass(), "call", term2412111);
        setField(term2411613, term2411613.getClass(), "typeOfThis", term2411869);
        term2412219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2412401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2412495 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term2412589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2412219, term2412219.getClass(), "kind", enum4507);
        setField(term2412401, term2412401.getClass(), "kind", enum4507);
        setField(term2412401, term2412401.getClass(), "typeOfThis", term2412495);
        setField(term2412401, term2412401.getClass(), "call", term2412589);
        setField(term2412219, term2412219.getClass(), "typeOfThis", term2412401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2412219;
        try {
            callMethod(klass, "isSubtype", argTypes, term2411613, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


