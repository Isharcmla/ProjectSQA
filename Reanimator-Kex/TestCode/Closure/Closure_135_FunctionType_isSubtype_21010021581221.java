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

public class FunctionType_isSubtype_21010021581221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1499477;
     Object term1499927;

    public FunctionType_isSubtype_21010021581221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1502856 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1502855 = ((Class) term1502856).getDeclaredField((String) "ORDINARY");
        ((Field) term1502855).setAccessible(true);
        Object enum2803 = ((Field) term1502855).get((Object) null);
        term1499477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1499725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1499819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1499477, term1499477.getClass(), "kind", enum2803);
        setField(term1499725, term1499725.getClass(), "kind", enum2803);
        setField(term1499725, term1499725.getClass(), "typeOfThis", term1499725);
        setField(term1499725, term1499725.getClass(), "call", term1499819);
        setField(term1499477, term1499477.getClass(), "typeOfThis", term1499725);
        Class<? extends Object> term1503147 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1503146 = ((Class) term1503147).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1503146).setAccessible(true);
        Object enum2804 = ((Field) term1503146).get((Object) null);
        term1499927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1500109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1500351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1499927, term1499927.getClass(), "kind", enum2803);
        setField(term1500109, term1500109.getClass(), "kind", enum2804);
        setField(term1500109, term1500109.getClass(), "typeOfThis", null);
        setField(term1500109, term1500109.getClass(), "call", term1500351);
        setField(term1499927, term1499927.getClass(), "typeOfThis", term1500109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1499927;
        try {
            callMethod(klass, "isSubtype", argTypes, term1499477, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


