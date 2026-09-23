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

public class FunctionType_getGreatestSubtype_6795917091531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2237382;
     Object term2238036;

    public FunctionType_getGreatestSubtype_6795917091531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2238903 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2238902 = ((Class) term2238903).getDeclaredField((String) "INTERFACE");
        ((Field) term2238902).setAccessible(true);
        Object enum3995 = ((Field) term2238902).get((Object) null);
        term2237382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2237926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term2237382, term2237382.getClass(), "kind", enum3995);
        setField(term2237382, term2237382.getClass(), "typeOfThis", term2237926);
        term2238036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2238036, term2238036.getClass(), "kind", enum3995);
        setField(term2238036, term2238036.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2238036;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2237382, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


