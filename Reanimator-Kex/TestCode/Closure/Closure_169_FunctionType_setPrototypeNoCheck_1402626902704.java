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

public class FunctionType_setPrototypeNoCheck_1402626902704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704847;
     Object term705221;

    public FunctionType_setPrototypeNoCheck_1402626902704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term705223 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term705222 = ((Class) term705223).getDeclaredField((String) "INTERFACE");
        ((Field) term705222).setAccessible(true);
        Object enum1144 = ((Field) term705222).get((Object) null);
        ArrayList term705117 = new ArrayList();
        term704847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term704917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term704847, term704847.getClass(), "prototypeSlot", null);
        setField(term704847, term704847.getClass(), "source", term704917);
        setField(term704847, term704847.getClass(), "kind", enum1144);
        setField(term704847, term704847.getClass(), "extendedInterfaces", term705117);
        term705221 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term705221, term705221.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term705221;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term704847, args);
    }

};


