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

public class PrototypeObjectType_hasOverridenNativeProperty_166988718862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1937;

    public PrototypeObjectType_hasOverridenNativeProperty_166988718862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1950 = new HashMap();
        term1937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1962 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1971 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1937, term1937.getClass(), "className", "RbVQXSpxXy");
        setField(term1937, term1937.getClass(), "properties", term1950);
        setBooleanField(term1937, term1937.getClass(), "nativeType", false);
        setField(term1937, term1937.getClass(), "implicitPrototypeFallback", null);
        setField(term1962, term1962.getClass(), "call", null);
        setField(term1962, term1962.getClass(), "prototypeSlot", null);
        setField(term1962, term1962.getClass(), "kind", null);
        setField(term1962, term1962.getClass(), "typeOfThis", null);
        setField(term1962, term1962.getClass(), "source", null);
        setField(term1962, term1962.getClass(), "implementedInterfaces", null);
        setField(term1962, term1962.getClass(), "extendedInterfaces", null);
        setField(term1962, term1962.getClass(), "subTypes", null);
        setField(term1962, term1962.getClass(), "templateTypeNames", null);
        setField(term1962, term1962.getClass(), "className", null);
        setField(term1962, term1962.getClass(), "properties", null);
        setBooleanField(term1962, term1962.getClass(), "nativeType", false);
        setField(term1962, term1962.getClass(), "implicitPrototypeFallback", null);
        setField(term1962, term1962.getClass(), "ownerFunction", null);
        setBooleanField(term1962, term1962.getClass(), "prettyPrint", false);
        setBooleanField(term1962, term1962.getClass(), "visited", false);
        setField(term1962, term1962.getClass(), "docInfo", null);
        setBooleanField(term1962, term1962.getClass(), "unknown", false);
        setBooleanField(term1962, term1962.getClass(), "resolved", false);
        setField(term1962, term1962.getClass(), "resolveResult", null);
        setBooleanField(term1962, term1962.getClass(), "inTemplatedCheckVisit", false);
        setField(term1962, term1962.getClass(), "registry", null);
        setField(term1937, term1937.getClass(), "ownerFunction", term1962);
        setBooleanField(term1937, term1937.getClass(), "prettyPrint", false);
        setBooleanField(term1937, term1937.getClass(), "visited", true);
        setField(term1971, term1971.getClass(), "info", null);
        setField(term1971, term1971.getClass(), "documentation", null);
        setField(term1971, term1971.getClass(), "associatedNode", null);
        setField(term1971, term1971.getClass(), "visibility", null);
        setIntField(term1971, term1971.getClass(), "bitset", 0);
        setField(term1971, term1971.getClass(), "type", null);
        setField(term1971, term1971.getClass(), "thisType", null);
        setBooleanField(term1971, term1971.getClass(), "includeDocumentation", false);
        setField(term1937, term1937.getClass(), "docInfo", term1971);
        setBooleanField(term1937, term1937.getClass(), "unknown", false);
        setBooleanField(term1937, term1937.getClass(), "resolved", false);
        setField(term1937, term1937.getClass(), "resolveResult", null);
        setBooleanField(term1937, term1937.getClass(), "inTemplatedCheckVisit", false);
        setField(term1937, term1937.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iljANwuEjk";
        try {
            callMethod(klass, "hasOverridenNativeProperty", argTypes, term1937, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


