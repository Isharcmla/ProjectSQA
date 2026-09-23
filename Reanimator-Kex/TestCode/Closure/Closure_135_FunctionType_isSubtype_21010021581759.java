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

public class FunctionType_isSubtype_21010021581759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2404774;
     Object term2405230;

    public FunctionType_isSubtype_21010021581759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2408466 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2408465 = ((Class) term2408466).getDeclaredField((String) "ORDINARY");
        ((Field) term2408465).setAccessible(true);
        Object enum4496 = ((Field) term2408465).get((Object) null);
        term2404774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2405022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2405122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2404774, term2404774.getClass(), "kind", enum4496);
        setField(term2405022, term2405022.getClass(), "kind", enum4496);
        setField(term2405022, term2405022.getClass(), "typeOfThis", term2405122);
        setField(term2404774, term2404774.getClass(), "typeOfThis", term2405022);
        Class<? extends Object> term2408757 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2408756 = ((Class) term2408757).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2408756).setAccessible(true);
        Object enum4497 = ((Field) term2408756).get((Object) null);
        term2405230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2405486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2405668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2405230, term2405230.getClass(), "kind", enum4497);
        setField(term2405486, term2405486.getClass(), "kind", enum4496);
        setField(term2405486, term2405486.getClass(), "typeOfThis", term2405668);
        setField(term2405230, term2405230.getClass(), "typeOfThis", term2405486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2405230;
        try {
            callMethod(klass, "isSubtype", argTypes, term2404774, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


