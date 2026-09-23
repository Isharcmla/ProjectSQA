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

public class JSDocInfoBuilder_recordThrowType_1200738989132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106331;
     Object term106429;

    public JSDocInfoBuilder_recordThrowType_1200738989132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106331 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term106411 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term106411, term106411.getClass(), "bitset", 536870912);
        setField(term106331, term106331.getClass(), "currentInfo", term106411);
        term106429 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term106430 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term106430, term106430.getClass(), "info", null);
        setField(term106430, term106430.getClass(), "documentation", null);
        setField(term106430, term106430.getClass(), "sourceName", null);
        setField(term106430, term106430.getClass(), "visibility", null);
        setIntField(term106430, term106430.getClass(), "bitset", 536870912);
        setField(term106430, term106430.getClass(), "type", null);
        setField(term106430, term106430.getClass(), "thisType", null);
        setBooleanField(term106430, term106430.getClass(), "includeDocumentation", false);
        setField(term106429, term106429.getClass(), "currentInfo", term106430);
        setBooleanField(term106429, term106429.getClass(), "populated", false);
        setBooleanField(term106429, term106429.getClass(), "parseDocumentation", false);
        setField(term106429, term106429.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordThrowType", argTypes, term106331, args);
        assertTrue(recursiveEquals(term106331, term106429));
        assertTrue(recursiveEquals(retValue, false));
    }

};


