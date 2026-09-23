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

public class FunctionType_getGreatestSubtype_679591709653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term656349;
     Object term657001;

    public FunctionType_getGreatestSubtype_679591709653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term657850 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term657849 = ((Class) term657850).getDeclaredField((String) "INTERFACE");
        ((Field) term657849).setAccessible(true);
        Object enum1185 = ((Field) term657849).get((Object) null);
        term656349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term656891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term656349, term656349.getClass(), "kind", enum1185);
        setField(term656349, term656349.getClass(), "typeOfThis", term656891);
        term657001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term657001, term657001.getClass(), "kind", enum1185);
        setField(term657001, term657001.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term657001;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term656349, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


