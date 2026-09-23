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

public class FunctionType_isSubtype_21010021581363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1740798;
     Object term1741364;

    public FunctionType_isSubtype_21010021581363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1743224 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1743223 = ((Class) term1743224).getDeclaredField((String) "ORDINARY");
        ((Field) term1743223).setAccessible(true);
        Object enum3248 = ((Field) term1743223).get((Object) null);
        term1740798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1741054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1741162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1741256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1740798, term1740798.getClass(), "kind", enum3248);
        setField(term1741054, term1741054.getClass(), "kind", enum3248);
        setField(term1741054, term1741054.getClass(), "typeOfThis", term1741162);
        setField(term1741054, term1741054.getClass(), "call", term1741256);
        setField(term1740798, term1740798.getClass(), "typeOfThis", term1741054);
        Class<? extends Object> term1743515 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1743514 = ((Class) term1743515).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1743514).setAccessible(true);
        Object enum3249 = ((Field) term1743514).get((Object) null);
        term1741364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1741546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1741790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term1741884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1741364, term1741364.getClass(), "kind", enum3248);
        setField(term1741546, term1741546.getClass(), "kind", enum3249);
        setField(term1741546, term1741546.getClass(), "typeOfThis", term1741790);
        setField(term1741546, term1741546.getClass(), "call", term1741884);
        setField(term1741364, term1741364.getClass(), "typeOfThis", term1741546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1741364;
        try {
            callMethod(klass, "isSubtype", argTypes, term1740798, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


