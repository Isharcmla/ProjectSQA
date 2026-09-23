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

public class FunctionType_isSubtype_21010021581401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1988764;
     Object term1989516;

    public FunctionType_isSubtype_21010021581401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1991198 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1991197 = ((Class) term1991198).getDeclaredField((String) "ORDINARY");
        ((Field) term1991197).setAccessible(true);
        Object enum3532 = ((Field) term1991197).get((Object) null);
        term1988764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1989308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1989408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1988764, term1988764.getClass(), "kind", enum3532);
        setField(term1989308, term1989308.getClass(), "kind", enum3532);
        setField(term1989308, term1989308.getClass(), "typeOfThis", term1989408);
        setField(term1988764, term1988764.getClass(), "typeOfThis", term1989308);
        Class<? extends Object> term1991489 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1991488 = ((Class) term1991489).getDeclaredField((String) "INTERFACE");
        ((Field) term1991488).setAccessible(true);
        Object enum3533 = ((Field) term1991488).get((Object) null);
        term1989516 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1989848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1989516, term1989516.getClass(), "kind", enum3532);
        setField(term1989848, term1989848.getClass(), "kind", enum3533);
        setField(term1989848, term1989848.getClass(), "typeOfThis", null);
        setField(term1989516, term1989516.getClass(), "typeOfThis", term1989848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1989516;
        try {
            callMethod(klass, "isSubtype", argTypes, term1988764, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


