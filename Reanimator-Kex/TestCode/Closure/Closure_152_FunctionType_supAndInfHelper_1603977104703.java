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

public class FunctionType_supAndInfHelper_1603977104703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term742626;
     Object term743290;

    public FunctionType_supAndInfHelper_1603977104703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term744480 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term744479 = ((Class) term744480).getDeclaredField((String) "ORDINARY");
        ((Field) term744479).setAccessible(true);
        Object enum1122 = ((Field) term744479).get((Object) null);
        Class<? extends Object> term744771 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term744770 = ((Class) term744771).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term744770).setAccessible(true);
        Object enum1123 = ((Field) term744770).get((Object) null);
        term742626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term743180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term742626, term742626.getClass(), "kind", enum1122);
        setField(term743180, term743180.getClass(), "kind", enum1123);
        setField(term742626, term742626.getClass(), "typeOfThis", term743180);
        term743290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term743464 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term743290, term743290.getClass(), "kind", enum1123);
        setField(term743290, term743290.getClass(), "typeOfThis", term743464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term743290;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term742626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


