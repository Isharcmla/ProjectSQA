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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class NamedType_isNominalType_198608888128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1212;
     Object term4963;

    public NamedType_isNominalType_198608888128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term1244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1241, term1241.getClass(), "propertyName", "");
        setField(term1241, term1241.getClass(), "type", null);
        setBooleanField(term1241, term1241.getClass(), "inferred", true);
        setIntField(term1244, term1244.getClass(), "type", 335112684);
        setField(term1244, term1244.getClass(), "next", null);
        setField(term1244, term1244.getClass(), "first", null);
        setField(term1244, term1244.getClass(), "last", null);
        setField(term1244, term1244.getClass(), "propListHead", null);
        setIntField(term1244, term1244.getClass(), "sourcePosition", 0);
        setField(term1244, term1244.getClass(), "jsType", null);
        setField(term1244, term1244.getClass(), "parent", null);
        setField(term1241, term1241.getClass(), "propertyNode", term1244);
        Object term1247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1247, term1247.getClass(), "propertyName", "");
        setField(term1247, term1247.getClass(), "type", null);
        setBooleanField(term1247, term1247.getClass(), "inferred", false);
        setField(term1247, term1247.getClass(), "propertyNode", null);
        Object term1250 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1250, term1250.getClass(), "propertyName", null);
        setField(term1250, term1250.getClass(), "type", null);
        setBooleanField(term1250, term1250.getClass(), "inferred", false);
        setField(term1250, term1250.getClass(), "propertyNode", null);
        Object term1252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1252, term1252.getClass(), "propertyName", null);
        setField(term1252, term1252.getClass(), "type", null);
        setBooleanField(term1252, term1252.getClass(), "inferred", false);
        setField(term1252, term1252.getClass(), "propertyNode", null);
        Object term1254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1254, term1254.getClass(), "propertyName", null);
        setField(term1254, term1254.getClass(), "type", null);
        setBooleanField(term1254, term1254.getClass(), "inferred", false);
        setField(term1254, term1254.getClass(), "propertyNode", null);
        Object term1256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1256, term1256.getClass(), "propertyName", null);
        setField(term1256, term1256.getClass(), "type", null);
        setBooleanField(term1256, term1256.getClass(), "inferred", false);
        setField(term1256, term1256.getClass(), "propertyNode", null);
        ArrayList term1239 = new ArrayList();
        ((ArrayList) term1239).add(term1241);
        ((ArrayList) term1239).add(term1247);
        ((ArrayList) term1239).add(term1250);
        ((ArrayList) term1239).add(term1252);
        ((ArrayList) term1239).add(term1254);
        ((ArrayList) term1239).add(term1256);
        term1212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1212, term1212.getClass(), "reference", "QXzGXbEXMu");
        setField(term1212, term1212.getClass(), "sourceName", "qxSDVejjiY");
        setIntField(term1212, term1212.getClass(), "lineno", 1540719661);
        setIntField(term1212, term1212.getClass(), "charno", 1265463001);
        setField(term1212, term1212.getClass(), "validator", null);
        setField(term1212, term1212.getClass(), "propertyContinuations", term1239);
        setField(term1212, term1212.getClass(), "referencedType", null);
        setField(term1212, term1212.getClass(), "referencedObjType", null);
        setBooleanField(term1212, term1212.getClass(), "visited", false);
        setField(term1212, term1212.getClass(), "docInfo", null);
        setBooleanField(term1212, term1212.getClass(), "unknown", false);
        setBooleanField(term1212, term1212.getClass(), "resolved", false);
        setField(term1212, term1212.getClass(), "resolveResult", null);
        setField(term1212, term1212.getClass(), "templateKeys", null);
        setField(term1212, term1212.getClass(), "templatizedTypes", null);
        setBooleanField(term1212, term1212.getClass(), "inTemplatedCheckVisit", false);
        setField(term1212, term1212.getClass(), "registry", null);
        Object term4970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term4972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4970, term4970.getClass(), "propertyName", "");
        setField(term4970, term4970.getClass(), "type", null);
        setBooleanField(term4970, term4970.getClass(), "inferred", true);
        setIntField(term4972, term4972.getClass(), "type", 335112684);
        setField(term4972, term4972.getClass(), "next", null);
        setField(term4972, term4972.getClass(), "first", null);
        setField(term4972, term4972.getClass(), "last", null);
        setField(term4972, term4972.getClass(), "propListHead", null);
        setIntField(term4972, term4972.getClass(), "sourcePosition", 0);
        setField(term4972, term4972.getClass(), "jsType", null);
        setField(term4972, term4972.getClass(), "parent", null);
        setField(term4970, term4970.getClass(), "propertyNode", term4972);
        Object term4973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4973, term4973.getClass(), "propertyName", "");
        setField(term4973, term4973.getClass(), "type", null);
        setBooleanField(term4973, term4973.getClass(), "inferred", false);
        setField(term4973, term4973.getClass(), "propertyNode", null);
        Object term4975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4975, term4975.getClass(), "propertyName", null);
        setField(term4975, term4975.getClass(), "type", null);
        setBooleanField(term4975, term4975.getClass(), "inferred", false);
        setField(term4975, term4975.getClass(), "propertyNode", null);
        Object term4976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4976, term4976.getClass(), "propertyName", null);
        setField(term4976, term4976.getClass(), "type", null);
        setBooleanField(term4976, term4976.getClass(), "inferred", false);
        setField(term4976, term4976.getClass(), "propertyNode", null);
        Object term4977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4977, term4977.getClass(), "propertyName", null);
        setField(term4977, term4977.getClass(), "type", null);
        setBooleanField(term4977, term4977.getClass(), "inferred", false);
        setField(term4977, term4977.getClass(), "propertyNode", null);
        Object term4978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4978, term4978.getClass(), "propertyName", null);
        setField(term4978, term4978.getClass(), "type", null);
        setBooleanField(term4978, term4978.getClass(), "inferred", false);
        setField(term4978, term4978.getClass(), "propertyNode", null);
        ArrayList term4968 = new ArrayList();
        ((ArrayList) term4968).add(term4970);
        ((ArrayList) term4968).add(term4973);
        ((ArrayList) term4968).add(term4975);
        ((ArrayList) term4968).add(term4976);
        ((ArrayList) term4968).add(term4977);
        ((ArrayList) term4968).add(term4978);
        term4963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term4963, term4963.getClass(), "reference", "QXzGXbEXMu");
        setField(term4963, term4963.getClass(), "sourceName", "qxSDVejjiY");
        setIntField(term4963, term4963.getClass(), "lineno", 1540719661);
        setIntField(term4963, term4963.getClass(), "charno", 1265463001);
        setField(term4963, term4963.getClass(), "validator", null);
        setField(term4963, term4963.getClass(), "propertyContinuations", term4968);
        setField(term4963, term4963.getClass(), "referencedType", null);
        setField(term4963, term4963.getClass(), "referencedObjType", null);
        setBooleanField(term4963, term4963.getClass(), "visited", false);
        setField(term4963, term4963.getClass(), "docInfo", null);
        setBooleanField(term4963, term4963.getClass(), "unknown", false);
        setBooleanField(term4963, term4963.getClass(), "resolved", false);
        setField(term4963, term4963.getClass(), "resolveResult", null);
        setField(term4963, term4963.getClass(), "templateKeys", null);
        setField(term4963, term4963.getClass(), "templatizedTypes", null);
        setBooleanField(term4963, term4963.getClass(), "inTemplatedCheckVisit", false);
        setField(term4963, term4963.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNominalType", argTypes, term1212, args);
        assertTrue(recursiveEquals(term1212, term4963));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


