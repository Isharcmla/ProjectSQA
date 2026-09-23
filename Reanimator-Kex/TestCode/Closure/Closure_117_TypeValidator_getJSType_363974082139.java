package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class TypeValidator_getJSType_363974082139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48108;
     Object term48178;
     Object term48683;
     Object term48684;
     Object term48675;

    public TypeValidator_getJSType_363974082139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48108 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term48178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term48178, term48178.getClass(), "jsType", term48284);
        term48683 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term48683, term48683.getClass(), "compiler", null);
        setField(term48683, term48683.getClass(), "typeRegistry", null);
        setField(term48683, term48683.getClass(), "allValueTypes", null);
        setBooleanField(term48683, term48683.getClass(), "shouldReport", false);
        setField(term48683, term48683.getClass(), "nullOrUndefined", null);
        setField(term48683, term48683.getClass(), "mismatches", null);
        term48684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term48684, term48684.getClass(), "type", 0);
        setField(term48684, term48684.getClass(), "next", null);
        setField(term48684, term48684.getClass(), "first", null);
        setField(term48684, term48684.getClass(), "last", null);
        setField(term48684, term48684.getClass(), "propListHead", null);
        setIntField(term48684, term48684.getClass(), "sourcePosition", 0);
        setField(term48685, term48685.getClass(), "referencedType", null);
        setField(term48685, term48685.getClass(), "referencedObjType", null);
        setBooleanField(term48685, term48685.getClass(), "visited", false);
        setField(term48685, term48685.getClass(), "docInfo", null);
        setBooleanField(term48685, term48685.getClass(), "unknown", false);
        setBooleanField(term48685, term48685.getClass(), "resolved", false);
        setField(term48685, term48685.getClass(), "resolveResult", null);
        setField(term48685, term48685.getClass(), "templateTypeMap", null);
        setBooleanField(term48685, term48685.getClass(), "inTemplatedCheckVisit", false);
        setField(term48685, term48685.getClass(), "registry", null);
        setField(term48684, term48684.getClass(), "jsType", term48685);
        setField(term48684, term48684.getClass(), "parent", null);
        term48675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term48675, term48675.getClass(), "referencedType", null);
        setField(term48675, term48675.getClass(), "referencedObjType", null);
        setBooleanField(term48675, term48675.getClass(), "visited", false);
        setField(term48675, term48675.getClass(), "docInfo", null);
        setBooleanField(term48675, term48675.getClass(), "unknown", false);
        setBooleanField(term48675, term48675.getClass(), "resolved", false);
        setField(term48675, term48675.getClass(), "resolveResult", null);
        setField(term48675, term48675.getClass(), "templateTypeMap", null);
        setBooleanField(term48675, term48675.getClass(), "inTemplatedCheckVisit", false);
        setField(term48675, term48675.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48178;
        Object retValue = callMethod(klass, "getJSType", argTypes, term48108, args);
        assertTrue(recursiveEquals(term48108, term48683));
        assertTrue(recursiveEquals(term48178, term48684));
        assertTrue(recursiveEquals(retValue, term48675));
    }

};


