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
     Object term752760;
     Object term753410;

    public FunctionType_getGreatestSubtype_679591709709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term754541 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term754540 = ((Class) term754541).getDeclaredField((String) "ORDINARY");
        ((Field) term754540).setAccessible(true);
        Object enum1139 = ((Field) term754540).get((Object) null);
        term752760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term753300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term752760, term752760.getClass(), "kind", enum1139);
        setField(term752760, term752760.getClass(), "typeOfThis", term753300);
        Class<? extends Object> term754832 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term754831 = ((Class) term754832).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term754831).setAccessible(true);
        Object enum1140 = ((Field) term754831).get((Object) null);
        term753410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term753584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term753410, term753410.getClass(), "kind", enum1140);
        setField(term753410, term753410.getClass(), "typeOfThis", term753584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term753410;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term752760, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


