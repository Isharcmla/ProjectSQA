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

public class FunctionType_getLeastSupertype_418850886619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528948;
     Object term529618;

    public FunctionType_getLeastSupertype_418850886619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term530617 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term530616 = ((Class) term530617).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term530616).setAccessible(true);
        Object enum979 = ((Field) term530616).get((Object) null);
        term528948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term529510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term528948, term528948.getClass(), "kind", enum979);
        setField(term528948, term528948.getClass(), "typeOfThis", term529510);
        Class<? extends Object> term530917 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term530916 = ((Class) term530917).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term530916).setAccessible(true);
        Object enum980 = ((Field) term530916).get((Object) null);
        term529618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term529618, term529618.getClass(), "kind", enum980);
        setField(term529618, term529618.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term529618;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term528948, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


