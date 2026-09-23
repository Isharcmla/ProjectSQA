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

public class FunctionType_setPrototypeBasedOn_1012666130247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246332;
     Object term246432;
     Object term246549;
     Object term246554;

    public FunctionType_setPrototypeBasedOn_1012666130247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        term246432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        term246549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term246550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term246553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term246549, term246549.getClass(), "call", null);
        setField(term246550, term246550.getClass(), "name", "prototype");
        setField(term246553, term246553.getClass(), "call", null);
        setField(term246553, term246553.getClass(), "prototypeSlot", null);
        setField(term246553, term246553.getClass(), "kind", null);
        setField(term246553, term246553.getClass(), "propAccess", null);
        setField(term246553, term246553.getClass(), "typeOfThis", null);
        setField(term246553, term246553.getClass(), "source", null);
        setField(term246553, term246553.getClass(), "implementedInterfaces", null);
        setField(term246553, term246553.getClass(), "extendedInterfaces", null);
        setField(term246553, term246553.getClass(), "subTypes", null);
        setField(term246553, term246553.getClass(), "templateTypeNames", null);
        setField(term246553, term246553.getClass(), "className", null);
        setField(term246553, term246553.getClass(), "properties", null);
        setBooleanField(term246553, term246553.getClass(), "nativeType", false);
        setField(term246553, term246553.getClass(), "implicitPrototypeFallback", null);
        setField(term246553, term246553.getClass(), "ownerFunction", term246549);
        setBooleanField(term246553, term246553.getClass(), "prettyPrint", false);
        setBooleanField(term246553, term246553.getClass(), "visited", false);
        setField(term246553, term246553.getClass(), "docInfo", null);
        setBooleanField(term246553, term246553.getClass(), "unknown", false);
        setBooleanField(term246553, term246553.getClass(), "resolved", false);
        setField(term246553, term246553.getClass(), "resolveResult", null);
        setBooleanField(term246553, term246553.getClass(), "inTemplatedCheckVisit", false);
        setField(term246553, term246553.getClass(), "registry", null);
        setField(term246550, term246550.getClass(), "type", term246553);
        setBooleanField(term246550, term246550.getClass(), "inferred", true);
        setField(term246550, term246550.getClass(), "propertyNode", null);
        setField(term246550, term246550.getClass(), "docInfo", null);
        setField(term246549, term246549.getClass(), "prototypeSlot", term246550);
        setField(term246549, term246549.getClass(), "kind", null);
        setField(term246549, term246549.getClass(), "propAccess", null);
        setField(term246549, term246549.getClass(), "typeOfThis", null);
        setField(term246549, term246549.getClass(), "source", null);
        setField(term246549, term246549.getClass(), "implementedInterfaces", null);
        setField(term246549, term246549.getClass(), "extendedInterfaces", null);
        setField(term246549, term246549.getClass(), "subTypes", null);
        setField(term246549, term246549.getClass(), "templateTypeNames", null);
        setField(term246549, term246549.getClass(), "className", null);
        setField(term246549, term246549.getClass(), "properties", null);
        setBooleanField(term246549, term246549.getClass(), "nativeType", false);
        setField(term246549, term246549.getClass(), "implicitPrototypeFallback", null);
        setField(term246549, term246549.getClass(), "ownerFunction", null);
        setBooleanField(term246549, term246549.getClass(), "prettyPrint", false);
        setBooleanField(term246549, term246549.getClass(), "visited", false);
        setField(term246549, term246549.getClass(), "docInfo", null);
        setBooleanField(term246549, term246549.getClass(), "unknown", false);
        setBooleanField(term246549, term246549.getClass(), "resolved", false);
        setField(term246549, term246549.getClass(), "resolveResult", null);
        setBooleanField(term246549, term246549.getClass(), "inTemplatedCheckVisit", false);
        setField(term246549, term246549.getClass(), "registry", null);
        term246554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term246555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term246556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term246554, term246554.getClass(), "call", null);
        setField(term246554, term246554.getClass(), "prototypeSlot", null);
        setField(term246554, term246554.getClass(), "kind", null);
        setField(term246554, term246554.getClass(), "propAccess", null);
        setField(term246554, term246554.getClass(), "typeOfThis", null);
        setField(term246554, term246554.getClass(), "source", null);
        setField(term246554, term246554.getClass(), "implementedInterfaces", null);
        setField(term246554, term246554.getClass(), "extendedInterfaces", null);
        setField(term246554, term246554.getClass(), "subTypes", null);
        setField(term246554, term246554.getClass(), "templateTypeNames", null);
        setField(term246554, term246554.getClass(), "className", null);
        setField(term246554, term246554.getClass(), "properties", null);
        setBooleanField(term246554, term246554.getClass(), "nativeType", false);
        setField(term246554, term246554.getClass(), "implicitPrototypeFallback", null);
        setField(term246555, term246555.getClass(), "call", null);
        setField(term246556, term246556.getClass(), "name", "prototype");
        setField(term246556, term246556.getClass(), "type", term246554);
        setBooleanField(term246556, term246556.getClass(), "inferred", true);
        setField(term246556, term246556.getClass(), "propertyNode", null);
        setField(term246556, term246556.getClass(), "docInfo", null);
        setField(term246555, term246555.getClass(), "prototypeSlot", term246556);
        setField(term246555, term246555.getClass(), "kind", null);
        setField(term246555, term246555.getClass(), "propAccess", null);
        setField(term246555, term246555.getClass(), "typeOfThis", null);
        setField(term246555, term246555.getClass(), "source", null);
        setField(term246555, term246555.getClass(), "implementedInterfaces", null);
        setField(term246555, term246555.getClass(), "extendedInterfaces", null);
        setField(term246555, term246555.getClass(), "subTypes", null);
        setField(term246555, term246555.getClass(), "templateTypeNames", null);
        setField(term246555, term246555.getClass(), "className", null);
        setField(term246555, term246555.getClass(), "properties", null);
        setBooleanField(term246555, term246555.getClass(), "nativeType", false);
        setField(term246555, term246555.getClass(), "implicitPrototypeFallback", null);
        setField(term246555, term246555.getClass(), "ownerFunction", null);
        setBooleanField(term246555, term246555.getClass(), "prettyPrint", false);
        setBooleanField(term246555, term246555.getClass(), "visited", false);
        setField(term246555, term246555.getClass(), "docInfo", null);
        setBooleanField(term246555, term246555.getClass(), "unknown", false);
        setBooleanField(term246555, term246555.getClass(), "resolved", false);
        setField(term246555, term246555.getClass(), "resolveResult", null);
        setBooleanField(term246555, term246555.getClass(), "inTemplatedCheckVisit", false);
        setField(term246555, term246555.getClass(), "registry", null);
        setField(term246554, term246554.getClass(), "ownerFunction", term246555);
        setBooleanField(term246554, term246554.getClass(), "prettyPrint", false);
        setBooleanField(term246554, term246554.getClass(), "visited", false);
        setField(term246554, term246554.getClass(), "docInfo", null);
        setBooleanField(term246554, term246554.getClass(), "unknown", false);
        setBooleanField(term246554, term246554.getClass(), "resolved", false);
        setField(term246554, term246554.getClass(), "resolveResult", null);
        setBooleanField(term246554, term246554.getClass(), "inTemplatedCheckVisit", false);
        setField(term246554, term246554.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term246432;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term246332, args);
        assertTrue(recursiveEquals(term246332, term246549));
        assertTrue(recursiveEquals(term246432, term246554));
    }

};


