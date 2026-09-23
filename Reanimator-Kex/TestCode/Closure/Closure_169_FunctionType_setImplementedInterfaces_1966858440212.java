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

public class FunctionType_setImplementedInterfaces_1966858440212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106753;

    public FunctionType_setImplementedInterfaces_1966858440212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term229012 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term229011 = ((Class) term229012).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term229011).setAccessible(true);
        Object enum433 = ((Field) term229011).get((Object) null);
        term106753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term106753, term106753.getClass(), "kind", enum433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setImplementedInterfaces", argTypes, term106753, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


