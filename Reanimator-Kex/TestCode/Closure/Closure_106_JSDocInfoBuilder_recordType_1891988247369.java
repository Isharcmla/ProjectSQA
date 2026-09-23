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

public class JSDocInfoBuilder_recordType_1891988247369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148295;
     Object term148469;
     Object term148964;
     Object term148966;

    public JSDocInfoBuilder_recordType_1891988247369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148295 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term148375 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term148375, term148375.getClass(), "bitset", 1073741824);
        setField(term148375, term148375.getClass(), "info", null);
        setField(term148295, term148295.getClass(), "currentInfo", term148375);
        term148469 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term148964 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term148965 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term148965, term148965.getClass(), "info", null);
        setField(term148965, term148965.getClass(), "documentation", null);
        setField(term148965, term148965.getClass(), "sourceName", null);
        setField(term148965, term148965.getClass(), "visibility", null);
        setIntField(term148965, term148965.getClass(), "bitset", 1073741824);
        setField(term148965, term148965.getClass(), "type", null);
        setField(term148965, term148965.getClass(), "thisType", null);
        setBooleanField(term148965, term148965.getClass(), "includeDocumentation", false);
        setField(term148964, term148964.getClass(), "currentInfo", term148965);
        setBooleanField(term148964, term148964.getClass(), "populated", false);
        setBooleanField(term148964, term148964.getClass(), "parseDocumentation", false);
        setField(term148964, term148964.getClass(), "currentMarker", null);
        term148966 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term148966, term148966.getClass(), "root", null);
        setField(term148966, term148966.getClass(), "sourceName", null);
        setField(term148966, term148966.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term148469;
        Object retValue = callMethod(klass, "recordType", argTypes, term148295, args);
        assertTrue(recursiveEquals(term148295, term148964));
        assertTrue(recursiveEquals(term148469, term148966));
        assertTrue(recursiveEquals(retValue, false));
    }

};


