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

public class FunctionType_isSubtype_2101002158664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589466;
     Object term590118;

    public FunctionType_isSubtype_2101002158664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term593227 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term593226 = ((Class) term593227).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term593226).setAccessible(true);
        Object enum1095 = ((Field) term593226).get((Object) null);
        term589466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term590010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term589466, term589466.getClass(), "kind", enum1095);
        setField(term589466, term589466.getClass(), "typeOfThis", term590010);
        Class<? extends Object> term593527 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term593526 = ((Class) term593527).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term593526).setAccessible(true);
        Object enum1096 = ((Field) term593526).get((Object) null);
        term590118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term590302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term590118, term590118.getClass(), "kind", enum1096);
        setField(term590118, term590118.getClass(), "typeOfThis", term590302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term590118;
        try {
            callMethod(klass, "isSubtype", argTypes, term589466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


