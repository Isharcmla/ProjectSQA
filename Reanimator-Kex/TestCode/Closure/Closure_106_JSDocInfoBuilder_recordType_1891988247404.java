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

public class JSDocInfoBuilder_recordType_1891988247404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157612;
     Object term157880;
     Object term157970;
     Object term157973;

    public JSDocInfoBuilder_recordType_1891988247404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157612 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term157692 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term157786 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term157692, term157692.getClass(), "bitset", 0);
        setField(term157692, term157692.getClass(), "info", null);
        setField(term157692, term157692.getClass(), "thisType", term157786);
        setField(term157612, term157612.getClass(), "currentInfo", term157692);
        term157880 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term157970 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term157971 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term157972 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term157971, term157971.getClass(), "info", null);
        setField(term157971, term157971.getClass(), "documentation", null);
        setField(term157971, term157971.getClass(), "sourceName", null);
        setField(term157971, term157971.getClass(), "visibility", null);
        setIntField(term157971, term157971.getClass(), "bitset", 0);
        setField(term157971, term157971.getClass(), "type", null);
        setField(term157972, term157972.getClass(), "root", null);
        setField(term157972, term157972.getClass(), "sourceName", null);
        setField(term157972, term157972.getClass(), "registry", null);
        setField(term157971, term157971.getClass(), "thisType", term157972);
        setBooleanField(term157971, term157971.getClass(), "includeDocumentation", false);
        setField(term157970, term157970.getClass(), "currentInfo", term157971);
        setBooleanField(term157970, term157970.getClass(), "populated", false);
        setBooleanField(term157970, term157970.getClass(), "parseDocumentation", false);
        setField(term157970, term157970.getClass(), "currentMarker", null);
        term157973 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term157973, term157973.getClass(), "root", null);
        setField(term157973, term157973.getClass(), "sourceName", null);
        setField(term157973, term157973.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term157880;
        Object retValue = callMethod(klass, "recordType", argTypes, term157612, args);
        assertTrue(recursiveEquals(term157612, term157970));
        assertTrue(recursiveEquals(term157880, term157973));
        assertTrue(recursiveEquals(retValue, false));
    }

};


