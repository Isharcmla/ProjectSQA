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
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525382;
     Object term526302;

    public FunctionType_setPrototypeNoCheck_1402626902550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term527250 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term527249 = ((Class) term527250).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term527249).setAccessible(true);
        Object enum863 = ((Field) term527249).get((Object) null);
        term525382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term525496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term525584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term525684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term525754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term525584, term525584.getClass(), "ownerFunction", term525684);
        setField(term525496, term525496.getClass(), "type", term525584);
        setField(term525382, term525382.getClass(), "prototypeSlot", term525496);
        setField(term525382, term525382.getClass(), "source", term525754);
        setField(term525382, term525382.getClass(), "kind", enum863);
        setBooleanField(term525382, term525382.getClass(), "unknown", false);
        setField(term525382, term525382.getClass(), "subTypes", null);
        setBooleanField(term525382, term525382.getClass(), "nativeType", false);
        ArrayList term526354 = new ArrayList();
        term526302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term526302, term526302.getClass(), "ownerFunction", null);
        setBooleanField(term526302, term526302.getClass(), "unknown", false);
        setField(term526302, term526302.getClass(), "subTypes", term526354);
        setBooleanField(term526302, term526302.getClass(), "nativeType", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term526302;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term525382, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


