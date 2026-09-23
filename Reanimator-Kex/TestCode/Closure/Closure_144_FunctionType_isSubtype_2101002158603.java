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

public class FunctionType_isSubtype_2101002158603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580354;
     Object term581008;

    public FunctionType_isSubtype_2101002158603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term582041 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term582040 = ((Class) term582041).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term582040).setAccessible(true);
        Object enum1056 = ((Field) term582040).get((Object) null);
        term580354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term580898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term580354, term580354.getClass(), "kind", enum1056);
        setField(term580354, term580354.getClass(), "typeOfThis", term580898);
        term581008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term581322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term581008, term581008.getClass(), "kind", enum1056);
        setField(term581008, term581008.getClass(), "typeOfThis", term581322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term581008;
        try {
            callMethod(klass, "isSubtype", argTypes, term580354, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


