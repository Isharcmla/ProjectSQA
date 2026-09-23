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

public class FunctionType_isSubtype_21010021581333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1688965;
     Object term1689725;

    public FunctionType_isSubtype_21010021581333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1693730 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1693729 = ((Class) term1693730).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1693729).setAccessible(true);
        Object enum3162 = ((Field) term1693729).get((Object) null);
        term1688965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1689509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1689617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1688965, term1688965.getClass(), "kind", enum3162);
        setField(term1689509, term1689509.getClass(), "kind", enum3162);
        setField(term1689509, term1689509.getClass(), "typeOfThis", term1689617);
        setField(term1688965, term1688965.getClass(), "typeOfThis", term1689509);
        Class<? extends Object> term1694030 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1694029 = ((Class) term1694030).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1694029).setAccessible(true);
        Object enum3163 = ((Field) term1694029).get((Object) null);
        term1689725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1689907 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1689725, term1689725.getClass(), "kind", enum3163);
        setField(term1689907, term1689907.getClass(), "kind", enum3162);
        setField(term1689907, term1689907.getClass(), "typeOfThis", term1689725);
        setField(term1689725, term1689725.getClass(), "typeOfThis", term1689907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1689725;
        try {
            callMethod(klass, "isSubtype", argTypes, term1688965, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


