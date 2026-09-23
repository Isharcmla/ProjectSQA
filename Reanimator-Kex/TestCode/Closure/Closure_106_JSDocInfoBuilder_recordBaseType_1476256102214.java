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

public class JSDocInfoBuilder_recordBaseType_1476256102214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118886;
     Object term119060;
     Object term119096;
     Object term119098;

    public JSDocInfoBuilder_recordBaseType_1476256102214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118886 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term118966 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term118966, term118966.getClass(), "bitset", 1610612736);
        setField(term118886, term118886.getClass(), "currentInfo", term118966);
        term119060 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term119096 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term119097 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term119097, term119097.getClass(), "info", null);
        setField(term119097, term119097.getClass(), "documentation", null);
        setField(term119097, term119097.getClass(), "sourceName", null);
        setField(term119097, term119097.getClass(), "visibility", null);
        setIntField(term119097, term119097.getClass(), "bitset", 1610612736);
        setField(term119097, term119097.getClass(), "type", null);
        setField(term119097, term119097.getClass(), "thisType", null);
        setBooleanField(term119097, term119097.getClass(), "includeDocumentation", false);
        setField(term119096, term119096.getClass(), "currentInfo", term119097);
        setBooleanField(term119096, term119096.getClass(), "populated", false);
        setBooleanField(term119096, term119096.getClass(), "parseDocumentation", false);
        setField(term119096, term119096.getClass(), "currentMarker", null);
        term119098 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term119098, term119098.getClass(), "root", null);
        setField(term119098, term119098.getClass(), "sourceName", null);
        setField(term119098, term119098.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term119060;
        Object retValue = callMethod(klass, "recordBaseType", argTypes, term118886, args);
        assertTrue(recursiveEquals(term118886, term119096));
        assertTrue(recursiveEquals(term119060, term119098));
        assertTrue(recursiveEquals(retValue, false));
    }

};


