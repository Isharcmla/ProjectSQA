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

public class FunctionType_getGreatestSubtype_679591709775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term756681;
     Object term757045;

    public FunctionType_getGreatestSubtype_679591709775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term760524 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term760523 = ((Class) term760524).getDeclaredField((String) "ORDINARY");
        ((Field) term760523).setAccessible(true);
        Object enum1417 = ((Field) term760523).get((Object) null);
        term756681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term756937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term756681, term756681.getClass(), "kind", enum1417);
        setField(term756681, term756681.getClass(), "typeOfThis", term756937);
        Class<? extends Object> term760815 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term760814 = ((Class) term760815).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term760814).setAccessible(true);
        Object enum1418 = ((Field) term760814).get((Object) null);
        term757045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term757293 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term757045, term757045.getClass(), "kind", enum1418);
        setField(term757045, term757045.getClass(), "typeOfThis", term757293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term757045;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term756681, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


