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

public class NamedType_finishPropertyContinuations_167806891103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21631;
     Object term22017;

    public NamedType_finishPropertyContinuations_167806891103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term21737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term21631, term21631.getClass(), "referencedObjType", term21737);
        term22017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term22018 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term22017, term22017.getClass(), "reference", null);
        setField(term22017, term22017.getClass(), "sourceName", null);
        setIntField(term22017, term22017.getClass(), "lineno", 0);
        setIntField(term22017, term22017.getClass(), "charno", 0);
        setField(term22017, term22017.getClass(), "validator", null);
        setField(term22017, term22017.getClass(), "propertyContinuations", null);
        setField(term22017, term22017.getClass(), "referencedType", null);
        setField(term22018, term22018.getClass(), "primitiveType", null);
        setField(term22018, term22018.getClass(), "primitiveObjectType", null);
        setField(term22018, term22018.getClass(), "name", null);
        setBooleanField(term22018, term22018.getClass(), "visited", false);
        setField(term22018, term22018.getClass(), "docInfo", null);
        setBooleanField(term22018, term22018.getClass(), "unknown", false);
        setBooleanField(term22018, term22018.getClass(), "resolved", false);
        setField(term22018, term22018.getClass(), "resolveResult", null);
        setField(term22018, term22018.getClass(), "templateKeys", null);
        setField(term22018, term22018.getClass(), "templatizedTypes", null);
        setBooleanField(term22018, term22018.getClass(), "inTemplatedCheckVisit", false);
        setField(term22018, term22018.getClass(), "registry", null);
        setField(term22017, term22017.getClass(), "referencedObjType", term22018);
        setBooleanField(term22017, term22017.getClass(), "visited", false);
        setField(term22017, term22017.getClass(), "docInfo", null);
        setBooleanField(term22017, term22017.getClass(), "unknown", false);
        setBooleanField(term22017, term22017.getClass(), "resolved", false);
        setField(term22017, term22017.getClass(), "resolveResult", null);
        setField(term22017, term22017.getClass(), "templateKeys", null);
        setField(term22017, term22017.getClass(), "templatizedTypes", null);
        setBooleanField(term22017, term22017.getClass(), "inTemplatedCheckVisit", false);
        setField(term22017, term22017.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term21631, args);
        assertTrue(recursiveEquals(term21631, term22017));
    }

};


