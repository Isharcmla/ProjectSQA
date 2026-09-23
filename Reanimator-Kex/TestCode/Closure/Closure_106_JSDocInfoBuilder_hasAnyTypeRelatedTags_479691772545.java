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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193267;
     Object term194034;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193267 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term193347 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term193471 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term193347, term193347.getClass(), "bitset", 1610612736);
        setField(term193471, term193471.getClass(), "parameters", null);
        setField(term193471, term193471.getClass(), "baseType", null);
        setField(term193347, term193347.getClass(), "info", term193471);
        setField(term193347, term193347.getClass(), "thisType", null);
        setField(term193267, term193267.getClass(), "currentInfo", term193347);
        term194034 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term194035 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term194036 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term194036, term194036.getClass(), "baseType", null);
        setField(term194036, term194036.getClass(), "implementedInterfaces", null);
        setField(term194036, term194036.getClass(), "parameters", null);
        setField(term194036, term194036.getClass(), "thrownTypes", null);
        setField(term194036, term194036.getClass(), "templateTypeName", null);
        setField(term194036, term194036.getClass(), "description", null);
        setField(term194036, term194036.getClass(), "deprecated", null);
        setField(term194036, term194036.getClass(), "license", null);
        setField(term194036, term194036.getClass(), "suppressions", null);
        setField(term194035, term194035.getClass(), "info", term194036);
        setField(term194035, term194035.getClass(), "documentation", null);
        setField(term194035, term194035.getClass(), "sourceName", null);
        setField(term194035, term194035.getClass(), "visibility", null);
        setIntField(term194035, term194035.getClass(), "bitset", 1610612736);
        setField(term194035, term194035.getClass(), "type", null);
        setField(term194035, term194035.getClass(), "thisType", null);
        setBooleanField(term194035, term194035.getClass(), "includeDocumentation", false);
        setField(term194034, term194034.getClass(), "currentInfo", term194035);
        setBooleanField(term194034, term194034.getClass(), "populated", false);
        setBooleanField(term194034, term194034.getClass(), "parseDocumentation", false);
        setField(term194034, term194034.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term193267, args);
        assertTrue(recursiveEquals(term193267, term194034));
        assertTrue(recursiveEquals(retValue, true));
    }

};


