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

public class JSDocInfoBuilder_recordImplicitCast_673896831191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115011;
     Object term115421;

    public JSDocInfoBuilder_recordImplicitCast_673896831191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115011 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term115091 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term115091, term115091.getClass(), "bitset", 0);
        setField(term115011, term115011.getClass(), "currentInfo", term115091);
        term115421 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term115422 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term115422, term115422.getClass(), "info", null);
        setField(term115422, term115422.getClass(), "documentation", null);
        setField(term115422, term115422.getClass(), "sourceName", null);
        setField(term115422, term115422.getClass(), "visibility", null);
        setIntField(term115422, term115422.getClass(), "bitset", 8192);
        setField(term115422, term115422.getClass(), "type", null);
        setField(term115422, term115422.getClass(), "thisType", null);
        setBooleanField(term115422, term115422.getClass(), "includeDocumentation", false);
        setField(term115421, term115421.getClass(), "currentInfo", term115422);
        setBooleanField(term115421, term115421.getClass(), "populated", true);
        setBooleanField(term115421, term115421.getClass(), "parseDocumentation", false);
        setField(term115421, term115421.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordImplicitCast", argTypes, term115011, args);
        assertTrue(recursiveEquals(term115011, term115421));
        assertTrue(recursiveEquals(retValue, true));
    }

};


