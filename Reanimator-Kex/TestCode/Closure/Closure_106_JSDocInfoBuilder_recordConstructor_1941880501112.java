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

public class JSDocInfoBuilder_recordConstructor_1941880501112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103195;
     Object term103580;

    public JSDocInfoBuilder_recordConstructor_1941880501112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103195 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term103275 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term103275, term103275.getClass(), "bitset", -2147483648);
        setField(term103195, term103195.getClass(), "currentInfo", term103275);
        term103580 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term103581 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term103581, term103581.getClass(), "info", null);
        setField(term103581, term103581.getClass(), "documentation", null);
        setField(term103581, term103581.getClass(), "sourceName", null);
        setField(term103581, term103581.getClass(), "visibility", null);
        setIntField(term103581, term103581.getClass(), "bitset", -2147483648);
        setField(term103581, term103581.getClass(), "type", null);
        setField(term103581, term103581.getClass(), "thisType", null);
        setBooleanField(term103581, term103581.getClass(), "includeDocumentation", false);
        setField(term103580, term103580.getClass(), "currentInfo", term103581);
        setBooleanField(term103580, term103580.getClass(), "populated", false);
        setBooleanField(term103580, term103580.getClass(), "parseDocumentation", false);
        setField(term103580, term103580.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordConstructor", argTypes, term103195, args);
        assertTrue(recursiveEquals(term103195, term103580));
        assertTrue(recursiveEquals(retValue, false));
    }

};


