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

public class JSDocInfoBuilder_recordNoShadow_432707390122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104715;
     Object term104816;

    public JSDocInfoBuilder_recordNoShadow_432707390122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104715 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term104795 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term104795, term104795.getClass(), "bitset", 0);
        setField(term104715, term104715.getClass(), "currentInfo", term104795);
        term104816 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term104817 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term104817, term104817.getClass(), "info", null);
        setField(term104817, term104817.getClass(), "documentation", null);
        setField(term104817, term104817.getClass(), "sourceName", null);
        setField(term104817, term104817.getClass(), "visibility", null);
        setIntField(term104817, term104817.getClass(), "bitset", 2048);
        setField(term104817, term104817.getClass(), "type", null);
        setField(term104817, term104817.getClass(), "thisType", null);
        setBooleanField(term104817, term104817.getClass(), "includeDocumentation", false);
        setField(term104816, term104816.getClass(), "currentInfo", term104817);
        setBooleanField(term104816, term104816.getClass(), "populated", true);
        setBooleanField(term104816, term104816.getClass(), "parseDocumentation", false);
        setField(term104816, term104816.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordNoShadow", argTypes, term104715, args);
        assertTrue(recursiveEquals(term104715, term104816));
        assertTrue(recursiveEquals(retValue, true));
    }

};


