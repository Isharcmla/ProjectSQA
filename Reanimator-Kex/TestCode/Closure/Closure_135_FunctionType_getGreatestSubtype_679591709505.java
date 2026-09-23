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

public class FunctionType_getGreatestSubtype_679591709505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367218;
     Object term367688;

    public FunctionType_getGreatestSubtype_679591709505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term370969 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term370968 = ((Class) term370969).getDeclaredField((String) "ORDINARY");
        ((Field) term370968).setAccessible(true);
        Object enum678 = ((Field) term370968).get((Object) null);
        term367218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term367474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term367580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term367218, term367218.getClass(), "kind", enum678);
        setField(term367474, term367474.getClass(), "kind", enum678);
        setField(term367474, term367474.getClass(), "typeOfThis", term367580);
        setField(term367218, term367218.getClass(), "typeOfThis", term367474);
        Class<? extends Object> term371260 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term371259 = ((Class) term371260).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term371259).setAccessible(true);
        Object enum679 = ((Field) term371259).get((Object) null);
        term367688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term367936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term367688, term367688.getClass(), "kind", enum679);
        setField(term367936, term367936.getClass(), "kind", enum678);
        setField(term367936, term367936.getClass(), "typeOfThis", null);
        setField(term367688, term367688.getClass(), "typeOfThis", term367936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term367688;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term367218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


