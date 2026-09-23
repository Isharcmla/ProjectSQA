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

public class FunctionType_isSubtype_2101002158774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term870614;
     Object term871070;

    public FunctionType_isSubtype_2101002158774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term874096 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term874095 = ((Class) term874096).getDeclaredField((String) "ORDINARY");
        ((Field) term874095).setAccessible(true);
        Object enum1577 = ((Field) term874095).get((Object) null);
        term870614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term870862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term870962 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term870614, term870614.getClass(), "kind", enum1577);
        setField(term870862, term870862.getClass(), "kind", enum1577);
        setField(term870862, term870862.getClass(), "typeOfThis", term870962);
        setField(term870614, term870614.getClass(), "typeOfThis", term870862);
        Class<? extends Object> term874387 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term874386 = ((Class) term874387).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term874386).setAccessible(true);
        Object enum1578 = ((Field) term874386).get((Object) null);
        term871070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term871326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term871070, term871070.getClass(), "kind", enum1578);
        setField(term871326, term871326.getClass(), "kind", enum1578);
        setField(term871326, term871326.getClass(), "typeOfThis", null);
        setField(term871070, term871070.getClass(), "typeOfThis", term871326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term871070;
        try {
            callMethod(klass, "isSubtype", argTypes, term870614, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


