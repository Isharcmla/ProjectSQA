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

public class FunctionType_isSubtype_21010021581263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1570704;
     Object term1571068;

    public FunctionType_isSubtype_21010021581263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1572252 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1572251 = ((Class) term1572252).getDeclaredField((String) "ORDINARY");
        ((Field) term1572251).setAccessible(true);
        Object enum2934 = ((Field) term1572251).get((Object) null);
        term1570704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1570960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1570704, term1570704.getClass(), "kind", enum2934);
        setField(term1570704, term1570704.getClass(), "typeOfThis", term1570960);
        Class<? extends Object> term1572543 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1572542 = ((Class) term1572543).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1572542).setAccessible(true);
        Object enum2935 = ((Field) term1572542).get((Object) null);
        term1571068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1571324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1571068, term1571068.getClass(), "kind", enum2935);
        setField(term1571068, term1571068.getClass(), "typeOfThis", term1571324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1571068;
        try {
            callMethod(klass, "isSubtype", argTypes, term1570704, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


