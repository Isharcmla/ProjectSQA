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

public class FunctionType_setPrototypeNoCheck_1402626902429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391978;
     Object term392556;

    public FunctionType_setPrototypeNoCheck_1402626902429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term393430 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term393429 = ((Class) term393430).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term393429).setAccessible(true);
        Object enum653 = ((Field) term393429).get((Object) null);
        term391978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term392092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term392200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term392304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term392200, term392200.getClass(), "ownerFunction", term392304);
        setField(term392092, term392092.getClass(), "type", term392200);
        setField(term391978, term391978.getClass(), "prototypeSlot", term392092);
        setField(term391978, term391978.getClass(), "source", null);
        setField(term391978, term391978.getClass(), "kind", enum653);
        term392556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term392556, term392556.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term392556;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term391978, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


