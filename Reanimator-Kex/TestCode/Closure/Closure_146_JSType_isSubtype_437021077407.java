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

public class JSType_isSubtype_437021077407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98347;
     Object term98441;
     Object term98591;
     Object term98593;

    public JSType_isSubtype_437021077407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term98441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term98547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term98547, term98547.getClass(), "unknown", false);
        setField(term98441, term98441.getClass(), "referencedType", term98547);
        term98591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term98592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term98591, term98591.getClass(), "reference", null);
        setField(term98591, term98591.getClass(), "sourceName", null);
        setIntField(term98591, term98591.getClass(), "lineno", 0);
        setIntField(term98591, term98591.getClass(), "charno", 0);
        setBooleanField(term98591, term98591.getClass(), "forgiving", false);
        setField(term98592, term98592.getClass(), "primitiveType", null);
        setField(term98592, term98592.getClass(), "primitiveObjectType", null);
        setField(term98592, term98592.getClass(), "name", null);
        setBooleanField(term98592, term98592.getClass(), "visited", false);
        setField(term98592, term98592.getClass(), "docInfo", null);
        setBooleanField(term98592, term98592.getClass(), "unknown", false);
        setBooleanField(term98592, term98592.getClass(), "resolved", false);
        setField(term98592, term98592.getClass(), "resolveResult", null);
        setField(term98592, term98592.getClass(), "registry", null);
        setField(term98591, term98591.getClass(), "referencedType", term98592);
        setBooleanField(term98591, term98591.getClass(), "visited", false);
        setField(term98591, term98591.getClass(), "docInfo", null);
        setBooleanField(term98591, term98591.getClass(), "unknown", false);
        setBooleanField(term98591, term98591.getClass(), "resolved", false);
        setField(term98591, term98591.getClass(), "resolveResult", null);
        setField(term98591, term98591.getClass(), "registry", null);
        term98593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term98593, term98593.getClass(), "resolved", false);
        setField(term98593, term98593.getClass(), "resolveResult", null);
        setField(term98593, term98593.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term98347;
        args[1] = term98441;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term98347, term98591));
        assertTrue(recursiveEquals(term98441, term98593));
        assertTrue(recursiveEquals(retValue, false));
    }

};


