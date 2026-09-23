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

public class FunctionType_setPrototypeNoCheck_1402626902655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636662;
     Object term637232;

    public FunctionType_setPrototypeNoCheck_1402626902655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term639582 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term639581 = ((Class) term639582).getDeclaredField((String) "ORDINARY");
        ((Field) term639581).setAccessible(true);
        Object enum1044 = ((Field) term639581).get((Object) null);
        term636662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term636776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term636880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term636980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term636880, term636880.getClass(), "ownerFunction", term636980);
        setField(term636776, term636776.getClass(), "type", term636880);
        setField(term636662, term636662.getClass(), "prototypeSlot", term636776);
        setField(term636662, term636662.getClass(), "source", null);
        setField(term636662, term636662.getClass(), "kind", enum1044);
        setBooleanField(term636662, term636662.getClass(), "unknown", false);
        setField(term636662, term636662.getClass(), "subTypes", null);
        setBooleanField(term636662, term636662.getClass(), "nativeType", false);
        Class<? extends Object> term639873 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term639872 = ((Class) term639873).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term639872).setAccessible(true);
        Object enum1045 = ((Field) term639872).get((Object) null);
        term637232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term637232, term637232.getClass(), "ownerFunction", null);
        setBooleanField(term637232, term637232.getClass(), "unknown", false);
        setField(term637232, term637232.getClass(), "subTypes", null);
        setBooleanField(term637232, term637232.getClass(), "nativeType", false);
        setField(term637232, term637232.getClass(), "kind", enum1045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term637232;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term636662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


