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

public class FunctionType_isSubtype_2101002158435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348744;
     Object term349298;

    public FunctionType_isSubtype_2101002158435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term349881 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term349880 = ((Class) term349881).getDeclaredField((String) "ORDINARY");
        ((Field) term349880).setAccessible(true);
        Object enum635 = ((Field) term349880).get((Object) null);
        term348744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term348744, term348744.getClass(), "kind", enum635);
        term349298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term349298;
        try {
            callMethod(klass, "isSubtype", argTypes, term348744, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


