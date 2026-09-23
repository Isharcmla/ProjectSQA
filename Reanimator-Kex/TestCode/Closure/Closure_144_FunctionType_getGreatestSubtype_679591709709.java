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

public class FunctionType_getGreatestSubtype_679591709709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term753241;
     Object term753905;

    public FunctionType_getGreatestSubtype_679591709709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term755498 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term755497 = ((Class) term755498).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term755497).setAccessible(true);
        Object enum1357 = ((Field) term755497).get((Object) null);
        term753241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term753795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term753241, term753241.getClass(), "kind", enum1357);
        setField(term753795, term753795.getClass(), "kind", enum1357);
        setField(term753241, term753241.getClass(), "typeOfThis", term753795);
        Class<? extends Object> term755798 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term755797 = ((Class) term755798).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term755797).setAccessible(true);
        Object enum1358 = ((Field) term755797).get((Object) null);
        Class<? extends Object> term756098 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term756097 = ((Class) term756098).getDeclaredField((String) "INTERFACE");
        ((Field) term756097).setAccessible(true);
        Object enum1359 = ((Field) term756097).get((Object) null);
        term753905 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term754079 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term753905, term753905.getClass(), "kind", enum1358);
        setField(term754079, term754079.getClass(), "kind", enum1359);
        setField(term753905, term753905.getClass(), "typeOfThis", term754079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term753905;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term753241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


