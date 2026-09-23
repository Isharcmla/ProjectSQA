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

public class FunctionType_setPrototypeBasedOn_1740539051188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98225;
     Object term98325;
     Object term219246;
     Object term219251;

    public FunctionType_setPrototypeBasedOn_1740539051188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term98325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term219246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term219247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term219250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term219246, term219246.getClass(), "call", null);
        setField(term219247, term219247.getClass(), "name", "prototype");
        setField(term219250, term219250.getClass(), "call", null);
        setField(term219250, term219250.getClass(), "prototypeSlot", null);
        setField(term219250, term219250.getClass(), "kind", null);
        setField(term219250, term219250.getClass(), "propAccess", null);
        setField(term219250, term219250.getClass(), "typeOfThis", null);
        setField(term219250, term219250.getClass(), "source", null);
        setField(term219250, term219250.getClass(), "implementedInterfaces", null);
        setField(term219250, term219250.getClass(), "extendedInterfaces", null);
        setField(term219250, term219250.getClass(), "subTypes", null);
        setField(term219250, term219250.getClass(), "templateTypeNames", null);
        setField(term219250, term219250.getClass(), "className", null);
        setField(term219250, term219250.getClass(), "properties", null);
        setBooleanField(term219250, term219250.getClass(), "nativeType", false);
        setField(term219250, term219250.getClass(), "implicitPrototypeFallback", null);
        setField(term219250, term219250.getClass(), "ownerFunction", term219246);
        setBooleanField(term219250, term219250.getClass(), "prettyPrint", false);
        setBooleanField(term219250, term219250.getClass(), "visited", false);
        setField(term219250, term219250.getClass(), "docInfo", null);
        setBooleanField(term219250, term219250.getClass(), "unknown", false);
        setBooleanField(term219250, term219250.getClass(), "resolved", false);
        setField(term219250, term219250.getClass(), "resolveResult", null);
        setBooleanField(term219250, term219250.getClass(), "inTemplatedCheckVisit", false);
        setField(term219250, term219250.getClass(), "registry", null);
        setField(term219247, term219247.getClass(), "type", term219250);
        setBooleanField(term219247, term219247.getClass(), "inferred", true);
        setField(term219247, term219247.getClass(), "propertyNode", null);
        setField(term219247, term219247.getClass(), "docInfo", null);
        setField(term219246, term219246.getClass(), "prototypeSlot", term219247);
        setField(term219246, term219246.getClass(), "kind", null);
        setField(term219246, term219246.getClass(), "propAccess", null);
        setField(term219246, term219246.getClass(), "typeOfThis", null);
        setField(term219246, term219246.getClass(), "source", null);
        setField(term219246, term219246.getClass(), "implementedInterfaces", null);
        setField(term219246, term219246.getClass(), "extendedInterfaces", null);
        setField(term219246, term219246.getClass(), "subTypes", null);
        setField(term219246, term219246.getClass(), "templateTypeNames", null);
        setField(term219246, term219246.getClass(), "className", null);
        setField(term219246, term219246.getClass(), "properties", null);
        setBooleanField(term219246, term219246.getClass(), "nativeType", false);
        setField(term219246, term219246.getClass(), "implicitPrototypeFallback", null);
        setField(term219246, term219246.getClass(), "ownerFunction", null);
        setBooleanField(term219246, term219246.getClass(), "prettyPrint", false);
        setBooleanField(term219246, term219246.getClass(), "visited", false);
        setField(term219246, term219246.getClass(), "docInfo", null);
        setBooleanField(term219246, term219246.getClass(), "unknown", false);
        setBooleanField(term219246, term219246.getClass(), "resolved", false);
        setField(term219246, term219246.getClass(), "resolveResult", null);
        setBooleanField(term219246, term219246.getClass(), "inTemplatedCheckVisit", false);
        setField(term219246, term219246.getClass(), "registry", null);
        term219251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term219252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term219253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term219251, term219251.getClass(), "call", null);
        setField(term219251, term219251.getClass(), "prototypeSlot", null);
        setField(term219251, term219251.getClass(), "kind", null);
        setField(term219251, term219251.getClass(), "propAccess", null);
        setField(term219251, term219251.getClass(), "typeOfThis", null);
        setField(term219251, term219251.getClass(), "source", null);
        setField(term219251, term219251.getClass(), "implementedInterfaces", null);
        setField(term219251, term219251.getClass(), "extendedInterfaces", null);
        setField(term219251, term219251.getClass(), "subTypes", null);
        setField(term219251, term219251.getClass(), "templateTypeNames", null);
        setField(term219251, term219251.getClass(), "className", null);
        setField(term219251, term219251.getClass(), "properties", null);
        setBooleanField(term219251, term219251.getClass(), "nativeType", false);
        setField(term219251, term219251.getClass(), "implicitPrototypeFallback", null);
        setField(term219252, term219252.getClass(), "call", null);
        setField(term219253, term219253.getClass(), "name", "prototype");
        setField(term219253, term219253.getClass(), "type", term219251);
        setBooleanField(term219253, term219253.getClass(), "inferred", true);
        setField(term219253, term219253.getClass(), "propertyNode", null);
        setField(term219253, term219253.getClass(), "docInfo", null);
        setField(term219252, term219252.getClass(), "prototypeSlot", term219253);
        setField(term219252, term219252.getClass(), "kind", null);
        setField(term219252, term219252.getClass(), "propAccess", null);
        setField(term219252, term219252.getClass(), "typeOfThis", null);
        setField(term219252, term219252.getClass(), "source", null);
        setField(term219252, term219252.getClass(), "implementedInterfaces", null);
        setField(term219252, term219252.getClass(), "extendedInterfaces", null);
        setField(term219252, term219252.getClass(), "subTypes", null);
        setField(term219252, term219252.getClass(), "templateTypeNames", null);
        setField(term219252, term219252.getClass(), "className", null);
        setField(term219252, term219252.getClass(), "properties", null);
        setBooleanField(term219252, term219252.getClass(), "nativeType", false);
        setField(term219252, term219252.getClass(), "implicitPrototypeFallback", null);
        setField(term219252, term219252.getClass(), "ownerFunction", null);
        setBooleanField(term219252, term219252.getClass(), "prettyPrint", false);
        setBooleanField(term219252, term219252.getClass(), "visited", false);
        setField(term219252, term219252.getClass(), "docInfo", null);
        setBooleanField(term219252, term219252.getClass(), "unknown", false);
        setBooleanField(term219252, term219252.getClass(), "resolved", false);
        setField(term219252, term219252.getClass(), "resolveResult", null);
        setBooleanField(term219252, term219252.getClass(), "inTemplatedCheckVisit", false);
        setField(term219252, term219252.getClass(), "registry", null);
        setField(term219251, term219251.getClass(), "ownerFunction", term219252);
        setBooleanField(term219251, term219251.getClass(), "prettyPrint", false);
        setBooleanField(term219251, term219251.getClass(), "visited", false);
        setField(term219251, term219251.getClass(), "docInfo", null);
        setBooleanField(term219251, term219251.getClass(), "unknown", false);
        setBooleanField(term219251, term219251.getClass(), "resolved", false);
        setField(term219251, term219251.getClass(), "resolveResult", null);
        setBooleanField(term219251, term219251.getClass(), "inTemplatedCheckVisit", false);
        setField(term219251, term219251.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term98325;
        args[1] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term98225, args);
        assertTrue(recursiveEquals(term98225, term219246));
        assertTrue(recursiveEquals(term98325, term219251));
    }

};


