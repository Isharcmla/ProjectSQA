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

public class FunctionType_getGreatestSubtype_679591709581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547534;
     Object term548288;

    public FunctionType_getGreatestSubtype_679591709581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term549277 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term549276 = ((Class) term549277).getDeclaredField((String) "ORDINARY");
        ((Field) term549276).setAccessible(true);
        Object enum998 = ((Field) term549276).get((Object) null);
        term547534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term548078 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term548178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term547534, term547534.getClass(), "kind", enum998);
        setField(term548078, term548078.getClass(), "kind", enum998);
        setField(term548078, term548078.getClass(), "typeOfThis", term548178);
        setField(term547534, term547534.getClass(), "typeOfThis", term548078);
        term548288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term548610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term548288, term548288.getClass(), "kind", enum998);
        setField(term548610, term548610.getClass(), "kind", enum998);
        setField(term548610, term548610.getClass(), "typeOfThis", null);
        setField(term548288, term548288.getClass(), "typeOfThis", term548610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term548288;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term547534, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


