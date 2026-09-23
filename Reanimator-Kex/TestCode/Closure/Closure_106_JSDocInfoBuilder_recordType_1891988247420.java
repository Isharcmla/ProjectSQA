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

public class JSDocInfoBuilder_recordType_1891988247420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161051;
     Object term161225;
     Object term161366;
     Object term161368;

    public JSDocInfoBuilder_recordType_1891988247420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161051 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term161131 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term161131, term161131.getClass(), "bitset", -2147483648);
        setField(term161131, term161131.getClass(), "info", null);
        setField(term161131, term161131.getClass(), "thisType", null);
        setField(term161051, term161051.getClass(), "currentInfo", term161131);
        term161225 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term161366 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term161367 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term161367, term161367.getClass(), "info", null);
        setField(term161367, term161367.getClass(), "documentation", null);
        setField(term161367, term161367.getClass(), "sourceName", null);
        setField(term161367, term161367.getClass(), "visibility", null);
        setIntField(term161367, term161367.getClass(), "bitset", -2147483648);
        setField(term161367, term161367.getClass(), "type", null);
        setField(term161367, term161367.getClass(), "thisType", null);
        setBooleanField(term161367, term161367.getClass(), "includeDocumentation", false);
        setField(term161366, term161366.getClass(), "currentInfo", term161367);
        setBooleanField(term161366, term161366.getClass(), "populated", false);
        setBooleanField(term161366, term161366.getClass(), "parseDocumentation", false);
        setField(term161366, term161366.getClass(), "currentMarker", null);
        term161368 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term161368, term161368.getClass(), "root", null);
        setField(term161368, term161368.getClass(), "sourceName", null);
        setField(term161368, term161368.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term161225;
        Object retValue = callMethod(klass, "recordType", argTypes, term161051, args);
        assertTrue(recursiveEquals(term161051, term161366));
        assertTrue(recursiveEquals(term161225, term161368));
        assertTrue(recursiveEquals(retValue, false));
    }

};


