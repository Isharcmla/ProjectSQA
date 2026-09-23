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

public class FunctionType_isSubtype_21010021581718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2337156;
     Object term2337762;

    public FunctionType_isSubtype_21010021581718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2340211 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2340210 = ((Class) term2340211).getDeclaredField((String) "ORDINARY");
        ((Field) term2340210).setAccessible(true);
        Object enum4371 = ((Field) term2340210).get((Object) null);
        Class<? extends Object> term2340502 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2340501 = ((Class) term2340502).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2340501).setAccessible(true);
        Object enum4372 = ((Field) term2340501).get((Object) null);
        term2337156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2337412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2337654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2337156, term2337156.getClass(), "kind", enum4371);
        setField(term2337412, term2337412.getClass(), "kind", enum4372);
        setField(term2337412, term2337412.getClass(), "call", term2337654);
        setField(term2337156, term2337156.getClass(), "typeOfThis", term2337412);
        term2337762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2337944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2337762, term2337762.getClass(), "kind", enum4371);
        setField(term2337944, term2337944.getClass(), "kind", enum4372);
        setField(term2337944, term2337944.getClass(), "call", null);
        setField(term2337762, term2337762.getClass(), "typeOfThis", term2337944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2337762;
        try {
            callMethod(klass, "isSubtype", argTypes, term2337156, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


