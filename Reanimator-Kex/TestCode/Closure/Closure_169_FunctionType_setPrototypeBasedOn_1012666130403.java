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

public class FunctionType_setPrototypeBasedOn_1012666130403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371863;
     Object term372169;

    public FunctionType_setPrototypeBasedOn_1012666130403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term373022 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term373021 = ((Class) term373022).getDeclaredField((String) "INTERFACE");
        ((Field) term373021).setAccessible(true);
        Object enum628 = ((Field) term373021).get((Object) null);
        term371863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term372081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term371863, term371863.getClass(), "nativeType", false);
        setField(term371863, term371863.getClass(), "kind", enum628);
        setField(term371863, term371863.getClass(), "prototypeSlot", null);
        setField(term371863, term371863.getClass(), "source", term372081);
        term372169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term372169, term372169.getClass(), "className", null);
        setField(term372169, term372169.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term372169;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term371863, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


