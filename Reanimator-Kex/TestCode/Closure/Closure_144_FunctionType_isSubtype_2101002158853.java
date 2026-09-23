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

public class FunctionType_isSubtype_2101002158853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1006938;
     Object term1007592;

    public FunctionType_isSubtype_2101002158853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1009231 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1009230 = ((Class) term1009231).getDeclaredField((String) "ORDINARY");
        ((Field) term1009230).setAccessible(true);
        Object enum1821 = ((Field) term1009230).get((Object) null);
        term1006938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1007482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1006938, term1006938.getClass(), "kind", enum1821);
        setField(term1007482, term1007482.getClass(), "kind", enum1821);
        setField(term1006938, term1006938.getClass(), "typeOfThis", term1007482);
        Class<? extends Object> term1009522 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1009521 = ((Class) term1009522).getDeclaredField((String) "INTERFACE");
        ((Field) term1009521).setAccessible(true);
        Object enum1822 = ((Field) term1009521).get((Object) null);
        term1007592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1007924 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1007592, term1007592.getClass(), "kind", enum1821);
        setField(term1007924, term1007924.getClass(), "kind", enum1822);
        setField(term1007592, term1007592.getClass(), "typeOfThis", term1007924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1007592;
        try {
            callMethod(klass, "isSubtype", argTypes, term1006938, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


