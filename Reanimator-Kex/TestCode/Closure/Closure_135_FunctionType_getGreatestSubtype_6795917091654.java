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

public class FunctionType_getGreatestSubtype_6795917091654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2233016;
     Object term2233676;

    public FunctionType_getGreatestSubtype_6795917091654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2234792 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2234791 = ((Class) term2234792).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2234791).setAccessible(true);
        Object enum4165 = ((Field) term2234791).get((Object) null);
        Class<? extends Object> term2235092 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2235091 = ((Class) term2235092).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2235091).setAccessible(true);
        Object enum4166 = ((Field) term2235091).get((Object) null);
        term2233016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2233568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2233016, term2233016.getClass(), "kind", enum4165);
        setField(term2233568, term2233568.getClass(), "kind", enum4166);
        setField(term2233016, term2233016.getClass(), "typeOfThis", term2233568);
        term2233676 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2233850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2233676, term2233676.getClass(), "kind", enum4166);
        setField(term2233850, term2233850.getClass(), "kind", enum4166);
        setField(term2233676, term2233676.getClass(), "typeOfThis", term2233850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2233676;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2233016, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


