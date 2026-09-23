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

public class FunctionType_getGreatestSubtype_679591709782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884805;
     Object term885559;

    public FunctionType_getGreatestSubtype_679591709782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term888552 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term888551 = ((Class) term888552).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term888551).setAccessible(true);
        Object enum1604 = ((Field) term888551).get((Object) null);
        Class<? extends Object> term888852 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term888851 = ((Class) term888852).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term888851).setAccessible(true);
        Object enum1605 = ((Field) term888851).get((Object) null);
        term884805 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term885349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term885931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term884805, term884805.getClass(), "kind", enum1604);
        setField(term885349, term885349.getClass(), "kind", enum1604);
        setField(term885931, term885931.getClass(), "kind", enum1605);
        setField(term885349, term885349.getClass(), "typeOfThis", term885931);
        setField(term884805, term884805.getClass(), "typeOfThis", term885349);
        term885559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term885733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term885559, term885559.getClass(), "kind", enum1605);
        setField(term885733, term885733.getClass(), "kind", enum1604);
        setField(term885733, term885733.getClass(), "typeOfThis", term885931);
        setField(term885559, term885559.getClass(), "typeOfThis", term885733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term885559;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term884805, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


