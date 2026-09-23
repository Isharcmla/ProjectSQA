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

public class JSType_isSubtype_437021077531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146416;
     Object term146510;
     Object term146725;
     Object term146727;

    public JSType_isSubtype_437021077531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        term146510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term146616 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term146616, term146616.getClass(), "unknown", false);
        setField(term146510, term146510.getClass(), "referencedType", term146616);
        term146725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term146726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term146725, term146725.getClass(), "reference", null);
        setField(term146725, term146725.getClass(), "sourceName", null);
        setIntField(term146725, term146725.getClass(), "lineno", 0);
        setIntField(term146725, term146725.getClass(), "charno", 0);
        setBooleanField(term146725, term146725.getClass(), "forgiving", false);
        setField(term146726, term146726.getClass(), "primitiveType", null);
        setField(term146726, term146726.getClass(), "primitiveObjectType", null);
        setField(term146726, term146726.getClass(), "name", null);
        setBooleanField(term146726, term146726.getClass(), "visited", false);
        setField(term146726, term146726.getClass(), "docInfo", null);
        setBooleanField(term146726, term146726.getClass(), "unknown", false);
        setBooleanField(term146726, term146726.getClass(), "resolved", false);
        setField(term146726, term146726.getClass(), "resolveResult", null);
        setField(term146726, term146726.getClass(), "registry", null);
        setField(term146725, term146725.getClass(), "referencedType", term146726);
        setBooleanField(term146725, term146725.getClass(), "visited", false);
        setField(term146725, term146725.getClass(), "docInfo", null);
        setBooleanField(term146725, term146725.getClass(), "unknown", false);
        setBooleanField(term146725, term146725.getClass(), "resolved", false);
        setField(term146725, term146725.getClass(), "resolveResult", null);
        setField(term146725, term146725.getClass(), "registry", null);
        term146727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term146727, term146727.getClass(), "className", null);
        setField(term146727, term146727.getClass(), "properties", null);
        setField(term146727, term146727.getClass(), "implicitPrototype", null);
        setBooleanField(term146727, term146727.getClass(), "nativeType", false);
        setBooleanField(term146727, term146727.getClass(), "prettyPrint", false);
        setBooleanField(term146727, term146727.getClass(), "visited", false);
        setField(term146727, term146727.getClass(), "docInfo", null);
        setBooleanField(term146727, term146727.getClass(), "unknown", false);
        setBooleanField(term146727, term146727.getClass(), "resolved", false);
        setField(term146727, term146727.getClass(), "resolveResult", null);
        setField(term146727, term146727.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term146416;
        args[1] = term146510;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term146416, term146725));
        assertTrue(recursiveEquals(term146510, term146727));
        assertTrue(recursiveEquals(retValue, false));
    }

};


