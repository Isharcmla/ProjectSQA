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

public class FunctionType_getGreatestSubtype_679591709771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term866122;
     Object term866896;

    public FunctionType_getGreatestSubtype_679591709771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term868603 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term868602 = ((Class) term868603).getDeclaredField((String) "ORDINARY");
        ((Field) term868602).setAccessible(true);
        Object enum1567 = ((Field) term868602).get((Object) null);
        Class<? extends Object> term868894 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term868893 = ((Class) term868894).getDeclaredField((String) "INTERFACE");
        ((Field) term868893).setAccessible(true);
        Object enum1568 = ((Field) term868893).get((Object) null);
        term866122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term866676 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term866786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term866122, term866122.getClass(), "kind", enum1567);
        setField(term866676, term866676.getClass(), "kind", enum1567);
        setField(term866786, term866786.getClass(), "kind", enum1568);
        setField(term866676, term866676.getClass(), "typeOfThis", term866786);
        setField(term866122, term866122.getClass(), "typeOfThis", term866676);
        Class<? extends Object> term869188 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term869187 = ((Class) term869188).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term869187).setAccessible(true);
        Object enum1569 = ((Field) term869187).get((Object) null);
        term866896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term867070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term867318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term866896, term866896.getClass(), "kind", enum1569);
        setField(term867070, term867070.getClass(), "kind", enum1567);
        setField(term867070, term867070.getClass(), "typeOfThis", term867318);
        setField(term866896, term866896.getClass(), "typeOfThis", term867070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term866896;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term866122, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


