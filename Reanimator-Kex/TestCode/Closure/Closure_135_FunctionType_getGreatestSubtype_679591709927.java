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

public class FunctionType_getGreatestSubtype_679591709927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1009469;
     Object term1009925;

    public FunctionType_getGreatestSubtype_679591709927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1011134 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1011133 = ((Class) term1011134).getDeclaredField((String) "ORDINARY");
        ((Field) term1011133).setAccessible(true);
        Object enum1885 = ((Field) term1011133).get((Object) null);
        term1009469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1009713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term1009817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1009469, term1009469.getClass(), "kind", enum1885);
        setField(term1009469, term1009469.getClass(), "typeOfThis", term1009713);
        setField(term1009469, term1009469.getClass(), "registry", term1009817);
        Class<? extends Object> term1011425 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1011424 = ((Class) term1011425).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1011424).setAccessible(true);
        Object enum1886 = ((Field) term1011424).get((Object) null);
        term1009925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1010173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1009925, term1009925.getClass(), "kind", enum1886);
        setField(term1009925, term1009925.getClass(), "typeOfThis", term1010173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1009925;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1009469, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


