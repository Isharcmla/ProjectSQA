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

public class NamedType_hasReferenceName_143436841526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1074;
     Object term4754;

    public NamedType_hasReferenceName_143436841526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term1106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1103, term1103.getClass(), "propertyName", "");
        setField(term1103, term1103.getClass(), "type", null);
        setBooleanField(term1103, term1103.getClass(), "inferred", false);
        setIntField(term1106, term1106.getClass(), "type", 493620644);
        setField(term1106, term1106.getClass(), "next", null);
        setField(term1106, term1106.getClass(), "first", null);
        setField(term1106, term1106.getClass(), "last", null);
        setField(term1106, term1106.getClass(), "propListHead", null);
        setIntField(term1106, term1106.getClass(), "sourcePosition", 0);
        setField(term1106, term1106.getClass(), "jsType", null);
        setField(term1106, term1106.getClass(), "parent", null);
        setField(term1103, term1103.getClass(), "propertyNode", term1106);
        Object term1109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1109, term1109.getClass(), "propertyName", "");
        setField(term1109, term1109.getClass(), "type", null);
        setBooleanField(term1109, term1109.getClass(), "inferred", false);
        setField(term1109, term1109.getClass(), "propertyNode", null);
        Object term1112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1112, term1112.getClass(), "propertyName", null);
        setField(term1112, term1112.getClass(), "type", null);
        setBooleanField(term1112, term1112.getClass(), "inferred", false);
        setField(term1112, term1112.getClass(), "propertyNode", null);
        Object term1114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1114, term1114.getClass(), "propertyName", null);
        setField(term1114, term1114.getClass(), "type", null);
        setBooleanField(term1114, term1114.getClass(), "inferred", false);
        setField(term1114, term1114.getClass(), "propertyNode", null);
        Object term1116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1116, term1116.getClass(), "propertyName", null);
        setField(term1116, term1116.getClass(), "type", null);
        setBooleanField(term1116, term1116.getClass(), "inferred", false);
        setField(term1116, term1116.getClass(), "propertyNode", null);
        Object term1118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1118, term1118.getClass(), "propertyName", null);
        setField(term1118, term1118.getClass(), "type", null);
        setBooleanField(term1118, term1118.getClass(), "inferred", false);
        setField(term1118, term1118.getClass(), "propertyNode", null);
        Object term1120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1120, term1120.getClass(), "propertyName", null);
        setField(term1120, term1120.getClass(), "type", null);
        setBooleanField(term1120, term1120.getClass(), "inferred", false);
        setField(term1120, term1120.getClass(), "propertyNode", null);
        ArrayList term1101 = new ArrayList();
        ((ArrayList) term1101).add(term1103);
        ((ArrayList) term1101).add(term1109);
        ((ArrayList) term1101).add(term1112);
        ((ArrayList) term1101).add(term1114);
        ((ArrayList) term1101).add(term1116);
        ((ArrayList) term1101).add(term1118);
        ((ArrayList) term1101).add(term1120);
        term1074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1074, term1074.getClass(), "reference", "XqgfKFvPSD");
        setField(term1074, term1074.getClass(), "sourceName", "JiVRgTZvKc");
        setIntField(term1074, term1074.getClass(), "lineno", 458147407);
        setIntField(term1074, term1074.getClass(), "charno", -184153539);
        setField(term1074, term1074.getClass(), "validator", null);
        setField(term1074, term1074.getClass(), "propertyContinuations", term1101);
        setField(term1074, term1074.getClass(), "referencedType", null);
        setField(term1074, term1074.getClass(), "referencedObjType", null);
        setBooleanField(term1074, term1074.getClass(), "visited", false);
        setField(term1074, term1074.getClass(), "docInfo", null);
        setBooleanField(term1074, term1074.getClass(), "unknown", false);
        setBooleanField(term1074, term1074.getClass(), "resolved", false);
        setField(term1074, term1074.getClass(), "resolveResult", null);
        setField(term1074, term1074.getClass(), "templateKeys", null);
        setField(term1074, term1074.getClass(), "templatizedTypes", null);
        setBooleanField(term1074, term1074.getClass(), "inTemplatedCheckVisit", false);
        setField(term1074, term1074.getClass(), "registry", null);
        Object term4761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term4763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4761, term4761.getClass(), "propertyName", "");
        setField(term4761, term4761.getClass(), "type", null);
        setBooleanField(term4761, term4761.getClass(), "inferred", false);
        setIntField(term4763, term4763.getClass(), "type", 493620644);
        setField(term4763, term4763.getClass(), "next", null);
        setField(term4763, term4763.getClass(), "first", null);
        setField(term4763, term4763.getClass(), "last", null);
        setField(term4763, term4763.getClass(), "propListHead", null);
        setIntField(term4763, term4763.getClass(), "sourcePosition", 0);
        setField(term4763, term4763.getClass(), "jsType", null);
        setField(term4763, term4763.getClass(), "parent", null);
        setField(term4761, term4761.getClass(), "propertyNode", term4763);
        Object term4764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4764, term4764.getClass(), "propertyName", "");
        setField(term4764, term4764.getClass(), "type", null);
        setBooleanField(term4764, term4764.getClass(), "inferred", false);
        setField(term4764, term4764.getClass(), "propertyNode", null);
        Object term4766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4766, term4766.getClass(), "propertyName", null);
        setField(term4766, term4766.getClass(), "type", null);
        setBooleanField(term4766, term4766.getClass(), "inferred", false);
        setField(term4766, term4766.getClass(), "propertyNode", null);
        Object term4767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4767, term4767.getClass(), "propertyName", null);
        setField(term4767, term4767.getClass(), "type", null);
        setBooleanField(term4767, term4767.getClass(), "inferred", false);
        setField(term4767, term4767.getClass(), "propertyNode", null);
        Object term4768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4768, term4768.getClass(), "propertyName", null);
        setField(term4768, term4768.getClass(), "type", null);
        setBooleanField(term4768, term4768.getClass(), "inferred", false);
        setField(term4768, term4768.getClass(), "propertyNode", null);
        Object term4769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4769, term4769.getClass(), "propertyName", null);
        setField(term4769, term4769.getClass(), "type", null);
        setBooleanField(term4769, term4769.getClass(), "inferred", false);
        setField(term4769, term4769.getClass(), "propertyNode", null);
        Object term4770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4770, term4770.getClass(), "propertyName", null);
        setField(term4770, term4770.getClass(), "type", null);
        setBooleanField(term4770, term4770.getClass(), "inferred", false);
        setField(term4770, term4770.getClass(), "propertyNode", null);
        ArrayList term4759 = new ArrayList();
        ((ArrayList) term4759).add(term4761);
        ((ArrayList) term4759).add(term4764);
        ((ArrayList) term4759).add(term4766);
        ((ArrayList) term4759).add(term4767);
        ((ArrayList) term4759).add(term4768);
        ((ArrayList) term4759).add(term4769);
        ((ArrayList) term4759).add(term4770);
        term4754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term4754, term4754.getClass(), "reference", "XqgfKFvPSD");
        setField(term4754, term4754.getClass(), "sourceName", "JiVRgTZvKc");
        setIntField(term4754, term4754.getClass(), "lineno", 458147407);
        setIntField(term4754, term4754.getClass(), "charno", -184153539);
        setField(term4754, term4754.getClass(), "validator", null);
        setField(term4754, term4754.getClass(), "propertyContinuations", term4759);
        setField(term4754, term4754.getClass(), "referencedType", null);
        setField(term4754, term4754.getClass(), "referencedObjType", null);
        setBooleanField(term4754, term4754.getClass(), "visited", false);
        setField(term4754, term4754.getClass(), "docInfo", null);
        setBooleanField(term4754, term4754.getClass(), "unknown", false);
        setBooleanField(term4754, term4754.getClass(), "resolved", false);
        setField(term4754, term4754.getClass(), "resolveResult", null);
        setField(term4754, term4754.getClass(), "templateKeys", null);
        setField(term4754, term4754.getClass(), "templatizedTypes", null);
        setBooleanField(term4754, term4754.getClass(), "inTemplatedCheckVisit", false);
        setField(term4754, term4754.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasReferenceName", argTypes, term1074, args);
        assertTrue(recursiveEquals(term1074, term4754));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


