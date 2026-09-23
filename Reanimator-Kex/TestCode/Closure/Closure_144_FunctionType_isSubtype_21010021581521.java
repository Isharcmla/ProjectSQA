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

public class FunctionType_isSubtype_21010021581521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2214074;
     Object term2214528;

    public FunctionType_isSubtype_21010021581521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2219131 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2219130 = ((Class) term2219131).getDeclaredField((String) "ORDINARY");
        ((Field) term2219130).setAccessible(true);
        Object enum3958 = ((Field) term2219130).get((Object) null);
        term2214074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2214322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2214418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term2214074, term2214074.getClass(), "kind", enum3958);
        setField(term2214322, term2214322.getClass(), "kind", enum3958);
        setField(term2214322, term2214322.getClass(), "typeOfThis", term2214418);
        setField(term2214322, term2214322.getClass(), "call", null);
        setField(term2214074, term2214074.getClass(), "typeOfThis", term2214322);
        Class<? extends Object> term2219422 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2219421 = ((Class) term2219422).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2219421).setAccessible(true);
        Object enum3959 = ((Field) term2219421).get((Object) null);
        term2214528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2214710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2214958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2215052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2214528, term2214528.getClass(), "kind", enum3958);
        setField(term2214710, term2214710.getClass(), "kind", enum3959);
        setField(term2214710, term2214710.getClass(), "typeOfThis", term2214958);
        setField(term2214710, term2214710.getClass(), "call", term2215052);
        setField(term2214528, term2214528.getClass(), "typeOfThis", term2214710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2214528;
        try {
            callMethod(klass, "isSubtype", argTypes, term2214074, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


