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

public class JSDocInfoBuilder_recordTypedef_595478264289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132129;
     Object term132303;
     Object term132728;
     Object term132730;

    public JSDocInfoBuilder_recordTypedef_595478264289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132129 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term132209 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term132209, term132209.getClass(), "bitset", 1073741824);
        setField(term132209, term132209.getClass(), "info", null);
        setField(term132129, term132129.getClass(), "currentInfo", term132209);
        term132303 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term132728 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term132729 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term132729, term132729.getClass(), "info", null);
        setField(term132729, term132729.getClass(), "documentation", null);
        setField(term132729, term132729.getClass(), "sourceName", null);
        setField(term132729, term132729.getClass(), "visibility", null);
        setIntField(term132729, term132729.getClass(), "bitset", 1073741824);
        setField(term132729, term132729.getClass(), "type", null);
        setField(term132729, term132729.getClass(), "thisType", null);
        setBooleanField(term132729, term132729.getClass(), "includeDocumentation", false);
        setField(term132728, term132728.getClass(), "currentInfo", term132729);
        setBooleanField(term132728, term132728.getClass(), "populated", false);
        setBooleanField(term132728, term132728.getClass(), "parseDocumentation", false);
        setField(term132728, term132728.getClass(), "currentMarker", null);
        term132730 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term132730, term132730.getClass(), "root", null);
        setField(term132730, term132730.getClass(), "sourceName", null);
        setField(term132730, term132730.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term132303;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term132129, args);
        assertTrue(recursiveEquals(term132129, term132728));
        assertTrue(recursiveEquals(term132303, term132730));
        assertTrue(recursiveEquals(retValue, false));
    }

};


