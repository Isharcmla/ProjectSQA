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
import java.util.ArrayList;
import java.lang.Object;

public class NamedType_resolveInternal_15966100330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1356;

    public NamedType_resolveInternal_15966100330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term1388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1385, term1385.getClass(), "propertyName", "");
        setField(term1385, term1385.getClass(), "type", null);
        setBooleanField(term1385, term1385.getClass(), "inferred", true);
        setIntField(term1388, term1388.getClass(), "type", -1772434990);
        setField(term1388, term1388.getClass(), "next", null);
        setField(term1388, term1388.getClass(), "first", null);
        setField(term1388, term1388.getClass(), "last", null);
        setField(term1388, term1388.getClass(), "propListHead", null);
        setIntField(term1388, term1388.getClass(), "sourcePosition", 0);
        setField(term1388, term1388.getClass(), "jsType", null);
        setField(term1388, term1388.getClass(), "parent", null);
        setField(term1385, term1385.getClass(), "propertyNode", term1388);
        Object term1391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1391, term1391.getClass(), "propertyName", "");
        setField(term1391, term1391.getClass(), "type", null);
        setBooleanField(term1391, term1391.getClass(), "inferred", false);
        setField(term1391, term1391.getClass(), "propertyNode", null);
        ArrayList term1383 = new ArrayList();
        ((ArrayList) term1383).add(term1385);
        ((ArrayList) term1383).add(term1391);
        term1356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1356, term1356.getClass(), "reference", "OEXDRUKcFl");
        setField(term1356, term1356.getClass(), "sourceName", "RYdKCNNMBR");
        setIntField(term1356, term1356.getClass(), "lineno", 1114000454);
        setIntField(term1356, term1356.getClass(), "charno", -556405712);
        setField(term1356, term1356.getClass(), "validator", null);
        setField(term1356, term1356.getClass(), "propertyContinuations", term1383);
        setField(term1356, term1356.getClass(), "referencedType", null);
        setField(term1356, term1356.getClass(), "referencedObjType", null);
        setBooleanField(term1356, term1356.getClass(), "visited", false);
        setField(term1356, term1356.getClass(), "docInfo", null);
        setBooleanField(term1356, term1356.getClass(), "unknown", false);
        setBooleanField(term1356, term1356.getClass(), "resolved", false);
        setField(term1356, term1356.getClass(), "resolveResult", null);
        setField(term1356, term1356.getClass(), "templateKeys", null);
        setField(term1356, term1356.getClass(), "templatizedTypes", null);
        setBooleanField(term1356, term1356.getClass(), "inTemplatedCheckVisit", false);
        setField(term1356, term1356.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term1356, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


