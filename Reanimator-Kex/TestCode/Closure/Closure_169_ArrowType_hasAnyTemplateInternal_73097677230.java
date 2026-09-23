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
import java.lang.Object;

public class ArrowType_hasAnyTemplateInternal_73097677230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626;

    public ArrowType_hasAnyTemplateInternal_73097677230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term627, term627.getClass(), "type", 11724947);
        setIntField(term629, term629.getClass(), "type", 1953277050);
        setIntField(term631, term631.getClass(), "type", 1283079251);
        setIntField(term633, term633.getClass(), "type", -523949691);
        setField(term633, term633.getClass(), "next", null);
        setField(term633, term633.getClass(), "first", null);
        setField(term633, term633.getClass(), "last", null);
        setField(term633, term633.getClass(), "propListHead", null);
        setIntField(term633, term633.getClass(), "sourcePosition", 0);
        setField(term633, term633.getClass(), "jsType", null);
        setField(term633, term633.getClass(), "parent", null);
        setField(term631, term631.getClass(), "next", term633);
        setIntField(term636, term636.getClass(), "type", -243422082);
        setField(term636, term636.getClass(), "next", null);
        setField(term636, term636.getClass(), "first", term627);
        setField(term636, term636.getClass(), "last", null);
        setField(term636, term636.getClass(), "propListHead", null);
        setIntField(term636, term636.getClass(), "sourcePosition", 0);
        setField(term636, term636.getClass(), "jsType", null);
        setField(term636, term636.getClass(), "parent", null);
        setField(term631, term631.getClass(), "first", term636);
        setIntField(term639, term639.getClass(), "type", 229204365);
        setField(term639, term639.getClass(), "next", null);
        setField(term639, term639.getClass(), "first", term629);
        setField(term639, term639.getClass(), "last", null);
        setField(term639, term639.getClass(), "propListHead", null);
        setIntField(term639, term639.getClass(), "sourcePosition", 0);
        setField(term639, term639.getClass(), "jsType", null);
        setField(term639, term639.getClass(), "parent", null);
        setField(term631, term631.getClass(), "last", term639);
        setField(term631, term631.getClass(), "propListHead", null);
        setIntField(term631, term631.getClass(), "sourcePosition", 0);
        setField(term631, term631.getClass(), "jsType", null);
        setField(term631, term631.getClass(), "parent", null);
        setField(term629, term629.getClass(), "next", term631);
        setField(term629, term629.getClass(), "first", term631);
        setIntField(term643, term643.getClass(), "type", 1398204340);
        setField(term643, term643.getClass(), "next", term639);
        setField(term643, term643.getClass(), "first", term636);
        setField(term643, term643.getClass(), "last", term636);
        setField(term643, term643.getClass(), "propListHead", null);
        setIntField(term643, term643.getClass(), "sourcePosition", 0);
        setField(term643, term643.getClass(), "jsType", null);
        setField(term643, term643.getClass(), "parent", null);
        setField(term629, term629.getClass(), "last", term643);
        setField(term629, term629.getClass(), "propListHead", null);
        setIntField(term629, term629.getClass(), "sourcePosition", 0);
        setField(term629, term629.getClass(), "jsType", null);
        setField(term629, term629.getClass(), "parent", null);
        setField(term627, term627.getClass(), "next", term629);
        setField(term627, term627.getClass(), "first", term636);
        setIntField(term647, term647.getClass(), "type", 0);
        setField(term647, term647.getClass(), "next", null);
        setField(term647, term647.getClass(), "first", null);
        setField(term647, term647.getClass(), "last", null);
        setField(term647, term647.getClass(), "propListHead", null);
        setIntField(term647, term647.getClass(), "sourcePosition", 0);
        setField(term647, term647.getClass(), "jsType", null);
        setField(term647, term647.getClass(), "parent", null);
        setField(term627, term627.getClass(), "last", term647);
        setField(term627, term627.getClass(), "propListHead", null);
        setIntField(term627, term627.getClass(), "sourcePosition", 0);
        setField(term627, term627.getClass(), "jsType", null);
        setField(term627, term627.getClass(), "parent", null);
        setField(term626, term626.getClass(), "parameters", term627);
        setField(term626, term626.getClass(), "returnType", null);
        setBooleanField(term626, term626.getClass(), "returnTypeInferred", false);
        setBooleanField(term626, term626.getClass(), "resolved", false);
        setField(term626, term626.getClass(), "resolveResult", null);
        setBooleanField(term626, term626.getClass(), "inTemplatedCheckVisit", false);
        setField(term626, term626.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasAnyTemplateInternal", argTypes, term626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


