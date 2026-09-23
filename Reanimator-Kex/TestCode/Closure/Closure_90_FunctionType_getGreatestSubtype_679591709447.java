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

public class FunctionType_getGreatestSubtype_679591709447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366066;
     Object term366714;

    public FunctionType_getGreatestSubtype_679591709447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term367585 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term367584 = ((Class) term367585).getDeclaredField((String) "ORDINARY");
        ((Field) term367584).setAccessible(true);
        Object enum624 = ((Field) term367584).get((Object) null);
        term366066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term366604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term366066, term366066.getClass(), "kind", enum624);
        setField(term366066, term366066.getClass(), "typeOfThis", term366604);
        term366714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term366714, term366714.getClass(), "kind", enum624);
        setField(term366714, term366714.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term366714;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term366066, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


