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

public class FunctionType_isSubtype_21010021581597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2135076;
     Object term2135674;

    public FunctionType_isSubtype_21010021581597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2137175 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2137174 = ((Class) term2137175).getDeclaredField((String) "ORDINARY");
        ((Field) term2137174).setAccessible(true);
        Object enum3982 = ((Field) term2137174).get((Object) null);
        Class<? extends Object> term2137466 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2137465 = ((Class) term2137466).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2137465).setAccessible(true);
        Object enum3983 = ((Field) term2137465).get((Object) null);
        term2135076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2135324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2135566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2135076, term2135076.getClass(), "kind", enum3982);
        setField(term2135324, term2135324.getClass(), "kind", enum3983);
        setField(term2135324, term2135324.getClass(), "call", term2135566);
        setField(term2135076, term2135076.getClass(), "typeOfThis", term2135324);
        term2135674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2135856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2135674, term2135674.getClass(), "kind", enum3982);
        setField(term2135856, term2135856.getClass(), "kind", enum3983);
        setField(term2135856, term2135856.getClass(), "call", null);
        setField(term2135674, term2135674.getClass(), "typeOfThis", term2135856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2135674;
        try {
            callMethod(klass, "isSubtype", argTypes, term2135076, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


