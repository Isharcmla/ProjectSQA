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

public class FunctionType_setPrototypeNoCheck_1402626902562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537644;
     Object term538110;

    public FunctionType_setPrototypeNoCheck_1402626902562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term539042 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term539041 = ((Class) term539042).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term539041).setAccessible(true);
        Object enum881 = ((Field) term539041).get((Object) null);
        term537644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term537758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term537858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term537758, term537758.getClass(), "type", term537644);
        setField(term537644, term537644.getClass(), "prototypeSlot", term537758);
        setField(term537644, term537644.getClass(), "source", null);
        setField(term537644, term537644.getClass(), "ownerFunction", term537858);
        setField(term537644, term537644.getClass(), "kind", enum881);
        term538110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term538110, term538110.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term538110;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term537644, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


