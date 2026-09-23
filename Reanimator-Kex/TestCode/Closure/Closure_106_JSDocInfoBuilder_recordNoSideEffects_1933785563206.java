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

public class JSDocInfoBuilder_recordNoSideEffects_1933785563206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117832;
     Object term117928;

    public JSDocInfoBuilder_recordNoSideEffects_1933785563206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117832 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term117912 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term117912, term117912.getClass(), "bitset", 16384);
        setField(term117832, term117832.getClass(), "currentInfo", term117912);
        term117928 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term117929 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term117929, term117929.getClass(), "info", null);
        setField(term117929, term117929.getClass(), "documentation", null);
        setField(term117929, term117929.getClass(), "sourceName", null);
        setField(term117929, term117929.getClass(), "visibility", null);
        setIntField(term117929, term117929.getClass(), "bitset", 16384);
        setField(term117929, term117929.getClass(), "type", null);
        setField(term117929, term117929.getClass(), "thisType", null);
        setBooleanField(term117929, term117929.getClass(), "includeDocumentation", false);
        setField(term117928, term117928.getClass(), "currentInfo", term117929);
        setBooleanField(term117928, term117928.getClass(), "populated", false);
        setBooleanField(term117928, term117928.getClass(), "parseDocumentation", false);
        setField(term117928, term117928.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordNoSideEffects", argTypes, term117832, args);
        assertTrue(recursiveEquals(term117832, term117928));
        assertTrue(recursiveEquals(retValue, false));
    }

};


