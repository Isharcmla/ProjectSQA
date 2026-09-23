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

public class FunctionType_getGreatestSubtype_6795917091122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1479543;
     Object term1480001;

    public FunctionType_getGreatestSubtype_6795917091122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1483697 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1483696 = ((Class) term1483697).getDeclaredField((String) "ORDINARY");
        ((Field) term1483696).setAccessible(true);
        Object enum2646 = ((Field) term1483696).get((Object) null);
        term1479543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1479787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term1479891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1479543, term1479543.getClass(), "kind", enum2646);
        setField(term1479543, term1479543.getClass(), "typeOfThis", term1479787);
        setField(term1479543, term1479543.getClass(), "registry", term1479891);
        Class<? extends Object> term1483988 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1483987 = ((Class) term1483988).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1483987).setAccessible(true);
        Object enum2647 = ((Field) term1483987).get((Object) null);
        term1480001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1480249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1480001, term1480001.getClass(), "kind", enum2647);
        setField(term1480001, term1480001.getClass(), "typeOfThis", term1480249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1480001;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1479543, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


