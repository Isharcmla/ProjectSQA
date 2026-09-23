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

public class FunctionType_isSubtype_21010021581071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1238946;
     Object term1239604;

    public FunctionType_isSubtype_21010021581071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1240645 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1240644 = ((Class) term1240645).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1240644).setAccessible(true);
        Object enum2311 = ((Field) term1240644).get((Object) null);
        term1238946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1239496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term1238946, term1238946.getClass(), "kind", enum2311);
        setField(term1238946, term1238946.getClass(), "typeOfThis", term1239496);
        Class<? extends Object> term1240945 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1240944 = ((Class) term1240945).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1240944).setAccessible(true);
        Object enum2312 = ((Field) term1240944).get((Object) null);
        term1239604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1239604, term1239604.getClass(), "kind", enum2312);
        setField(term1239604, term1239604.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1239604;
        try {
            callMethod(klass, "isSubtype", argTypes, term1238946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


