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

public class FunctionType_isSubtype_21010021581509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1984979;
     Object term1985739;

    public FunctionType_isSubtype_21010021581509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1987459 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1987458 = ((Class) term1987459).getDeclaredField((String) "ORDINARY");
        ((Field) term1987458).setAccessible(true);
        Object enum3702 = ((Field) term1987458).get((Object) null);
        Class<? extends Object> term1987750 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1987749 = ((Class) term1987750).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1987749).setAccessible(true);
        Object enum3703 = ((Field) term1987749).get((Object) null);
        term1984979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1985531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1985631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1984979, term1984979.getClass(), "kind", enum3702);
        setField(term1985531, term1985531.getClass(), "kind", enum3703);
        setField(term1985531, term1985531.getClass(), "typeOfThis", term1985631);
        setField(term1984979, term1984979.getClass(), "typeOfThis", term1985531);
        term1985739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1986069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1986169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1985739, term1985739.getClass(), "kind", enum3702);
        setField(term1986069, term1986069.getClass(), "kind", enum3703);
        setField(term1986069, term1986069.getClass(), "typeOfThis", term1986169);
        setField(term1985739, term1985739.getClass(), "typeOfThis", term1986069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1985739;
        try {
            callMethod(klass, "isSubtype", argTypes, term1984979, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


