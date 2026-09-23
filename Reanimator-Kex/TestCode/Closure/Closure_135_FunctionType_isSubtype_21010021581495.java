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

public class FunctionType_isSubtype_21010021581495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1962135;
     Object term1962887;

    public FunctionType_isSubtype_21010021581495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1964725 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1964724 = ((Class) term1964725).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1964724).setAccessible(true);
        Object enum3660 = ((Field) term1964724).get((Object) null);
        term1962135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1962679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1962779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1962135, term1962135.getClass(), "kind", enum3660);
        setField(term1962679, term1962679.getClass(), "kind", enum3660);
        setField(term1962679, term1962679.getClass(), "typeOfThis", term1962779);
        setField(term1962679, term1962679.getClass(), "call", null);
        setField(term1962135, term1962135.getClass(), "typeOfThis", term1962679);
        Class<? extends Object> term1965025 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1965024 = ((Class) term1965025).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1965024).setAccessible(true);
        Object enum3661 = ((Field) term1965024).get((Object) null);
        term1962887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1963217 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1963311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1962887, term1962887.getClass(), "kind", enum3660);
        setField(term1963217, term1963217.getClass(), "kind", enum3661);
        setField(term1963217, term1963217.getClass(), "typeOfThis", null);
        setField(term1963217, term1963217.getClass(), "call", term1963311);
        setField(term1962887, term1962887.getClass(), "typeOfThis", term1963217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1962887;
        try {
            callMethod(klass, "isSubtype", argTypes, term1962135, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


