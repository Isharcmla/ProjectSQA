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

public class FunctionType_isSubtype_2101002158765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term850712;
     Object term851452;

    public FunctionType_isSubtype_2101002158765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term855721 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term855720 = ((Class) term855721).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term855720).setAccessible(true);
        Object enum1542 = ((Field) term855720).get((Object) null);
        Class<? extends Object> term856021 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term856020 = ((Class) term856021).getDeclaredField((String) "INTERFACE");
        ((Field) term856020).setAccessible(true);
        Object enum1543 = ((Field) term856020).get((Object) null);
        term850712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term851256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term851344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term850712, term850712.getClass(), "kind", enum1542);
        setField(term851256, term851256.getClass(), "kind", enum1543);
        setField(term851256, term851256.getClass(), "typeOfThis", term851344);
        setField(term850712, term850712.getClass(), "typeOfThis", term851256);
        Class<? extends Object> term856315 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term856314 = ((Class) term856315).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term856314).setAccessible(true);
        Object enum1544 = ((Field) term856314).get((Object) null);
        term851452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term851782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term851452, term851452.getClass(), "kind", enum1542);
        setField(term851782, term851782.getClass(), "kind", enum1544);
        setField(term851782, term851782.getClass(), "typeOfThis", null);
        setField(term851452, term851452.getClass(), "typeOfThis", term851782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term851452;
        try {
            callMethod(klass, "isSubtype", argTypes, term850712, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


