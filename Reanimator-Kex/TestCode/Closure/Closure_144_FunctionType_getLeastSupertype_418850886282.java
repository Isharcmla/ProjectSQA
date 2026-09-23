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

public class FunctionType_getLeastSupertype_418850886282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170392;
     Object term170650;

    public FunctionType_getLeastSupertype_418850886282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term172775 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term172774 = ((Class) term172775).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term172774).setAccessible(true);
        Object enum334 = ((Field) term172774).get((Object) null);
        term170392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term170392, term170392.getClass(), "kind", enum334);
        term170650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term170650, term170650.getClass(), "kind", enum334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term170650;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term170392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


