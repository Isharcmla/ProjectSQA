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

public class FunctionType_isSubtype_2101002158864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896935;
     Object term897539;

    public FunctionType_isSubtype_2101002158864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term901440 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term901439 = ((Class) term901440).getDeclaredField((String) "ORDINARY");
        ((Field) term901439).setAccessible(true);
        Object enum1676 = ((Field) term901439).get((Object) null);
        Class<? extends Object> term901731 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term901730 = ((Class) term901731).getDeclaredField((String) "INTERFACE");
        ((Field) term901730).setAccessible(true);
        Object enum1677 = ((Field) term901730).get((Object) null);
        term896935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term897183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term897431 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term896935, term896935.getClass(), "kind", enum1676);
        setField(term897183, term897183.getClass(), "kind", enum1677);
        setField(term897183, term897183.getClass(), "typeOfThis", term897431);
        setField(term896935, term896935.getClass(), "typeOfThis", term897183);
        Class<? extends Object> term902025 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term902024 = ((Class) term902025).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term902024).setAccessible(true);
        Object enum1678 = ((Field) term902024).get((Object) null);
        term897539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term897721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term897539, term897539.getClass(), "kind", enum1676);
        setField(term897721, term897721.getClass(), "kind", enum1678);
        setField(term897721, term897721.getClass(), "typeOfThis", null);
        setField(term897539, term897539.getClass(), "typeOfThis", term897721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term897539;
        try {
            callMethod(klass, "isSubtype", argTypes, term896935, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


