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

public class JSDocInfoBuilder_recordDefineType_1936429508258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126318;
     Object term126492;
     Object term126511;
     Object term126513;

    public JSDocInfoBuilder_recordDefineType_1936429508258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126318 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term126398 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term126398, term126398.getClass(), "bitset", 1);
        setField(term126318, term126318.getClass(), "currentInfo", term126398);
        term126492 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term126511 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term126512 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term126512, term126512.getClass(), "info", null);
        setField(term126512, term126512.getClass(), "documentation", null);
        setField(term126512, term126512.getClass(), "sourceName", null);
        setField(term126512, term126512.getClass(), "visibility", null);
        setIntField(term126512, term126512.getClass(), "bitset", 1);
        setField(term126512, term126512.getClass(), "type", null);
        setField(term126512, term126512.getClass(), "thisType", null);
        setBooleanField(term126512, term126512.getClass(), "includeDocumentation", false);
        setField(term126511, term126511.getClass(), "currentInfo", term126512);
        setBooleanField(term126511, term126511.getClass(), "populated", false);
        setBooleanField(term126511, term126511.getClass(), "parseDocumentation", false);
        setField(term126511, term126511.getClass(), "currentMarker", null);
        term126513 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term126513, term126513.getClass(), "root", null);
        setField(term126513, term126513.getClass(), "sourceName", null);
        setField(term126513, term126513.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term126492;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term126318, args);
        assertTrue(recursiveEquals(term126318, term126511));
        assertTrue(recursiveEquals(term126492, term126513));
        assertTrue(recursiveEquals(retValue, false));
    }

};


