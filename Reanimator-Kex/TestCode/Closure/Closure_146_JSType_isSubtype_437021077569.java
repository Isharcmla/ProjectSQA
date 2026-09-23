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

public class JSType_isSubtype_437021077569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157951;
     Object term158045;
     Object term158268;
     Object term158270;

    public JSType_isSubtype_437021077569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        term158045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term158157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setBooleanField(term158157, term158157.getClass(), "unknown", false);
        setField(term158045, term158045.getClass(), "referencedType", term158157);
        term158268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term158269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term158268, term158268.getClass(), "reference", null);
        setField(term158268, term158268.getClass(), "sourceName", null);
        setIntField(term158268, term158268.getClass(), "lineno", 0);
        setIntField(term158268, term158268.getClass(), "charno", 0);
        setBooleanField(term158268, term158268.getClass(), "forgiving", false);
        setField(term158269, term158269.getClass(), "constructor", null);
        setField(term158269, term158269.getClass(), "className", null);
        setField(term158269, term158269.getClass(), "properties", null);
        setField(term158269, term158269.getClass(), "implicitPrototype", null);
        setBooleanField(term158269, term158269.getClass(), "nativeType", false);
        setBooleanField(term158269, term158269.getClass(), "prettyPrint", false);
        setBooleanField(term158269, term158269.getClass(), "visited", false);
        setField(term158269, term158269.getClass(), "docInfo", null);
        setBooleanField(term158269, term158269.getClass(), "unknown", false);
        setBooleanField(term158269, term158269.getClass(), "resolved", false);
        setField(term158269, term158269.getClass(), "resolveResult", null);
        setField(term158269, term158269.getClass(), "registry", null);
        setField(term158268, term158268.getClass(), "referencedType", term158269);
        setBooleanField(term158268, term158268.getClass(), "visited", false);
        setField(term158268, term158268.getClass(), "docInfo", null);
        setBooleanField(term158268, term158268.getClass(), "unknown", false);
        setBooleanField(term158268, term158268.getClass(), "resolved", false);
        setField(term158268, term158268.getClass(), "resolveResult", null);
        setField(term158268, term158268.getClass(), "registry", null);
        term158270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setBooleanField(term158270, term158270.getClass(), "resolved", false);
        setField(term158270, term158270.getClass(), "resolveResult", null);
        setField(term158270, term158270.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term157951;
        args[1] = term158045;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term157951, term158268));
        assertTrue(recursiveEquals(term158045, term158270));
        assertTrue(recursiveEquals(retValue, false));
    }

};


