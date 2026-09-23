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
import java.util.HashMap;

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212041;
     Object term212508;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term212293 = new HashMap();
        term212041 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term212121 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term212245 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term212121, term212121.getClass(), "bitset", 1073741824);
        setField(term212245, term212245.getClass(), "parameters", term212293);
        setField(term212121, term212121.getClass(), "info", term212245);
        setField(term212041, term212041.getClass(), "currentInfo", term212121);
        HashMap term212511 = new HashMap();
        term212508 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term212509 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term212510 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term212510, term212510.getClass(), "baseType", null);
        setField(term212510, term212510.getClass(), "implementedInterfaces", null);
        setField(term212510, term212510.getClass(), "parameters", term212511);
        setField(term212510, term212510.getClass(), "thrownTypes", null);
        setField(term212510, term212510.getClass(), "templateTypeName", null);
        setField(term212510, term212510.getClass(), "description", null);
        setField(term212510, term212510.getClass(), "deprecated", null);
        setField(term212510, term212510.getClass(), "license", null);
        setField(term212510, term212510.getClass(), "suppressions", null);
        setField(term212509, term212509.getClass(), "info", term212510);
        setField(term212509, term212509.getClass(), "documentation", null);
        setField(term212509, term212509.getClass(), "sourceName", null);
        setField(term212509, term212509.getClass(), "visibility", null);
        setIntField(term212509, term212509.getClass(), "bitset", 1073741824);
        setField(term212509, term212509.getClass(), "type", null);
        setField(term212509, term212509.getClass(), "thisType", null);
        setBooleanField(term212509, term212509.getClass(), "includeDocumentation", false);
        setField(term212508, term212508.getClass(), "currentInfo", term212509);
        setBooleanField(term212508, term212508.getClass(), "populated", false);
        setBooleanField(term212508, term212508.getClass(), "parseDocumentation", false);
        setField(term212508, term212508.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term212041, args);
        assertTrue(recursiveEquals(term212041, term212508));
        assertTrue(recursiveEquals(retValue, true));
    }

};


