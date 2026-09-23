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

public class JSDocInfoBuilder_recordThrowType_1200738989130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106036;
     Object term106220;

    public JSDocInfoBuilder_recordThrowType_1200738989130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106036 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term106116 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term106116, term106116.getClass(), "bitset", -2147483648);
        setField(term106036, term106036.getClass(), "currentInfo", term106116);
        term106220 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term106221 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term106221, term106221.getClass(), "info", null);
        setField(term106221, term106221.getClass(), "documentation", null);
        setField(term106221, term106221.getClass(), "sourceName", null);
        setField(term106221, term106221.getClass(), "visibility", null);
        setIntField(term106221, term106221.getClass(), "bitset", -2147483648);
        setField(term106221, term106221.getClass(), "type", null);
        setField(term106221, term106221.getClass(), "thisType", null);
        setBooleanField(term106221, term106221.getClass(), "includeDocumentation", false);
        setField(term106220, term106220.getClass(), "currentInfo", term106221);
        setBooleanField(term106220, term106220.getClass(), "populated", false);
        setBooleanField(term106220, term106220.getClass(), "parseDocumentation", false);
        setField(term106220, term106220.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordThrowType", argTypes, term106036, args);
        assertTrue(recursiveEquals(term106036, term106220));
        assertTrue(recursiveEquals(retValue, false));
    }

};


