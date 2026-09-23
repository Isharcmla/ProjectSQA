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

public class JSType_isSubtype_437021077583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162142;
     Object term162236;
     Object term162358;
     Object term162360;

    public JSType_isSubtype_437021077583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term162236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term162334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term162236, term162236.getClass(), "referencedType", term162334);
        term162358 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term162359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term162358, term162358.getClass(), "reference", null);
        setField(term162358, term162358.getClass(), "sourceName", null);
        setIntField(term162358, term162358.getClass(), "lineno", 0);
        setIntField(term162358, term162358.getClass(), "charno", 0);
        setBooleanField(term162358, term162358.getClass(), "forgiving", false);
        setBooleanField(term162359, term162359.getClass(), "isChecked", false);
        setBooleanField(term162359, term162359.getClass(), "visited", false);
        setField(term162359, term162359.getClass(), "docInfo", null);
        setBooleanField(term162359, term162359.getClass(), "unknown", false);
        setBooleanField(term162359, term162359.getClass(), "resolved", false);
        setField(term162359, term162359.getClass(), "resolveResult", null);
        setField(term162359, term162359.getClass(), "registry", null);
        setField(term162358, term162358.getClass(), "referencedType", term162359);
        setBooleanField(term162358, term162358.getClass(), "visited", false);
        setField(term162358, term162358.getClass(), "docInfo", null);
        setBooleanField(term162358, term162358.getClass(), "unknown", false);
        setBooleanField(term162358, term162358.getClass(), "resolved", false);
        setField(term162358, term162358.getClass(), "resolveResult", null);
        setField(term162358, term162358.getClass(), "registry", null);
        term162360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term162360, term162360.getClass(), "resolved", false);
        setField(term162360, term162360.getClass(), "resolveResult", null);
        setField(term162360, term162360.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term162142;
        args[1] = term162236;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term162142, term162358));
        assertTrue(recursiveEquals(term162236, term162360));
        assertTrue(recursiveEquals(retValue, true));
    }

};


