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

public class FunctionType_isSubtype_21010021581088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1263897;
     Object term1264361;

    public FunctionType_isSubtype_21010021581088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1269232 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1269231 = ((Class) term1269232).getDeclaredField((String) "ORDINARY");
        ((Field) term1269231).setAccessible(true);
        Object enum2362 = ((Field) term1269231).get((Object) null);
        term1263897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1264153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1264253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1263897, term1263897.getClass(), "kind", enum2362);
        setField(term1264153, term1264153.getClass(), "kind", enum2362);
        setField(term1264153, term1264153.getClass(), "typeOfThis", term1264253);
        setField(term1264153, term1264153.getClass(), "call", null);
        setField(term1263897, term1263897.getClass(), "typeOfThis", term1264153);
        Class<? extends Object> term1269523 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1269522 = ((Class) term1269523).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1269522).setAccessible(true);
        Object enum2363 = ((Field) term1269522).get((Object) null);
        term1264361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1264543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1264801 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term1264895 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1264361, term1264361.getClass(), "kind", enum2362);
        setField(term1264543, term1264543.getClass(), "kind", enum2363);
        setField(term1264543, term1264543.getClass(), "typeOfThis", term1264801);
        setField(term1264543, term1264543.getClass(), "call", term1264895);
        setField(term1264361, term1264361.getClass(), "typeOfThis", term1264543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1264361;
        try {
            callMethod(klass, "isSubtype", argTypes, term1263897, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


