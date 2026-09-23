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

public class FunctionType_setPrototypeBasedOn_1740539051281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268199;
     Object term268299;
     Object term268554;
     Object term268563;

    public FunctionType_setPrototypeBasedOn_1740539051281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term268199, term268199.getClass(), "nativeType", true);
        term268299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term268299, term268299.getClass(), "className", null);
        setField(term268299, term268299.getClass(), "ownerFunction", null);
        term268554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term268555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term268558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term268561 = newInstance(Class.forName("java.util.TreeMap"));
        Object term268562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term268554, term268554.getClass(), "call", null);
        setField(term268555, term268555.getClass(), "name", "prototype");
        setField(term268558, term268558.getClass(), "className", "null.prototype");
        setField(term268561, term268561.getClass(), "comparator", null);
        setField(term268561, term268561.getClass(), "root", null);
        setIntField(term268561, term268561.getClass(), "size", 0);
        setIntField(term268561, term268561.getClass(), "modCount", 0);
        setField(term268561, term268561.getClass(), "entrySet", null);
        setField(term268561, term268561.getClass(), "navigableKeySet", null);
        setField(term268561, term268561.getClass(), "descendingMap", null);
        setField(term268561, term268561.getClass(), "keySet", null);
        setField(term268561, term268561.getClass(), "values", null);
        setField(term268558, term268558.getClass(), "properties", term268561);
        setBooleanField(term268558, term268558.getClass(), "nativeType", false);
        setField(term268562, term268562.getClass(), "call", null);
        setField(term268562, term268562.getClass(), "prototypeSlot", null);
        setField(term268562, term268562.getClass(), "kind", null);
        setField(term268562, term268562.getClass(), "propAccess", null);
        setField(term268562, term268562.getClass(), "typeOfThis", null);
        setField(term268562, term268562.getClass(), "source", null);
        setField(term268562, term268562.getClass(), "implementedInterfaces", null);
        setField(term268562, term268562.getClass(), "extendedInterfaces", null);
        setField(term268562, term268562.getClass(), "subTypes", null);
        setField(term268562, term268562.getClass(), "templateTypeNames", null);
        setField(term268562, term268562.getClass(), "className", null);
        setField(term268562, term268562.getClass(), "properties", null);
        setBooleanField(term268562, term268562.getClass(), "nativeType", false);
        setField(term268562, term268562.getClass(), "implicitPrototypeFallback", null);
        setField(term268562, term268562.getClass(), "ownerFunction", null);
        setBooleanField(term268562, term268562.getClass(), "prettyPrint", false);
        setBooleanField(term268562, term268562.getClass(), "visited", false);
        setField(term268562, term268562.getClass(), "docInfo", null);
        setBooleanField(term268562, term268562.getClass(), "unknown", false);
        setBooleanField(term268562, term268562.getClass(), "resolved", false);
        setField(term268562, term268562.getClass(), "resolveResult", null);
        setBooleanField(term268562, term268562.getClass(), "inTemplatedCheckVisit", false);
        setField(term268562, term268562.getClass(), "registry", null);
        setField(term268558, term268558.getClass(), "implicitPrototypeFallback", term268562);
        setField(term268558, term268558.getClass(), "ownerFunction", term268554);
        setBooleanField(term268558, term268558.getClass(), "prettyPrint", false);
        setBooleanField(term268558, term268558.getClass(), "visited", false);
        setField(term268558, term268558.getClass(), "docInfo", null);
        setBooleanField(term268558, term268558.getClass(), "unknown", true);
        setBooleanField(term268558, term268558.getClass(), "resolved", false);
        setField(term268558, term268558.getClass(), "resolveResult", null);
        setBooleanField(term268558, term268558.getClass(), "inTemplatedCheckVisit", false);
        setField(term268558, term268558.getClass(), "registry", null);
        setField(term268555, term268555.getClass(), "type", term268558);
        setBooleanField(term268555, term268555.getClass(), "inferred", true);
        setField(term268555, term268555.getClass(), "propertyNode", null);
        setField(term268555, term268555.getClass(), "docInfo", null);
        setField(term268554, term268554.getClass(), "prototypeSlot", term268555);
        setField(term268554, term268554.getClass(), "kind", null);
        setField(term268554, term268554.getClass(), "propAccess", null);
        setField(term268554, term268554.getClass(), "typeOfThis", null);
        setField(term268554, term268554.getClass(), "source", null);
        setField(term268554, term268554.getClass(), "implementedInterfaces", null);
        setField(term268554, term268554.getClass(), "extendedInterfaces", null);
        setField(term268554, term268554.getClass(), "subTypes", null);
        setField(term268554, term268554.getClass(), "templateTypeNames", null);
        setField(term268554, term268554.getClass(), "className", null);
        setField(term268554, term268554.getClass(), "properties", null);
        setBooleanField(term268554, term268554.getClass(), "nativeType", true);
        setField(term268554, term268554.getClass(), "implicitPrototypeFallback", null);
        setField(term268554, term268554.getClass(), "ownerFunction", null);
        setBooleanField(term268554, term268554.getClass(), "prettyPrint", false);
        setBooleanField(term268554, term268554.getClass(), "visited", false);
        setField(term268554, term268554.getClass(), "docInfo", null);
        setBooleanField(term268554, term268554.getClass(), "unknown", false);
        setBooleanField(term268554, term268554.getClass(), "resolved", false);
        setField(term268554, term268554.getClass(), "resolveResult", null);
        setBooleanField(term268554, term268554.getClass(), "inTemplatedCheckVisit", false);
        setField(term268554, term268554.getClass(), "registry", null);
        term268563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term268563, term268563.getClass(), "call", null);
        setField(term268563, term268563.getClass(), "prototypeSlot", null);
        setField(term268563, term268563.getClass(), "kind", null);
        setField(term268563, term268563.getClass(), "propAccess", null);
        setField(term268563, term268563.getClass(), "typeOfThis", null);
        setField(term268563, term268563.getClass(), "source", null);
        setField(term268563, term268563.getClass(), "implementedInterfaces", null);
        setField(term268563, term268563.getClass(), "extendedInterfaces", null);
        setField(term268563, term268563.getClass(), "subTypes", null);
        setField(term268563, term268563.getClass(), "templateTypeNames", null);
        setField(term268563, term268563.getClass(), "className", null);
        setField(term268563, term268563.getClass(), "properties", null);
        setBooleanField(term268563, term268563.getClass(), "nativeType", false);
        setField(term268563, term268563.getClass(), "implicitPrototypeFallback", null);
        setField(term268563, term268563.getClass(), "ownerFunction", null);
        setBooleanField(term268563, term268563.getClass(), "prettyPrint", false);
        setBooleanField(term268563, term268563.getClass(), "visited", false);
        setField(term268563, term268563.getClass(), "docInfo", null);
        setBooleanField(term268563, term268563.getClass(), "unknown", false);
        setBooleanField(term268563, term268563.getClass(), "resolved", false);
        setField(term268563, term268563.getClass(), "resolveResult", null);
        setBooleanField(term268563, term268563.getClass(), "inTemplatedCheckVisit", false);
        setField(term268563, term268563.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term268299;
        args[1] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term268199, args);
        assertTrue(recursiveEquals(term268199, term268554));
        assertTrue(recursiveEquals(term268299, term268563));
    }

};


