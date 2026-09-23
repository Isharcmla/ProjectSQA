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

public class FunctionType_isSubtype_2101002158345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197903;
     Object term198159;

    public FunctionType_isSubtype_2101002158345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term198772 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term198771 = ((Class) term198772).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term198771).setAccessible(true);
        Object enum361 = ((Field) term198771).get((Object) null);
        term197903 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term197903, term197903.getClass(), "kind", enum361);
        term198159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term198159;
        try {
            callMethod(klass, "isSubtype", argTypes, term197903, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


