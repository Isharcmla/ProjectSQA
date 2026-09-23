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
import java.lang.Boolean;

public class FunctionType_supAndInfHelper_160397710496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11725;
     Object term11775;

    public FunctionType_supAndInfHelper_160397710496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44953 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term44952 = ((Class) term44953).getDeclaredField((String) "ORDINARY");
        ((Field) term44952).setAccessible(true);
        Object enum114 = ((Field) term44952).get((Object) null);
        term11725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term11756 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term11727, term11727.getClass(), "type", 993388358);
        setIntField(term11729, term11729.getClass(), "type", -1891015523);
        setIntField(term11731, term11731.getClass(), "type", 0);
        setField(term11731, term11731.getClass(), "next", null);
        setField(term11731, term11731.getClass(), "first", null);
        setField(term11731, term11731.getClass(), "last", null);
        setField(term11731, term11731.getClass(), "propListHead", null);
        setIntField(term11731, term11731.getClass(), "sourcePosition", 0);
        setField(term11731, term11731.getClass(), "jsType", null);
        setField(term11731, term11731.getClass(), "parent", null);
        setField(term11729, term11729.getClass(), "next", term11731);
        setIntField(term11734, term11734.getClass(), "type", 0);
        setField(term11734, term11734.getClass(), "next", null);
        setField(term11734, term11734.getClass(), "first", null);
        setField(term11734, term11734.getClass(), "last", null);
        setField(term11734, term11734.getClass(), "propListHead", null);
        setIntField(term11734, term11734.getClass(), "sourcePosition", 0);
        setField(term11734, term11734.getClass(), "jsType", null);
        setField(term11734, term11734.getClass(), "parent", null);
        setField(term11729, term11729.getClass(), "first", term11734);
        setIntField(term11737, term11737.getClass(), "type", 0);
        setField(term11737, term11737.getClass(), "next", null);
        setField(term11737, term11737.getClass(), "first", null);
        setField(term11737, term11737.getClass(), "last", null);
        setField(term11737, term11737.getClass(), "propListHead", null);
        setIntField(term11737, term11737.getClass(), "sourcePosition", 0);
        setField(term11737, term11737.getClass(), "jsType", null);
        setField(term11737, term11737.getClass(), "parent", null);
        setField(term11729, term11729.getClass(), "last", term11737);
        setField(term11729, term11729.getClass(), "propListHead", null);
        setIntField(term11729, term11729.getClass(), "sourcePosition", 0);
        setField(term11729, term11729.getClass(), "jsType", null);
        setField(term11729, term11729.getClass(), "parent", null);
        setField(term11727, term11727.getClass(), "next", term11729);
        setIntField(term11741, term11741.getClass(), "type", 0);
        setField(term11741, term11741.getClass(), "next", null);
        setField(term11741, term11741.getClass(), "first", null);
        setField(term11741, term11741.getClass(), "last", null);
        setField(term11741, term11741.getClass(), "propListHead", null);
        setIntField(term11741, term11741.getClass(), "sourcePosition", 0);
        setField(term11741, term11741.getClass(), "jsType", null);
        setField(term11741, term11741.getClass(), "parent", null);
        setField(term11727, term11727.getClass(), "first", term11741);
        setIntField(term11744, term11744.getClass(), "type", 0);
        setField(term11744, term11744.getClass(), "next", null);
        setField(term11744, term11744.getClass(), "first", null);
        setField(term11744, term11744.getClass(), "last", null);
        setField(term11744, term11744.getClass(), "propListHead", null);
        setIntField(term11744, term11744.getClass(), "sourcePosition", 0);
        setField(term11744, term11744.getClass(), "jsType", null);
        setField(term11744, term11744.getClass(), "parent", null);
        setField(term11727, term11727.getClass(), "last", term11744);
        setField(term11727, term11727.getClass(), "propListHead", null);
        setIntField(term11727, term11727.getClass(), "sourcePosition", 0);
        setField(term11727, term11727.getClass(), "jsType", null);
        setField(term11727, term11727.getClass(), "parent", null);
        setField(term11726, term11726.getClass(), "parameters", term11727);
        setField(term11726, term11726.getClass(), "returnType", null);
        setBooleanField(term11726, term11726.getClass(), "returnTypeInferred", false);
        setBooleanField(term11726, term11726.getClass(), "resolved", false);
        setField(term11726, term11726.getClass(), "resolveResult", null);
        setField(term11726, term11726.getClass(), "registry", null);
        setField(term11725, term11725.getClass(), "call", term11726);
        setField(term11750, term11750.getClass(), "className", null);
        setField(term11750, term11750.getClass(), "properties", null);
        setBooleanField(term11750, term11750.getClass(), "nativeType", false);
        setField(term11750, term11750.getClass(), "implicitPrototypeFallback", null);
        setField(term11750, term11750.getClass(), "ownerFunction", null);
        setBooleanField(term11750, term11750.getClass(), "prettyPrint", false);
        setBooleanField(term11750, term11750.getClass(), "visited", false);
        setField(term11750, term11750.getClass(), "docInfo", null);
        setBooleanField(term11750, term11750.getClass(), "unknown", false);
        setBooleanField(term11750, term11750.getClass(), "resolved", false);
        setField(term11750, term11750.getClass(), "resolveResult", null);
        setField(term11750, term11750.getClass(), "registry", null);
        setField(term11725, term11725.getClass(), "prototype", term11750);
        setField(term11756, term11756.getClass(), "name", null);
        setField(term11756, term11756.getClass(), "type", null);
        setBooleanField(term11756, term11756.getClass(), "inferred", false);
        setField(term11725, term11725.getClass(), "prototypeSlot", term11756);
        setField(term11725, term11725.getClass(), "kind", enum114);
        setField(term11725, term11725.getClass(), "typeOfThis", null);
        setField(term11725, term11725.getClass(), "source", null);
        setField(term11725, term11725.getClass(), "implementedInterfaces", null);
        setField(term11725, term11725.getClass(), "extendedInterfaces", null);
        setField(term11725, term11725.getClass(), "subTypes", null);
        setField(term11725, term11725.getClass(), "templateTypeName", null);
        setField(term11725, term11725.getClass(), "className", null);
        setField(term11725, term11725.getClass(), "properties", null);
        setBooleanField(term11725, term11725.getClass(), "nativeType", false);
        setField(term11725, term11725.getClass(), "implicitPrototypeFallback", null);
        setField(term11725, term11725.getClass(), "ownerFunction", null);
        setBooleanField(term11725, term11725.getClass(), "prettyPrint", false);
        setBooleanField(term11725, term11725.getClass(), "visited", false);
        setField(term11725, term11725.getClass(), "docInfo", null);
        setBooleanField(term11725, term11725.getClass(), "unknown", false);
        setBooleanField(term11725, term11725.getClass(), "resolved", false);
        setField(term11725, term11725.getClass(), "resolveResult", null);
        setField(term11725, term11725.getClass(), "registry", null);
        term11775 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11775;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term11725, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


