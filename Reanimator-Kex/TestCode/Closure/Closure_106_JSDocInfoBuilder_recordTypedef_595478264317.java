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

public class JSDocInfoBuilder_recordTypedef_595478264317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136949;
     Object term137123;
     Object term137531;
     Object term137533;

    public JSDocInfoBuilder_recordTypedef_595478264317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136949 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term137029 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term137029, term137029.getClass(), "bitset", 536870912);
        setField(term137029, term137029.getClass(), "info", null);
        setField(term137029, term137029.getClass(), "thisType", null);
        setField(term136949, term136949.getClass(), "currentInfo", term137029);
        term137123 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term137531 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term137532 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term137532, term137532.getClass(), "info", null);
        setField(term137532, term137532.getClass(), "documentation", null);
        setField(term137532, term137532.getClass(), "sourceName", null);
        setField(term137532, term137532.getClass(), "visibility", null);
        setIntField(term137532, term137532.getClass(), "bitset", 536870912);
        setField(term137532, term137532.getClass(), "type", null);
        setField(term137532, term137532.getClass(), "thisType", null);
        setBooleanField(term137532, term137532.getClass(), "includeDocumentation", false);
        setField(term137531, term137531.getClass(), "currentInfo", term137532);
        setBooleanField(term137531, term137531.getClass(), "populated", false);
        setBooleanField(term137531, term137531.getClass(), "parseDocumentation", false);
        setField(term137531, term137531.getClass(), "currentMarker", null);
        term137533 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term137533, term137533.getClass(), "root", null);
        setField(term137533, term137533.getClass(), "sourceName", null);
        setField(term137533, term137533.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term137123;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term136949, args);
        assertTrue(recursiveEquals(term136949, term137531));
        assertTrue(recursiveEquals(term137123, term137533));
        assertTrue(recursiveEquals(retValue, false));
    }

};


