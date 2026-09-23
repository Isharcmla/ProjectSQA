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

public class NamedType_resolveViaProperties_64475463932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1490;

    public NamedType_resolveViaProperties_64475463932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term1522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1519, term1519.getClass(), "propertyName", "");
        setField(term1519, term1519.getClass(), "type", null);
        setBooleanField(term1519, term1519.getClass(), "inferred", false);
        setIntField(term1522, term1522.getClass(), "type", -663691365);
        setField(term1522, term1522.getClass(), "next", null);
        setField(term1522, term1522.getClass(), "first", null);
        setField(term1522, term1522.getClass(), "last", null);
        setField(term1522, term1522.getClass(), "propListHead", null);
        setIntField(term1522, term1522.getClass(), "sourcePosition", 0);
        setField(term1522, term1522.getClass(), "jsType", null);
        setField(term1522, term1522.getClass(), "parent", null);
        setField(term1519, term1519.getClass(), "propertyNode", term1522);
        Object term1525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1525, term1525.getClass(), "propertyName", "");
        setField(term1525, term1525.getClass(), "type", null);
        setBooleanField(term1525, term1525.getClass(), "inferred", false);
        setField(term1525, term1525.getClass(), "propertyNode", null);
        Object term1528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1528, term1528.getClass(), "propertyName", null);
        setField(term1528, term1528.getClass(), "type", null);
        setBooleanField(term1528, term1528.getClass(), "inferred", false);
        setField(term1528, term1528.getClass(), "propertyNode", null);
        ArrayList term1517 = new ArrayList();
        ((ArrayList) term1517).add(term1519);
        ((ArrayList) term1517).add(term1525);
        ((ArrayList) term1517).add(term1528);
        term1490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1490, term1490.getClass(), "reference", "dpNsDgfPso");
        setField(term1490, term1490.getClass(), "sourceName", "hCWPJQKpdc");
        setIntField(term1490, term1490.getClass(), "lineno", -268815336);
        setIntField(term1490, term1490.getClass(), "charno", -1210583429);
        setField(term1490, term1490.getClass(), "validator", null);
        setField(term1490, term1490.getClass(), "propertyContinuations", term1517);
        setField(term1490, term1490.getClass(), "referencedType", null);
        setField(term1490, term1490.getClass(), "referencedObjType", null);
        setBooleanField(term1490, term1490.getClass(), "visited", false);
        setField(term1490, term1490.getClass(), "docInfo", null);
        setBooleanField(term1490, term1490.getClass(), "unknown", false);
        setBooleanField(term1490, term1490.getClass(), "resolved", false);
        setField(term1490, term1490.getClass(), "resolveResult", null);
        setField(term1490, term1490.getClass(), "templateKeys", null);
        setField(term1490, term1490.getClass(), "templatizedTypes", null);
        setBooleanField(term1490, term1490.getClass(), "inTemplatedCheckVisit", false);
        setField(term1490, term1490.getClass(), "registry", null);
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
            callMethod(klass, "resolveViaProperties", argTypes, term1490, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


