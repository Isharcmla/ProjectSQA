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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototypeBasedOn_1012666130203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102944;
     Object term103590;

    public FunctionType_setPrototypeBasedOn_1012666130203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term103592 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term103591 = ((Class) term103592).getDeclaredField((String) "ORDINARY");
        ((Field) term103591).setAccessible(true);
        Object enum194 = ((Field) term103591).get((Object) null);
        term102944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term103502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term102944, term102944.getClass(), "nativeType", false);
        setField(term102944, term102944.getClass(), "kind", enum194);
        setField(term102944, term102944.getClass(), "prototype", term103502);
        setField(term102944, term102944.getClass(), "prototypeSlot", null);
        setBooleanField(term102944, term102944.getClass(), "unknown", false);
        setField(term102944, term102944.getClass(), "subTypes", null);
        term103590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term103590, term103590.getClass(), "className", null);
        setField(term103590, term103590.getClass(), "ownerFunction", null);
        setBooleanField(term103590, term103590.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term103590;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term102944, args);
    }

};


