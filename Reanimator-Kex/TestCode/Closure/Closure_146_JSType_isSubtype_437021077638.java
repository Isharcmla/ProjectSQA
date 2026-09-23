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

public class JSType_isSubtype_437021077638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179811;
     Object term179905;
     Object term180778;
     Object term180780;

    public JSType_isSubtype_437021077638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term179905 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term180001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term179905, term179905.getClass(), "referencedType", term180001);
        term180778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term180779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term180778, term180778.getClass(), "reference", null);
        setField(term180778, term180778.getClass(), "sourceName", null);
        setIntField(term180778, term180778.getClass(), "lineno", 0);
        setIntField(term180778, term180778.getClass(), "charno", 0);
        setBooleanField(term180778, term180778.getClass(), "forgiving", false);
        setField(term180779, term180779.getClass(), "properties", null);
        setBooleanField(term180779, term180779.getClass(), "isFrozen", false);
        setField(term180779, term180779.getClass(), "className", null);
        setField(term180779, term180779.getClass(), "implicitPrototype", null);
        setBooleanField(term180779, term180779.getClass(), "nativeType", false);
        setBooleanField(term180779, term180779.getClass(), "prettyPrint", false);
        setBooleanField(term180779, term180779.getClass(), "visited", false);
        setField(term180779, term180779.getClass(), "docInfo", null);
        setBooleanField(term180779, term180779.getClass(), "unknown", false);
        setBooleanField(term180779, term180779.getClass(), "resolved", false);
        setField(term180779, term180779.getClass(), "resolveResult", null);
        setField(term180779, term180779.getClass(), "registry", null);
        setField(term180778, term180778.getClass(), "referencedType", term180779);
        setBooleanField(term180778, term180778.getClass(), "visited", false);
        setField(term180778, term180778.getClass(), "docInfo", null);
        setBooleanField(term180778, term180778.getClass(), "unknown", false);
        setBooleanField(term180778, term180778.getClass(), "resolved", false);
        setField(term180778, term180778.getClass(), "resolveResult", null);
        setField(term180778, term180778.getClass(), "registry", null);
        term180780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term180780, term180780.getClass(), "resolved", false);
        setField(term180780, term180780.getClass(), "resolveResult", null);
        setField(term180780, term180780.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term179811;
        args[1] = term179905;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term179811, term180778));
        assertTrue(recursiveEquals(term179905, term180780));
        assertTrue(recursiveEquals(retValue, false));
    }

};


