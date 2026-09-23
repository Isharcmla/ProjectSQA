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

public class FunctionType_isSubtype_21010021581631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2192857;
     Object term2193313;

    public FunctionType_isSubtype_21010021581631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2196553 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2196552 = ((Class) term2196553).getDeclaredField((String) "ORDINARY");
        ((Field) term2196552).setAccessible(true);
        Object enum4090 = ((Field) term2196552).get((Object) null);
        term2192857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2193105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2193205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2192857, term2192857.getClass(), "kind", enum4090);
        setField(term2193105, term2193105.getClass(), "kind", enum4090);
        setField(term2193105, term2193105.getClass(), "typeOfThis", term2193205);
        setField(term2193105, term2193105.getClass(), "call", null);
        setField(term2192857, term2192857.getClass(), "typeOfThis", term2193105);
        Class<? extends Object> term2196844 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2196843 = ((Class) term2196844).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2196843).setAccessible(true);
        Object enum4091 = ((Field) term2196843).get((Object) null);
        term2193313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2193495 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2193749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term2193843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2193313, term2193313.getClass(), "kind", enum4090);
        setField(term2193495, term2193495.getClass(), "kind", enum4091);
        setField(term2193495, term2193495.getClass(), "typeOfThis", term2193749);
        setField(term2193495, term2193495.getClass(), "call", term2193843);
        setField(term2193313, term2193313.getClass(), "typeOfThis", term2193495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2193313;
        try {
            callMethod(klass, "isSubtype", argTypes, term2192857, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


