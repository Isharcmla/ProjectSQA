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

public class FunctionType_getLeastSupertype_418850886589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562156;
     Object term562518;

    public FunctionType_getLeastSupertype_418850886589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term563505 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term563504 = ((Class) term563505).getDeclaredField((String) "INTERFACE");
        ((Field) term563504).setAccessible(true);
        Object enum1023 = ((Field) term563504).get((Object) null);
        term562156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term562408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term562156, term562156.getClass(), "kind", enum1023);
        setField(term562156, term562156.getClass(), "registry", term562408);
        Class<? extends Object> term563799 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term563798 = ((Class) term563799).getDeclaredField((String) "ORDINARY");
        ((Field) term563798).setAccessible(true);
        Object enum1024 = ((Field) term563798).get((Object) null);
        term562518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term562518, term562518.getClass(), "kind", enum1024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term562518;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term562156, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


