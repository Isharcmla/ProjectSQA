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

public class FunctionType_supAndInfHelper_1603977104317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204962;
     Object term205608;

    public FunctionType_supAndInfHelper_1603977104317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term206480 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term206479 = ((Class) term206480).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term206479).setAccessible(true);
        Object enum368 = ((Field) term206479).get((Object) null);
        term204962 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term205498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term204962, term204962.getClass(), "kind", enum368);
        setField(term204962, term204962.getClass(), "typeOfThis", term205498);
        term205608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term205608, term205608.getClass(), "kind", enum368);
        setField(term205608, term205608.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term205608;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term204962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


