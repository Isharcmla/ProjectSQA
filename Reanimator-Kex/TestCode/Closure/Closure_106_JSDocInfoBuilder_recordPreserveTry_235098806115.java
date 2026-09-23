package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class JSDocInfoBuilder_recordPreserveTry_235098806115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103692;
     Object term104082;

    public JSDocInfoBuilder_recordPreserveTry_235098806115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103692 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term103772 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term103772, term103772.getClass(), "bitset", 16);
        setField(term103692, term103692.getClass(), "currentInfo", term103772);
        term104082 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term104083 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term104083, term104083.getClass(), "info", null);
        setField(term104083, term104083.getClass(), "documentation", null);
        setField(term104083, term104083.getClass(), "sourceName", null);
        setField(term104083, term104083.getClass(), "visibility", null);
        setIntField(term104083, term104083.getClass(), "bitset", 16);
        setField(term104083, term104083.getClass(), "type", null);
        setField(term104083, term104083.getClass(), "thisType", null);
        setBooleanField(term104083, term104083.getClass(), "includeDocumentation", false);
        setField(term104082, term104082.getClass(), "currentInfo", term104083);
        setBooleanField(term104082, term104082.getClass(), "populated", false);
        setBooleanField(term104082, term104082.getClass(), "parseDocumentation", false);
        setField(term104082, term104082.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordPreserveTry", argTypes, term103692, args);
        assertTrue(recursiveEquals(term103692, term104082));
        assertTrue(recursiveEquals(retValue, false));
    }

};


