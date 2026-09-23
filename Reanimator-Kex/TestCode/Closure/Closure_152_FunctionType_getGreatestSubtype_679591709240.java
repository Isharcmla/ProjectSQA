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

public class FunctionType_getGreatestSubtype_679591709240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124738;
     Object term124996;

    public FunctionType_getGreatestSubtype_679591709240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term126354 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term126353 = ((Class) term126354).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term126353).setAccessible(true);
        Object enum232 = ((Field) term126353).get((Object) null);
        term124738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term124738, term124738.getClass(), "kind", enum232);
        term124996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term124996;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term124738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


