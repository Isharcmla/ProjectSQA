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

public class TypeCheck_visitName_1546932345600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161709;
     Object term161908;
     Object term162012;
     Object term162013;
     Object term162015;

    public TypeCheck_visitName_1546932345600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161709 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term161908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term161955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term161908, term161908.getClass(), "type", 0);
        setField(term161908, term161908.getClass(), "jsType", term161955);
        term162012 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term162012, term162012.getClass(), "compiler", null);
        setField(term162012, term162012.getClass(), "validator", null);
        setField(term162012, term162012.getClass(), "reverseInterpreter", null);
        setField(term162012, term162012.getClass(), "typeRegistry", null);
        setField(term162012, term162012.getClass(), "topScope", null);
        setField(term162012, term162012.getClass(), "scopeCreator", null);
        setField(term162012, term162012.getClass(), "reportMissingOverride", null);
        setField(term162012, term162012.getClass(), "reportUnknownTypes", null);
        setBooleanField(term162012, term162012.getClass(), "reportMissingProperties", false);
        setField(term162012, term162012.getClass(), "inferJSDocInfo", null);
        setIntField(term162012, term162012.getClass(), "typedCount", 0);
        setIntField(term162012, term162012.getClass(), "nullCount", 0);
        setIntField(term162012, term162012.getClass(), "unknownCount", 0);
        setBooleanField(term162012, term162012.getClass(), "inExterns", false);
        setIntField(term162012, term162012.getClass(), "noTypeCheckSection", 0);
        term162013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term162013, term162013.getClass(), "type", 0);
        setField(term162013, term162013.getClass(), "next", null);
        setField(term162013, term162013.getClass(), "first", null);
        setField(term162013, term162013.getClass(), "last", null);
        setField(term162013, term162013.getClass(), "propListHead", null);
        setIntField(term162013, term162013.getClass(), "sourcePosition", 0);
        setField(term162014, term162014.getClass(), "reference", null);
        setField(term162014, term162014.getClass(), "sourceName", null);
        setIntField(term162014, term162014.getClass(), "lineno", 0);
        setIntField(term162014, term162014.getClass(), "charno", 0);
        setField(term162014, term162014.getClass(), "validator", null);
        setField(term162014, term162014.getClass(), "propertyContinuations", null);
        setField(term162014, term162014.getClass(), "referencedType", null);
        setField(term162014, term162014.getClass(), "referencedObjType", null);
        setBooleanField(term162014, term162014.getClass(), "visited", false);
        setField(term162014, term162014.getClass(), "docInfo", null);
        setBooleanField(term162014, term162014.getClass(), "unknown", false);
        setBooleanField(term162014, term162014.getClass(), "resolved", false);
        setField(term162014, term162014.getClass(), "resolveResult", null);
        setField(term162014, term162014.getClass(), "templateKeys", null);
        setField(term162014, term162014.getClass(), "templatizedTypes", null);
        setBooleanField(term162014, term162014.getClass(), "inTemplatedCheckVisit", false);
        setField(term162014, term162014.getClass(), "registry", null);
        setField(term162013, term162013.getClass(), "jsType", term162014);
        setField(term162013, term162013.getClass(), "parent", null);
        term162015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term162015, term162015.getClass(), "type", 0);
        setField(term162015, term162015.getClass(), "next", null);
        setField(term162015, term162015.getClass(), "first", null);
        setField(term162015, term162015.getClass(), "last", null);
        setField(term162015, term162015.getClass(), "propListHead", null);
        setIntField(term162015, term162015.getClass(), "sourcePosition", 0);
        setField(term162016, term162016.getClass(), "reference", null);
        setField(term162016, term162016.getClass(), "sourceName", null);
        setIntField(term162016, term162016.getClass(), "lineno", 0);
        setIntField(term162016, term162016.getClass(), "charno", 0);
        setField(term162016, term162016.getClass(), "validator", null);
        setField(term162016, term162016.getClass(), "propertyContinuations", null);
        setField(term162016, term162016.getClass(), "referencedType", null);
        setField(term162016, term162016.getClass(), "referencedObjType", null);
        setBooleanField(term162016, term162016.getClass(), "visited", false);
        setField(term162016, term162016.getClass(), "docInfo", null);
        setBooleanField(term162016, term162016.getClass(), "unknown", false);
        setBooleanField(term162016, term162016.getClass(), "resolved", false);
        setField(term162016, term162016.getClass(), "resolveResult", null);
        setField(term162016, term162016.getClass(), "templateKeys", null);
        setField(term162016, term162016.getClass(), "templatizedTypes", null);
        setBooleanField(term162016, term162016.getClass(), "inTemplatedCheckVisit", false);
        setField(term162016, term162016.getClass(), "registry", null);
        setField(term162015, term162015.getClass(), "jsType", term162016);
        setField(term162015, term162015.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term161908;
        args[2] = term161908;
        Object retValue = callMethod(klass, "visitName", argTypes, term161709, args);
        assertTrue(recursiveEquals(term161709, term162012));
        assertTrue(recursiveEquals(term161908, term162015));
        assertTrue(recursiveEquals(term161908, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


