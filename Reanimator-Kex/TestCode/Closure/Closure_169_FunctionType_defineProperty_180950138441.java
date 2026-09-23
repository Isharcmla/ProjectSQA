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

public class FunctionType_defineProperty_180950138441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403268;
     Object term403420;
     Object term403604;
     Object term403609;

    public FunctionType_defineProperty_180950138441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term403420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        term403604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term403605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term403608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term403604, term403604.getClass(), "call", null);
        setField(term403605, term403605.getClass(), "name", "prototype");
        setField(term403608, term403608.getClass(), "className", null);
        setField(term403608, term403608.getClass(), "properties", null);
        setBooleanField(term403608, term403608.getClass(), "nativeType", false);
        setField(term403608, term403608.getClass(), "implicitPrototypeFallback", null);
        setField(term403608, term403608.getClass(), "ownerFunction", term403604);
        setBooleanField(term403608, term403608.getClass(), "prettyPrint", false);
        setBooleanField(term403608, term403608.getClass(), "visited", false);
        setField(term403608, term403608.getClass(), "docInfo", null);
        setBooleanField(term403608, term403608.getClass(), "unknown", false);
        setBooleanField(term403608, term403608.getClass(), "resolved", false);
        setField(term403608, term403608.getClass(), "resolveResult", null);
        setBooleanField(term403608, term403608.getClass(), "inTemplatedCheckVisit", false);
        setField(term403608, term403608.getClass(), "registry", null);
        setField(term403605, term403605.getClass(), "type", term403608);
        setBooleanField(term403605, term403605.getClass(), "inferred", true);
        setField(term403605, term403605.getClass(), "propertyNode", null);
        setField(term403605, term403605.getClass(), "docInfo", null);
        setField(term403604, term403604.getClass(), "prototypeSlot", term403605);
        setField(term403604, term403604.getClass(), "kind", null);
        setField(term403604, term403604.getClass(), "propAccess", null);
        setField(term403604, term403604.getClass(), "typeOfThis", null);
        setField(term403604, term403604.getClass(), "source", null);
        setField(term403604, term403604.getClass(), "implementedInterfaces", null);
        setField(term403604, term403604.getClass(), "extendedInterfaces", null);
        setField(term403604, term403604.getClass(), "subTypes", null);
        setField(term403604, term403604.getClass(), "templateTypeNames", null);
        setField(term403604, term403604.getClass(), "className", null);
        setField(term403604, term403604.getClass(), "properties", null);
        setBooleanField(term403604, term403604.getClass(), "nativeType", false);
        setField(term403604, term403604.getClass(), "implicitPrototypeFallback", null);
        setField(term403604, term403604.getClass(), "ownerFunction", null);
        setBooleanField(term403604, term403604.getClass(), "prettyPrint", false);
        setBooleanField(term403604, term403604.getClass(), "visited", false);
        setField(term403604, term403604.getClass(), "docInfo", null);
        setBooleanField(term403604, term403604.getClass(), "unknown", false);
        setBooleanField(term403604, term403604.getClass(), "resolved", false);
        setField(term403604, term403604.getClass(), "resolveResult", null);
        setBooleanField(term403604, term403604.getClass(), "inTemplatedCheckVisit", false);
        setField(term403604, term403604.getClass(), "registry", null);
        term403609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term403610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term403611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term403609, term403609.getClass(), "className", null);
        setField(term403609, term403609.getClass(), "properties", null);
        setBooleanField(term403609, term403609.getClass(), "nativeType", false);
        setField(term403609, term403609.getClass(), "implicitPrototypeFallback", null);
        setField(term403610, term403610.getClass(), "call", null);
        setField(term403611, term403611.getClass(), "name", "prototype");
        setField(term403611, term403611.getClass(), "type", term403609);
        setBooleanField(term403611, term403611.getClass(), "inferred", true);
        setField(term403611, term403611.getClass(), "propertyNode", null);
        setField(term403611, term403611.getClass(), "docInfo", null);
        setField(term403610, term403610.getClass(), "prototypeSlot", term403611);
        setField(term403610, term403610.getClass(), "kind", null);
        setField(term403610, term403610.getClass(), "propAccess", null);
        setField(term403610, term403610.getClass(), "typeOfThis", null);
        setField(term403610, term403610.getClass(), "source", null);
        setField(term403610, term403610.getClass(), "implementedInterfaces", null);
        setField(term403610, term403610.getClass(), "extendedInterfaces", null);
        setField(term403610, term403610.getClass(), "subTypes", null);
        setField(term403610, term403610.getClass(), "templateTypeNames", null);
        setField(term403610, term403610.getClass(), "className", null);
        setField(term403610, term403610.getClass(), "properties", null);
        setBooleanField(term403610, term403610.getClass(), "nativeType", false);
        setField(term403610, term403610.getClass(), "implicitPrototypeFallback", null);
        setField(term403610, term403610.getClass(), "ownerFunction", null);
        setBooleanField(term403610, term403610.getClass(), "prettyPrint", false);
        setBooleanField(term403610, term403610.getClass(), "visited", false);
        setField(term403610, term403610.getClass(), "docInfo", null);
        setBooleanField(term403610, term403610.getClass(), "unknown", false);
        setBooleanField(term403610, term403610.getClass(), "resolved", false);
        setField(term403610, term403610.getClass(), "resolveResult", null);
        setBooleanField(term403610, term403610.getClass(), "inTemplatedCheckVisit", false);
        setField(term403610, term403610.getClass(), "registry", null);
        setField(term403609, term403609.getClass(), "ownerFunction", term403610);
        setBooleanField(term403609, term403609.getClass(), "prettyPrint", false);
        setBooleanField(term403609, term403609.getClass(), "visited", false);
        setField(term403609, term403609.getClass(), "docInfo", null);
        setBooleanField(term403609, term403609.getClass(), "unknown", false);
        setBooleanField(term403609, term403609.getClass(), "resolved", false);
        setField(term403609, term403609.getClass(), "resolveResult", null);
        setBooleanField(term403609, term403609.getClass(), "inTemplatedCheckVisit", false);
        setField(term403609, term403609.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = "prototype";
        args[1] = term403420;
        args[2] = false;
        args[3] = null;
        Object retValue = callMethod(klass, "defineProperty", argTypes, term403268, args);
        assertTrue(recursiveEquals(term403268, term403604));
        assertTrue(recursiveEquals(term403420, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


