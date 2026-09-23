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

public class FunctionType_getGreatestSubtype_679591709676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607576;
     Object term608238;

    public FunctionType_getGreatestSubtype_679591709676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term611032 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term611031 = ((Class) term611032).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term611031).setAccessible(true);
        Object enum1130 = ((Field) term611031).get((Object) null);
        term607576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term608130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term607576, term607576.getClass(), "kind", enum1130);
        setField(term607576, term607576.getClass(), "typeOfThis", term608130);
        Class<? extends Object> term611332 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term611331 = ((Class) term611332).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term611331).setAccessible(true);
        Object enum1131 = ((Field) term611331).get((Object) null);
        term608238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term608238, term608238.getClass(), "kind", enum1131);
        setField(term608238, term608238.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term608238;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term607576, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


