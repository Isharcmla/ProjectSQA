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

public class FunctionType_tryMergeFunctionPiecewise_2003411845651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659411;
     Object term660171;

    public FunctionType_tryMergeFunctionPiecewise_2003411845651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term661831 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term661830 = ((Class) term661831).getDeclaredField((String) "ORDINARY");
        ((Field) term661830).setAccessible(true);
        Object enum1018 = ((Field) term661830).get((Object) null);
        term659411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term659505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term660440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term660083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term660475, term660475.getClass(), "jsType", null);
        setField(term660510, term660510.getClass(), "jsType", null);
        setField(term660510, term660510.getClass(), "next", null);
        setField(term660475, term660475.getClass(), "next", term660510);
        setField(term660440, term660440.getClass(), "first", term660475);
        setField(term660440, term660440.getClass(), "jsType", null);
        setField(term660440, term660440.getClass(), "next", null);
        setField(term659505, term659505.getClass(), "parameters", term660440);
        setField(term659823, term659823.getClass(), "kind", enum1018);
        setField(term659823, term659823.getClass(), "typeOfThis", term660083);
        setField(term659505, term659505.getClass(), "returnType", term659823);
        setField(term659411, term659411.getClass(), "call", term659505);
        Class<? extends Object> term662122 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term662121 = ((Class) term662122).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term662121).setAccessible(true);
        Object enum1019 = ((Field) term662121).get((Object) null);
        term660171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term660265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term660335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term660405, term660405.getClass(), "jsType", null);
        setField(term660405, term660405.getClass(), "next", term660440);
        setField(term660335, term660335.getClass(), "first", term660405);
        setField(term660265, term660265.getClass(), "parameters", term660335);
        setField(term660618, term660618.getClass(), "kind", enum1019);
        setField(term660618, term660618.getClass(), "typeOfThis", null);
        setField(term660265, term660265.getClass(), "returnType", term660618);
        setField(term660171, term660171.getClass(), "call", term660265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term660171;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term659411, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


