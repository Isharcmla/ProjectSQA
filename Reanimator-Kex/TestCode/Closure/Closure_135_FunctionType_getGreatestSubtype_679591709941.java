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

public class FunctionType_getGreatestSubtype_679591709941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1028216;
     Object term1028868;

    public FunctionType_getGreatestSubtype_679591709941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1029978 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1029977 = ((Class) term1029978).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1029977).setAccessible(true);
        Object enum1919 = ((Field) term1029977).get((Object) null);
        Class<? extends Object> term1030278 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1030277 = ((Class) term1030278).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1030277).setAccessible(true);
        Object enum1920 = ((Field) term1030277).get((Object) null);
        term1028216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1028760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1028216, term1028216.getClass(), "kind", enum1919);
        setField(term1028760, term1028760.getClass(), "kind", enum1920);
        setField(term1028216, term1028216.getClass(), "typeOfThis", term1028760);
        term1028868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1029042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1028868, term1028868.getClass(), "kind", enum1920);
        setField(term1028868, term1028868.getClass(), "typeOfThis", term1029042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1028868;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1028216, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


