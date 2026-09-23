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

public class FunctionType_getGreatestSubtype_679591709583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550394;
     Object term551058;

    public FunctionType_getGreatestSubtype_679591709583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term552246 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term552245 = ((Class) term552246).getDeclaredField((String) "INTERFACE");
        ((Field) term552245).setAccessible(true);
        Object enum1003 = ((Field) term552245).get((Object) null);
        Class<? extends Object> term552540 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term552539 = ((Class) term552540).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term552539).setAccessible(true);
        Object enum1004 = ((Field) term552539).get((Object) null);
        term550394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term550948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term550394, term550394.getClass(), "kind", enum1003);
        setField(term550948, term550948.getClass(), "kind", enum1004);
        setField(term550394, term550394.getClass(), "typeOfThis", term550948);
        term551058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term551232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term551058, term551058.getClass(), "kind", enum1004);
        setField(term551058, term551058.getClass(), "typeOfThis", term551232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term551058;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term550394, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


