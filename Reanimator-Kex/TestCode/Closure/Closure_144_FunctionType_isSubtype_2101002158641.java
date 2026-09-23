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

public class FunctionType_isSubtype_2101002158641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638687;
     Object term639341;

    public FunctionType_isSubtype_2101002158641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term640343 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term640342 = ((Class) term640343).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term640342).setAccessible(true);
        Object enum1150 = ((Field) term640342).get((Object) null);
        term638687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term639231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term638687, term638687.getClass(), "kind", enum1150);
        setField(term638687, term638687.getClass(), "typeOfThis", term639231);
        term639341 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term639651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term639341, term639341.getClass(), "kind", enum1150);
        setField(term639341, term639341.getClass(), "typeOfThis", term639651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term639341;
        try {
            callMethod(klass, "isSubtype", argTypes, term638687, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


