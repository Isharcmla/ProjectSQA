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

public class FunctionType_isSubtype_2101002158861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term893810;
     Object term894470;

    public FunctionType_isSubtype_2101002158861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term895767 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term895766 = ((Class) term895767).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term895766).setAccessible(true);
        Object enum1668 = ((Field) term895766).get((Object) null);
        term893810 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term894362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term893810, term893810.getClass(), "kind", enum1668);
        setField(term894362, term894362.getClass(), "kind", enum1668);
        setField(term893810, term893810.getClass(), "typeOfThis", term894362);
        Class<? extends Object> term896067 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term896066 = ((Class) term896067).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term896066).setAccessible(true);
        Object enum1669 = ((Field) term896066).get((Object) null);
        term894470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term894800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term894470, term894470.getClass(), "kind", enum1668);
        setField(term894800, term894800.getClass(), "kind", enum1669);
        setField(term894470, term894470.getClass(), "typeOfThis", term894800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term894470;
        try {
            callMethod(klass, "isSubtype", argTypes, term893810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


