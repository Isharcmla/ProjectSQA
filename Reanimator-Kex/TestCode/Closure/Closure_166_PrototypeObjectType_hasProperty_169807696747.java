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

public class PrototypeObjectType_hasProperty_169807696747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338;

    public PrototypeObjectType_hasProperty_169807696747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term351 = new HashMap();
        term338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term372 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term338, term338.getClass(), "className", "AWRooQKkdW");
        setField(term338, term338.getClass(), "properties", term351);
        setBooleanField(term338, term338.getClass(), "nativeType", true);
        setField(term338, term338.getClass(), "implicitPrototypeFallback", null);
        setField(term363, term363.getClass(), "call", null);
        setField(term363, term363.getClass(), "prototypeSlot", null);
        setField(term363, term363.getClass(), "kind", null);
        setField(term363, term363.getClass(), "typeOfThis", null);
        setField(term363, term363.getClass(), "source", null);
        setField(term363, term363.getClass(), "implementedInterfaces", null);
        setField(term363, term363.getClass(), "extendedInterfaces", null);
        setField(term363, term363.getClass(), "subTypes", null);
        setField(term363, term363.getClass(), "templateTypeNames", null);
        setField(term363, term363.getClass(), "className", null);
        setField(term363, term363.getClass(), "properties", null);
        setBooleanField(term363, term363.getClass(), "nativeType", false);
        setField(term363, term363.getClass(), "implicitPrototypeFallback", null);
        setField(term363, term363.getClass(), "ownerFunction", null);
        setBooleanField(term363, term363.getClass(), "prettyPrint", false);
        setBooleanField(term363, term363.getClass(), "visited", false);
        setField(term363, term363.getClass(), "docInfo", null);
        setBooleanField(term363, term363.getClass(), "unknown", false);
        setBooleanField(term363, term363.getClass(), "resolved", false);
        setField(term363, term363.getClass(), "resolveResult", null);
        setBooleanField(term363, term363.getClass(), "inTemplatedCheckVisit", false);
        setField(term363, term363.getClass(), "registry", null);
        setField(term338, term338.getClass(), "ownerFunction", term363);
        setBooleanField(term338, term338.getClass(), "prettyPrint", true);
        setBooleanField(term338, term338.getClass(), "visited", false);
        setField(term372, term372.getClass(), "info", null);
        setField(term372, term372.getClass(), "documentation", null);
        setField(term372, term372.getClass(), "associatedNode", null);
        setField(term372, term372.getClass(), "visibility", null);
        setIntField(term372, term372.getClass(), "bitset", 0);
        setField(term372, term372.getClass(), "type", null);
        setField(term372, term372.getClass(), "thisType", null);
        setBooleanField(term372, term372.getClass(), "includeDocumentation", false);
        setField(term338, term338.getClass(), "docInfo", term372);
        setBooleanField(term338, term338.getClass(), "unknown", true);
        setBooleanField(term338, term338.getClass(), "resolved", true);
        setField(term338, term338.getClass(), "resolveResult", null);
        setBooleanField(term338, term338.getClass(), "inTemplatedCheckVisit", false);
        setField(term338, term338.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qxSDVejjiY";
        try {
            callMethod(klass, "hasProperty", argTypes, term338, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


