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

public class JSDocInfoBuilder_recordConstructor_1941880501286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131872;
     Object term131994;

    public JSDocInfoBuilder_recordConstructor_1941880501286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131872 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term131952 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term131952, term131952.getClass(), "bitset", 2);
        setField(term131872, term131872.getClass(), "currentInfo", term131952);
        term131994 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term131995 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term131995, term131995.getClass(), "info", null);
        setField(term131995, term131995.getClass(), "documentation", null);
        setField(term131995, term131995.getClass(), "sourceName", null);
        setField(term131995, term131995.getClass(), "visibility", null);
        setIntField(term131995, term131995.getClass(), "bitset", 2);
        setField(term131995, term131995.getClass(), "type", null);
        setField(term131995, term131995.getClass(), "thisType", null);
        setBooleanField(term131995, term131995.getClass(), "includeDocumentation", false);
        setField(term131994, term131994.getClass(), "currentInfo", term131995);
        setBooleanField(term131994, term131994.getClass(), "populated", false);
        setBooleanField(term131994, term131994.getClass(), "parseDocumentation", false);
        setField(term131994, term131994.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordConstructor", argTypes, term131872, args);
        assertTrue(recursiveEquals(term131872, term131994));
        assertTrue(recursiveEquals(retValue, false));
    }

};


