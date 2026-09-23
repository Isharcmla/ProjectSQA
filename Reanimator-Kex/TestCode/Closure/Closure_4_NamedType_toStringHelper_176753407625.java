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
import java.lang.Boolean;

public class NamedType_toStringHelper_176753407625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1006;
     Object term1052;
     Object term4636;

    public NamedType_toStringHelper_176753407625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term1038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1035, term1035.getClass(), "propertyName", "");
        setField(term1035, term1035.getClass(), "type", null);
        setBooleanField(term1035, term1035.getClass(), "inferred", true);
        setIntField(term1038, term1038.getClass(), "type", 1632125673);
        setField(term1038, term1038.getClass(), "next", null);
        setField(term1038, term1038.getClass(), "first", null);
        setField(term1038, term1038.getClass(), "last", null);
        setField(term1038, term1038.getClass(), "propListHead", null);
        setIntField(term1038, term1038.getClass(), "sourcePosition", 0);
        setField(term1038, term1038.getClass(), "jsType", null);
        setField(term1038, term1038.getClass(), "parent", null);
        setField(term1035, term1035.getClass(), "propertyNode", term1038);
        Object term1041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1041, term1041.getClass(), "propertyName", "");
        setField(term1041, term1041.getClass(), "type", null);
        setBooleanField(term1041, term1041.getClass(), "inferred", false);
        setField(term1041, term1041.getClass(), "propertyNode", null);
        Object term1044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term1044, term1044.getClass(), "propertyName", null);
        setField(term1044, term1044.getClass(), "type", null);
        setBooleanField(term1044, term1044.getClass(), "inferred", false);
        setField(term1044, term1044.getClass(), "propertyNode", null);
        ArrayList term1033 = new ArrayList();
        ((ArrayList) term1033).add(term1035);
        ((ArrayList) term1033).add(term1041);
        ((ArrayList) term1033).add(term1044);
        term1006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1006, term1006.getClass(), "reference", "GVizqqzXpy");
        setField(term1006, term1006.getClass(), "sourceName", "JqXGgAhZPl");
        setIntField(term1006, term1006.getClass(), "lineno", 579005622);
        setIntField(term1006, term1006.getClass(), "charno", -14890619);
        setField(term1006, term1006.getClass(), "validator", null);
        setField(term1006, term1006.getClass(), "propertyContinuations", term1033);
        setField(term1006, term1006.getClass(), "referencedType", null);
        setField(term1006, term1006.getClass(), "referencedObjType", null);
        setBooleanField(term1006, term1006.getClass(), "visited", false);
        setField(term1006, term1006.getClass(), "docInfo", null);
        setBooleanField(term1006, term1006.getClass(), "unknown", false);
        setBooleanField(term1006, term1006.getClass(), "resolved", false);
        setField(term1006, term1006.getClass(), "resolveResult", null);
        setField(term1006, term1006.getClass(), "templateKeys", null);
        setField(term1006, term1006.getClass(), "templatizedTypes", null);
        setBooleanField(term1006, term1006.getClass(), "inTemplatedCheckVisit", false);
        setField(term1006, term1006.getClass(), "registry", null);
        term1052 = new Boolean(false);
        Object term4643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term4645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4643, term4643.getClass(), "propertyName", "");
        setField(term4643, term4643.getClass(), "type", null);
        setBooleanField(term4643, term4643.getClass(), "inferred", true);
        setIntField(term4645, term4645.getClass(), "type", 1632125673);
        setField(term4645, term4645.getClass(), "next", null);
        setField(term4645, term4645.getClass(), "first", null);
        setField(term4645, term4645.getClass(), "last", null);
        setField(term4645, term4645.getClass(), "propListHead", null);
        setIntField(term4645, term4645.getClass(), "sourcePosition", 0);
        setField(term4645, term4645.getClass(), "jsType", null);
        setField(term4645, term4645.getClass(), "parent", null);
        setField(term4643, term4643.getClass(), "propertyNode", term4645);
        Object term4646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4646, term4646.getClass(), "propertyName", "");
        setField(term4646, term4646.getClass(), "type", null);
        setBooleanField(term4646, term4646.getClass(), "inferred", false);
        setField(term4646, term4646.getClass(), "propertyNode", null);
        Object term4648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term4648, term4648.getClass(), "propertyName", null);
        setField(term4648, term4648.getClass(), "type", null);
        setBooleanField(term4648, term4648.getClass(), "inferred", false);
        setField(term4648, term4648.getClass(), "propertyNode", null);
        ArrayList term4641 = new ArrayList();
        ((ArrayList) term4641).add(term4643);
        ((ArrayList) term4641).add(term4646);
        ((ArrayList) term4641).add(term4648);
        term4636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term4636, term4636.getClass(), "reference", "GVizqqzXpy");
        setField(term4636, term4636.getClass(), "sourceName", "JqXGgAhZPl");
        setIntField(term4636, term4636.getClass(), "lineno", 579005622);
        setIntField(term4636, term4636.getClass(), "charno", -14890619);
        setField(term4636, term4636.getClass(), "validator", null);
        setField(term4636, term4636.getClass(), "propertyContinuations", term4641);
        setField(term4636, term4636.getClass(), "referencedType", null);
        setField(term4636, term4636.getClass(), "referencedObjType", null);
        setBooleanField(term4636, term4636.getClass(), "visited", false);
        setField(term4636, term4636.getClass(), "docInfo", null);
        setBooleanField(term4636, term4636.getClass(), "unknown", false);
        setBooleanField(term4636, term4636.getClass(), "resolved", false);
        setField(term4636, term4636.getClass(), "resolveResult", null);
        setField(term4636, term4636.getClass(), "templateKeys", null);
        setField(term4636, term4636.getClass(), "templatizedTypes", null);
        setBooleanField(term4636, term4636.getClass(), "inTemplatedCheckVisit", false);
        setField(term4636, term4636.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1052;
        Object retValue = callMethod(klass, "toStringHelper", argTypes, term1006, args);
        assertTrue(recursiveEquals(term1006, term4636));
        assertTrue(recursiveEquals(term1052, false));
        assertTrue(recursiveEquals(retValue, "GVizqqzXpy"));
    }

};


