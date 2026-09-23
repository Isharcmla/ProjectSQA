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

public class FunctionType_isSubtype_21010021581439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2056894;
     Object term2057654;

    public FunctionType_isSubtype_21010021581439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2061009 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2061008 = ((Class) term2061009).getDeclaredField((String) "INTERFACE");
        ((Field) term2061008).setAccessible(true);
        Object enum3664 = ((Field) term2061008).get((Object) null);
        term2056894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2057438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2057546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2056894, term2056894.getClass(), "kind", enum3664);
        setField(term2057438, term2057438.getClass(), "kind", enum3664);
        setField(term2057546, term2057546.getClass(), "kind", enum3664);
        setField(term2057438, term2057438.getClass(), "typeOfThis", term2057546);
        setField(term2056894, term2056894.getClass(), "typeOfThis", term2057438);
        Class<? extends Object> term2061303 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2061302 = ((Class) term2061303).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2061302).setAccessible(true);
        Object enum3665 = ((Field) term2061302).get((Object) null);
        Class<? extends Object> term2061603 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2061602 = ((Class) term2061603).getDeclaredField((String) "INTERFACE");
        ((Field) term2061602).setAccessible(true);
        Object enum3666 = ((Field) term2061602).get((Object) null);
        term2057654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2057986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2058096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2057654, term2057654.getClass(), "kind", enum3664);
        setField(term2057986, term2057986.getClass(), "kind", enum3665);
        setField(term2058096, term2058096.getClass(), "kind", enum3666);
        setField(term2057986, term2057986.getClass(), "typeOfThis", term2058096);
        setField(term2057654, term2057654.getClass(), "typeOfThis", term2057986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2057654;
        try {
            callMethod(klass, "isSubtype", argTypes, term2056894, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


