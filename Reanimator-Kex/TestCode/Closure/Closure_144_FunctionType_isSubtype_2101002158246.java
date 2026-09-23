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

public class FunctionType_isSubtype_2101002158246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138118;
     Object term138672;

    public FunctionType_isSubtype_2101002158246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term140497 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term140496 = ((Class) term140497).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term140496).setAccessible(true);
        Object enum281 = ((Field) term140496).get((Object) null);
        term138118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term138118, term138118.getClass(), "kind", enum281);
        Class<? extends Object> term140797 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term140796 = ((Class) term140797).getDeclaredField((String) "INTERFACE");
        ((Field) term140796).setAccessible(true);
        Object enum282 = ((Field) term140796).get((Object) null);
        term138672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term138672, term138672.getClass(), "kind", enum282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term138672;
        try {
            callMethod(klass, "isSubtype", argTypes, term138118, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


