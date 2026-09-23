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

public class FunctionType_setPrototypeNoCheck_1402626902709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710960;
     Object term711534;

    public FunctionType_setPrototypeNoCheck_1402626902709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term711536 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term711535 = ((Class) term711536).getDeclaredField((String) "INTERFACE");
        ((Field) term711535).setAccessible(true);
        Object enum1149 = ((Field) term711535).get((Object) null);
        term710960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term711074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term711178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term711282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term711178, term711178.getClass(), "ownerFunction", term711282);
        setField(term711074, term711074.getClass(), "type", term711178);
        setField(term710960, term710960.getClass(), "prototypeSlot", term711074);
        setField(term710960, term710960.getClass(), "source", null);
        setField(term710960, term710960.getClass(), "kind", enum1149);
        term711534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term711534, term711534.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term711534;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term710960, args);
    }

};


