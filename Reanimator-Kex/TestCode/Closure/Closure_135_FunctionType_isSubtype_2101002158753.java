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

public class FunctionType_isSubtype_2101002158753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term720351;
     Object term720607;

    public FunctionType_isSubtype_2101002158753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term724053 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term724052 = ((Class) term724053).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term724052).setAccessible(true);
        Object enum1346 = ((Field) term724052).get((Object) null);
        term720351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term720351, term720351.getClass(), "kind", enum1346);
        setField(term720351, term720351.getClass(), "typeOfThis", term720351);
        Class<? extends Object> term724353 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term724352 = ((Class) term724353).getDeclaredField((String) "ORDINARY");
        ((Field) term724352).setAccessible(true);
        Object enum1347 = ((Field) term724352).get((Object) null);
        term720607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term721085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term720607, term720607.getClass(), "kind", enum1347);
        setField(term721085, term721085.getClass(), "kind", enum1347);
        setField(term720607, term720607.getClass(), "typeOfThis", term721085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term720607;
        try {
            callMethod(klass, "isSubtype", argTypes, term720351, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


