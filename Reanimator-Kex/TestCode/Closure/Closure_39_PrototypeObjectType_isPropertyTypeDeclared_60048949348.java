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

public class PrototypeObjectType_isPropertyTypeDeclared_60048949348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522;

    public PrototypeObjectType_isPropertyTypeDeclared_60048949348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term535 = new HashMap();
        term522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term555 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term522, term522.getClass(), "className", "RYdKCNNMBR");
        setField(term522, term522.getClass(), "properties", term535);
        setBooleanField(term522, term522.getClass(), "nativeType", false);
        setField(term522, term522.getClass(), "implicitPrototypeFallback", null);
        setField(term547, term547.getClass(), "call", null);
        setField(term547, term547.getClass(), "prototypeSlot", null);
        setField(term547, term547.getClass(), "kind", null);
        setField(term547, term547.getClass(), "typeOfThis", null);
        setField(term547, term547.getClass(), "source", null);
        setField(term547, term547.getClass(), "implementedInterfaces", null);
        setField(term547, term547.getClass(), "extendedInterfaces", null);
        setField(term547, term547.getClass(), "subTypes", null);
        setField(term547, term547.getClass(), "templateTypeName", null);
        setField(term547, term547.getClass(), "className", null);
        setField(term547, term547.getClass(), "properties", null);
        setBooleanField(term547, term547.getClass(), "nativeType", false);
        setField(term547, term547.getClass(), "implicitPrototypeFallback", null);
        setField(term547, term547.getClass(), "ownerFunction", null);
        setBooleanField(term547, term547.getClass(), "prettyPrint", false);
        setBooleanField(term547, term547.getClass(), "visited", false);
        setField(term547, term547.getClass(), "docInfo", null);
        setBooleanField(term547, term547.getClass(), "unknown", false);
        setBooleanField(term547, term547.getClass(), "resolved", false);
        setField(term547, term547.getClass(), "resolveResult", null);
        setField(term547, term547.getClass(), "registry", null);
        setField(term522, term522.getClass(), "ownerFunction", term547);
        setBooleanField(term522, term522.getClass(), "prettyPrint", false);
        setBooleanField(term522, term522.getClass(), "visited", true);
        setField(term555, term555.getClass(), "info", null);
        setField(term555, term555.getClass(), "documentation", null);
        setField(term555, term555.getClass(), "associatedNode", null);
        setField(term555, term555.getClass(), "visibility", null);
        setIntField(term555, term555.getClass(), "bitset", 0);
        setField(term555, term555.getClass(), "type", null);
        setField(term555, term555.getClass(), "thisType", null);
        setBooleanField(term555, term555.getClass(), "includeDocumentation", false);
        setField(term522, term522.getClass(), "docInfo", term555);
        setBooleanField(term522, term522.getClass(), "unknown", false);
        setBooleanField(term522, term522.getClass(), "resolved", true);
        setField(term522, term522.getClass(), "resolveResult", null);
        setField(term522, term522.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iNwOJRBEjp";
        try {
            callMethod(klass, "isPropertyTypeDeclared", argTypes, term522, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


