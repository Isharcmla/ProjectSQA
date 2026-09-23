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

public class FunctionType_isSubtype_21010021581577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2098205;
     Object term2098857;

    public FunctionType_isSubtype_21010021581577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2102211 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2102210 = ((Class) term2102211).getDeclaredField((String) "ORDINARY");
        ((Field) term2102210).setAccessible(true);
        Object enum3912 = ((Field) term2102210).get((Object) null);
        term2098205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2098749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2098205, term2098205.getClass(), "kind", enum3912);
        setField(term2098749, term2098749.getClass(), "kind", enum3912);
        setField(term2098205, term2098205.getClass(), "typeOfThis", term2098749);
        Class<? extends Object> term2102502 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2102501 = ((Class) term2102502).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2102501).setAccessible(true);
        Object enum3913 = ((Field) term2102501).get((Object) null);
        Class<? extends Object> term2102802 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2102801 = ((Class) term2102802).getDeclaredField((String) "INTERFACE");
        ((Field) term2102801).setAccessible(true);
        Object enum3914 = ((Field) term2102801).get((Object) null);
        term2098857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2099031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2098857, term2098857.getClass(), "kind", enum3913);
        setField(term2099031, term2099031.getClass(), "kind", enum3914);
        setField(term2098857, term2098857.getClass(), "typeOfThis", term2099031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2098857;
        try {
            callMethod(klass, "isSubtype", argTypes, term2098205, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


