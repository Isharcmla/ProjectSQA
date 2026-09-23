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

public class FunctionType_isSubtype_21010021581005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1134615;
     Object term1135065;

    public FunctionType_isSubtype_21010021581005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1136258 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1136257 = ((Class) term1136258).getDeclaredField((String) "ORDINARY");
        ((Field) term1136257).setAccessible(true);
        Object enum2113 = ((Field) term1136257).get((Object) null);
        term1134615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1134863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1134957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1134615, term1134615.getClass(), "kind", enum2113);
        setField(term1134615, term1134615.getClass(), "typeOfThis", term1134863);
        setField(term1134615, term1134615.getClass(), "call", term1134957);
        Class<? extends Object> term1136549 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1136548 = ((Class) term1136549).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1136548).setAccessible(true);
        Object enum2114 = ((Field) term1136548).get((Object) null);
        term1135065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1135321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1135065, term1135065.getClass(), "kind", enum2114);
        setField(term1135065, term1135065.getClass(), "typeOfThis", term1135321);
        setField(term1135065, term1135065.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1135065;
        try {
            callMethod(klass, "isSubtype", argTypes, term1134615, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


