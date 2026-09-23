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

public class FunctionType_isSubtype_2101002158787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776820;
     Object term777472;

    public FunctionType_isSubtype_2101002158787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term779797 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term779796 = ((Class) term779797).getDeclaredField((String) "INTERFACE");
        ((Field) term779796).setAccessible(true);
        Object enum1453 = ((Field) term779796).get((Object) null);
        Class<? extends Object> term780091 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term780090 = ((Class) term780091).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term780090).setAccessible(true);
        Object enum1454 = ((Field) term780090).get((Object) null);
        term776820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term777364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term776820, term776820.getClass(), "kind", enum1453);
        setField(term777364, term777364.getClass(), "kind", enum1454);
        setField(term776820, term776820.getClass(), "typeOfThis", term777364);
        term777472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term777802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term777472, term777472.getClass(), "kind", enum1453);
        setField(term777802, term777802.getClass(), "kind", enum1453);
        setField(term777472, term777472.getClass(), "typeOfThis", term777802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term777472;
        try {
            callMethod(klass, "isSubtype", argTypes, term776820, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


