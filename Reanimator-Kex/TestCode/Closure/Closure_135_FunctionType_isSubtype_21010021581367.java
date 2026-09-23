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

public class FunctionType_isSubtype_21010021581367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1748694;
     Object term1749454;

    public FunctionType_isSubtype_21010021581367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1750910 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1750909 = ((Class) term1750910).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1750909).setAccessible(true);
        Object enum3262 = ((Field) term1750909).get((Object) null);
        term1748694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1749834 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1749888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1748694, term1748694.getClass(), "kind", enum3262);
        setField(term1749834, term1749834.getClass(), "kind", enum3262);
        setField(term1749834, term1749834.getClass(), "typeOfThis", term1749888);
        setField(term1748694, term1748694.getClass(), "typeOfThis", term1749834);
        Class<? extends Object> term1751210 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1751209 = ((Class) term1751210).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1751209).setAccessible(true);
        Object enum3263 = ((Field) term1751209).get((Object) null);
        term1749454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1749636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1749454, term1749454.getClass(), "kind", enum3263);
        setField(term1749636, term1749636.getClass(), "kind", enum3262);
        setField(term1749636, term1749636.getClass(), "typeOfThis", term1749834);
        setField(term1749454, term1749454.getClass(), "typeOfThis", term1749636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1749454;
        try {
            callMethod(klass, "isSubtype", argTypes, term1748694, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


