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

public class FunctionType_setPrototypeNoCheck_1402626902357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325521;
     Object term325987;

    public FunctionType_setPrototypeNoCheck_1402626902357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term326917 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term326916 = ((Class) term326917).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term326916).setAccessible(true);
        Object enum564 = ((Field) term326916).get((Object) null);
        term325521 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term325635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term325735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term325635, term325635.getClass(), "type", term325521);
        setField(term325521, term325521.getClass(), "prototypeSlot", term325635);
        setField(term325521, term325521.getClass(), "source", null);
        setField(term325521, term325521.getClass(), "ownerFunction", term325735);
        setField(term325521, term325521.getClass(), "kind", enum564);
        term325987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term325987, term325987.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term325987;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term325521, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


