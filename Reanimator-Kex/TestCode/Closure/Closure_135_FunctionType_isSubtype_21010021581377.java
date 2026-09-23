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

public class FunctionType_isSubtype_21010021581377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1763509;
     Object term1764169;

    public FunctionType_isSubtype_21010021581377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1765935 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1765934 = ((Class) term1765935).getDeclaredField((String) "ORDINARY");
        ((Field) term1765934).setAccessible(true);
        Object enum3289 = ((Field) term1765934).get((Object) null);
        Class<? extends Object> term1766226 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1766225 = ((Class) term1766226).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1766225).setAccessible(true);
        Object enum3290 = ((Field) term1766225).get((Object) null);
        term1763509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1764061 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1763509, term1763509.getClass(), "kind", enum3289);
        setField(term1764061, term1764061.getClass(), "kind", enum3290);
        setField(term1764061, term1764061.getClass(), "call", null);
        setField(term1763509, term1763509.getClass(), "typeOfThis", term1764061);
        term1764169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1764499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1764593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1764169, term1764169.getClass(), "kind", enum3289);
        setField(term1764499, term1764499.getClass(), "kind", enum3290);
        setField(term1764499, term1764499.getClass(), "call", term1764593);
        setField(term1764169, term1764169.getClass(), "typeOfThis", term1764499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1764169;
        try {
            callMethod(klass, "isSubtype", argTypes, term1763509, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


