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

public class NamedType_checkEnumElementCycle_59616581665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12606;
     Object term12771;

    public NamedType_checkEnumElementCycle_59616581665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term12712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term12606, term12606.getClass(), "referencedType", term12712);
        term12771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term12772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term12771, term12771.getClass(), "reference", null);
        setField(term12771, term12771.getClass(), "sourceName", null);
        setIntField(term12771, term12771.getClass(), "lineno", 0);
        setIntField(term12771, term12771.getClass(), "charno", 0);
        setField(term12771, term12771.getClass(), "validator", null);
        setField(term12771, term12771.getClass(), "propertyContinuations", null);
        setField(term12772, term12772.getClass(), "primitiveType", null);
        setField(term12772, term12772.getClass(), "primitiveObjectType", null);
        setField(term12772, term12772.getClass(), "name", null);
        setBooleanField(term12772, term12772.getClass(), "visited", false);
        setField(term12772, term12772.getClass(), "docInfo", null);
        setBooleanField(term12772, term12772.getClass(), "unknown", false);
        setBooleanField(term12772, term12772.getClass(), "resolved", false);
        setField(term12772, term12772.getClass(), "resolveResult", null);
        setField(term12772, term12772.getClass(), "templateKeys", null);
        setField(term12772, term12772.getClass(), "templatizedTypes", null);
        setBooleanField(term12772, term12772.getClass(), "inTemplatedCheckVisit", false);
        setField(term12772, term12772.getClass(), "registry", null);
        setField(term12771, term12771.getClass(), "referencedType", term12772);
        setField(term12771, term12771.getClass(), "referencedObjType", null);
        setBooleanField(term12771, term12771.getClass(), "visited", false);
        setField(term12771, term12771.getClass(), "docInfo", null);
        setBooleanField(term12771, term12771.getClass(), "unknown", false);
        setBooleanField(term12771, term12771.getClass(), "resolved", false);
        setField(term12771, term12771.getClass(), "resolveResult", null);
        setField(term12771, term12771.getClass(), "templateKeys", null);
        setField(term12771, term12771.getClass(), "templatizedTypes", null);
        setBooleanField(term12771, term12771.getClass(), "inTemplatedCheckVisit", false);
        setField(term12771, term12771.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkEnumElementCycle", argTypes, term12606, args);
        assertTrue(recursiveEquals(term12606, term12771));
    }

};


