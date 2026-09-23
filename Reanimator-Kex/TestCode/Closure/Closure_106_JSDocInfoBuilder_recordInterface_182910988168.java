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

public class JSDocInfoBuilder_recordInterface_182910988168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111344;
     Object term111479;

    public JSDocInfoBuilder_recordInterface_182910988168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111344 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term111424 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term111424, term111424.getClass(), "bitset", 0);
        setField(term111344, term111344.getClass(), "currentInfo", term111424);
        term111479 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term111480 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term111480, term111480.getClass(), "info", null);
        setField(term111480, term111480.getClass(), "documentation", null);
        setField(term111480, term111480.getClass(), "sourceName", null);
        setField(term111480, term111480.getClass(), "visibility", null);
        setIntField(term111480, term111480.getClass(), "bitset", 512);
        setField(term111480, term111480.getClass(), "type", null);
        setField(term111480, term111480.getClass(), "thisType", null);
        setBooleanField(term111480, term111480.getClass(), "includeDocumentation", false);
        setField(term111479, term111479.getClass(), "currentInfo", term111480);
        setBooleanField(term111479, term111479.getClass(), "populated", true);
        setBooleanField(term111479, term111479.getClass(), "parseDocumentation", false);
        setField(term111479, term111479.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordInterface", argTypes, term111344, args);
        assertTrue(recursiveEquals(term111344, term111479));
        assertTrue(recursiveEquals(retValue, true));
    }

};


