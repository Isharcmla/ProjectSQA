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

public class JSDocInfoBuilder_recordType_1891988247176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112688;
     Object term112862;
     Object term112948;
     Object term112951;

    public JSDocInfoBuilder_recordType_1891988247176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112688 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term112768 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term112768, term112768.getClass(), "bitset", 0);
        setField(term112688, term112688.getClass(), "currentInfo", term112768);
        term112862 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term112948 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term112949 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term112950 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term112949, term112949.getClass(), "info", null);
        setField(term112949, term112949.getClass(), "documentation", null);
        setField(term112949, term112949.getClass(), "sourceName", null);
        setField(term112949, term112949.getClass(), "visibility", null);
        setIntField(term112949, term112949.getClass(), "bitset", 536870912);
        setField(term112950, term112950.getClass(), "root", null);
        setField(term112950, term112950.getClass(), "sourceName", null);
        setField(term112950, term112950.getClass(), "registry", null);
        setField(term112949, term112949.getClass(), "type", term112950);
        setField(term112949, term112949.getClass(), "thisType", null);
        setBooleanField(term112949, term112949.getClass(), "includeDocumentation", false);
        setField(term112948, term112948.getClass(), "currentInfo", term112949);
        setBooleanField(term112948, term112948.getClass(), "populated", true);
        setBooleanField(term112948, term112948.getClass(), "parseDocumentation", false);
        setField(term112948, term112948.getClass(), "currentMarker", null);
        term112951 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term112951, term112951.getClass(), "root", null);
        setField(term112951, term112951.getClass(), "sourceName", null);
        setField(term112951, term112951.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term112862;
        Object retValue = callMethod(klass, "recordType", argTypes, term112688, args);
        assertTrue(recursiveEquals(term112688, term112948));
        assertTrue(recursiveEquals(term112862, term112951));
        assertTrue(recursiveEquals(retValue, true));
    }

};


