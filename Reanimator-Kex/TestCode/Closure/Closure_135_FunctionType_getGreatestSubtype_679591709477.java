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

public class FunctionType_getGreatestSubtype_679591709477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332703;
     Object term333365;

    public FunctionType_getGreatestSubtype_679591709477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term334644 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term334643 = ((Class) term334644).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term334643).setAccessible(true);
        Object enum610 = ((Field) term334643).get((Object) null);
        term332703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term333257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term332703, term332703.getClass(), "kind", enum610);
        setField(term332703, term332703.getClass(), "typeOfThis", term333257);
        Class<? extends Object> term334944 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term334943 = ((Class) term334944).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term334943).setAccessible(true);
        Object enum611 = ((Field) term334943).get((Object) null);
        term333365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term333365, term333365.getClass(), "kind", enum611);
        setField(term333365, term333365.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term333365;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term332703, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


