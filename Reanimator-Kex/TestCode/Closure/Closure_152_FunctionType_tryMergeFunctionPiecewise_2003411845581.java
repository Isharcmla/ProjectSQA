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
import java.lang.Object;
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559915;
     Object term560981;

    public FunctionType_tryMergeFunctionPiecewise_2003411845581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term562506 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term562505 = ((Class) term562506).getDeclaredField((String) "ORDINARY");
        ((Field) term562505).setAccessible(true);
        Object enum871 = ((Field) term562505).get((Object) null);
        term559915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term560009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term560079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term560149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term560237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term560777 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term560881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term560149, term560149.getClass(), "jsType", null);
        setField(term560149, term560149.getClass(), "next", null);
        setField(term560079, term560079.getClass(), "first", term560149);
        setField(term560009, term560009.getClass(), "parameters", term560079);
        setField(term560237, term560237.getClass(), "kind", enum871);
        setField(term560237, term560237.getClass(), "typeOfThis", term560777);
        setField(term560237, term560237.getClass(), "registry", term560881);
        setField(term560009, term560009.getClass(), "returnType", term560237);
        setField(term559915, term559915.getClass(), "call", term560009);
        Class<? extends Object> term562797 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term562796 = ((Class) term562797).getDeclaredField((String) "INTERFACE");
        ((Field) term562796).setAccessible(true);
        Object enum872 = ((Field) term562796).get((Object) null);
        term560981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term561075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term561145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term561215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term561315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term561489 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term561215, term561215.getClass(), "jsType", null);
        setField(term561215, term561215.getClass(), "next", null);
        setField(term561145, term561145.getClass(), "first", term561215);
        setField(term561075, term561075.getClass(), "parameters", term561145);
        setField(term561315, term561315.getClass(), "kind", enum872);
        setField(term561315, term561315.getClass(), "typeOfThis", term561489);
        setField(term561075, term561075.getClass(), "returnType", term561315);
        setField(term560981, term560981.getClass(), "call", term561075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term560981;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term559915, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


