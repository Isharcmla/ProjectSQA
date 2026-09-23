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

public class FunctionType_isSubtype_2101002158285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148388;
     Object term148644;

    public FunctionType_isSubtype_2101002158285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term149257 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term149256 = ((Class) term149257).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term149256).setAccessible(true);
        Object enum274 = ((Field) term149256).get((Object) null);
        term148388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term148388, term148388.getClass(), "kind", enum274);
        term148644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term148644;
        try {
            callMethod(klass, "isSubtype", argTypes, term148388, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


