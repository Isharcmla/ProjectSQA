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

public class FunctionType_isSubtype_21010021581226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1507086;
     Object term1507846;

    public FunctionType_isSubtype_21010021581226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1511502 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1511501 = ((Class) term1511502).getDeclaredField((String) "ORDINARY");
        ((Field) term1511501).setAccessible(true);
        Object enum2819 = ((Field) term1511501).get((Object) null);
        Class<? extends Object> term1511793 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1511792 = ((Class) term1511793).getDeclaredField((String) "INTERFACE");
        ((Field) term1511792).setAccessible(true);
        Object enum2820 = ((Field) term1511792).get((Object) null);
        term1507086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1507638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1507738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1507086, term1507086.getClass(), "kind", enum2819);
        setField(term1507638, term1507638.getClass(), "kind", enum2820);
        setField(term1507638, term1507638.getClass(), "typeOfThis", term1507738);
        setField(term1507086, term1507086.getClass(), "typeOfThis", term1507638);
        Class<? extends Object> term1512087 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1512086 = ((Class) term1512087).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1512086).setAccessible(true);
        Object enum2821 = ((Field) term1512086).get((Object) null);
        term1507846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1508176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1508276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1507846, term1507846.getClass(), "kind", enum2819);
        setField(term1508176, term1508176.getClass(), "kind", enum2821);
        setField(term1508176, term1508176.getClass(), "typeOfThis", term1508276);
        setField(term1507846, term1507846.getClass(), "typeOfThis", term1508176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1507846;
        try {
            callMethod(klass, "isSubtype", argTypes, term1507086, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


