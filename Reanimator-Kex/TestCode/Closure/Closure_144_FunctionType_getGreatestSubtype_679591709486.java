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

public class FunctionType_getGreatestSubtype_679591709486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409951;
     Object term410615;

    public FunctionType_getGreatestSubtype_679591709486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term413665 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term413664 = ((Class) term413665).getDeclaredField((String) "ORDINARY");
        ((Field) term413664).setAccessible(true);
        Object enum746 = ((Field) term413664).get((Object) null);
        term409951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term410505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term409951, term409951.getClass(), "kind", enum746);
        setField(term410505, term410505.getClass(), "kind", enum746);
        setField(term409951, term409951.getClass(), "typeOfThis", term410505);
        Class<? extends Object> term413956 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term413955 = ((Class) term413956).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term413955).setAccessible(true);
        Object enum747 = ((Field) term413955).get((Object) null);
        Class<? extends Object> term414256 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term414255 = ((Class) term414256).getDeclaredField((String) "INTERFACE");
        ((Field) term414255).setAccessible(true);
        Object enum748 = ((Field) term414255).get((Object) null);
        term410615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term410789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term410615, term410615.getClass(), "kind", enum747);
        setField(term410789, term410789.getClass(), "kind", enum748);
        setField(term410615, term410615.getClass(), "typeOfThis", term410789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term410615;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term409951, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


