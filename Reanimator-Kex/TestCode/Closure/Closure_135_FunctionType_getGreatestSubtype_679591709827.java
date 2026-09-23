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

public class FunctionType_getGreatestSubtype_679591709827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839985;
     Object term840633;

    public FunctionType_getGreatestSubtype_679591709827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term841647 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term841646 = ((Class) term841647).getDeclaredField((String) "INTERFACE");
        ((Field) term841646).setAccessible(true);
        Object enum1569 = ((Field) term841646).get((Object) null);
        term839985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term840525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term839985, term839985.getClass(), "kind", enum1569);
        setField(term839985, term839985.getClass(), "typeOfThis", term840525);
        Class<? extends Object> term841941 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term841940 = ((Class) term841941).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term841940).setAccessible(true);
        Object enum1570 = ((Field) term841940).get((Object) null);
        term840633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term840633, term840633.getClass(), "kind", enum1570);
        setField(term840633, term840633.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term840633;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term839985, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


