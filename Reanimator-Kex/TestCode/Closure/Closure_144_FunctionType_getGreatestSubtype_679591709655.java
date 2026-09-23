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

public class FunctionType_getGreatestSubtype_679591709655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658976;
     Object term659546;

    public FunctionType_getGreatestSubtype_679591709655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term660451 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term660450 = ((Class) term660451).getDeclaredField((String) "ORDINARY");
        ((Field) term660450).setAccessible(true);
        Object enum1189 = ((Field) term660450).get((Object) null);
        term658976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term659234 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term659342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term659436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term658976, term658976.getClass(), "kind", enum1189);
        setField(term659234, term659234.getClass(), "kind", enum1189);
        setField(term659234, term659234.getClass(), "typeOfThis", term659342);
        setField(term658976, term658976.getClass(), "typeOfThis", term659234);
        setField(term658976, term658976.getClass(), "call", term659436);
        term659546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term659720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term659546, term659546.getClass(), "kind", enum1189);
        setField(term659720, term659720.getClass(), "kind", enum1189);
        setField(term659720, term659720.getClass(), "typeOfThis", null);
        setField(term659546, term659546.getClass(), "typeOfThis", term659720);
        setField(term659546, term659546.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term659546;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term658976, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


