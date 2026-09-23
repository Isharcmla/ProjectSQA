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

public class FunctionType_isSubtype_21010021581488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2154128;
     Object term2154582;

    public FunctionType_isSubtype_21010021581488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2157663 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2157662 = ((Class) term2157663).getDeclaredField((String) "ORDINARY");
        ((Field) term2157662).setAccessible(true);
        Object enum3841 = ((Field) term2157662).get((Object) null);
        term2154128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2154364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term2154474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2154128, term2154128.getClass(), "kind", enum3841);
        setField(term2154364, term2154364.getClass(), "kind", enum3841);
        setField(term2154364, term2154364.getClass(), "typeOfThis", term2154474);
        setField(term2154128, term2154128.getClass(), "typeOfThis", term2154364);
        term2154582 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2154766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2154854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2154582, term2154582.getClass(), "kind", enum3841);
        setField(term2154766, term2154766.getClass(), "kind", enum3841);
        setField(term2154766, term2154766.getClass(), "typeOfThis", term2154854);
        setField(term2154582, term2154582.getClass(), "typeOfThis", term2154766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2154582;
        try {
            callMethod(klass, "isSubtype", argTypes, term2154128, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


