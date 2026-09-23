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
import java.lang.Object;
import java.lang.String;

public class FunctionType_setPrototypeNoCheck_1402626902720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term727030;
     Object term727500;

    public FunctionType_setPrototypeNoCheck_1402626902720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term727502 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term727501 = ((Class) term727502).getDeclaredField((String) "ORDINARY");
        ((Field) term727501).setAccessible(true);
        Object enum1166 = ((Field) term727501).get((Object) null);
        term727030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term727144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term727248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term727248, term727248.getClass(), "ownerFunction", null);
        setField(term727144, term727144.getClass(), "type", term727248);
        setField(term727030, term727030.getClass(), "prototypeSlot", term727144);
        setField(term727030, term727030.getClass(), "source", null);
        setField(term727030, term727030.getClass(), "kind", enum1166);
        setBooleanField(term727030, term727030.getClass(), "unknown", false);
        setField(term727030, term727030.getClass(), "subTypes", null);
        setBooleanField(term727030, term727030.getClass(), "nativeType", false);
        term727500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term727500, term727500.getClass(), "ownerFunction", null);
        setBooleanField(term727500, term727500.getClass(), "unknown", false);
        setField(term727500, term727500.getClass(), "subTypes", null);
        setBooleanField(term727500, term727500.getClass(), "nativeType", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term727500;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term727030, args);
    }

};


