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

public class JSDocInfoBuilder_isInterfaceRecorded_420165813284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131644;
     Object term131739;

    public JSDocInfoBuilder_isInterfaceRecorded_420165813284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131644 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term131724 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term131724, term131724.getClass(), "bitset", 512);
        setField(term131644, term131644.getClass(), "currentInfo", term131724);
        term131739 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term131740 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term131740, term131740.getClass(), "info", null);
        setField(term131740, term131740.getClass(), "documentation", null);
        setField(term131740, term131740.getClass(), "sourceName", null);
        setField(term131740, term131740.getClass(), "visibility", null);
        setIntField(term131740, term131740.getClass(), "bitset", 512);
        setField(term131740, term131740.getClass(), "type", null);
        setField(term131740, term131740.getClass(), "thisType", null);
        setBooleanField(term131740, term131740.getClass(), "includeDocumentation", false);
        setField(term131739, term131739.getClass(), "currentInfo", term131740);
        setBooleanField(term131739, term131739.getClass(), "populated", false);
        setBooleanField(term131739, term131739.getClass(), "parseDocumentation", false);
        setField(term131739, term131739.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInterfaceRecorded", argTypes, term131644, args);
        assertTrue(recursiveEquals(term131644, term131739));
    }

};


