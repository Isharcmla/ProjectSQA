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

public class FunctionType_getGreatestSubtype_679591709743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705128;
     Object term705588;

    public FunctionType_getGreatestSubtype_679591709743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term706940 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term706939 = ((Class) term706940).getDeclaredField((String) "ORDINARY");
        ((Field) term706939).setAccessible(true);
        Object enum1312 = ((Field) term706939).get((Object) null);
        term705128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term705384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term705480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term705128, term705128.getClass(), "kind", enum1312);
        setField(term705384, term705384.getClass(), "kind", enum1312);
        setField(term705384, term705384.getClass(), "typeOfThis", term705480);
        setField(term705128, term705128.getClass(), "typeOfThis", term705384);
        Class<? extends Object> term707231 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term707230 = ((Class) term707231).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term707230).setAccessible(true);
        Object enum1313 = ((Field) term707230).get((Object) null);
        term705588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term705836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term705588, term705588.getClass(), "kind", enum1313);
        setField(term705836, term705836.getClass(), "kind", enum1312);
        setField(term705836, term705836.getClass(), "typeOfThis", null);
        setField(term705588, term705588.getClass(), "typeOfThis", term705836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term705588;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term705128, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


