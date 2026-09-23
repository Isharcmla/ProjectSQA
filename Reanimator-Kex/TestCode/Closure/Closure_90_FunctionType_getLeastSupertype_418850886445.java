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

public class FunctionType_getLeastSupertype_418850886445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363004;
     Object term363758;

    public FunctionType_getLeastSupertype_418850886445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term364861 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term364860 = ((Class) term364861).getDeclaredField((String) "ORDINARY");
        ((Field) term364860).setAccessible(true);
        Object enum620 = ((Field) term364860).get((Object) null);
        term363004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term363548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term363648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term363004, term363004.getClass(), "kind", enum620);
        setField(term363548, term363548.getClass(), "kind", enum620);
        setField(term363548, term363548.getClass(), "typeOfThis", term363648);
        setField(term363004, term363004.getClass(), "typeOfThis", term363548);
        term363758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term364080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term364194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term363758, term363758.getClass(), "kind", enum620);
        setField(term364080, term364080.getClass(), "kind", enum620);
        setField(term364080, term364080.getClass(), "typeOfThis", term364194);
        setField(term363758, term363758.getClass(), "typeOfThis", term364080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term363758;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term363004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


