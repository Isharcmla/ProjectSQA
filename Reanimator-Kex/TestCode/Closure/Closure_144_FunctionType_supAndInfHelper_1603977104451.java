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

public class FunctionType_supAndInfHelper_1603977104451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369138;
     Object term369396;

    public FunctionType_supAndInfHelper_1603977104451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term370690 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term370689 = ((Class) term370690).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term370689).setAccessible(true);
        Object enum673 = ((Field) term370689).get((Object) null);
        term369138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term369138, term369138.getClass(), "kind", enum673);
        Class<? extends Object> term370990 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term370989 = ((Class) term370990).getDeclaredField((String) "ORDINARY");
        ((Field) term370989).setAccessible(true);
        Object enum674 = ((Field) term370989).get((Object) null);
        term369396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term369396, term369396.getClass(), "kind", enum674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term369396;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term369138, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


