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

public class FunctionType_setPrototypeNoCheck_1402626902728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739520;
     Object term740092;

    public FunctionType_setPrototypeNoCheck_1402626902728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term740242 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term740241 = ((Class) term740242).getDeclaredField((String) "ORDINARY");
        ((Field) term740241).setAccessible(true);
        Object enum1178 = ((Field) term740241).get((Object) null);
        term739520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term739634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term739734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term739834 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term739734, term739734.getClass(), "ownerFunction", term739834);
        setField(term739634, term739634.getClass(), "type", term739734);
        setField(term739520, term739520.getClass(), "prototypeSlot", term739634);
        setField(term739520, term739520.getClass(), "source", null);
        setField(term739520, term739520.getClass(), "kind", enum1178);
        setBooleanField(term739520, term739520.getClass(), "unknown", false);
        setField(term739520, term739520.getClass(), "subTypes", null);
        setBooleanField(term739520, term739520.getClass(), "nativeType", false);
        Class<? extends Object> term740533 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term740532 = ((Class) term740533).getDeclaredField((String) "INTERFACE");
        ((Field) term740532).setAccessible(true);
        Object enum1179 = ((Field) term740532).get((Object) null);
        term740092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term740092, term740092.getClass(), "ownerFunction", null);
        setBooleanField(term740092, term740092.getClass(), "unknown", false);
        setField(term740092, term740092.getClass(), "subTypes", null);
        setBooleanField(term740092, term740092.getClass(), "nativeType", false);
        setField(term740092, term740092.getClass(), "kind", enum1179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term740092;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term739520, args);
    }

};


