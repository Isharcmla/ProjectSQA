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

public class FunctionType_isSubtype_21010021581684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2285266;
     Object term2285928;

    public FunctionType_isSubtype_21010021581684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2287100 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2287099 = ((Class) term2287100).getDeclaredField((String) "ORDINARY");
        ((Field) term2287099).setAccessible(true);
        Object enum4271 = ((Field) term2287099).get((Object) null);
        term2285266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2285820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2285266, term2285266.getClass(), "kind", enum4271);
        setField(term2285266, term2285266.getClass(), "typeOfThis", term2285820);
        Class<? extends Object> term2287391 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2287390 = ((Class) term2287391).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2287390).setAccessible(true);
        Object enum4272 = ((Field) term2287390).get((Object) null);
        term2285928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2286110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2285928, term2285928.getClass(), "kind", enum4272);
        setField(term2285928, term2285928.getClass(), "typeOfThis", term2286110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2285928;
        try {
            callMethod(klass, "isSubtype", argTypes, term2285266, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


