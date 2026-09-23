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

public class FunctionType_isSubtype_21010021581469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2120008;
     Object term2120468;

    public FunctionType_isSubtype_21010021581469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2121726 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2121725 = ((Class) term2121726).getDeclaredField((String) "ORDINARY");
        ((Field) term2121725).setAccessible(true);
        Object enum3779 = ((Field) term2121725).get((Object) null);
        term2120008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2120264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2120358 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2120008, term2120008.getClass(), "kind", enum3779);
        setField(term2120008, term2120008.getClass(), "typeOfThis", term2120264);
        setField(term2120008, term2120008.getClass(), "call", term2120358);
        Class<? extends Object> term2122017 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2122016 = ((Class) term2122017).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2122016).setAccessible(true);
        Object enum3780 = ((Field) term2122016).get((Object) null);
        term2120468 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2120710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2120468, term2120468.getClass(), "kind", enum3780);
        setField(term2120468, term2120468.getClass(), "typeOfThis", null);
        setField(term2120468, term2120468.getClass(), "call", term2120710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2120468;
        try {
            callMethod(klass, "isSubtype", argTypes, term2120008, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


