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

public class FunctionType_isSubtype_21010021581499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2176360;
     Object term2177014;

    public FunctionType_isSubtype_21010021581499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2178338 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2178337 = ((Class) term2178338).getDeclaredField((String) "INTERFACE");
        ((Field) term2178337).setAccessible(true);
        Object enum3880 = ((Field) term2178337).get((Object) null);
        Class<? extends Object> term2178632 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2178631 = ((Class) term2178632).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2178631).setAccessible(true);
        Object enum3881 = ((Field) term2178631).get((Object) null);
        term2176360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2176904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2176360, term2176360.getClass(), "kind", enum3880);
        setField(term2176904, term2176904.getClass(), "kind", enum3881);
        setField(term2176360, term2176360.getClass(), "typeOfThis", term2176904);
        term2177014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2177346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2177014, term2177014.getClass(), "kind", enum3880);
        setField(term2177346, term2177346.getClass(), "kind", enum3880);
        setField(term2177014, term2177014.getClass(), "typeOfThis", term2177346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2177014;
        try {
            callMethod(klass, "isSubtype", argTypes, term2176360, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


