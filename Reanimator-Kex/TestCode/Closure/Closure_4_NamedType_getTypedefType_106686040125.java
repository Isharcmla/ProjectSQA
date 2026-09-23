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

public class NamedType_getTypedefType_106686040125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27010;
     Object term27134;
     Object term27260;
     Object term27261;
     Object term27237;

    public NamedType_getTypedefType_106686040125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term27134 = newInstance(Class.forName("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot"));
        Object term27228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term27134, term27134.getClass(), "type", term27228);
        term27260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term27260, term27260.getClass(), "reference", null);
        setField(term27260, term27260.getClass(), "sourceName", null);
        setIntField(term27260, term27260.getClass(), "lineno", 0);
        setIntField(term27260, term27260.getClass(), "charno", 0);
        setField(term27260, term27260.getClass(), "validator", null);
        setField(term27260, term27260.getClass(), "propertyContinuations", null);
        setField(term27260, term27260.getClass(), "referencedType", null);
        setField(term27260, term27260.getClass(), "referencedObjType", null);
        setBooleanField(term27260, term27260.getClass(), "visited", false);
        setField(term27260, term27260.getClass(), "docInfo", null);
        setBooleanField(term27260, term27260.getClass(), "unknown", false);
        setBooleanField(term27260, term27260.getClass(), "resolved", false);
        setField(term27260, term27260.getClass(), "resolveResult", null);
        setField(term27260, term27260.getClass(), "templateKeys", null);
        setField(term27260, term27260.getClass(), "templatizedTypes", null);
        setBooleanField(term27260, term27260.getClass(), "inTemplatedCheckVisit", false);
        setField(term27260, term27260.getClass(), "registry", null);
        term27261 = newInstance(Class.forName("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot"));
        Object term27262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term27261, term27261.getClass(), "parent", null);
        setField(term27261, term27261.getClass(), "name", null);
        setField(term27262, term27262.getClass(), "reference", null);
        setField(term27262, term27262.getClass(), "sourceName", null);
        setIntField(term27262, term27262.getClass(), "lineno", 0);
        setIntField(term27262, term27262.getClass(), "charno", 0);
        setField(term27262, term27262.getClass(), "validator", null);
        setField(term27262, term27262.getClass(), "propertyContinuations", null);
        setField(term27262, term27262.getClass(), "referencedType", null);
        setField(term27262, term27262.getClass(), "referencedObjType", null);
        setBooleanField(term27262, term27262.getClass(), "visited", false);
        setField(term27262, term27262.getClass(), "docInfo", null);
        setBooleanField(term27262, term27262.getClass(), "unknown", false);
        setBooleanField(term27262, term27262.getClass(), "resolved", false);
        setField(term27262, term27262.getClass(), "resolveResult", null);
        setField(term27262, term27262.getClass(), "templateKeys", null);
        setField(term27262, term27262.getClass(), "templatizedTypes", null);
        setBooleanField(term27262, term27262.getClass(), "inTemplatedCheckVisit", false);
        setField(term27262, term27262.getClass(), "registry", null);
        setField(term27261, term27261.getClass(), "type", term27262);
        setBooleanField(term27261, term27261.getClass(), "inferred", false);
        term27237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term27237, term27237.getClass(), "reference", null);
        setField(term27237, term27237.getClass(), "sourceName", null);
        setIntField(term27237, term27237.getClass(), "lineno", 0);
        setIntField(term27237, term27237.getClass(), "charno", 0);
        setField(term27237, term27237.getClass(), "validator", null);
        setField(term27237, term27237.getClass(), "propertyContinuations", null);
        setField(term27237, term27237.getClass(), "referencedType", null);
        setField(term27237, term27237.getClass(), "referencedObjType", null);
        setBooleanField(term27237, term27237.getClass(), "visited", false);
        setField(term27237, term27237.getClass(), "docInfo", null);
        setBooleanField(term27237, term27237.getClass(), "unknown", false);
        setBooleanField(term27237, term27237.getClass(), "resolved", false);
        setField(term27237, term27237.getClass(), "resolveResult", null);
        setField(term27237, term27237.getClass(), "templateKeys", null);
        setField(term27237, term27237.getClass(), "templatizedTypes", null);
        setBooleanField(term27237, term27237.getClass(), "inTemplatedCheckVisit", false);
        setField(term27237, term27237.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term27134;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term27010, args);
        assertTrue(recursiveEquals(term27010, term27260));
        assertTrue(recursiveEquals(term27134, null));
        assertTrue(recursiveEquals(retValue, term27237));
    }

};


