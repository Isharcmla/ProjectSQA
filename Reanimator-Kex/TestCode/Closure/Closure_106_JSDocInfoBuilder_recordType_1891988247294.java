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

public class JSDocInfoBuilder_recordType_1891988247294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133228;
     Object term133402;
     Object term133499;
     Object term133501;

    public JSDocInfoBuilder_recordType_1891988247294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133228 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term133308 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term133308, term133308.getClass(), "bitset", 512);
        setField(term133228, term133228.getClass(), "currentInfo", term133308);
        term133402 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term133499 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term133500 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term133500, term133500.getClass(), "info", null);
        setField(term133500, term133500.getClass(), "documentation", null);
        setField(term133500, term133500.getClass(), "sourceName", null);
        setField(term133500, term133500.getClass(), "visibility", null);
        setIntField(term133500, term133500.getClass(), "bitset", 512);
        setField(term133500, term133500.getClass(), "type", null);
        setField(term133500, term133500.getClass(), "thisType", null);
        setBooleanField(term133500, term133500.getClass(), "includeDocumentation", false);
        setField(term133499, term133499.getClass(), "currentInfo", term133500);
        setBooleanField(term133499, term133499.getClass(), "populated", false);
        setBooleanField(term133499, term133499.getClass(), "parseDocumentation", false);
        setField(term133499, term133499.getClass(), "currentMarker", null);
        term133501 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term133501, term133501.getClass(), "root", null);
        setField(term133501, term133501.getClass(), "sourceName", null);
        setField(term133501, term133501.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term133402;
        Object retValue = callMethod(klass, "recordType", argTypes, term133228, args);
        assertTrue(recursiveEquals(term133228, term133499));
        assertTrue(recursiveEquals(term133402, term133501));
        assertTrue(recursiveEquals(retValue, false));
    }

};


