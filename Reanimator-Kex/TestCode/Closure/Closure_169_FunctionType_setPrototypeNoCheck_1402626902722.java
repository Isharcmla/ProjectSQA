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
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729643;
     Object term730255;

    public FunctionType_setPrototypeNoCheck_1402626902722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term730257 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term730256 = ((Class) term730257).getDeclaredField((String) "INTERFACE");
        ((Field) term730256).setAccessible(true);
        Object enum1168 = ((Field) term730256).get((Object) null);
        ArrayList term730145 = new ArrayList();
        ((ArrayList) term730145).add((Object)null);
        term729643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term729757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term729845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term729945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term729845, term729845.getClass(), "ownerFunction", term729945);
        setField(term729757, term729757.getClass(), "type", term729845);
        setField(term729643, term729643.getClass(), "prototypeSlot", term729757);
        setField(term729643, term729643.getClass(), "source", null);
        setField(term729643, term729643.getClass(), "kind", enum1168);
        setField(term729643, term729643.getClass(), "extendedInterfaces", term730145);
        term730255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term730255, term730255.getClass(), "ownerFunction", null);
        setField(term730255, term730255.getClass(), "implicitPrototypeFallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term730255;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term729643, args);
    }

};


