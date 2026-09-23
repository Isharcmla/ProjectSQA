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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152721;
     Object term152870;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152721 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term152801 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term152801, term152801.getClass(), "bitset", -2147483648);
        setField(term152801, term152801.getClass(), "info", null);
        setField(term152801, term152801.getClass(), "thisType", null);
        setField(term152721, term152721.getClass(), "currentInfo", term152801);
        term152870 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term152871 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term152871, term152871.getClass(), "info", null);
        setField(term152871, term152871.getClass(), "documentation", null);
        setField(term152871, term152871.getClass(), "sourceName", null);
        setField(term152871, term152871.getClass(), "visibility", null);
        setIntField(term152871, term152871.getClass(), "bitset", -2147483648);
        setField(term152871, term152871.getClass(), "type", null);
        setField(term152871, term152871.getClass(), "thisType", null);
        setBooleanField(term152871, term152871.getClass(), "includeDocumentation", false);
        setField(term152870, term152870.getClass(), "currentInfo", term152871);
        setBooleanField(term152870, term152870.getClass(), "populated", false);
        setBooleanField(term152870, term152870.getClass(), "parseDocumentation", false);
        setField(term152870, term152870.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term152721, args);
        assertTrue(recursiveEquals(term152721, term152870));
        assertTrue(recursiveEquals(retValue, true));
    }

};


