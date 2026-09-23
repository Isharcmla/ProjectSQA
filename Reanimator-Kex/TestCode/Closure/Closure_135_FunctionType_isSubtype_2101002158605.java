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

public class FunctionType_isSubtype_2101002158605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511204;
     Object term511560;

    public FunctionType_isSubtype_2101002158605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term512744 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term512743 = ((Class) term512744).getDeclaredField((String) "ORDINARY");
        ((Field) term512743).setAccessible(true);
        Object enum946 = ((Field) term512743).get((Object) null);
        term511204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term511452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term511204, term511204.getClass(), "kind", enum946);
        setField(term511204, term511204.getClass(), "typeOfThis", term511452);
        Class<? extends Object> term513035 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term513034 = ((Class) term513035).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term513034).setAccessible(true);
        Object enum947 = ((Field) term513034).get((Object) null);
        term511560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term511816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term511560, term511560.getClass(), "kind", enum947);
        setField(term511560, term511560.getClass(), "typeOfThis", term511816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term511560;
        try {
            callMethod(klass, "isSubtype", argTypes, term511204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


