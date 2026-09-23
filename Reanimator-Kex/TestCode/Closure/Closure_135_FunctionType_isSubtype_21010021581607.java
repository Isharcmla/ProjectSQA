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

public class FunctionType_isSubtype_21010021581607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2151862;
     Object term2152620;

    public FunctionType_isSubtype_21010021581607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2156140 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2156139 = ((Class) term2156140).getDeclaredField((String) "ORDINARY");
        ((Field) term2156139).setAccessible(true);
        Object enum4018 = ((Field) term2156139).get((Object) null);
        Class<? extends Object> term2156431 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2156430 = ((Class) term2156431).getDeclaredField((String) "INTERFACE");
        ((Field) term2156430).setAccessible(true);
        Object enum4019 = ((Field) term2156430).get((Object) null);
        term2151862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2152406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2152512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term2151862, term2151862.getClass(), "kind", enum4018);
        setField(term2152406, term2152406.getClass(), "kind", enum4019);
        setField(term2152406, term2152406.getClass(), "typeOfThis", term2152512);
        setField(term2151862, term2151862.getClass(), "typeOfThis", term2152406);
        term2152620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2152950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2152620, term2152620.getClass(), "kind", enum4018);
        setField(term2152950, term2152950.getClass(), "kind", enum4018);
        setField(term2152950, term2152950.getClass(), "typeOfThis", null);
        setField(term2152620, term2152620.getClass(), "typeOfThis", term2152950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2152620;
        try {
            callMethod(klass, "isSubtype", argTypes, term2151862, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


