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

public class FunctionType_setPrototypeNoCheck_1402626902600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571969;
     Object term572547;

    public FunctionType_setPrototypeNoCheck_1402626902600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term573421 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term573420 = ((Class) term573421).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term573420).setAccessible(true);
        Object enum933 = ((Field) term573420).get((Object) null);
        term571969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term572083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term572191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term572295 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term572191, term572191.getClass(), "ownerFunction", term572295);
        setField(term572083, term572083.getClass(), "type", term572191);
        setField(term571969, term571969.getClass(), "prototypeSlot", term572083);
        setField(term571969, term571969.getClass(), "source", null);
        setField(term571969, term571969.getClass(), "kind", enum933);
        term572547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term572547, term572547.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term572547;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term571969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


