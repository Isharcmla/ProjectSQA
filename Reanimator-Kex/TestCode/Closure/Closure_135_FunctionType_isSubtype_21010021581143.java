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

public class FunctionType_isSubtype_21010021581143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1356934;
     Object term1357390;

    public FunctionType_isSubtype_21010021581143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1358968 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1358967 = ((Class) term1358968).getDeclaredField((String) "ORDINARY");
        ((Field) term1358967).setAccessible(true);
        Object enum2541 = ((Field) term1358967).get((Object) null);
        term1356934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1357182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1357282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1356934, term1356934.getClass(), "kind", enum2541);
        setField(term1357182, term1357182.getClass(), "kind", enum2541);
        setField(term1357182, term1357182.getClass(), "typeOfThis", term1357282);
        setField(term1356934, term1356934.getClass(), "typeOfThis", term1357182);
        Class<? extends Object> term1359259 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1359258 = ((Class) term1359259).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1359258).setAccessible(true);
        Object enum2542 = ((Field) term1359258).get((Object) null);
        term1357390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1357572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1357390, term1357390.getClass(), "kind", enum2541);
        setField(term1357572, term1357572.getClass(), "kind", enum2542);
        setField(term1357572, term1357572.getClass(), "typeOfThis", null);
        setField(term1357390, term1357390.getClass(), "typeOfThis", term1357572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1357390;
        try {
            callMethod(klass, "isSubtype", argTypes, term1356934, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


