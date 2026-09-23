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

public class PrototypeObjectType_matchConstraint_198224946982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3349;

    public PrototypeObjectType_matchConstraint_198224946982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3362 = new HashMap();
        term3349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term3374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term3382 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term3349, term3349.getClass(), "className", "WZzvmIHhzZ");
        setField(term3349, term3349.getClass(), "properties", term3362);
        setBooleanField(term3349, term3349.getClass(), "nativeType", false);
        setField(term3349, term3349.getClass(), "implicitPrototypeFallback", null);
        setField(term3374, term3374.getClass(), "call", null);
        setField(term3374, term3374.getClass(), "prototypeSlot", null);
        setField(term3374, term3374.getClass(), "kind", null);
        setField(term3374, term3374.getClass(), "typeOfThis", null);
        setField(term3374, term3374.getClass(), "source", null);
        setField(term3374, term3374.getClass(), "implementedInterfaces", null);
        setField(term3374, term3374.getClass(), "extendedInterfaces", null);
        setField(term3374, term3374.getClass(), "subTypes", null);
        setField(term3374, term3374.getClass(), "templateTypeName", null);
        setField(term3374, term3374.getClass(), "className", null);
        setField(term3374, term3374.getClass(), "properties", null);
        setBooleanField(term3374, term3374.getClass(), "nativeType", false);
        setField(term3374, term3374.getClass(), "implicitPrototypeFallback", null);
        setField(term3374, term3374.getClass(), "ownerFunction", null);
        setBooleanField(term3374, term3374.getClass(), "prettyPrint", false);
        setBooleanField(term3374, term3374.getClass(), "visited", false);
        setField(term3374, term3374.getClass(), "docInfo", null);
        setBooleanField(term3374, term3374.getClass(), "unknown", false);
        setBooleanField(term3374, term3374.getClass(), "resolved", false);
        setField(term3374, term3374.getClass(), "resolveResult", null);
        setField(term3374, term3374.getClass(), "registry", null);
        setField(term3349, term3349.getClass(), "ownerFunction", term3374);
        setBooleanField(term3349, term3349.getClass(), "prettyPrint", false);
        setBooleanField(term3349, term3349.getClass(), "visited", true);
        setField(term3382, term3382.getClass(), "info", null);
        setField(term3382, term3382.getClass(), "documentation", null);
        setField(term3382, term3382.getClass(), "associatedNode", null);
        setField(term3382, term3382.getClass(), "visibility", null);
        setIntField(term3382, term3382.getClass(), "bitset", 0);
        setField(term3382, term3382.getClass(), "type", null);
        setField(term3382, term3382.getClass(), "thisType", null);
        setBooleanField(term3382, term3382.getClass(), "includeDocumentation", false);
        setField(term3349, term3349.getClass(), "docInfo", term3382);
        setBooleanField(term3349, term3349.getClass(), "unknown", true);
        setBooleanField(term3349, term3349.getClass(), "resolved", true);
        setField(term3349, term3349.getClass(), "resolveResult", null);
        setField(term3349, term3349.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "matchConstraint", argTypes, term3349, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


