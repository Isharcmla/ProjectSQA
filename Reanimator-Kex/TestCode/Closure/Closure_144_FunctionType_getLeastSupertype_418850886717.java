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

public class FunctionType_getLeastSupertype_418850886717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term767264;
     Object term767742;

    public FunctionType_getLeastSupertype_418850886717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term769241 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term769240 = ((Class) term769241).getDeclaredField((String) "ORDINARY");
        ((Field) term769240).setAccessible(true);
        Object enum1381 = ((Field) term769240).get((Object) null);
        term767264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term767522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term767632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term767264, term767264.getClass(), "kind", enum1381);
        setField(term767522, term767522.getClass(), "kind", enum1381);
        setField(term767522, term767522.getClass(), "typeOfThis", term767632);
        setField(term767264, term767264.getClass(), "typeOfThis", term767522);
        Class<? extends Object> term769532 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term769531 = ((Class) term769532).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term769531).setAccessible(true);
        Object enum1382 = ((Field) term769531).get((Object) null);
        term767742 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term767916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term768164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term767742, term767742.getClass(), "kind", enum1381);
        setField(term767916, term767916.getClass(), "kind", enum1382);
        setField(term767916, term767916.getClass(), "typeOfThis", term768164);
        setField(term767742, term767742.getClass(), "typeOfThis", term767916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term767742;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term767264, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


