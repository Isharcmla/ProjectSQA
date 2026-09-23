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

public class FunctionType_isEquivalentTo_230708275449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368649;
     Object term368907;

    public FunctionType_isEquivalentTo_230708275449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term369583 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term369582 = ((Class) term369583).getDeclaredField((String) "INTERFACE");
        ((Field) term369582).setAccessible(true);
        Object enum628 = ((Field) term369582).get((Object) null);
        term368649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term368649, term368649.getClass(), "kind", enum628);
        term368907 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term368907, term368907.getClass(), "kind", enum628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term368907;
        try {
            callMethod(klass, "isEquivalentTo", argTypes, term368649, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


