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

public class NamedType_setReferencedAndResolvedType_101551349034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1626;
     Object term6256;

    public NamedType_setReferencedAndResolvedType_101551349034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term1658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1655, term1655.getClass(), "propertyName", "");
        setField(term1655, term1655.getClass(), "type", null);
        setBooleanField(term1655, term1655.getClass(), "inferred", false);
        setIntField(term1658, term1658.getClass(), "type", 1861318859);
        setField(term1658, term1658.getClass(), "next", null);
        setField(term1658, term1658.getClass(), "first", null);
        setField(term1658, term1658.getClass(), "last", null);
        setField(term1658, term1658.getClass(), "propListHead", null);
        setIntField(term1658, term1658.getClass(), "sourcePosition", 0);
        setField(term1658, term1658.getClass(), "jsType", null);
        setField(term1658, term1658.getClass(), "parent", null);
        setField(term1655, term1655.getClass(), "propertyNode", term1658);
        Object term1661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1661, term1661.getClass(), "propertyName", "");
        setField(term1661, term1661.getClass(), "type", null);
        setBooleanField(term1661, term1661.getClass(), "inferred", false);
        setField(term1661, term1661.getClass(), "propertyNode", null);
        Object term1664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1664, term1664.getClass(), "propertyName", null);
        setField(term1664, term1664.getClass(), "type", null);
        setBooleanField(term1664, term1664.getClass(), "inferred", false);
        setField(term1664, term1664.getClass(), "propertyNode", null);
        Object term1666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1666, term1666.getClass(), "propertyName", null);
        setField(term1666, term1666.getClass(), "type", null);
        setBooleanField(term1666, term1666.getClass(), "inferred", false);
        setField(term1666, term1666.getClass(), "propertyNode", null);
        Object term1668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1668, term1668.getClass(), "propertyName", null);
        setField(term1668, term1668.getClass(), "type", null);
        setBooleanField(term1668, term1668.getClass(), "inferred", false);
        setField(term1668, term1668.getClass(), "propertyNode", null);
        ArrayList term1653 = new ArrayList();
        ((ArrayList) term1653).add(term1655);
        ((ArrayList) term1653).add(term1661);
        ((ArrayList) term1653).add(term1664);
        ((ArrayList) term1653).add(term1666);
        ((ArrayList) term1653).add(term1668);
        term1626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1626, term1626.getClass(), "reference", "xIeFjkHkOe");
        setField(term1626, term1626.getClass(), "sourceName", "SdCKLMIYnX");
        setIntField(term1626, term1626.getClass(), "lineno", 1386130016);
        setIntField(term1626, term1626.getClass(), "charno", 1072005683);
        setField(term1626, term1626.getClass(), "validator", null);
        setField(term1626, term1626.getClass(), "propertyContinuations", term1653);
        setField(term1626, term1626.getClass(), "referencedType", null);
        setField(term1626, term1626.getClass(), "referencedObjType", null);
        setBooleanField(term1626, term1626.getClass(), "visited", false);
        setField(term1626, term1626.getClass(), "docInfo", null);
        setBooleanField(term1626, term1626.getClass(), "unknown", false);
        setBooleanField(term1626, term1626.getClass(), "resolved", false);
        setField(term1626, term1626.getClass(), "resolveResult", null);
        setField(term1626, term1626.getClass(), "templateKeys", null);
        setField(term1626, term1626.getClass(), "templatizedTypes", null);
        setBooleanField(term1626, term1626.getClass(), "inTemplatedCheckVisit", false);
        setField(term1626, term1626.getClass(), "registry", null);
        Object term6263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term6265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6263, term6263.getClass(), "propertyName", "");
        setField(term6263, term6263.getClass(), "type", null);
        setBooleanField(term6263, term6263.getClass(), "inferred", false);
        setIntField(term6265, term6265.getClass(), "type", 1861318859);
        setField(term6265, term6265.getClass(), "next", null);
        setField(term6265, term6265.getClass(), "first", null);
        setField(term6265, term6265.getClass(), "last", null);
        setField(term6265, term6265.getClass(), "propListHead", null);
        setIntField(term6265, term6265.getClass(), "sourcePosition", 0);
        setField(term6265, term6265.getClass(), "jsType", null);
        setField(term6265, term6265.getClass(), "parent", null);
        setField(term6263, term6263.getClass(), "propertyNode", term6265);
        Object term6266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term6266, term6266.getClass(), "propertyName", "");
        setField(term6266, term6266.getClass(), "type", null);
        setBooleanField(term6266, term6266.getClass(), "inferred", false);
        setField(term6266, term6266.getClass(), "propertyNode", null);
        Object term6268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term6268, term6268.getClass(), "propertyName", null);
        setField(term6268, term6268.getClass(), "type", null);
        setBooleanField(term6268, term6268.getClass(), "inferred", false);
        setField(term6268, term6268.getClass(), "propertyNode", null);
        Object term6269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term6269, term6269.getClass(), "propertyName", null);
        setField(term6269, term6269.getClass(), "type", null);
        setBooleanField(term6269, term6269.getClass(), "inferred", false);
        setField(term6269, term6269.getClass(), "propertyNode", null);
        Object term6270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term6270, term6270.getClass(), "propertyName", null);
        setField(term6270, term6270.getClass(), "type", null);
        setBooleanField(term6270, term6270.getClass(), "inferred", false);
        setField(term6270, term6270.getClass(), "propertyNode", null);
        ArrayList term6261 = new ArrayList();
        ((ArrayList) term6261).add(term6263);
        ((ArrayList) term6261).add(term6266);
        ((ArrayList) term6261).add(term6268);
        ((ArrayList) term6261).add(term6269);
        ((ArrayList) term6261).add(term6270);
        term6256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term6256, term6256.getClass(), "reference", "xIeFjkHkOe");
        setField(term6256, term6256.getClass(), "sourceName", "SdCKLMIYnX");
        setIntField(term6256, term6256.getClass(), "lineno", 1386130016);
        setIntField(term6256, term6256.getClass(), "charno", 1072005683);
        setField(term6256, term6256.getClass(), "validator", null);
        setField(term6256, term6256.getClass(), "propertyContinuations", term6261);
        setField(term6256, term6256.getClass(), "referencedType", null);
        setField(term6256, term6256.getClass(), "referencedObjType", null);
        setBooleanField(term6256, term6256.getClass(), "visited", false);
        setField(term6256, term6256.getClass(), "docInfo", null);
        setBooleanField(term6256, term6256.getClass(), "unknown", false);
        setBooleanField(term6256, term6256.getClass(), "resolved", true);
        setField(term6256, term6256.getClass(), "resolveResult", null);
        setField(term6256, term6256.getClass(), "templateKeys", null);
        setField(term6256, term6256.getClass(), "templatizedTypes", null);
        setBooleanField(term6256, term6256.getClass(), "inTemplatedCheckVisit", false);
        setField(term6256, term6256.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "setReferencedAndResolvedType", argTypes, term1626, args);
        assertTrue(recursiveEquals(term1626, term6256));
    }

};


