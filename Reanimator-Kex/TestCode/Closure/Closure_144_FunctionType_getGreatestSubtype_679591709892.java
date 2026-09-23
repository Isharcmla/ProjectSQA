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

public class FunctionType_getGreatestSubtype_679591709892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1079454;
     Object term1080118;

    public FunctionType_getGreatestSubtype_679591709892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1082615 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1082614 = ((Class) term1082615).getDeclaredField((String) "INTERFACE");
        ((Field) term1082614).setAccessible(true);
        Object enum1953 = ((Field) term1082614).get((Object) null);
        term1079454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1080008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1079454, term1079454.getClass(), "kind", enum1953);
        setField(term1079454, term1079454.getClass(), "typeOfThis", term1080008);
        term1080118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1080428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1080118, term1080118.getClass(), "kind", enum1953);
        setField(term1080118, term1080118.getClass(), "typeOfThis", term1080428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1080118;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1079454, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


