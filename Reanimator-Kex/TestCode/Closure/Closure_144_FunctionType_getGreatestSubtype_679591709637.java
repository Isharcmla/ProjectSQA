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

public class FunctionType_getGreatestSubtype_679591709637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term634528;
     Object term634890;

    public FunctionType_getGreatestSubtype_679591709637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term635610 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term635609 = ((Class) term635610).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term635609).setAccessible(true);
        Object enum1143 = ((Field) term635609).get((Object) null);
        term634528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term634780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term634528, term634528.getClass(), "kind", enum1143);
        setField(term634528, term634528.getClass(), "registry", term634780);
        term634890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term634890, term634890.getClass(), "kind", enum1143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term634890;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term634528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


