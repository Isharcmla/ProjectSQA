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

public class FunctionType_getLeastSupertype_4188508861270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1579781;
     Object term1580241;

    public FunctionType_getLeastSupertype_4188508861270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1583771 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1583770 = ((Class) term1583771).getDeclaredField((String) "ORDINARY");
        ((Field) term1583770).setAccessible(true);
        Object enum2950 = ((Field) term1583770).get((Object) null);
        term1579781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1580029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1580133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1579781, term1579781.getClass(), "kind", enum2950);
        setField(term1579781, term1579781.getClass(), "typeOfThis", term1580029);
        setField(term1579781, term1579781.getClass(), "registry", term1580133);
        Class<? extends Object> term1584062 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1584061 = ((Class) term1584062).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1584061).setAccessible(true);
        Object enum2951 = ((Field) term1584061).get((Object) null);
        term1580241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1580489 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1580241, term1580241.getClass(), "kind", enum2951);
        setField(term1580241, term1580241.getClass(), "typeOfThis", term1580489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1580241;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1579781, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


