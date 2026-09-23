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

public class FunctionType_addRelatedExtendedInterfaces_1452940821215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109289;
     Object term109389;
     Object term229997;
     Object term229998;

    public FunctionType_addRelatedExtendedInterfaces_1452940821215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term109389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term229997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term229997, term229997.getClass(), "call", null);
        setField(term229997, term229997.getClass(), "prototypeSlot", null);
        setField(term229997, term229997.getClass(), "kind", null);
        setField(term229997, term229997.getClass(), "propAccess", null);
        setField(term229997, term229997.getClass(), "typeOfThis", null);
        setField(term229997, term229997.getClass(), "source", null);
        setField(term229997, term229997.getClass(), "implementedInterfaces", null);
        setField(term229997, term229997.getClass(), "extendedInterfaces", null);
        setField(term229997, term229997.getClass(), "subTypes", null);
        setField(term229997, term229997.getClass(), "templateTypeNames", null);
        setField(term229997, term229997.getClass(), "className", null);
        setField(term229997, term229997.getClass(), "properties", null);
        setBooleanField(term229997, term229997.getClass(), "nativeType", false);
        setField(term229997, term229997.getClass(), "implicitPrototypeFallback", null);
        setField(term229997, term229997.getClass(), "ownerFunction", null);
        setBooleanField(term229997, term229997.getClass(), "prettyPrint", false);
        setBooleanField(term229997, term229997.getClass(), "visited", false);
        setField(term229997, term229997.getClass(), "docInfo", null);
        setBooleanField(term229997, term229997.getClass(), "unknown", false);
        setBooleanField(term229997, term229997.getClass(), "resolved", false);
        setField(term229997, term229997.getClass(), "resolveResult", null);
        setBooleanField(term229997, term229997.getClass(), "inTemplatedCheckVisit", false);
        setField(term229997, term229997.getClass(), "registry", null);
        term229998 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term229998, term229998.getClass(), "call", null);
        setField(term229998, term229998.getClass(), "prototypeSlot", null);
        setField(term229998, term229998.getClass(), "kind", null);
        setField(term229998, term229998.getClass(), "propAccess", null);
        setField(term229998, term229998.getClass(), "typeOfThis", null);
        setField(term229998, term229998.getClass(), "source", null);
        setField(term229998, term229998.getClass(), "implementedInterfaces", null);
        setField(term229998, term229998.getClass(), "extendedInterfaces", null);
        setField(term229998, term229998.getClass(), "subTypes", null);
        setField(term229998, term229998.getClass(), "templateTypeNames", null);
        setField(term229998, term229998.getClass(), "className", null);
        setField(term229998, term229998.getClass(), "properties", null);
        setBooleanField(term229998, term229998.getClass(), "nativeType", false);
        setField(term229998, term229998.getClass(), "implicitPrototypeFallback", null);
        setField(term229998, term229998.getClass(), "ownerFunction", null);
        setBooleanField(term229998, term229998.getClass(), "prettyPrint", false);
        setBooleanField(term229998, term229998.getClass(), "visited", false);
        setField(term229998, term229998.getClass(), "docInfo", null);
        setBooleanField(term229998, term229998.getClass(), "unknown", false);
        setBooleanField(term229998, term229998.getClass(), "resolved", false);
        setField(term229998, term229998.getClass(), "resolveResult", null);
        setBooleanField(term229998, term229998.getClass(), "inTemplatedCheckVisit", false);
        setField(term229998, term229998.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term109389;
        args[1] = null;
        callMethod(klass, "addRelatedExtendedInterfaces", argTypes, term109289, args);
        assertTrue(recursiveEquals(term109289, term229997));
        assertTrue(recursiveEquals(term109389, term229998));
    }

};


