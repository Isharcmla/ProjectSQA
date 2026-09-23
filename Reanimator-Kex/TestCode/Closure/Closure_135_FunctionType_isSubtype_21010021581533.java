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

public class FunctionType_isSubtype_21010021581533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2028050;
     Object term2028710;

    public FunctionType_isSubtype_21010021581533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2031974 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2031973 = ((Class) term2031974).getDeclaredField((String) "INTERFACE");
        ((Field) term2031973).setAccessible(true);
        Object enum3783 = ((Field) term2031973).get((Object) null);
        Class<? extends Object> term2032268 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2032267 = ((Class) term2032268).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2032267).setAccessible(true);
        Object enum3784 = ((Field) term2032267).get((Object) null);
        term2028050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2028602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2028050, term2028050.getClass(), "kind", enum3783);
        setField(term2028602, term2028602.getClass(), "kind", enum3784);
        setField(term2028602, term2028602.getClass(), "typeOfThis", null);
        setField(term2028050, term2028050.getClass(), "typeOfThis", term2028602);
        term2028710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2029040 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2029148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2028710, term2028710.getClass(), "kind", enum3783);
        setField(term2029040, term2029040.getClass(), "kind", enum3783);
        setField(term2029040, term2029040.getClass(), "typeOfThis", term2029148);
        setField(term2028710, term2028710.getClass(), "typeOfThis", term2029040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2028710;
        try {
            callMethod(klass, "isSubtype", argTypes, term2028050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


