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

public class JSDocInfoBuilder_recordTypedef_595478264356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145580;
     Object term145754;
     Object term145835;
     Object term145837;

    public JSDocInfoBuilder_recordTypedef_595478264356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145580 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term145660 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term145660, term145660.getClass(), "bitset", 1610612736);
        setField(term145660, term145660.getClass(), "info", null);
        setField(term145660, term145660.getClass(), "thisType", null);
        setField(term145580, term145580.getClass(), "currentInfo", term145660);
        term145754 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term145835 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term145836 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term145836, term145836.getClass(), "info", null);
        setField(term145836, term145836.getClass(), "documentation", null);
        setField(term145836, term145836.getClass(), "sourceName", null);
        setField(term145836, term145836.getClass(), "visibility", null);
        setIntField(term145836, term145836.getClass(), "bitset", 1610612736);
        setField(term145836, term145836.getClass(), "type", null);
        setField(term145836, term145836.getClass(), "thisType", null);
        setBooleanField(term145836, term145836.getClass(), "includeDocumentation", false);
        setField(term145835, term145835.getClass(), "currentInfo", term145836);
        setBooleanField(term145835, term145835.getClass(), "populated", false);
        setBooleanField(term145835, term145835.getClass(), "parseDocumentation", false);
        setField(term145835, term145835.getClass(), "currentMarker", null);
        term145837 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term145837, term145837.getClass(), "root", null);
        setField(term145837, term145837.getClass(), "sourceName", null);
        setField(term145837, term145837.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term145754;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term145580, args);
        assertTrue(recursiveEquals(term145580, term145835));
        assertTrue(recursiveEquals(term145754, term145837));
        assertTrue(recursiveEquals(retValue, false));
    }

};


