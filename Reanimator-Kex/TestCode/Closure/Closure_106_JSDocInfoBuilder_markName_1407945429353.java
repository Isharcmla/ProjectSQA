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

public class JSDocInfoBuilder_markName_1407945429353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144979;
     Object term145364;

    public JSDocInfoBuilder_markName_1407945429353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144979 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(term144979, term144979.getClass(), "currentMarker", null);
        term145364 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(term145364, term145364.getClass(), "currentInfo", null);
        setBooleanField(term145364, term145364.getClass(), "populated", false);
        setBooleanField(term145364, term145364.getClass(), "parseDocumentation", false);
        setField(term145364, term145364.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        callMethod(klass, "markName", argTypes, term144979, args);
        assertTrue(recursiveEquals(term144979, term145364));
    }

};


