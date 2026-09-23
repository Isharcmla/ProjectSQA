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

public class PrototypeObjectType_isPropertyTypeInferred_116767719652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669;

    public PrototypeObjectType_isPropertyTypeInferred_116767719652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term682 = new HashMap();
        term669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term703 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term669, term669.getClass(), "className", "WzMEhMXkKx");
        setField(term669, term669.getClass(), "properties", term682);
        setBooleanField(term669, term669.getClass(), "nativeType", true);
        setField(term669, term669.getClass(), "implicitPrototypeFallback", null);
        setField(term694, term694.getClass(), "call", null);
        setField(term694, term694.getClass(), "prototypeSlot", null);
        setField(term694, term694.getClass(), "kind", null);
        setField(term694, term694.getClass(), "typeOfThis", null);
        setField(term694, term694.getClass(), "source", null);
        setField(term694, term694.getClass(), "implementedInterfaces", null);
        setField(term694, term694.getClass(), "extendedInterfaces", null);
        setField(term694, term694.getClass(), "subTypes", null);
        setField(term694, term694.getClass(), "templateTypeNames", null);
        setField(term694, term694.getClass(), "className", null);
        setField(term694, term694.getClass(), "properties", null);
        setBooleanField(term694, term694.getClass(), "nativeType", false);
        setField(term694, term694.getClass(), "implicitPrototypeFallback", null);
        setField(term694, term694.getClass(), "ownerFunction", null);
        setBooleanField(term694, term694.getClass(), "prettyPrint", false);
        setBooleanField(term694, term694.getClass(), "visited", false);
        setField(term694, term694.getClass(), "docInfo", null);
        setBooleanField(term694, term694.getClass(), "unknown", false);
        setBooleanField(term694, term694.getClass(), "resolved", false);
        setField(term694, term694.getClass(), "resolveResult", null);
        setBooleanField(term694, term694.getClass(), "inTemplatedCheckVisit", false);
        setField(term694, term694.getClass(), "registry", null);
        setField(term669, term669.getClass(), "ownerFunction", term694);
        setBooleanField(term669, term669.getClass(), "prettyPrint", true);
        setBooleanField(term669, term669.getClass(), "visited", false);
        setField(term703, term703.getClass(), "info", null);
        setField(term703, term703.getClass(), "documentation", null);
        setField(term703, term703.getClass(), "associatedNode", null);
        setField(term703, term703.getClass(), "visibility", null);
        setIntField(term703, term703.getClass(), "bitset", 0);
        setField(term703, term703.getClass(), "type", null);
        setField(term703, term703.getClass(), "thisType", null);
        setBooleanField(term703, term703.getClass(), "includeDocumentation", false);
        setField(term669, term669.getClass(), "docInfo", term703);
        setBooleanField(term669, term669.getClass(), "unknown", false);
        setBooleanField(term669, term669.getClass(), "resolved", true);
        setField(term669, term669.getClass(), "resolveResult", null);
        setBooleanField(term669, term669.getClass(), "inTemplatedCheckVisit", false);
        setField(term669, term669.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lHfTrWKMPk";
        try {
            callMethod(klass, "isPropertyTypeInferred", argTypes, term669, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


