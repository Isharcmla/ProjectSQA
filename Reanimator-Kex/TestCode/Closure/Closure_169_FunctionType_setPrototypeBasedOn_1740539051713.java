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

public class FunctionType_setPrototypeBasedOn_1740539051713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716972;
     Object term717328;

    public FunctionType_setPrototypeBasedOn_1740539051713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term717330 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term717329 = ((Class) term717330).getDeclaredField((String) "INTERFACE");
        ((Field) term717329).setAccessible(true);
        Object enum1155 = ((Field) term717329).get((Object) null);
        term716972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term717076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term716972, term716972.getClass(), "nativeType", true);
        setField(term716972, term716972.getClass(), "registry", term717076);
        setField(term716972, term716972.getClass(), "className", null);
        setField(term716972, term716972.getClass(), "ownerFunction", null);
        setField(term716972, term716972.getClass(), "kind", enum1155);
        setField(term716972, term716972.getClass(), "prototypeSlot", null);
        setField(term716972, term716972.getClass(), "source", null);
        term717328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term717328, term717328.getClass(), "className", null);
        setField(term717328, term717328.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term717328;
        args[1] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term716972, args);
    }

};


