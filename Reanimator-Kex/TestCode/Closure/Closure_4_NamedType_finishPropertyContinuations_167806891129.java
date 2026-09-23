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

public class NamedType_finishPropertyContinuations_167806891129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27706;
     Object term27893;

    public NamedType_finishPropertyContinuations_167806891129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27864 = new ArrayList();
        term27706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term27812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term27812, term27812.getClass(), "unknown", false);
        setField(term27706, term27706.getClass(), "referencedObjType", term27812);
        setField(term27706, term27706.getClass(), "propertyContinuations", term27864);
        term27893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term27894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term27893, term27893.getClass(), "reference", null);
        setField(term27893, term27893.getClass(), "sourceName", null);
        setIntField(term27893, term27893.getClass(), "lineno", 0);
        setIntField(term27893, term27893.getClass(), "charno", 0);
        setField(term27893, term27893.getClass(), "validator", null);
        setField(term27893, term27893.getClass(), "propertyContinuations", null);
        setField(term27893, term27893.getClass(), "referencedType", null);
        setField(term27894, term27894.getClass(), "primitiveType", null);
        setField(term27894, term27894.getClass(), "primitiveObjectType", null);
        setField(term27894, term27894.getClass(), "name", null);
        setBooleanField(term27894, term27894.getClass(), "visited", false);
        setField(term27894, term27894.getClass(), "docInfo", null);
        setBooleanField(term27894, term27894.getClass(), "unknown", false);
        setBooleanField(term27894, term27894.getClass(), "resolved", false);
        setField(term27894, term27894.getClass(), "resolveResult", null);
        setField(term27894, term27894.getClass(), "templateKeys", null);
        setField(term27894, term27894.getClass(), "templatizedTypes", null);
        setBooleanField(term27894, term27894.getClass(), "inTemplatedCheckVisit", false);
        setField(term27894, term27894.getClass(), "registry", null);
        setField(term27893, term27893.getClass(), "referencedObjType", term27894);
        setBooleanField(term27893, term27893.getClass(), "visited", false);
        setField(term27893, term27893.getClass(), "docInfo", null);
        setBooleanField(term27893, term27893.getClass(), "unknown", false);
        setBooleanField(term27893, term27893.getClass(), "resolved", false);
        setField(term27893, term27893.getClass(), "resolveResult", null);
        setField(term27893, term27893.getClass(), "templateKeys", null);
        setField(term27893, term27893.getClass(), "templatizedTypes", null);
        setBooleanField(term27893, term27893.getClass(), "inTemplatedCheckVisit", false);
        setField(term27893, term27893.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term27706, args);
        assertTrue(recursiveEquals(term27706, term27893));
    }

};


