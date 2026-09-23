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

public class JSType_isSubtype_437021077568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157631;
     Object term157725;
     Object term158207;
     Object term158209;

    public JSType_isSubtype_437021077568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term157725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term157837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term157725, term157725.getClass(), "referencedType", term157837);
        term158207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term158208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term158207, term158207.getClass(), "reference", null);
        setField(term158207, term158207.getClass(), "sourceName", null);
        setIntField(term158207, term158207.getClass(), "lineno", 0);
        setIntField(term158207, term158207.getClass(), "charno", 0);
        setBooleanField(term158207, term158207.getClass(), "forgiving", false);
        setField(term158208, term158208.getClass(), "constructor", null);
        setField(term158208, term158208.getClass(), "className", null);
        setField(term158208, term158208.getClass(), "properties", null);
        setField(term158208, term158208.getClass(), "implicitPrototype", null);
        setBooleanField(term158208, term158208.getClass(), "nativeType", false);
        setBooleanField(term158208, term158208.getClass(), "prettyPrint", false);
        setBooleanField(term158208, term158208.getClass(), "visited", false);
        setField(term158208, term158208.getClass(), "docInfo", null);
        setBooleanField(term158208, term158208.getClass(), "unknown", false);
        setBooleanField(term158208, term158208.getClass(), "resolved", false);
        setField(term158208, term158208.getClass(), "resolveResult", null);
        setField(term158208, term158208.getClass(), "registry", null);
        setField(term158207, term158207.getClass(), "referencedType", term158208);
        setBooleanField(term158207, term158207.getClass(), "visited", false);
        setField(term158207, term158207.getClass(), "docInfo", null);
        setBooleanField(term158207, term158207.getClass(), "unknown", false);
        setBooleanField(term158207, term158207.getClass(), "resolved", false);
        setField(term158207, term158207.getClass(), "resolveResult", null);
        setField(term158207, term158207.getClass(), "registry", null);
        term158209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term158209, term158209.getClass(), "resolved", false);
        setField(term158209, term158209.getClass(), "resolveResult", null);
        setField(term158209, term158209.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term157631;
        args[1] = term157725;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term157631, term158207));
        assertTrue(recursiveEquals(term157725, term158209));
        assertTrue(recursiveEquals(retValue, false));
    }

};


