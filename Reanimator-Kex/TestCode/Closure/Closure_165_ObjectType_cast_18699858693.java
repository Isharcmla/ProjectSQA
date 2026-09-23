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
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class ObjectType_cast_18699858693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12428;
     Object term12443;
     Object term12437;

    public ObjectType_cast_18699858693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term12443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term12443, term12443.getClass(), "this$0", null);
        setField(term12443, term12443.getClass(), "call", null);
        setField(term12443, term12443.getClass(), "prototypeSlot", null);
        setField(term12443, term12443.getClass(), "kind", null);
        setField(term12443, term12443.getClass(), "typeOfThis", null);
        setField(term12443, term12443.getClass(), "source", null);
        setField(term12443, term12443.getClass(), "implementedInterfaces", null);
        setField(term12443, term12443.getClass(), "extendedInterfaces", null);
        setField(term12443, term12443.getClass(), "subTypes", null);
        setField(term12443, term12443.getClass(), "templateTypeName", null);
        setField(term12443, term12443.getClass(), "className", null);
        setField(term12443, term12443.getClass(), "properties", null);
        setBooleanField(term12443, term12443.getClass(), "nativeType", false);
        setField(term12443, term12443.getClass(), "implicitPrototypeFallback", null);
        setField(term12443, term12443.getClass(), "ownerFunction", null);
        setBooleanField(term12443, term12443.getClass(), "prettyPrint", false);
        setBooleanField(term12443, term12443.getClass(), "visited", false);
        setField(term12443, term12443.getClass(), "docInfo", null);
        setBooleanField(term12443, term12443.getClass(), "unknown", false);
        setBooleanField(term12443, term12443.getClass(), "resolved", false);
        setField(term12443, term12443.getClass(), "resolveResult", null);
        setField(term12443, term12443.getClass(), "registry", null);
        term12437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term12437, term12437.getClass(), "this$0", null);
        setField(term12437, term12437.getClass(), "call", null);
        setField(term12437, term12437.getClass(), "prototypeSlot", null);
        setField(term12437, term12437.getClass(), "kind", null);
        setField(term12437, term12437.getClass(), "typeOfThis", null);
        setField(term12437, term12437.getClass(), "source", null);
        setField(term12437, term12437.getClass(), "implementedInterfaces", null);
        setField(term12437, term12437.getClass(), "extendedInterfaces", null);
        setField(term12437, term12437.getClass(), "subTypes", null);
        setField(term12437, term12437.getClass(), "templateTypeName", null);
        setField(term12437, term12437.getClass(), "className", null);
        setField(term12437, term12437.getClass(), "properties", null);
        setBooleanField(term12437, term12437.getClass(), "nativeType", false);
        setField(term12437, term12437.getClass(), "implicitPrototypeFallback", null);
        setField(term12437, term12437.getClass(), "ownerFunction", null);
        setBooleanField(term12437, term12437.getClass(), "prettyPrint", false);
        setBooleanField(term12437, term12437.getClass(), "visited", false);
        setField(term12437, term12437.getClass(), "docInfo", null);
        setBooleanField(term12437, term12437.getClass(), "unknown", false);
        setBooleanField(term12437, term12437.getClass(), "resolved", false);
        setField(term12437, term12437.getClass(), "resolveResult", null);
        setField(term12437, term12437.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term12428;
        Object retValue = callMethod(klass, "cast", argTypes, null, args);
        assertTrue(recursiveEquals(term12428, term12443));
        assertTrue(recursiveEquals(retValue, term12437));
    }

};


