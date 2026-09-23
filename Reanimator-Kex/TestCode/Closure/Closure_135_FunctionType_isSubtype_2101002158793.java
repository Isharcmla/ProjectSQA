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

public class FunctionType_isSubtype_2101002158793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787081;
     Object term787733;

    public FunctionType_isSubtype_2101002158793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term788748 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term788747 = ((Class) term788748).getDeclaredField((String) "ORDINARY");
        ((Field) term788747).setAccessible(true);
        Object enum1471 = ((Field) term788747).get((Object) null);
        term787081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term787625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term787081, term787081.getClass(), "kind", enum1471);
        setField(term787081, term787081.getClass(), "typeOfThis", term787625);
        term787733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term788061 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term787733, term787733.getClass(), "kind", enum1471);
        setField(term787733, term787733.getClass(), "typeOfThis", term788061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term787733;
        try {
            callMethod(klass, "isSubtype", argTypes, term787081, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


