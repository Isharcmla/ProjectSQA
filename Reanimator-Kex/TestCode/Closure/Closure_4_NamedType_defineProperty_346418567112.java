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
import java.lang.Object;
import java.util.ArrayList;

public class NamedType_defineProperty_346418567112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23255;
     Object term23671;

    public NamedType_defineProperty_346418567112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23401 = new ArrayList();
        term23255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term23349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setBooleanField(term23255, term23255.getClass(), "resolved", true);
        setBooleanField(term23349, term23349.getClass(), "resolved", false);
        setField(term23349, term23349.getClass(), "propertyContinuations", term23401);
        setField(term23255, term23255.getClass(), "referencedObjType", term23349);
        Object term23675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term23675, term23675.getClass(), "propertyName", null);
        setField(term23675, term23675.getClass(), "type", null);
        setBooleanField(term23675, term23675.getClass(), "inferred", false);
        setField(term23675, term23675.getClass(), "propertyNode", null);
        ArrayList term23673 = new ArrayList();
        ((ArrayList) term23673).add(term23675);
        term23671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term23672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term23671, term23671.getClass(), "reference", null);
        setField(term23671, term23671.getClass(), "sourceName", null);
        setIntField(term23671, term23671.getClass(), "lineno", 0);
        setIntField(term23671, term23671.getClass(), "charno", 0);
        setField(term23671, term23671.getClass(), "validator", null);
        setField(term23671, term23671.getClass(), "propertyContinuations", null);
        setField(term23671, term23671.getClass(), "referencedType", null);
        setField(term23672, term23672.getClass(), "reference", null);
        setField(term23672, term23672.getClass(), "sourceName", null);
        setIntField(term23672, term23672.getClass(), "lineno", 0);
        setIntField(term23672, term23672.getClass(), "charno", 0);
        setField(term23672, term23672.getClass(), "validator", null);
        setField(term23672, term23672.getClass(), "propertyContinuations", term23673);
        setField(term23672, term23672.getClass(), "referencedType", null);
        setField(term23672, term23672.getClass(), "referencedObjType", null);
        setBooleanField(term23672, term23672.getClass(), "visited", false);
        setField(term23672, term23672.getClass(), "docInfo", null);
        setBooleanField(term23672, term23672.getClass(), "unknown", false);
        setBooleanField(term23672, term23672.getClass(), "resolved", false);
        setField(term23672, term23672.getClass(), "resolveResult", null);
        setField(term23672, term23672.getClass(), "templateKeys", null);
        setField(term23672, term23672.getClass(), "templatizedTypes", null);
        setBooleanField(term23672, term23672.getClass(), "inTemplatedCheckVisit", false);
        setField(term23672, term23672.getClass(), "registry", null);
        setField(term23671, term23671.getClass(), "referencedObjType", term23672);
        setBooleanField(term23671, term23671.getClass(), "visited", false);
        setField(term23671, term23671.getClass(), "docInfo", null);
        setBooleanField(term23671, term23671.getClass(), "unknown", false);
        setBooleanField(term23671, term23671.getClass(), "resolved", true);
        setField(term23671, term23671.getClass(), "resolveResult", null);
        setField(term23671, term23671.getClass(), "templateKeys", null);
        setField(term23671, term23671.getClass(), "templatizedTypes", null);
        setBooleanField(term23671, term23671.getClass(), "inTemplatedCheckVisit", false);
        setField(term23671, term23671.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = false;
        args[3] = null;
        Object retValue = callMethod(klass, "defineProperty", argTypes, term23255, args);
        assertTrue(recursiveEquals(term23255, term23671));
        assertTrue(recursiveEquals(retValue, true));
    }

};


