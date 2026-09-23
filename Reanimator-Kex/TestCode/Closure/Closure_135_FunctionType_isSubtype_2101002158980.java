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

public class FunctionType_isSubtype_2101002158980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1093316;
     Object term1093772;

    public FunctionType_isSubtype_2101002158980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1095967 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1095966 = ((Class) term1095967).getDeclaredField((String) "ORDINARY");
        ((Field) term1095966).setAccessible(true);
        Object enum2039 = ((Field) term1095966).get((Object) null);
        term1093316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1093564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1093664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1093316, term1093316.getClass(), "kind", enum2039);
        setField(term1093564, term1093564.getClass(), "kind", enum2039);
        setField(term1093564, term1093564.getClass(), "typeOfThis", term1093664);
        setField(term1093316, term1093316.getClass(), "typeOfThis", term1093564);
        Class<? extends Object> term1096258 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1096257 = ((Class) term1096258).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1096257).setAccessible(true);
        Object enum2040 = ((Field) term1096257).get((Object) null);
        term1093772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1094028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1094210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1093772, term1093772.getClass(), "kind", enum2040);
        setField(term1094028, term1094028.getClass(), "kind", enum2039);
        setField(term1094028, term1094028.getClass(), "typeOfThis", term1094210);
        setField(term1093772, term1093772.getClass(), "typeOfThis", term1094028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1093772;
        try {
            callMethod(klass, "isSubtype", argTypes, term1093316, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


