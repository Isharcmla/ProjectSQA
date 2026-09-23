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

public class NamedType_hashCode_131595414629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1284;
     Object term5073;

    public NamedType_hashCode_131595414629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term1316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1313, term1313.getClass(), "propertyName", "");
        setField(term1313, term1313.getClass(), "type", null);
        setBooleanField(term1313, term1313.getClass(), "inferred", true);
        setIntField(term1316, term1316.getClass(), "type", -481533957);
        setField(term1316, term1316.getClass(), "next", null);
        setField(term1316, term1316.getClass(), "first", null);
        setField(term1316, term1316.getClass(), "last", null);
        setField(term1316, term1316.getClass(), "propListHead", null);
        setIntField(term1316, term1316.getClass(), "sourcePosition", 0);
        setField(term1316, term1316.getClass(), "jsType", null);
        setField(term1316, term1316.getClass(), "parent", null);
        setField(term1313, term1313.getClass(), "propertyNode", term1316);
        Object term1319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1319, term1319.getClass(), "propertyName", "");
        setField(term1319, term1319.getClass(), "type", null);
        setBooleanField(term1319, term1319.getClass(), "inferred", false);
        setField(term1319, term1319.getClass(), "propertyNode", null);
        Object term1322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1322, term1322.getClass(), "propertyName", null);
        setField(term1322, term1322.getClass(), "type", null);
        setBooleanField(term1322, term1322.getClass(), "inferred", false);
        setField(term1322, term1322.getClass(), "propertyNode", null);
        Object term1324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1324, term1324.getClass(), "propertyName", null);
        setField(term1324, term1324.getClass(), "type", null);
        setBooleanField(term1324, term1324.getClass(), "inferred", false);
        setField(term1324, term1324.getClass(), "propertyNode", null);
        Object term1326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1326, term1326.getClass(), "propertyName", null);
        setField(term1326, term1326.getClass(), "type", null);
        setBooleanField(term1326, term1326.getClass(), "inferred", false);
        setField(term1326, term1326.getClass(), "propertyNode", null);
        Object term1328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1328, term1328.getClass(), "propertyName", null);
        setField(term1328, term1328.getClass(), "type", null);
        setBooleanField(term1328, term1328.getClass(), "inferred", false);
        setField(term1328, term1328.getClass(), "propertyNode", null);
        ArrayList term1311 = new ArrayList();
        ((ArrayList) term1311).add(term1313);
        ((ArrayList) term1311).add(term1319);
        ((ArrayList) term1311).add(term1322);
        ((ArrayList) term1311).add(term1324);
        ((ArrayList) term1311).add(term1326);
        ((ArrayList) term1311).add(term1328);
        term1284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1284, term1284.getClass(), "reference", "ZVecLZMLHF");
        setField(term1284, term1284.getClass(), "sourceName", "fztQhjqwdP");
        setIntField(term1284, term1284.getClass(), "lineno", 972867650);
        setIntField(term1284, term1284.getClass(), "charno", 1655935355);
        setField(term1284, term1284.getClass(), "validator", null);
        setField(term1284, term1284.getClass(), "propertyContinuations", term1311);
        setField(term1284, term1284.getClass(), "referencedType", null);
        setField(term1284, term1284.getClass(), "referencedObjType", null);
        setBooleanField(term1284, term1284.getClass(), "visited", false);
        setField(term1284, term1284.getClass(), "docInfo", null);
        setBooleanField(term1284, term1284.getClass(), "unknown", false);
        setBooleanField(term1284, term1284.getClass(), "resolved", false);
        setField(term1284, term1284.getClass(), "resolveResult", null);
        setField(term1284, term1284.getClass(), "templateKeys", null);
        setField(term1284, term1284.getClass(), "templatizedTypes", null);
        setBooleanField(term1284, term1284.getClass(), "inTemplatedCheckVisit", false);
        setField(term1284, term1284.getClass(), "registry", null);
        Object term5080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term5082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5080, term5080.getClass(), "propertyName", "");
        setField(term5080, term5080.getClass(), "type", null);
        setBooleanField(term5080, term5080.getClass(), "inferred", true);
        setIntField(term5082, term5082.getClass(), "type", -481533957);
        setField(term5082, term5082.getClass(), "next", null);
        setField(term5082, term5082.getClass(), "first", null);
        setField(term5082, term5082.getClass(), "last", null);
        setField(term5082, term5082.getClass(), "propListHead", null);
        setIntField(term5082, term5082.getClass(), "sourcePosition", 0);
        setField(term5082, term5082.getClass(), "jsType", null);
        setField(term5082, term5082.getClass(), "parent", null);
        setField(term5080, term5080.getClass(), "propertyNode", term5082);
        Object term5083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term5083, term5083.getClass(), "propertyName", "");
        setField(term5083, term5083.getClass(), "type", null);
        setBooleanField(term5083, term5083.getClass(), "inferred", false);
        setField(term5083, term5083.getClass(), "propertyNode", null);
        Object term5085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term5085, term5085.getClass(), "propertyName", null);
        setField(term5085, term5085.getClass(), "type", null);
        setBooleanField(term5085, term5085.getClass(), "inferred", false);
        setField(term5085, term5085.getClass(), "propertyNode", null);
        Object term5086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term5086, term5086.getClass(), "propertyName", null);
        setField(term5086, term5086.getClass(), "type", null);
        setBooleanField(term5086, term5086.getClass(), "inferred", false);
        setField(term5086, term5086.getClass(), "propertyNode", null);
        Object term5087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term5087, term5087.getClass(), "propertyName", null);
        setField(term5087, term5087.getClass(), "type", null);
        setBooleanField(term5087, term5087.getClass(), "inferred", false);
        setField(term5087, term5087.getClass(), "propertyNode", null);
        Object term5088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term5088, term5088.getClass(), "propertyName", null);
        setField(term5088, term5088.getClass(), "type", null);
        setBooleanField(term5088, term5088.getClass(), "inferred", false);
        setField(term5088, term5088.getClass(), "propertyNode", null);
        ArrayList term5078 = new ArrayList();
        ((ArrayList) term5078).add(term5080);
        ((ArrayList) term5078).add(term5083);
        ((ArrayList) term5078).add(term5085);
        ((ArrayList) term5078).add(term5086);
        ((ArrayList) term5078).add(term5087);
        ((ArrayList) term5078).add(term5088);
        term5073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term5073, term5073.getClass(), "reference", "ZVecLZMLHF");
        setField(term5073, term5073.getClass(), "sourceName", "fztQhjqwdP");
        setIntField(term5073, term5073.getClass(), "lineno", 972867650);
        setIntField(term5073, term5073.getClass(), "charno", 1655935355);
        setField(term5073, term5073.getClass(), "validator", null);
        setField(term5073, term5073.getClass(), "propertyContinuations", term5078);
        setField(term5073, term5073.getClass(), "referencedType", null);
        setField(term5073, term5073.getClass(), "referencedObjType", null);
        setBooleanField(term5073, term5073.getClass(), "visited", false);
        setField(term5073, term5073.getClass(), "docInfo", null);
        setBooleanField(term5073, term5073.getClass(), "unknown", false);
        setBooleanField(term5073, term5073.getClass(), "resolved", false);
        setField(term5073, term5073.getClass(), "resolveResult", null);
        setField(term5073, term5073.getClass(), "templateKeys", null);
        setField(term5073, term5073.getClass(), "templatizedTypes", null);
        setBooleanField(term5073, term5073.getClass(), "inTemplatedCheckVisit", false);
        setField(term5073, term5073.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term1284, args);
        assertTrue(recursiveEquals(term1284, term5073));
        assertTrue(recursiveEquals(retValue, -1468569915));
    }

};


