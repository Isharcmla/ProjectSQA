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

public class FunctionType_getGreatestSubtype_679591709928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1135562;
     Object term1136030;

    public FunctionType_getGreatestSubtype_679591709928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1139300 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1139299 = ((Class) term1139300).getDeclaredField((String) "ORDINARY");
        ((Field) term1139299).setAccessible(true);
        Object enum2045 = ((Field) term1139299).get((Object) null);
        term1135562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1135820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1135920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1135562, term1135562.getClass(), "kind", enum2045);
        setField(term1135820, term1135820.getClass(), "kind", enum2045);
        setField(term1135820, term1135820.getClass(), "typeOfThis", term1135920);
        setField(term1135562, term1135562.getClass(), "typeOfThis", term1135820);
        Class<? extends Object> term1139591 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1139590 = ((Class) term1139591).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1139590).setAccessible(true);
        Object enum2046 = ((Field) term1139590).get((Object) null);
        term1136030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1136286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1136460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1136030, term1136030.getClass(), "kind", enum2046);
        setField(term1136286, term1136286.getClass(), "kind", enum2045);
        setField(term1136286, term1136286.getClass(), "typeOfThis", term1136460);
        setField(term1136030, term1136030.getClass(), "typeOfThis", term1136286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1136030;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1135562, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


