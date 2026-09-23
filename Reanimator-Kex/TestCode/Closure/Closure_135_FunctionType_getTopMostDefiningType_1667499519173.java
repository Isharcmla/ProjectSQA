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

public class FunctionType_getTopMostDefiningType_1667499519173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78606;

    public FunctionType_getTopMostDefiningType_1667499519173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79361 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term79360 = ((Class) term79361).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term79360).setAccessible(true);
        Object enum168 = ((Field) term79360).get((Object) null);
        term78606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term78606, term78606.getClass(), "kind", enum168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTopMostDefiningType", argTypes, term78606, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


