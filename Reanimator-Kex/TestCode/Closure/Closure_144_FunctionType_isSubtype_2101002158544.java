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

public class FunctionType_isSubtype_2101002158544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489156;
     Object term489514;

    public FunctionType_isSubtype_2101002158544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term491496 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term491495 = ((Class) term491496).getDeclaredField((String) "ORDINARY");
        ((Field) term491495).setAccessible(true);
        Object enum892 = ((Field) term491495).get((Object) null);
        term489156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term489404 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term489156, term489156.getClass(), "kind", enum892);
        setField(term489156, term489156.getClass(), "typeOfThis", term489404);
        Class<? extends Object> term491787 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term491786 = ((Class) term491787).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term491786).setAccessible(true);
        Object enum893 = ((Field) term491786).get((Object) null);
        term489514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term489770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term489514, term489514.getClass(), "kind", enum893);
        setField(term489514, term489514.getClass(), "typeOfThis", term489770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term489514;
        try {
            callMethod(klass, "isSubtype", argTypes, term489156, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


