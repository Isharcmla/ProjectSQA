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

public class FunctionType_getGreatestSubtype_679591709803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term919063;
     Object term919727;

    public FunctionType_getGreatestSubtype_679591709803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term921054 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term921053 = ((Class) term921054).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term921053).setAccessible(true);
        Object enum1664 = ((Field) term921053).get((Object) null);
        Class<? extends Object> term921354 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term921353 = ((Class) term921354).getDeclaredField((String) "INTERFACE");
        ((Field) term921353).setAccessible(true);
        Object enum1665 = ((Field) term921353).get((Object) null);
        term919063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term919617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term919063, term919063.getClass(), "kind", enum1664);
        setField(term919617, term919617.getClass(), "kind", enum1665);
        setField(term919063, term919063.getClass(), "typeOfThis", term919617);
        term919727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term920049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term919727, term919727.getClass(), "kind", enum1664);
        setField(term920049, term920049.getClass(), "kind", enum1665);
        setField(term919727, term919727.getClass(), "typeOfThis", term920049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term919727;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term919063, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


