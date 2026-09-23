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

public class FunctionType_getLeastSupertype_418850886353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204696;
     Object term205440;

    public FunctionType_getLeastSupertype_418850886353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term206451 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term206450 = ((Class) term206451).getDeclaredField((String) "ORDINARY");
        ((Field) term206450).setAccessible(true);
        Object enum371 = ((Field) term206450).get((Object) null);
        term204696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term205228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term205332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term204696, term204696.getClass(), "kind", enum371);
        setField(term204696, term204696.getClass(), "typeOfThis", term205228);
        setField(term204696, term204696.getClass(), "registry", term205332);
        Class<? extends Object> term206742 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term206741 = ((Class) term206742).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term206741).setAccessible(true);
        Object enum372 = ((Field) term206741).get((Object) null);
        term205440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term205440, term205440.getClass(), "kind", enum372);
        setField(term205440, term205440.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term205440;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term204696, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


