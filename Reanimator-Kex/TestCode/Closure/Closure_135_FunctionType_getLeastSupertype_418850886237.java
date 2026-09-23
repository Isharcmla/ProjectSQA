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

public class FunctionType_getLeastSupertype_418850886237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115386;
     Object term115730;

    public FunctionType_getLeastSupertype_418850886237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term116814 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term116813 = ((Class) term116814).getDeclaredField((String) "ORDINARY");
        ((Field) term116813).setAccessible(true);
        Object enum226 = ((Field) term116813).get((Object) null);
        term115386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term115622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term115386, term115386.getClass(), "kind", enum226);
        setField(term115386, term115386.getClass(), "typeOfThis", term115622);
        Class<? extends Object> term117105 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term117104 = ((Class) term117105).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term117104).setAccessible(true);
        Object enum227 = ((Field) term117104).get((Object) null);
        term115730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term115730, term115730.getClass(), "kind", enum227);
        setField(term115730, term115730.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term115730;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term115386, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


