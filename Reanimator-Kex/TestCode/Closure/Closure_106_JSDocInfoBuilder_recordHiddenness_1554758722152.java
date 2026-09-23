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

public class JSDocInfoBuilder_recordHiddenness_1554758722152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109134;
     Object term109235;

    public JSDocInfoBuilder_recordHiddenness_1554758722152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109134 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term109214 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term109214, term109214.getClass(), "bitset", 0);
        setField(term109134, term109134.getClass(), "currentInfo", term109214);
        term109235 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term109236 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term109236, term109236.getClass(), "info", null);
        setField(term109236, term109236.getClass(), "documentation", null);
        setField(term109236, term109236.getClass(), "sourceName", null);
        setField(term109236, term109236.getClass(), "visibility", null);
        setIntField(term109236, term109236.getClass(), "bitset", 8);
        setField(term109236, term109236.getClass(), "type", null);
        setField(term109236, term109236.getClass(), "thisType", null);
        setBooleanField(term109236, term109236.getClass(), "includeDocumentation", false);
        setField(term109235, term109235.getClass(), "currentInfo", term109236);
        setBooleanField(term109235, term109235.getClass(), "populated", true);
        setBooleanField(term109235, term109235.getClass(), "parseDocumentation", false);
        setField(term109235, term109235.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordHiddenness", argTypes, term109134, args);
        assertTrue(recursiveEquals(term109134, term109235));
        assertTrue(recursiveEquals(retValue, true));
    }

};


