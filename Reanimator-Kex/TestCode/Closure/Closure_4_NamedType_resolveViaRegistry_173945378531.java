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

public class NamedType_resolveViaRegistry_173945378531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420;

    public NamedType_resolveViaRegistry_173945378531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term1452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1449, term1449.getClass(), "propertyName", "");
        setField(term1449, term1449.getClass(), "type", null);
        setBooleanField(term1449, term1449.getClass(), "inferred", true);
        setIntField(term1452, term1452.getClass(), "type", -894662986);
        setField(term1452, term1452.getClass(), "next", null);
        setField(term1452, term1452.getClass(), "first", null);
        setField(term1452, term1452.getClass(), "last", null);
        setField(term1452, term1452.getClass(), "propListHead", null);
        setIntField(term1452, term1452.getClass(), "sourcePosition", 0);
        setField(term1452, term1452.getClass(), "jsType", null);
        setField(term1452, term1452.getClass(), "parent", null);
        setField(term1449, term1449.getClass(), "propertyNode", term1452);
        Object term1455 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1455, term1455.getClass(), "propertyName", "");
        setField(term1455, term1455.getClass(), "type", null);
        setBooleanField(term1455, term1455.getClass(), "inferred", false);
        setField(term1455, term1455.getClass(), "propertyNode", null);
        Object term1458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1458, term1458.getClass(), "propertyName", null);
        setField(term1458, term1458.getClass(), "type", null);
        setBooleanField(term1458, term1458.getClass(), "inferred", false);
        setField(term1458, term1458.getClass(), "propertyNode", null);
        Object term1460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1460, term1460.getClass(), "propertyName", null);
        setField(term1460, term1460.getClass(), "type", null);
        setBooleanField(term1460, term1460.getClass(), "inferred", false);
        setField(term1460, term1460.getClass(), "propertyNode", null);
        Object term1462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1462, term1462.getClass(), "propertyName", null);
        setField(term1462, term1462.getClass(), "type", null);
        setBooleanField(term1462, term1462.getClass(), "inferred", false);
        setField(term1462, term1462.getClass(), "propertyNode", null);
        ArrayList term1447 = new ArrayList();
        ((ArrayList) term1447).add(term1449);
        ((ArrayList) term1447).add(term1455);
        ((ArrayList) term1447).add(term1458);
        ((ArrayList) term1447).add(term1460);
        ((ArrayList) term1447).add(term1462);
        term1420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1420, term1420.getClass(), "reference", "iNwOJRBEjp");
        setField(term1420, term1420.getClass(), "sourceName", "XylxrMBraH");
        setIntField(term1420, term1420.getClass(), "lineno", -1034506028);
        setIntField(term1420, term1420.getClass(), "charno", -1263114719);
        setField(term1420, term1420.getClass(), "validator", null);
        setField(term1420, term1420.getClass(), "propertyContinuations", term1447);
        setField(term1420, term1420.getClass(), "referencedType", null);
        setField(term1420, term1420.getClass(), "referencedObjType", null);
        setBooleanField(term1420, term1420.getClass(), "visited", false);
        setField(term1420, term1420.getClass(), "docInfo", null);
        setBooleanField(term1420, term1420.getClass(), "unknown", false);
        setBooleanField(term1420, term1420.getClass(), "resolved", false);
        setField(term1420, term1420.getClass(), "resolveResult", null);
        setField(term1420, term1420.getClass(), "templateKeys", null);
        setField(term1420, term1420.getClass(), "templatizedTypes", null);
        setBooleanField(term1420, term1420.getClass(), "inTemplatedCheckVisit", false);
        setField(term1420, term1420.getClass(), "registry", null);
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
            callMethod(klass, "resolveViaRegistry", argTypes, term1420, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


