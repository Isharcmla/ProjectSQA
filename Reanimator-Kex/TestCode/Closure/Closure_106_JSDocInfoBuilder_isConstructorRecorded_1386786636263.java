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

public class JSDocInfoBuilder_isConstructorRecorded_1386786636263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126929;
     Object term127406;

    public JSDocInfoBuilder_isConstructorRecorded_1386786636263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126929 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term127009 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term127009, term127009.getClass(), "bitset", 2);
        setField(term126929, term126929.getClass(), "currentInfo", term127009);
        term127406 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term127407 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term127407, term127407.getClass(), "info", null);
        setField(term127407, term127407.getClass(), "documentation", null);
        setField(term127407, term127407.getClass(), "sourceName", null);
        setField(term127407, term127407.getClass(), "visibility", null);
        setIntField(term127407, term127407.getClass(), "bitset", 2);
        setField(term127407, term127407.getClass(), "type", null);
        setField(term127407, term127407.getClass(), "thisType", null);
        setBooleanField(term127407, term127407.getClass(), "includeDocumentation", false);
        setField(term127406, term127406.getClass(), "currentInfo", term127407);
        setBooleanField(term127406, term127406.getClass(), "populated", false);
        setBooleanField(term127406, term127406.getClass(), "parseDocumentation", false);
        setField(term127406, term127406.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isConstructorRecorded", argTypes, term126929, args);
        assertTrue(recursiveEquals(term126929, term127406));
    }

};


