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

public class NamedType_setReferencedAndResolvedType_101551349095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18378;
     Object term18672;
     Object term18719;
     Object term18721;

    public NamedType_setReferencedAndResolvedType_101551349095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18378 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term18472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term18566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term18378, term18378.getClass(), "validator", null);
        setField(term18378, term18378.getClass(), "referencedType", term18472);
        setField(term18378, term18378.getClass(), "referencedObjType", term18566);
        term18672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        term18719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term18720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term18719, term18719.getClass(), "reference", null);
        setField(term18719, term18719.getClass(), "sourceName", null);
        setIntField(term18719, term18719.getClass(), "lineno", 0);
        setIntField(term18719, term18719.getClass(), "charno", 0);
        setField(term18719, term18719.getClass(), "validator", null);
        setField(term18719, term18719.getClass(), "propertyContinuations", null);
        setField(term18720, term18720.getClass(), "primitiveType", null);
        setField(term18720, term18720.getClass(), "primitiveObjectType", null);
        setField(term18720, term18720.getClass(), "name", null);
        setBooleanField(term18720, term18720.getClass(), "visited", false);
        setField(term18720, term18720.getClass(), "docInfo", null);
        setBooleanField(term18720, term18720.getClass(), "unknown", false);
        setBooleanField(term18720, term18720.getClass(), "resolved", false);
        setField(term18720, term18720.getClass(), "resolveResult", null);
        setField(term18720, term18720.getClass(), "templateKeys", null);
        setField(term18720, term18720.getClass(), "templatizedTypes", null);
        setBooleanField(term18720, term18720.getClass(), "inTemplatedCheckVisit", false);
        setField(term18720, term18720.getClass(), "registry", null);
        setField(term18719, term18719.getClass(), "referencedType", term18720);
        setField(term18719, term18719.getClass(), "referencedObjType", term18720);
        setBooleanField(term18719, term18719.getClass(), "visited", false);
        setField(term18719, term18719.getClass(), "docInfo", null);
        setBooleanField(term18719, term18719.getClass(), "unknown", false);
        setBooleanField(term18719, term18719.getClass(), "resolved", true);
        setField(term18719, term18719.getClass(), "resolveResult", term18720);
        setField(term18719, term18719.getClass(), "templateKeys", null);
        setField(term18719, term18719.getClass(), "templatizedTypes", null);
        setBooleanField(term18719, term18719.getClass(), "inTemplatedCheckVisit", false);
        setField(term18719, term18719.getClass(), "registry", null);
        term18721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term18721, term18721.getClass(), "primitiveType", null);
        setField(term18721, term18721.getClass(), "primitiveObjectType", null);
        setField(term18721, term18721.getClass(), "name", null);
        setBooleanField(term18721, term18721.getClass(), "visited", false);
        setField(term18721, term18721.getClass(), "docInfo", null);
        setBooleanField(term18721, term18721.getClass(), "unknown", false);
        setBooleanField(term18721, term18721.getClass(), "resolved", false);
        setField(term18721, term18721.getClass(), "resolveResult", null);
        setField(term18721, term18721.getClass(), "templateKeys", null);
        setField(term18721, term18721.getClass(), "templatizedTypes", null);
        setBooleanField(term18721, term18721.getClass(), "inTemplatedCheckVisit", false);
        setField(term18721, term18721.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term18672;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "setReferencedAndResolvedType", argTypes, term18378, args);
        assertTrue(recursiveEquals(term18378, term18719));
        assertTrue(recursiveEquals(term18672, term18721));
    }

};


