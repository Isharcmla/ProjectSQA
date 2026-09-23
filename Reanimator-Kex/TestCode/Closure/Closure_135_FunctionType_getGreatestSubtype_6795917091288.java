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

public class FunctionType_getGreatestSubtype_6795917091288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1609875;
     Object term1610645;

    public FunctionType_getGreatestSubtype_6795917091288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1615354 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1615353 = ((Class) term1615354).getDeclaredField((String) "INTERFACE");
        ((Field) term1615353).setAccessible(true);
        Object enum3006 = ((Field) term1615353).get((Object) null);
        term1609875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1610427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1610537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term1609875, term1609875.getClass(), "kind", enum3006);
        setField(term1610427, term1610427.getClass(), "kind", enum3006);
        setField(term1610427, term1610427.getClass(), "typeOfThis", term1610537);
        setField(term1609875, term1609875.getClass(), "typeOfThis", term1610427);
        term1610645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1610967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1610645, term1610645.getClass(), "kind", enum3006);
        setField(term1610967, term1610967.getClass(), "kind", enum3006);
        setField(term1610967, term1610967.getClass(), "typeOfThis", null);
        setField(term1610645, term1610645.getClass(), "typeOfThis", term1610967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1610645;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1609875, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


