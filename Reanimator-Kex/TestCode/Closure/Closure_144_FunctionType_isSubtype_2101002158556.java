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

public class FunctionType_isSubtype_2101002158556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505324;
     Object term505976;

    public FunctionType_isSubtype_2101002158556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term509367 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term509366 = ((Class) term509367).getDeclaredField((String) "ORDINARY");
        ((Field) term509366).setAccessible(true);
        Object enum925 = ((Field) term509366).get((Object) null);
        Class<? extends Object> term509658 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term509657 = ((Class) term509658).getDeclaredField((String) "INTERFACE");
        ((Field) term509657).setAccessible(true);
        Object enum926 = ((Field) term509657).get((Object) null);
        term505324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term505868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term505324, term505324.getClass(), "kind", enum925);
        setField(term505868, term505868.getClass(), "kind", enum926);
        setField(term505324, term505324.getClass(), "typeOfThis", term505868);
        Class<? extends Object> term509952 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term509951 = ((Class) term509952).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term509951).setAccessible(true);
        Object enum927 = ((Field) term509951).get((Object) null);
        term505976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term506308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term505976, term505976.getClass(), "kind", enum925);
        setField(term506308, term506308.getClass(), "kind", enum927);
        setField(term505976, term505976.getClass(), "typeOfThis", term506308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term505976;
        try {
            callMethod(klass, "isSubtype", argTypes, term505324, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


