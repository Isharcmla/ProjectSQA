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

public class NamedType_setValidator_74406016039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2522;
     Object term8196;

    public NamedType_setValidator_74406016039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term2554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2551, term2551.getClass(), "propertyName", "");
        setField(term2551, term2551.getClass(), "type", null);
        setBooleanField(term2551, term2551.getClass(), "inferred", true);
        setIntField(term2554, term2554.getClass(), "type", 1283079251);
        setField(term2554, term2554.getClass(), "next", null);
        setField(term2554, term2554.getClass(), "first", null);
        setField(term2554, term2554.getClass(), "last", null);
        setField(term2554, term2554.getClass(), "propListHead", null);
        setIntField(term2554, term2554.getClass(), "sourcePosition", 0);
        setField(term2554, term2554.getClass(), "jsType", null);
        setField(term2554, term2554.getClass(), "parent", null);
        setField(term2551, term2551.getClass(), "propertyNode", term2554);
        Object term2557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2557, term2557.getClass(), "propertyName", "");
        setField(term2557, term2557.getClass(), "type", null);
        setBooleanField(term2557, term2557.getClass(), "inferred", false);
        setField(term2557, term2557.getClass(), "propertyNode", null);
        Object term2560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2560, term2560.getClass(), "propertyName", null);
        setField(term2560, term2560.getClass(), "type", null);
        setBooleanField(term2560, term2560.getClass(), "inferred", false);
        setField(term2560, term2560.getClass(), "propertyNode", null);
        Object term2562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2562, term2562.getClass(), "propertyName", null);
        setField(term2562, term2562.getClass(), "type", null);
        setBooleanField(term2562, term2562.getClass(), "inferred", false);
        setField(term2562, term2562.getClass(), "propertyNode", null);
        Object term2564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2564, term2564.getClass(), "propertyName", null);
        setField(term2564, term2564.getClass(), "type", null);
        setBooleanField(term2564, term2564.getClass(), "inferred", false);
        setField(term2564, term2564.getClass(), "propertyNode", null);
        Object term2566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2566, term2566.getClass(), "propertyName", null);
        setField(term2566, term2566.getClass(), "type", null);
        setBooleanField(term2566, term2566.getClass(), "inferred", false);
        setField(term2566, term2566.getClass(), "propertyNode", null);
        Object term2568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term2568, term2568.getClass(), "propertyName", null);
        setField(term2568, term2568.getClass(), "type", null);
        setBooleanField(term2568, term2568.getClass(), "inferred", false);
        setField(term2568, term2568.getClass(), "propertyNode", null);
        ArrayList term2549 = new ArrayList();
        ((ArrayList) term2549).add(term2551);
        ((ArrayList) term2549).add(term2557);
        ((ArrayList) term2549).add(term2560);
        ((ArrayList) term2549).add(term2562);
        ((ArrayList) term2549).add(term2564);
        ((ArrayList) term2549).add(term2566);
        ((ArrayList) term2549).add(term2568);
        term2522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term2522, term2522.getClass(), "reference", "lihXWlGDxk");
        setField(term2522, term2522.getClass(), "sourceName", "JmcmxoGhIK");
        setIntField(term2522, term2522.getClass(), "lineno", 11724947);
        setIntField(term2522, term2522.getClass(), "charno", 1953277050);
        setField(term2522, term2522.getClass(), "validator", null);
        setField(term2522, term2522.getClass(), "propertyContinuations", term2549);
        setField(term2522, term2522.getClass(), "referencedType", null);
        setField(term2522, term2522.getClass(), "referencedObjType", null);
        setBooleanField(term2522, term2522.getClass(), "visited", false);
        setField(term2522, term2522.getClass(), "docInfo", null);
        setBooleanField(term2522, term2522.getClass(), "unknown", false);
        setBooleanField(term2522, term2522.getClass(), "resolved", false);
        setField(term2522, term2522.getClass(), "resolveResult", null);
        setField(term2522, term2522.getClass(), "templateKeys", null);
        setField(term2522, term2522.getClass(), "templatizedTypes", null);
        setBooleanField(term2522, term2522.getClass(), "inTemplatedCheckVisit", false);
        setField(term2522, term2522.getClass(), "registry", null);
        Object term8203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        Object term8205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term8203, term8203.getClass(), "propertyName", "");
        setField(term8203, term8203.getClass(), "type", null);
        setBooleanField(term8203, term8203.getClass(), "inferred", true);
        setIntField(term8205, term8205.getClass(), "type", 1283079251);
        setField(term8205, term8205.getClass(), "next", null);
        setField(term8205, term8205.getClass(), "first", null);
        setField(term8205, term8205.getClass(), "last", null);
        setField(term8205, term8205.getClass(), "propListHead", null);
        setIntField(term8205, term8205.getClass(), "sourcePosition", 0);
        setField(term8205, term8205.getClass(), "jsType", null);
        setField(term8205, term8205.getClass(), "parent", null);
        setField(term8203, term8203.getClass(), "propertyNode", term8205);
        Object term8206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term8206, term8206.getClass(), "propertyName", "");
        setField(term8206, term8206.getClass(), "type", null);
        setBooleanField(term8206, term8206.getClass(), "inferred", false);
        setField(term8206, term8206.getClass(), "propertyNode", null);
        Object term8208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term8208, term8208.getClass(), "propertyName", null);
        setField(term8208, term8208.getClass(), "type", null);
        setBooleanField(term8208, term8208.getClass(), "inferred", false);
        setField(term8208, term8208.getClass(), "propertyNode", null);
        Object term8209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term8209, term8209.getClass(), "propertyName", null);
        setField(term8209, term8209.getClass(), "type", null);
        setBooleanField(term8209, term8209.getClass(), "inferred", false);
        setField(term8209, term8209.getClass(), "propertyNode", null);
        Object term8210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term8210, term8210.getClass(), "propertyName", null);
        setField(term8210, term8210.getClass(), "type", null);
        setBooleanField(term8210, term8210.getClass(), "inferred", false);
        setField(term8210, term8210.getClass(), "propertyNode", null);
        Object term8211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term8211, term8211.getClass(), "propertyName", null);
        setField(term8211, term8211.getClass(), "type", null);
        setBooleanField(term8211, term8211.getClass(), "inferred", false);
        setField(term8211, term8211.getClass(), "propertyNode", null);
        Object term8212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term8212, term8212.getClass(), "propertyName", null);
        setField(term8212, term8212.getClass(), "type", null);
        setBooleanField(term8212, term8212.getClass(), "inferred", false);
        setField(term8212, term8212.getClass(), "propertyNode", null);
        ArrayList term8201 = new ArrayList();
        ((ArrayList) term8201).add(term8203);
        ((ArrayList) term8201).add(term8206);
        ((ArrayList) term8201).add(term8208);
        ((ArrayList) term8201).add(term8209);
        ((ArrayList) term8201).add(term8210);
        ((ArrayList) term8201).add(term8211);
        ((ArrayList) term8201).add(term8212);
        term8196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term8196, term8196.getClass(), "reference", "lihXWlGDxk");
        setField(term8196, term8196.getClass(), "sourceName", "JmcmxoGhIK");
        setIntField(term8196, term8196.getClass(), "lineno", 11724947);
        setIntField(term8196, term8196.getClass(), "charno", 1953277050);
        setField(term8196, term8196.getClass(), "validator", null);
        setField(term8196, term8196.getClass(), "propertyContinuations", term8201);
        setField(term8196, term8196.getClass(), "referencedType", null);
        setField(term8196, term8196.getClass(), "referencedObjType", null);
        setBooleanField(term8196, term8196.getClass(), "visited", false);
        setField(term8196, term8196.getClass(), "docInfo", null);
        setBooleanField(term8196, term8196.getClass(), "unknown", false);
        setBooleanField(term8196, term8196.getClass(), "resolved", false);
        setField(term8196, term8196.getClass(), "resolveResult", null);
        setField(term8196, term8196.getClass(), "templateKeys", null);
        setField(term8196, term8196.getClass(), "templatizedTypes", null);
        setBooleanField(term8196, term8196.getClass(), "inTemplatedCheckVisit", false);
        setField(term8196, term8196.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setValidator", argTypes, term2522, args);
        assertTrue(recursiveEquals(term2522, term8196));
    }

};


