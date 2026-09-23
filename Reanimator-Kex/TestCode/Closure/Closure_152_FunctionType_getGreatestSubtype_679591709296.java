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

public class FunctionType_getGreatestSubtype_679591709296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175686;
     Object term175944;

    public FunctionType_getGreatestSubtype_679591709296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term177515 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term177514 = ((Class) term177515).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term177514).setAccessible(true);
        Object enum319 = ((Field) term177514).get((Object) null);
        term175686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term175686, term175686.getClass(), "kind", enum319);
        term175944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term175944, term175944.getClass(), "kind", enum319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term175944;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term175686, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


