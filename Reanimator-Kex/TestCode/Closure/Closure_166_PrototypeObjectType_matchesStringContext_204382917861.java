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

public class PrototypeObjectType_matchesStringContext_204382917861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1887;

    public PrototypeObjectType_matchesStringContext_204382917861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1900 = new HashMap();
        term1887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1921 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1887, term1887.getClass(), "className", "VGizxZnyHX");
        setField(term1887, term1887.getClass(), "properties", term1900);
        setBooleanField(term1887, term1887.getClass(), "nativeType", false);
        setField(term1887, term1887.getClass(), "implicitPrototypeFallback", null);
        setField(term1912, term1912.getClass(), "call", null);
        setField(term1912, term1912.getClass(), "prototypeSlot", null);
        setField(term1912, term1912.getClass(), "kind", null);
        setField(term1912, term1912.getClass(), "typeOfThis", null);
        setField(term1912, term1912.getClass(), "source", null);
        setField(term1912, term1912.getClass(), "implementedInterfaces", null);
        setField(term1912, term1912.getClass(), "extendedInterfaces", null);
        setField(term1912, term1912.getClass(), "subTypes", null);
        setField(term1912, term1912.getClass(), "templateTypeNames", null);
        setField(term1912, term1912.getClass(), "className", null);
        setField(term1912, term1912.getClass(), "properties", null);
        setBooleanField(term1912, term1912.getClass(), "nativeType", false);
        setField(term1912, term1912.getClass(), "implicitPrototypeFallback", null);
        setField(term1912, term1912.getClass(), "ownerFunction", null);
        setBooleanField(term1912, term1912.getClass(), "prettyPrint", false);
        setBooleanField(term1912, term1912.getClass(), "visited", false);
        setField(term1912, term1912.getClass(), "docInfo", null);
        setBooleanField(term1912, term1912.getClass(), "unknown", false);
        setBooleanField(term1912, term1912.getClass(), "resolved", false);
        setField(term1912, term1912.getClass(), "resolveResult", null);
        setBooleanField(term1912, term1912.getClass(), "inTemplatedCheckVisit", false);
        setField(term1912, term1912.getClass(), "registry", null);
        setField(term1887, term1887.getClass(), "ownerFunction", term1912);
        setBooleanField(term1887, term1887.getClass(), "prettyPrint", false);
        setBooleanField(term1887, term1887.getClass(), "visited", false);
        setField(term1921, term1921.getClass(), "info", null);
        setField(term1921, term1921.getClass(), "documentation", null);
        setField(term1921, term1921.getClass(), "associatedNode", null);
        setField(term1921, term1921.getClass(), "visibility", null);
        setIntField(term1921, term1921.getClass(), "bitset", 0);
        setField(term1921, term1921.getClass(), "type", null);
        setField(term1921, term1921.getClass(), "thisType", null);
        setBooleanField(term1921, term1921.getClass(), "includeDocumentation", false);
        setField(term1887, term1887.getClass(), "docInfo", term1921);
        setBooleanField(term1887, term1887.getClass(), "unknown", false);
        setBooleanField(term1887, term1887.getClass(), "resolved", false);
        setField(term1887, term1887.getClass(), "resolveResult", null);
        setBooleanField(term1887, term1887.getClass(), "inTemplatedCheckVisit", false);
        setField(term1887, term1887.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesStringContext", argTypes, term1887, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


