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

public class NamedType_lookupViaProperties_209659290569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13165;
     Object term13214;

    public NamedType_lookupViaProperties_209659290569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13165 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term13165, term13165.getClass(), "reference", "");
        term13214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term13214, term13214.getClass(), "reference", "");
        setField(term13214, term13214.getClass(), "sourceName", null);
        setIntField(term13214, term13214.getClass(), "lineno", 0);
        setIntField(term13214, term13214.getClass(), "charno", 0);
        setField(term13214, term13214.getClass(), "validator", null);
        setField(term13214, term13214.getClass(), "propertyContinuations", null);
        setField(term13214, term13214.getClass(), "referencedType", null);
        setField(term13214, term13214.getClass(), "referencedObjType", null);
        setBooleanField(term13214, term13214.getClass(), "visited", false);
        setField(term13214, term13214.getClass(), "docInfo", null);
        setBooleanField(term13214, term13214.getClass(), "unknown", false);
        setBooleanField(term13214, term13214.getClass(), "resolved", false);
        setField(term13214, term13214.getClass(), "resolveResult", null);
        setField(term13214, term13214.getClass(), "templateKeys", null);
        setField(term13214, term13214.getClass(), "templatizedTypes", null);
        setBooleanField(term13214, term13214.getClass(), "inTemplatedCheckVisit", false);
        setField(term13214, term13214.getClass(), "registry", null);
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
        Object retValue = callMethod(klass, "lookupViaProperties", argTypes, term13165, args);
        assertTrue(recursiveEquals(term13165, term13214));
        assertTrue(recursiveEquals(retValue, null));
    }

};


