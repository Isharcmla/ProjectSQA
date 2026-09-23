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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class FunctionType_setPrototypeBasedOn_1740539051609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583786;
     Object term584160;

    public FunctionType_setPrototypeBasedOn_1740539051609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term585418 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term585417 = ((Class) term585418).getDeclaredField((String) "INTERFACE");
        ((Field) term585417).setAccessible(true);
        Object enum953 = ((Field) term585417).get((Object) null);
        ArrayList term584056 = new ArrayList();
        ((ArrayList) term584056).add((Object)null);
        term583786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term584004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term583786, term583786.getClass(), "nativeType", false);
        setField(term583786, term583786.getClass(), "kind", enum953);
        setField(term583786, term583786.getClass(), "prototypeSlot", null);
        setField(term583786, term583786.getClass(), "source", term584004);
        setField(term583786, term583786.getClass(), "extendedInterfaces", term584056);
        term584160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term584160, term584160.getClass(), "className", null);
        setField(term584160, term584160.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term584160;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term583786, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


