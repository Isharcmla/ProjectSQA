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

public class FunctionType_isSubtype_21010021581774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2429149;
     Object term2429789;

    public FunctionType_isSubtype_21010021581774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2432823 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2432822 = ((Class) term2432823).getDeclaredField((String) "INTERFACE");
        ((Field) term2432822).setAccessible(true);
        Object enum4544 = ((Field) term2432822).get((Object) null);
        term2429149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2429681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2429149, term2429149.getClass(), "kind", enum4544);
        setField(term2429149, term2429149.getClass(), "typeOfThis", term2429681);
        Class<? extends Object> term2433117 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2433116 = ((Class) term2433117).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2433116).setAccessible(true);
        Object enum4545 = ((Field) term2433116).get((Object) null);
        term2429789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2429789, term2429789.getClass(), "kind", enum4545);
        setField(term2429789, term2429789.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2429789;
        try {
            callMethod(klass, "isSubtype", argTypes, term2429149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


