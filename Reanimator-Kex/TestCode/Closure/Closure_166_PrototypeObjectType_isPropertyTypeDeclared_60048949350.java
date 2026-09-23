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

public class PrototypeObjectType_isPropertyTypeDeclared_60048949350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532;

    public PrototypeObjectType_isPropertyTypeDeclared_60048949350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term545 = new HashMap();
        term532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term566 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term532, term532.getClass(), "className", "RYdKCNNMBR");
        setField(term532, term532.getClass(), "properties", term545);
        setBooleanField(term532, term532.getClass(), "nativeType", false);
        setField(term532, term532.getClass(), "implicitPrototypeFallback", null);
        setField(term557, term557.getClass(), "call", null);
        setField(term557, term557.getClass(), "prototypeSlot", null);
        setField(term557, term557.getClass(), "kind", null);
        setField(term557, term557.getClass(), "typeOfThis", null);
        setField(term557, term557.getClass(), "source", null);
        setField(term557, term557.getClass(), "implementedInterfaces", null);
        setField(term557, term557.getClass(), "extendedInterfaces", null);
        setField(term557, term557.getClass(), "subTypes", null);
        setField(term557, term557.getClass(), "templateTypeNames", null);
        setField(term557, term557.getClass(), "className", null);
        setField(term557, term557.getClass(), "properties", null);
        setBooleanField(term557, term557.getClass(), "nativeType", false);
        setField(term557, term557.getClass(), "implicitPrototypeFallback", null);
        setField(term557, term557.getClass(), "ownerFunction", null);
        setBooleanField(term557, term557.getClass(), "prettyPrint", false);
        setBooleanField(term557, term557.getClass(), "visited", false);
        setField(term557, term557.getClass(), "docInfo", null);
        setBooleanField(term557, term557.getClass(), "unknown", false);
        setBooleanField(term557, term557.getClass(), "resolved", false);
        setField(term557, term557.getClass(), "resolveResult", null);
        setBooleanField(term557, term557.getClass(), "inTemplatedCheckVisit", false);
        setField(term557, term557.getClass(), "registry", null);
        setField(term532, term532.getClass(), "ownerFunction", term557);
        setBooleanField(term532, term532.getClass(), "prettyPrint", false);
        setBooleanField(term532, term532.getClass(), "visited", true);
        setField(term566, term566.getClass(), "info", null);
        setField(term566, term566.getClass(), "documentation", null);
        setField(term566, term566.getClass(), "associatedNode", null);
        setField(term566, term566.getClass(), "visibility", null);
        setIntField(term566, term566.getClass(), "bitset", 0);
        setField(term566, term566.getClass(), "type", null);
        setField(term566, term566.getClass(), "thisType", null);
        setBooleanField(term566, term566.getClass(), "includeDocumentation", false);
        setField(term532, term532.getClass(), "docInfo", term566);
        setBooleanField(term532, term532.getClass(), "unknown", false);
        setBooleanField(term532, term532.getClass(), "resolved", true);
        setField(term532, term532.getClass(), "resolveResult", null);
        setBooleanField(term532, term532.getClass(), "inTemplatedCheckVisit", false);
        setField(term532, term532.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iNwOJRBEjp";
        try {
            callMethod(klass, "isPropertyTypeDeclared", argTypes, term532, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


