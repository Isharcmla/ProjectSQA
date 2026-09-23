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

public class NamedType_defineProperty_34641856775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13952;
     Object term14096;

    public NamedType_defineProperty_34641856775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term14046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setBooleanField(term13952, term13952.getClass(), "resolved", true);
        setField(term13952, term13952.getClass(), "referencedObjType", term14046);
        Object term14100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType$PropertyContinuation"));
        setField(term14100, term14100.getClass(), "propertyName", null);
        setField(term14100, term14100.getClass(), "type", null);
        setBooleanField(term14100, term14100.getClass(), "inferred", false);
        setField(term14100, term14100.getClass(), "propertyNode", null);
        ArrayList term14098 = new ArrayList();
        ((ArrayList) term14098).add(term14100);
        term14096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term14097 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term14096, term14096.getClass(), "reference", null);
        setField(term14096, term14096.getClass(), "sourceName", null);
        setIntField(term14096, term14096.getClass(), "lineno", 0);
        setIntField(term14096, term14096.getClass(), "charno", 0);
        setField(term14096, term14096.getClass(), "validator", null);
        setField(term14096, term14096.getClass(), "propertyContinuations", null);
        setField(term14096, term14096.getClass(), "referencedType", null);
        setField(term14097, term14097.getClass(), "reference", null);
        setField(term14097, term14097.getClass(), "sourceName", null);
        setIntField(term14097, term14097.getClass(), "lineno", 0);
        setIntField(term14097, term14097.getClass(), "charno", 0);
        setField(term14097, term14097.getClass(), "validator", null);
        setField(term14097, term14097.getClass(), "propertyContinuations", term14098);
        setField(term14097, term14097.getClass(), "referencedType", null);
        setField(term14097, term14097.getClass(), "referencedObjType", null);
        setBooleanField(term14097, term14097.getClass(), "visited", false);
        setField(term14097, term14097.getClass(), "docInfo", null);
        setBooleanField(term14097, term14097.getClass(), "unknown", false);
        setBooleanField(term14097, term14097.getClass(), "resolved", false);
        setField(term14097, term14097.getClass(), "resolveResult", null);
        setField(term14097, term14097.getClass(), "templateKeys", null);
        setField(term14097, term14097.getClass(), "templatizedTypes", null);
        setBooleanField(term14097, term14097.getClass(), "inTemplatedCheckVisit", false);
        setField(term14097, term14097.getClass(), "registry", null);
        setField(term14096, term14096.getClass(), "referencedObjType", term14097);
        setBooleanField(term14096, term14096.getClass(), "visited", false);
        setField(term14096, term14096.getClass(), "docInfo", null);
        setBooleanField(term14096, term14096.getClass(), "unknown", false);
        setBooleanField(term14096, term14096.getClass(), "resolved", true);
        setField(term14096, term14096.getClass(), "resolveResult", null);
        setField(term14096, term14096.getClass(), "templateKeys", null);
        setField(term14096, term14096.getClass(), "templatizedTypes", null);
        setBooleanField(term14096, term14096.getClass(), "inTemplatedCheckVisit", false);
        setField(term14096, term14096.getClass(), "registry", null);
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
        Object retValue = callMethod(klass, "defineProperty", argTypes, term13952, args);
        assertTrue(recursiveEquals(term13952, term14096));
        assertTrue(recursiveEquals(retValue, true));
    }

};


