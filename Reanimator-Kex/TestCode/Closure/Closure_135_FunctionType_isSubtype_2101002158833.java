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

public class FunctionType_isSubtype_2101002158833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848270;
     Object term848782;

    public FunctionType_isSubtype_2101002158833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term851615 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term851614 = ((Class) term851615).getDeclaredField((String) "ORDINARY");
        ((Field) term851614).setAccessible(true);
        Object enum1586 = ((Field) term851614).get((Object) null);
        Class<? extends Object> term851906 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term851905 = ((Class) term851906).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term851905).setAccessible(true);
        Object enum1587 = ((Field) term851905).get((Object) null);
        term848270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term848526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term848270, term848270.getClass(), "kind", enum1586);
        setField(term848526, term848526.getClass(), "kind", enum1587);
        setField(term848270, term848270.getClass(), "typeOfThis", term848526);
        term848782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term848964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term848782, term848782.getClass(), "kind", enum1586);
        setField(term848964, term848964.getClass(), "kind", enum1586);
        setField(term848782, term848782.getClass(), "typeOfThis", term848964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term848782;
        try {
            callMethod(klass, "isSubtype", argTypes, term848270, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


