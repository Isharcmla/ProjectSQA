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

public class FunctionType_isSubtype_2101002158250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142256;
     Object term142514;

    public FunctionType_isSubtype_2101002158250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term143872 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term143871 = ((Class) term143872).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term143871).setAccessible(true);
        Object enum288 = ((Field) term143871).get((Object) null);
        term142256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term142256, term142256.getClass(), "kind", enum288);
        term142514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term142514;
        try {
            callMethod(klass, "isSubtype", argTypes, term142256, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


