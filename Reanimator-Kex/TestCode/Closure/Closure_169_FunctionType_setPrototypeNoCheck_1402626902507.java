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

public class FunctionType_setPrototypeNoCheck_1402626902507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472005;
     Object term472575;

    public FunctionType_setPrototypeNoCheck_1402626902507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term473423 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term473422 = ((Class) term473423).getDeclaredField((String) "INTERFACE");
        ((Field) term473422).setAccessible(true);
        Object enum772 = ((Field) term473422).get((Object) null);
        term472005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term472119 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term472223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term472323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term472223, term472223.getClass(), "ownerFunction", term472323);
        setField(term472119, term472119.getClass(), "type", term472223);
        setField(term472005, term472005.getClass(), "prototypeSlot", term472119);
        setField(term472005, term472005.getClass(), "source", null);
        setField(term472005, term472005.getClass(), "kind", enum772);
        term472575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term472575, term472575.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term472575;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term472005, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


