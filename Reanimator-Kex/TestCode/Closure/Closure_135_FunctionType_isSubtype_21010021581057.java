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

public class FunctionType_isSubtype_21010021581057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1211887;
     Object term1212343;

    public FunctionType_isSubtype_21010021581057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1215643 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1215642 = ((Class) term1215643).getDeclaredField((String) "ORDINARY");
        ((Field) term1215642).setAccessible(true);
        Object enum2264 = ((Field) term1215642).get((Object) null);
        term1211887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1212135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1212235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1211887, term1211887.getClass(), "kind", enum2264);
        setField(term1212135, term1212135.getClass(), "kind", enum2264);
        setField(term1212135, term1212135.getClass(), "typeOfThis", term1212235);
        setField(term1211887, term1211887.getClass(), "typeOfThis", term1212135);
        Class<? extends Object> term1215934 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1215933 = ((Class) term1215934).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1215933).setAccessible(true);
        Object enum2265 = ((Field) term1215933).get((Object) null);
        term1212343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1212599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1212781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1212343, term1212343.getClass(), "kind", enum2265);
        setField(term1212599, term1212599.getClass(), "kind", enum2264);
        setField(term1212599, term1212599.getClass(), "typeOfThis", term1212781);
        setField(term1212343, term1212343.getClass(), "typeOfThis", term1212599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1212343;
        try {
            callMethod(klass, "isSubtype", argTypes, term1211887, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


