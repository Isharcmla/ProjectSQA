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

public class FunctionType_isSubtype_21010021581384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1957376;
     Object term1957964;

    public FunctionType_isSubtype_21010021581384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1960946 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1960945 = ((Class) term1960946).getDeclaredField((String) "ORDINARY");
        ((Field) term1960945).setAccessible(true);
        Object enum3474 = ((Field) term1960945).get((Object) null);
        term1957376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1957624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1957732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1957856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term1957376, term1957376.getClass(), "kind", enum3474);
        setField(term1957624, term1957624.getClass(), "kind", enum3474);
        setField(term1957732, term1957732.getClass(), "kind", enum3474);
        setField(term1957732, term1957732.getClass(), "typeOfThis", term1957856);
        setField(term1957624, term1957624.getClass(), "typeOfThis", term1957732);
        setField(term1957376, term1957376.getClass(), "typeOfThis", term1957624);
        Class<? extends Object> term1961237 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1961236 = ((Class) term1961237).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1961236).setAccessible(true);
        Object enum3475 = ((Field) term1961236).get((Object) null);
        term1957964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1958220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1958328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1957964, term1957964.getClass(), "kind", enum3475);
        setField(term1958220, term1958220.getClass(), "kind", enum3475);
        setField(term1958328, term1958328.getClass(), "kind", enum3475);
        setField(term1958328, term1958328.getClass(), "typeOfThis", null);
        setField(term1958220, term1958220.getClass(), "typeOfThis", term1958328);
        setField(term1957964, term1957964.getClass(), "typeOfThis", term1958220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1957964;
        try {
            callMethod(klass, "isSubtype", argTypes, term1957376, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


