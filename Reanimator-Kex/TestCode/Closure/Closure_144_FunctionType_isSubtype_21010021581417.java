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

public class FunctionType_isSubtype_21010021581417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2016785;
     Object term2017447;

    public FunctionType_isSubtype_21010021581417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2021167 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2021166 = ((Class) term2021167).getDeclaredField((String) "INTERFACE");
        ((Field) term2021166).setAccessible(true);
        Object enum3589 = ((Field) term2021166).get((Object) null);
        Class<? extends Object> term2021461 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2021460 = ((Class) term2021461).getDeclaredField((String) "INTERFACE");
        ((Field) term2021460).setAccessible(true);
        Object enum3590 = ((Field) term2021460).get((Object) null);
        term2016785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2017339 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2016785, term2016785.getClass(), "kind", enum3589);
        setField(term2017339, term2017339.getClass(), "kind", enum3590);
        setField(term2016785, term2016785.getClass(), "typeOfThis", term2017339);
        Class<? extends Object> term2021755 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2021754 = ((Class) term2021755).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2021754).setAccessible(true);
        Object enum3591 = ((Field) term2021754).get((Object) null);
        term2017447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2017629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2017447, term2017447.getClass(), "kind", enum3591);
        setField(term2017447, term2017447.getClass(), "typeOfThis", term2017629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2017447;
        try {
            callMethod(klass, "isSubtype", argTypes, term2016785, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


