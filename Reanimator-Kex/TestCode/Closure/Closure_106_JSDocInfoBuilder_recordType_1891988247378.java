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

public class JSDocInfoBuilder_recordType_1891988247378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150847;
     Object term151021;
     Object term151086;
     Object term151088;

    public JSDocInfoBuilder_recordType_1891988247378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150847 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term150927 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term150927, term150927.getClass(), "bitset", 536870912);
        setField(term150927, term150927.getClass(), "info", null);
        setField(term150927, term150927.getClass(), "thisType", null);
        setField(term150847, term150847.getClass(), "currentInfo", term150927);
        term151021 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term151086 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term151087 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term151087, term151087.getClass(), "info", null);
        setField(term151087, term151087.getClass(), "documentation", null);
        setField(term151087, term151087.getClass(), "sourceName", null);
        setField(term151087, term151087.getClass(), "visibility", null);
        setIntField(term151087, term151087.getClass(), "bitset", 536870912);
        setField(term151087, term151087.getClass(), "type", null);
        setField(term151087, term151087.getClass(), "thisType", null);
        setBooleanField(term151087, term151087.getClass(), "includeDocumentation", false);
        setField(term151086, term151086.getClass(), "currentInfo", term151087);
        setBooleanField(term151086, term151086.getClass(), "populated", false);
        setBooleanField(term151086, term151086.getClass(), "parseDocumentation", false);
        setField(term151086, term151086.getClass(), "currentMarker", null);
        term151088 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term151088, term151088.getClass(), "root", null);
        setField(term151088, term151088.getClass(), "sourceName", null);
        setField(term151088, term151088.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term151021;
        Object retValue = callMethod(klass, "recordType", argTypes, term150847, args);
        assertTrue(recursiveEquals(term150847, term151086));
        assertTrue(recursiveEquals(term151021, term151088));
        assertTrue(recursiveEquals(retValue, false));
    }

};


