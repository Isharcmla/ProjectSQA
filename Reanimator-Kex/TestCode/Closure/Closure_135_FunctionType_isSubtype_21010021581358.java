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

public class FunctionType_isSubtype_21010021581358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1728551;
     Object term1729109;

    public FunctionType_isSubtype_21010021581358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1732637 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1732636 = ((Class) term1732637).getDeclaredField((String) "ORDINARY");
        ((Field) term1732636).setAccessible(true);
        Object enum3228 = ((Field) term1732636).get((Object) null);
        term1728551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1728799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1728907 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1729001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1728551, term1728551.getClass(), "kind", enum3228);
        setField(term1728799, term1728799.getClass(), "kind", enum3228);
        setField(term1728907, term1728907.getClass(), "kind", enum3228);
        setField(term1728907, term1728907.getClass(), "typeOfThis", term1729001);
        setField(term1728799, term1728799.getClass(), "typeOfThis", term1728907);
        setField(term1728551, term1728551.getClass(), "typeOfThis", term1728799);
        Class<? extends Object> term1732928 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1732927 = ((Class) term1732928).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1732927).setAccessible(true);
        Object enum3229 = ((Field) term1732927).get((Object) null);
        term1729109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1729365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1729473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1729109, term1729109.getClass(), "kind", enum3229);
        setField(term1729365, term1729365.getClass(), "kind", enum3229);
        setField(term1729473, term1729473.getClass(), "kind", enum3229);
        setField(term1729473, term1729473.getClass(), "typeOfThis", null);
        setField(term1729365, term1729365.getClass(), "typeOfThis", term1729473);
        setField(term1729109, term1729109.getClass(), "typeOfThis", term1729365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1729109;
        try {
            callMethod(klass, "isSubtype", argTypes, term1728551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


