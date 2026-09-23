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

public class FunctionType_isSubtype_21010021581443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2063070;
     Object term2063722;

    public FunctionType_isSubtype_21010021581443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2069339 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2069338 = ((Class) term2069339).getDeclaredField((String) "INTERFACE");
        ((Field) term2069338).setAccessible(true);
        Object enum3678 = ((Field) term2069338).get((Object) null);
        Class<? extends Object> term2069633 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2069632 = ((Class) term2069633).getDeclaredField((String) "INTERFACE");
        ((Field) term2069632).setAccessible(true);
        Object enum3679 = ((Field) term2069632).get((Object) null);
        term2063070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2063614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2063070, term2063070.getClass(), "kind", enum3678);
        setField(term2063614, term2063614.getClass(), "kind", enum3679);
        setField(term2063070, term2063070.getClass(), "typeOfThis", term2063614);
        Class<? extends Object> term2069927 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2069926 = ((Class) term2069927).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2069926).setAccessible(true);
        Object enum3680 = ((Field) term2069926).get((Object) null);
        term2063722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2063904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2063722, term2063722.getClass(), "kind", enum3680);
        setField(term2063904, term2063904.getClass(), "kind", enum3680);
        setField(term2063722, term2063722.getClass(), "typeOfThis", term2063904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2063722;
        try {
            callMethod(klass, "isSubtype", argTypes, term2063070, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


