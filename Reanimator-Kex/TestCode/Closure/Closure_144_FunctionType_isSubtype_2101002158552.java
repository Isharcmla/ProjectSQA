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

public class FunctionType_isSubtype_2101002158552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498633;
     Object term499285;

    public FunctionType_isSubtype_2101002158552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term501993 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term501992 = ((Class) term501993).getDeclaredField((String) "ORDINARY");
        ((Field) term501992).setAccessible(true);
        Object enum911 = ((Field) term501992).get((Object) null);
        term498633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term499177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term498633, term498633.getClass(), "kind", enum911);
        setField(term498633, term498633.getClass(), "typeOfThis", term499177);
        Class<? extends Object> term502284 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term502283 = ((Class) term502284).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term502283).setAccessible(true);
        Object enum912 = ((Field) term502283).get((Object) null);
        term499285 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term499285, term499285.getClass(), "kind", enum912);
        setField(term499285, term499285.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term499285;
        try {
            callMethod(klass, "isSubtype", argTypes, term498633, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


