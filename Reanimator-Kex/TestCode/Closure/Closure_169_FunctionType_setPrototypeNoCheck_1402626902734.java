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

public class FunctionType_setPrototypeNoCheck_1402626902734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748199;
     Object term748669;

    public FunctionType_setPrototypeNoCheck_1402626902734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term748671 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term748670 = ((Class) term748671).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term748670).setAccessible(true);
        Object enum1187 = ((Field) term748670).get((Object) null);
        term748199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term748313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term748417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term748417, term748417.getClass(), "ownerFunction", null);
        setField(term748313, term748313.getClass(), "type", term748417);
        setField(term748199, term748199.getClass(), "prototypeSlot", term748313);
        setField(term748199, term748199.getClass(), "source", null);
        setField(term748199, term748199.getClass(), "kind", enum1187);
        term748669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term748669, term748669.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term748669;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term748199, args);
    }

};


