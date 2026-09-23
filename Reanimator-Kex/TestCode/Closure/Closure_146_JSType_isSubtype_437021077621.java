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

public class JSType_isSubtype_437021077621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175172;
     Object term175266;
     Object term175388;
     Object term175390;

    public JSType_isSubtype_437021077621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175172 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term175266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term175364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term175266, term175266.getClass(), "referencedType", term175364);
        term175388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term175389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term175388, term175388.getClass(), "reference", null);
        setField(term175388, term175388.getClass(), "sourceName", null);
        setIntField(term175388, term175388.getClass(), "lineno", 0);
        setIntField(term175388, term175388.getClass(), "charno", 0);
        setBooleanField(term175388, term175388.getClass(), "forgiving", false);
        setBooleanField(term175389, term175389.getClass(), "isChecked", false);
        setBooleanField(term175389, term175389.getClass(), "visited", false);
        setField(term175389, term175389.getClass(), "docInfo", null);
        setBooleanField(term175389, term175389.getClass(), "unknown", false);
        setBooleanField(term175389, term175389.getClass(), "resolved", false);
        setField(term175389, term175389.getClass(), "resolveResult", null);
        setField(term175389, term175389.getClass(), "registry", null);
        setField(term175388, term175388.getClass(), "referencedType", term175389);
        setBooleanField(term175388, term175388.getClass(), "visited", false);
        setField(term175388, term175388.getClass(), "docInfo", null);
        setBooleanField(term175388, term175388.getClass(), "unknown", false);
        setBooleanField(term175388, term175388.getClass(), "resolved", false);
        setField(term175388, term175388.getClass(), "resolveResult", null);
        setField(term175388, term175388.getClass(), "registry", null);
        term175390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term175390, term175390.getClass(), "resolved", false);
        setField(term175390, term175390.getClass(), "resolveResult", null);
        setField(term175390, term175390.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term175172;
        args[1] = term175266;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term175172, term175388));
        assertTrue(recursiveEquals(term175266, term175390));
        assertTrue(recursiveEquals(retValue, true));
    }

};


