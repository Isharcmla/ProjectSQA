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

public class FunctionType_isSubtype_21010021581569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2086535;
     Object term2087087;

    public FunctionType_isSubtype_21010021581569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2089511 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2089510 = ((Class) term2089511).getDeclaredField((String) "ORDINARY");
        ((Field) term2089510).setAccessible(true);
        Object enum3889 = ((Field) term2089510).get((Object) null);
        term2086535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2086535, term2086535.getClass(), "kind", enum3889);
        setField(term2086535, term2086535.getClass(), "typeOfThis", term2086535);
        term2087087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2087417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2087087, term2087087.getClass(), "kind", enum3889);
        setField(term2087417, term2087417.getClass(), "kind", enum3889);
        setField(term2087087, term2087087.getClass(), "typeOfThis", term2087417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2087087;
        try {
            callMethod(klass, "isSubtype", argTypes, term2086535, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


