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

public class NamedType_setReferencedAndResolvedType_101551349067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12897;
     Object term12991;
     Object term13044;
     Object term13046;

    public NamedType_setReferencedAndResolvedType_101551349067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term12897, term12897.getClass(), "validator", null);
        setField(term12897, term12897.getClass(), "referencedType", null);
        term12991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term13044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term13045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term13044, term13044.getClass(), "reference", null);
        setField(term13044, term13044.getClass(), "sourceName", null);
        setIntField(term13044, term13044.getClass(), "lineno", 0);
        setIntField(term13044, term13044.getClass(), "charno", 0);
        setField(term13044, term13044.getClass(), "validator", null);
        setField(term13044, term13044.getClass(), "propertyContinuations", null);
        setField(term13045, term13045.getClass(), "reference", null);
        setField(term13045, term13045.getClass(), "sourceName", null);
        setIntField(term13045, term13045.getClass(), "lineno", 0);
        setIntField(term13045, term13045.getClass(), "charno", 0);
        setField(term13045, term13045.getClass(), "validator", null);
        setField(term13045, term13045.getClass(), "propertyContinuations", null);
        setField(term13045, term13045.getClass(), "referencedType", null);
        setField(term13045, term13045.getClass(), "referencedObjType", null);
        setBooleanField(term13045, term13045.getClass(), "visited", false);
        setField(term13045, term13045.getClass(), "docInfo", null);
        setBooleanField(term13045, term13045.getClass(), "unknown", false);
        setBooleanField(term13045, term13045.getClass(), "resolved", false);
        setField(term13045, term13045.getClass(), "resolveResult", null);
        setField(term13045, term13045.getClass(), "templateKeys", null);
        setField(term13045, term13045.getClass(), "templatizedTypes", null);
        setBooleanField(term13045, term13045.getClass(), "inTemplatedCheckVisit", false);
        setField(term13045, term13045.getClass(), "registry", null);
        setField(term13044, term13044.getClass(), "referencedType", term13045);
        setField(term13044, term13044.getClass(), "referencedObjType", term13045);
        setBooleanField(term13044, term13044.getClass(), "visited", false);
        setField(term13044, term13044.getClass(), "docInfo", null);
        setBooleanField(term13044, term13044.getClass(), "unknown", false);
        setBooleanField(term13044, term13044.getClass(), "resolved", true);
        setField(term13044, term13044.getClass(), "resolveResult", term13045);
        setField(term13044, term13044.getClass(), "templateKeys", null);
        setField(term13044, term13044.getClass(), "templatizedTypes", null);
        setBooleanField(term13044, term13044.getClass(), "inTemplatedCheckVisit", false);
        setField(term13044, term13044.getClass(), "registry", null);
        term13046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term13046, term13046.getClass(), "reference", null);
        setField(term13046, term13046.getClass(), "sourceName", null);
        setIntField(term13046, term13046.getClass(), "lineno", 0);
        setIntField(term13046, term13046.getClass(), "charno", 0);
        setField(term13046, term13046.getClass(), "validator", null);
        setField(term13046, term13046.getClass(), "propertyContinuations", null);
        setField(term13046, term13046.getClass(), "referencedType", null);
        setField(term13046, term13046.getClass(), "referencedObjType", null);
        setBooleanField(term13046, term13046.getClass(), "visited", false);
        setField(term13046, term13046.getClass(), "docInfo", null);
        setBooleanField(term13046, term13046.getClass(), "unknown", false);
        setBooleanField(term13046, term13046.getClass(), "resolved", false);
        setField(term13046, term13046.getClass(), "resolveResult", null);
        setField(term13046, term13046.getClass(), "templateKeys", null);
        setField(term13046, term13046.getClass(), "templatizedTypes", null);
        setBooleanField(term13046, term13046.getClass(), "inTemplatedCheckVisit", false);
        setField(term13046, term13046.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term12991;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "setReferencedAndResolvedType", argTypes, term12897, args);
        assertTrue(recursiveEquals(term12897, term13044));
        assertTrue(recursiveEquals(term12991, term13046));
    }

};


