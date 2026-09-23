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
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_hasProperty_169807696746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334;

    public PrototypeObjectType_hasProperty_169807696746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term347 = new HashMap();
        term334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term367 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term334, term334.getClass(), "className", "AWRooQKkdW");
        setField(term334, term334.getClass(), "properties", term347);
        setBooleanField(term334, term334.getClass(), "nativeType", true);
        setField(term334, term334.getClass(), "implicitPrototypeFallback", null);
        setField(term359, term359.getClass(), "call", null);
        setField(term359, term359.getClass(), "prototypeSlot", null);
        setField(term359, term359.getClass(), "kind", null);
        setField(term359, term359.getClass(), "typeOfThis", null);
        setField(term359, term359.getClass(), "source", null);
        setField(term359, term359.getClass(), "implementedInterfaces", null);
        setField(term359, term359.getClass(), "extendedInterfaces", null);
        setField(term359, term359.getClass(), "subTypes", null);
        setField(term359, term359.getClass(), "templateTypeName", null);
        setField(term359, term359.getClass(), "className", null);
        setField(term359, term359.getClass(), "properties", null);
        setBooleanField(term359, term359.getClass(), "nativeType", false);
        setField(term359, term359.getClass(), "implicitPrototypeFallback", null);
        setField(term359, term359.getClass(), "ownerFunction", null);
        setBooleanField(term359, term359.getClass(), "prettyPrint", false);
        setBooleanField(term359, term359.getClass(), "visited", false);
        setField(term359, term359.getClass(), "docInfo", null);
        setBooleanField(term359, term359.getClass(), "unknown", false);
        setBooleanField(term359, term359.getClass(), "resolved", false);
        setField(term359, term359.getClass(), "resolveResult", null);
        setField(term359, term359.getClass(), "registry", null);
        setField(term334, term334.getClass(), "ownerFunction", term359);
        setBooleanField(term334, term334.getClass(), "prettyPrint", true);
        setBooleanField(term334, term334.getClass(), "visited", false);
        setField(term367, term367.getClass(), "info", null);
        setField(term367, term367.getClass(), "documentation", null);
        setField(term367, term367.getClass(), "associatedNode", null);
        setField(term367, term367.getClass(), "visibility", null);
        setIntField(term367, term367.getClass(), "bitset", 0);
        setField(term367, term367.getClass(), "type", null);
        setField(term367, term367.getClass(), "thisType", null);
        setBooleanField(term367, term367.getClass(), "includeDocumentation", false);
        setField(term334, term334.getClass(), "docInfo", term367);
        setBooleanField(term334, term334.getClass(), "unknown", true);
        setBooleanField(term334, term334.getClass(), "resolved", true);
        setField(term334, term334.getClass(), "resolveResult", null);
        setField(term334, term334.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qxSDVejjiY";
        try {
            callMethod(klass, "hasProperty", argTypes, term334, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


