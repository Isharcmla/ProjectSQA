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

public class FunctionType_getGreatestSubtype_679591709759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840936;
     Object term841698;

    public FunctionType_getGreatestSubtype_679591709759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term842993 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term842992 = ((Class) term842993).getDeclaredField((String) "INTERFACE");
        ((Field) term842992).setAccessible(true);
        Object enum1519 = ((Field) term842992).get((Object) null);
        term840936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term841490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term841588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term840936, term840936.getClass(), "kind", enum1519);
        setField(term841490, term841490.getClass(), "kind", enum1519);
        setField(term841490, term841490.getClass(), "typeOfThis", term841588);
        setField(term840936, term840936.getClass(), "typeOfThis", term841490);
        Class<? extends Object> term843287 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term843286 = ((Class) term843287).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term843286).setAccessible(true);
        Object enum1520 = ((Field) term843286).get((Object) null);
        term841698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term841880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term841698, term841698.getClass(), "kind", enum1520);
        setField(term841880, term841880.getClass(), "kind", enum1519);
        setField(term841880, term841880.getClass(), "typeOfThis", null);
        setField(term841698, term841698.getClass(), "typeOfThis", term841880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term841698;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term840936, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


