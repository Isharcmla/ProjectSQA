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

public class FunctionType_isSubtype_21010021581501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2179789;
     Object term2180453;

    public FunctionType_isSubtype_21010021581501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2181774 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2181773 = ((Class) term2181774).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2181773).setAccessible(true);
        Object enum3886 = ((Field) term2181773).get((Object) null);
        Class<? extends Object> term2182074 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2182073 = ((Class) term2182074).getDeclaredField((String) "INTERFACE");
        ((Field) term2182073).setAccessible(true);
        Object enum3887 = ((Field) term2182073).get((Object) null);
        term2179789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2180730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2179789, term2179789.getClass(), "kind", enum3886);
        setField(term2180730, term2180730.getClass(), "kind", enum3887);
        setField(term2180730, term2180730.getClass(), "typeOfThis", null);
        setField(term2179789, term2179789.getClass(), "typeOfThis", term2180730);
        term2180453 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2180453, term2180453.getClass(), "kind", enum3886);
        setField(term2180453, term2180453.getClass(), "typeOfThis", term2180730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2180453;
        try {
            callMethod(klass, "isSubtype", argTypes, term2179789, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


