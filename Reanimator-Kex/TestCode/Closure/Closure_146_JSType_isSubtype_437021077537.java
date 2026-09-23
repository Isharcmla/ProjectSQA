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

public class JSType_isSubtype_437021077537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147839;
     Object term147933;
     Object term148082;
     Object term148084;

    public JSType_isSubtype_437021077537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term147933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term148029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term147933, term147933.getClass(), "referencedType", term148029);
        term148082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term148083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term148082, term148082.getClass(), "reference", null);
        setField(term148082, term148082.getClass(), "sourceName", null);
        setIntField(term148082, term148082.getClass(), "lineno", 0);
        setIntField(term148082, term148082.getClass(), "charno", 0);
        setBooleanField(term148082, term148082.getClass(), "forgiving", false);
        setField(term148083, term148083.getClass(), "properties", null);
        setBooleanField(term148083, term148083.getClass(), "isFrozen", false);
        setField(term148083, term148083.getClass(), "className", null);
        setField(term148083, term148083.getClass(), "implicitPrototype", null);
        setBooleanField(term148083, term148083.getClass(), "nativeType", false);
        setBooleanField(term148083, term148083.getClass(), "prettyPrint", false);
        setBooleanField(term148083, term148083.getClass(), "visited", false);
        setField(term148083, term148083.getClass(), "docInfo", null);
        setBooleanField(term148083, term148083.getClass(), "unknown", false);
        setBooleanField(term148083, term148083.getClass(), "resolved", false);
        setField(term148083, term148083.getClass(), "resolveResult", null);
        setField(term148083, term148083.getClass(), "registry", null);
        setField(term148082, term148082.getClass(), "referencedType", term148083);
        setBooleanField(term148082, term148082.getClass(), "visited", false);
        setField(term148082, term148082.getClass(), "docInfo", null);
        setBooleanField(term148082, term148082.getClass(), "unknown", false);
        setBooleanField(term148082, term148082.getClass(), "resolved", false);
        setField(term148082, term148082.getClass(), "resolveResult", null);
        setField(term148082, term148082.getClass(), "registry", null);
        term148084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term148084, term148084.getClass(), "resolved", false);
        setField(term148084, term148084.getClass(), "resolveResult", null);
        setField(term148084, term148084.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term147839;
        args[1] = term147933;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term147839, term148082));
        assertTrue(recursiveEquals(term147933, term148084));
        assertTrue(recursiveEquals(retValue, false));
    }

};


