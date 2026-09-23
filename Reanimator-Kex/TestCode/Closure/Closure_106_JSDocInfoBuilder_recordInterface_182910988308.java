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

public class JSDocInfoBuilder_recordInterface_182910988308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135571;
     Object term135761;

    public JSDocInfoBuilder_recordInterface_182910988308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135571 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term135651 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term135651, term135651.getClass(), "bitset", -2147483648);
        setField(term135571, term135571.getClass(), "currentInfo", term135651);
        term135761 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term135762 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term135762, term135762.getClass(), "info", null);
        setField(term135762, term135762.getClass(), "documentation", null);
        setField(term135762, term135762.getClass(), "sourceName", null);
        setField(term135762, term135762.getClass(), "visibility", null);
        setIntField(term135762, term135762.getClass(), "bitset", -2147483648);
        setField(term135762, term135762.getClass(), "type", null);
        setField(term135762, term135762.getClass(), "thisType", null);
        setBooleanField(term135762, term135762.getClass(), "includeDocumentation", false);
        setField(term135761, term135761.getClass(), "currentInfo", term135762);
        setBooleanField(term135761, term135761.getClass(), "populated", false);
        setBooleanField(term135761, term135761.getClass(), "parseDocumentation", false);
        setField(term135761, term135761.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordInterface", argTypes, term135571, args);
        assertTrue(recursiveEquals(term135571, term135761));
        assertTrue(recursiveEquals(retValue, false));
    }

};


