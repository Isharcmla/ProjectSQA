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

public class FunctionType_isSubtype_21010021581477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1930277;
     Object term1930929;

    public FunctionType_isSubtype_21010021581477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1932039 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1932038 = ((Class) term1932039).getDeclaredField((String) "INTERFACE");
        ((Field) term1932038).setAccessible(true);
        Object enum3595 = ((Field) term1932038).get((Object) null);
        term1930277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1930821 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1930277, term1930277.getClass(), "kind", enum3595);
        setField(term1930277, term1930277.getClass(), "typeOfThis", term1930821);
        Class<? extends Object> term1932333 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1932332 = ((Class) term1932333).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1932332).setAccessible(true);
        Object enum3596 = ((Field) term1932332).get((Object) null);
        term1930929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1931111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1930929, term1930929.getClass(), "kind", enum3596);
        setField(term1930929, term1930929.getClass(), "typeOfThis", term1931111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1930929;
        try {
            callMethod(klass, "isSubtype", argTypes, term1930277, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


