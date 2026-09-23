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

public class FunctionType_setPrototypeNoCheck_1402626902292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278203;
     Object term278467;
     Object term278778;
     Object term278783;

    public FunctionType_setPrototypeNoCheck_1402626902292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term278317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        term278467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term278317, term278317.getClass(), "type", term278467);
        setField(term278203, term278203.getClass(), "prototypeSlot", term278317);
        setField(term278203, term278203.getClass(), "source", null);
        term278778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term278779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term278782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term278778, term278778.getClass(), "call", null);
        setField(term278779, term278779.getClass(), "name", "prototype");
        setField(term278782, term278782.getClass(), "call", null);
        setField(term278782, term278782.getClass(), "prototypeSlot", null);
        setField(term278782, term278782.getClass(), "kind", null);
        setField(term278782, term278782.getClass(), "propAccess", null);
        setField(term278782, term278782.getClass(), "typeOfThis", null);
        setField(term278782, term278782.getClass(), "source", null);
        setField(term278782, term278782.getClass(), "implementedInterfaces", null);
        setField(term278782, term278782.getClass(), "extendedInterfaces", null);
        setField(term278782, term278782.getClass(), "subTypes", null);
        setField(term278782, term278782.getClass(), "templateTypeNames", null);
        setField(term278782, term278782.getClass(), "className", null);
        setField(term278782, term278782.getClass(), "properties", null);
        setBooleanField(term278782, term278782.getClass(), "nativeType", false);
        setField(term278782, term278782.getClass(), "implicitPrototypeFallback", null);
        setField(term278782, term278782.getClass(), "ownerFunction", null);
        setBooleanField(term278782, term278782.getClass(), "prettyPrint", false);
        setBooleanField(term278782, term278782.getClass(), "visited", false);
        setField(term278782, term278782.getClass(), "docInfo", null);
        setBooleanField(term278782, term278782.getClass(), "unknown", true);
        setBooleanField(term278782, term278782.getClass(), "resolved", false);
        setField(term278782, term278782.getClass(), "resolveResult", null);
        setBooleanField(term278782, term278782.getClass(), "inTemplatedCheckVisit", false);
        setField(term278782, term278782.getClass(), "registry", null);
        setField(term278779, term278779.getClass(), "type", term278782);
        setBooleanField(term278779, term278779.getClass(), "inferred", true);
        setField(term278779, term278779.getClass(), "propertyNode", null);
        setField(term278779, term278779.getClass(), "docInfo", null);
        setField(term278778, term278778.getClass(), "prototypeSlot", term278779);
        setField(term278778, term278778.getClass(), "kind", null);
        setField(term278778, term278778.getClass(), "propAccess", null);
        setField(term278778, term278778.getClass(), "typeOfThis", null);
        setField(term278778, term278778.getClass(), "source", null);
        setField(term278778, term278778.getClass(), "implementedInterfaces", null);
        setField(term278778, term278778.getClass(), "extendedInterfaces", null);
        setField(term278778, term278778.getClass(), "subTypes", null);
        setField(term278778, term278778.getClass(), "templateTypeNames", null);
        setField(term278778, term278778.getClass(), "className", null);
        setField(term278778, term278778.getClass(), "properties", null);
        setBooleanField(term278778, term278778.getClass(), "nativeType", false);
        setField(term278778, term278778.getClass(), "implicitPrototypeFallback", null);
        setField(term278778, term278778.getClass(), "ownerFunction", null);
        setBooleanField(term278778, term278778.getClass(), "prettyPrint", false);
        setBooleanField(term278778, term278778.getClass(), "visited", false);
        setField(term278778, term278778.getClass(), "docInfo", null);
        setBooleanField(term278778, term278778.getClass(), "unknown", true);
        setBooleanField(term278778, term278778.getClass(), "resolved", false);
        setField(term278778, term278778.getClass(), "resolveResult", null);
        setBooleanField(term278778, term278778.getClass(), "inTemplatedCheckVisit", false);
        setField(term278778, term278778.getClass(), "registry", null);
        term278783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term278783, term278783.getClass(), "call", null);
        setField(term278783, term278783.getClass(), "prototypeSlot", null);
        setField(term278783, term278783.getClass(), "kind", null);
        setField(term278783, term278783.getClass(), "propAccess", null);
        setField(term278783, term278783.getClass(), "typeOfThis", null);
        setField(term278783, term278783.getClass(), "source", null);
        setField(term278783, term278783.getClass(), "implementedInterfaces", null);
        setField(term278783, term278783.getClass(), "extendedInterfaces", null);
        setField(term278783, term278783.getClass(), "subTypes", null);
        setField(term278783, term278783.getClass(), "templateTypeNames", null);
        setField(term278783, term278783.getClass(), "className", null);
        setField(term278783, term278783.getClass(), "properties", null);
        setBooleanField(term278783, term278783.getClass(), "nativeType", false);
        setField(term278783, term278783.getClass(), "implicitPrototypeFallback", null);
        setField(term278783, term278783.getClass(), "ownerFunction", null);
        setBooleanField(term278783, term278783.getClass(), "prettyPrint", false);
        setBooleanField(term278783, term278783.getClass(), "visited", false);
        setField(term278783, term278783.getClass(), "docInfo", null);
        setBooleanField(term278783, term278783.getClass(), "unknown", true);
        setBooleanField(term278783, term278783.getClass(), "resolved", false);
        setField(term278783, term278783.getClass(), "resolveResult", null);
        setBooleanField(term278783, term278783.getClass(), "inTemplatedCheckVisit", false);
        setField(term278783, term278783.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term278467;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term278203, args);
        assertTrue(recursiveEquals(term278203, term278778));
        assertTrue(recursiveEquals(term278467, term278783));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


