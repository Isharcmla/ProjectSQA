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

public class FunctionType_makesStructs_1497117839200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102150;

    public FunctionType_makesStructs_1497117839200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term223364 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term223363 = ((Class) term223364).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term223363).setAccessible(true);
        Object enum423 = ((Field) term223363).get((Object) null);
        term102150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term102150, term102150.getClass(), "kind", enum423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "makesStructs", argTypes, term102150, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


