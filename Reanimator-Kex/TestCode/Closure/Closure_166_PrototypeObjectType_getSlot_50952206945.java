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

public class PrototypeObjectType_getSlot_50952206945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;

    public PrototypeObjectType_getSlot_50952206945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term229 = new HashMap();
        term216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term250 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term216, term216.getClass(), "className", "DfISiziTgG");
        setField(term216, term216.getClass(), "properties", term229);
        setBooleanField(term216, term216.getClass(), "nativeType", true);
        setField(term216, term216.getClass(), "implicitPrototypeFallback", null);
        setField(term241, term241.getClass(), "call", null);
        setField(term241, term241.getClass(), "prototypeSlot", null);
        setField(term241, term241.getClass(), "kind", null);
        setField(term241, term241.getClass(), "typeOfThis", null);
        setField(term241, term241.getClass(), "source", null);
        setField(term241, term241.getClass(), "implementedInterfaces", null);
        setField(term241, term241.getClass(), "extendedInterfaces", null);
        setField(term241, term241.getClass(), "subTypes", null);
        setField(term241, term241.getClass(), "templateTypeNames", null);
        setField(term241, term241.getClass(), "className", null);
        setField(term241, term241.getClass(), "properties", null);
        setBooleanField(term241, term241.getClass(), "nativeType", false);
        setField(term241, term241.getClass(), "implicitPrototypeFallback", null);
        setField(term241, term241.getClass(), "ownerFunction", null);
        setBooleanField(term241, term241.getClass(), "prettyPrint", false);
        setBooleanField(term241, term241.getClass(), "visited", false);
        setField(term241, term241.getClass(), "docInfo", null);
        setBooleanField(term241, term241.getClass(), "unknown", false);
        setBooleanField(term241, term241.getClass(), "resolved", false);
        setField(term241, term241.getClass(), "resolveResult", null);
        setBooleanField(term241, term241.getClass(), "inTemplatedCheckVisit", false);
        setField(term241, term241.getClass(), "registry", null);
        setField(term216, term216.getClass(), "ownerFunction", term241);
        setBooleanField(term216, term216.getClass(), "prettyPrint", true);
        setBooleanField(term216, term216.getClass(), "visited", true);
        setField(term250, term250.getClass(), "info", null);
        setField(term250, term250.getClass(), "documentation", null);
        setField(term250, term250.getClass(), "associatedNode", null);
        setField(term250, term250.getClass(), "visibility", null);
        setIntField(term250, term250.getClass(), "bitset", 0);
        setField(term250, term250.getClass(), "type", null);
        setField(term250, term250.getClass(), "thisType", null);
        setBooleanField(term250, term250.getClass(), "includeDocumentation", false);
        setField(term216, term216.getClass(), "docInfo", term250);
        setBooleanField(term216, term216.getClass(), "unknown", true);
        setBooleanField(term216, term216.getClass(), "resolved", true);
        setField(term216, term216.getClass(), "resolveResult", null);
        setBooleanField(term216, term216.getClass(), "inTemplatedCheckVisit", false);
        setField(term216, term216.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        try {
            callMethod(klass, "getSlot", argTypes, term216, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


