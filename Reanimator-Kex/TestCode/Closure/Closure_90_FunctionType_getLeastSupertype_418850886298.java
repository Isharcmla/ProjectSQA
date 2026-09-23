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

public class FunctionType_getLeastSupertype_418850886298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188048;
     Object term188702;

    public FunctionType_getLeastSupertype_418850886298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term190875 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term190874 = ((Class) term190875).getDeclaredField((String) "INTERFACE");
        ((Field) term190874).setAccessible(true);
        Object enum343 = ((Field) term190874).get((Object) null);
        term188048 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term188592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term188048, term188048.getClass(), "kind", enum343);
        setField(term188048, term188048.getClass(), "typeOfThis", term188592);
        term188702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term188702, term188702.getClass(), "kind", enum343);
        setField(term188702, term188702.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term188702;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term188048, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


