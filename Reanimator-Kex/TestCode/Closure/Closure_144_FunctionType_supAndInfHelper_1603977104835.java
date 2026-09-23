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

public class FunctionType_supAndInfHelper_1603977104835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term976113;
     Object term976475;

    public FunctionType_supAndInfHelper_1603977104835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term977548 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term977547 = ((Class) term977548).getDeclaredField((String) "INTERFACE");
        ((Field) term977547).setAccessible(true);
        Object enum1766 = ((Field) term977547).get((Object) null);
        term976113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term976365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term976113, term976113.getClass(), "kind", enum1766);
        setField(term976113, term976113.getClass(), "registry", term976365);
        Class<? extends Object> term977842 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term977841 = ((Class) term977842).getDeclaredField((String) "ORDINARY");
        ((Field) term977841).setAccessible(true);
        Object enum1767 = ((Field) term977841).get((Object) null);
        term976475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term976475, term976475.getClass(), "kind", enum1767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term976475;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term976113, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


