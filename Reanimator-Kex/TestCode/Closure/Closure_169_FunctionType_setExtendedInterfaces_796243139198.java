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

public class FunctionType_setExtendedInterfaces_796243139198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101433;

    public FunctionType_setExtendedInterfaces_796243139198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term222241 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term222240 = ((Class) term222241).getDeclaredField((String) "INTERFACE");
        ((Field) term222240).setAccessible(true);
        Object enum421 = ((Field) term222240).get((Object) null);
        term101433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term101433, term101433.getClass(), "kind", enum421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setExtendedInterfaces", argTypes, term101433, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


