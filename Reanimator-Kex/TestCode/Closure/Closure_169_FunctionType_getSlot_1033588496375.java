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
import java.lang.Object;

public class FunctionType_getSlot_1033588496375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342872;
     Object term343058;
     Object term343039;

    public FunctionType_getSlot_1033588496375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term342986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term342872, term342872.getClass(), "prototypeSlot", term342986);
        term343058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term343059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term343058, term343058.getClass(), "call", null);
        setField(term343059, term343059.getClass(), "name", null);
        setField(term343059, term343059.getClass(), "type", null);
        setBooleanField(term343059, term343059.getClass(), "inferred", false);
        setField(term343059, term343059.getClass(), "propertyNode", null);
        setField(term343059, term343059.getClass(), "docInfo", null);
        setField(term343058, term343058.getClass(), "prototypeSlot", term343059);
        setField(term343058, term343058.getClass(), "kind", null);
        setField(term343058, term343058.getClass(), "propAccess", null);
        setField(term343058, term343058.getClass(), "typeOfThis", null);
        setField(term343058, term343058.getClass(), "source", null);
        setField(term343058, term343058.getClass(), "implementedInterfaces", null);
        setField(term343058, term343058.getClass(), "extendedInterfaces", null);
        setField(term343058, term343058.getClass(), "subTypes", null);
        setField(term343058, term343058.getClass(), "templateTypeNames", null);
        setField(term343058, term343058.getClass(), "className", null);
        setField(term343058, term343058.getClass(), "properties", null);
        setBooleanField(term343058, term343058.getClass(), "nativeType", false);
        setField(term343058, term343058.getClass(), "implicitPrototypeFallback", null);
        setField(term343058, term343058.getClass(), "ownerFunction", null);
        setBooleanField(term343058, term343058.getClass(), "prettyPrint", false);
        setBooleanField(term343058, term343058.getClass(), "visited", false);
        setField(term343058, term343058.getClass(), "docInfo", null);
        setBooleanField(term343058, term343058.getClass(), "unknown", false);
        setBooleanField(term343058, term343058.getClass(), "resolved", false);
        setField(term343058, term343058.getClass(), "resolveResult", null);
        setBooleanField(term343058, term343058.getClass(), "inTemplatedCheckVisit", false);
        setField(term343058, term343058.getClass(), "registry", null);
        term343039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term343039, term343039.getClass(), "name", null);
        setField(term343039, term343039.getClass(), "type", null);
        setBooleanField(term343039, term343039.getClass(), "inferred", false);
        setField(term343039, term343039.getClass(), "propertyNode", null);
        setField(term343039, term343039.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "prototype";
        Object retValue = callMethod(klass, "getSlot", argTypes, term342872, args);
        assertTrue(recursiveEquals(term342872, term343058));
        assertTrue(recursiveEquals(retValue, term343039));
    }

};


