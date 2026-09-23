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

public class JSDocInfoBuilder_recordThisType_1193895769170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111609;
     Object term111783;
     Object term111829;
     Object term111832;

    public JSDocInfoBuilder_recordThisType_1193895769170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111609 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term111689 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term111689, term111689.getClass(), "bitset", -1610612736);
        setField(term111609, term111609.getClass(), "currentInfo", term111689);
        term111783 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term111829 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term111830 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term111831 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term111830, term111830.getClass(), "info", null);
        setField(term111830, term111830.getClass(), "documentation", null);
        setField(term111830, term111830.getClass(), "sourceName", null);
        setField(term111830, term111830.getClass(), "visibility", null);
        setIntField(term111830, term111830.getClass(), "bitset", -1610612736);
        setField(term111830, term111830.getClass(), "type", null);
        setField(term111831, term111831.getClass(), "root", null);
        setField(term111831, term111831.getClass(), "sourceName", null);
        setField(term111831, term111831.getClass(), "registry", null);
        setField(term111830, term111830.getClass(), "thisType", term111831);
        setBooleanField(term111830, term111830.getClass(), "includeDocumentation", false);
        setField(term111829, term111829.getClass(), "currentInfo", term111830);
        setBooleanField(term111829, term111829.getClass(), "populated", true);
        setBooleanField(term111829, term111829.getClass(), "parseDocumentation", false);
        setField(term111829, term111829.getClass(), "currentMarker", null);
        term111832 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term111832, term111832.getClass(), "root", null);
        setField(term111832, term111832.getClass(), "sourceName", null);
        setField(term111832, term111832.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term111783;
        Object retValue = callMethod(klass, "recordThisType", argTypes, term111609, args);
        assertTrue(recursiveEquals(term111609, term111829));
        assertTrue(recursiveEquals(term111783, term111832));
        assertTrue(recursiveEquals(retValue, true));
    }

};


