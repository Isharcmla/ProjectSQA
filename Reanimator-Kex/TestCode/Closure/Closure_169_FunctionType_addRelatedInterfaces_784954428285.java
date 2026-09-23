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

public class FunctionType_addRelatedInterfaces_784954428285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271628;
     Object term271738;
     Object term273276;
     Object term273277;

    public FunctionType_addRelatedInterfaces_784954428285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term271738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term273276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term273276, term273276.getClass(), "call", null);
        setField(term273276, term273276.getClass(), "prototypeSlot", null);
        setField(term273276, term273276.getClass(), "kind", null);
        setField(term273276, term273276.getClass(), "propAccess", null);
        setField(term273276, term273276.getClass(), "typeOfThis", null);
        setField(term273276, term273276.getClass(), "source", null);
        setField(term273276, term273276.getClass(), "implementedInterfaces", null);
        setField(term273276, term273276.getClass(), "extendedInterfaces", null);
        setField(term273276, term273276.getClass(), "subTypes", null);
        setField(term273276, term273276.getClass(), "templateTypeNames", null);
        setField(term273276, term273276.getClass(), "className", null);
        setField(term273276, term273276.getClass(), "properties", null);
        setBooleanField(term273276, term273276.getClass(), "nativeType", false);
        setField(term273276, term273276.getClass(), "implicitPrototypeFallback", null);
        setField(term273276, term273276.getClass(), "ownerFunction", null);
        setBooleanField(term273276, term273276.getClass(), "prettyPrint", false);
        setBooleanField(term273276, term273276.getClass(), "visited", false);
        setField(term273276, term273276.getClass(), "docInfo", null);
        setBooleanField(term273276, term273276.getClass(), "unknown", false);
        setBooleanField(term273276, term273276.getClass(), "resolved", false);
        setField(term273276, term273276.getClass(), "resolveResult", null);
        setBooleanField(term273276, term273276.getClass(), "inTemplatedCheckVisit", false);
        setField(term273276, term273276.getClass(), "registry", null);
        term273277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term273277, term273277.getClass(), "call", null);
        setField(term273277, term273277.getClass(), "prototypeSlot", null);
        setField(term273277, term273277.getClass(), "kind", null);
        setField(term273277, term273277.getClass(), "propAccess", null);
        setField(term273277, term273277.getClass(), "typeOfThis", null);
        setField(term273277, term273277.getClass(), "source", null);
        setField(term273277, term273277.getClass(), "implementedInterfaces", null);
        setField(term273277, term273277.getClass(), "extendedInterfaces", null);
        setField(term273277, term273277.getClass(), "subTypes", null);
        setField(term273277, term273277.getClass(), "templateTypeNames", null);
        setField(term273277, term273277.getClass(), "className", null);
        setField(term273277, term273277.getClass(), "properties", null);
        setBooleanField(term273277, term273277.getClass(), "nativeType", false);
        setField(term273277, term273277.getClass(), "implicitPrototypeFallback", null);
        setField(term273277, term273277.getClass(), "ownerFunction", null);
        setBooleanField(term273277, term273277.getClass(), "prettyPrint", false);
        setBooleanField(term273277, term273277.getClass(), "visited", false);
        setField(term273277, term273277.getClass(), "docInfo", null);
        setBooleanField(term273277, term273277.getClass(), "unknown", false);
        setBooleanField(term273277, term273277.getClass(), "resolved", false);
        setField(term273277, term273277.getClass(), "resolveResult", null);
        setBooleanField(term273277, term273277.getClass(), "inTemplatedCheckVisit", false);
        setField(term273277, term273277.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term271738;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term271628, args);
        assertTrue(recursiveEquals(term271628, term273276));
        assertTrue(recursiveEquals(term271738, term273277));
    }

};


