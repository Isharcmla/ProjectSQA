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

public class FunctionType_getGreatestSubtype_679591709593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568526;
     Object term568982;

    public FunctionType_getGreatestSubtype_679591709593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term570278 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term570277 = ((Class) term570278).getDeclaredField((String) "ORDINARY");
        ((Field) term570277).setAccessible(true);
        Object enum1035 = ((Field) term570277).get((Object) null);
        term568526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term568784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term568872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term568526, term568526.getClass(), "kind", enum1035);
        setField(term568784, term568784.getClass(), "kind", enum1035);
        setField(term568784, term568784.getClass(), "typeOfThis", term568872);
        setField(term568526, term568526.getClass(), "typeOfThis", term568784);
        Class<? extends Object> term570569 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term570568 = ((Class) term570569).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term570568).setAccessible(true);
        Object enum1036 = ((Field) term570568).get((Object) null);
        term568982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term569230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term568982, term568982.getClass(), "kind", enum1036);
        setField(term569230, term569230.getClass(), "kind", enum1036);
        setField(term569230, term569230.getClass(), "typeOfThis", null);
        setField(term568982, term568982.getClass(), "typeOfThis", term569230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term568982;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term568526, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


