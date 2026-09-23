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

public class JSDocInfoBuilder_recordEnumParameterType_881918703161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110209;
     Object term110383;
     Object term110689;
     Object term110691;

    public JSDocInfoBuilder_recordEnumParameterType_881918703161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110209 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term110289 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term110289, term110289.getClass(), "bitset", 2);
        setField(term110209, term110209.getClass(), "currentInfo", term110289);
        term110383 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term110689 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term110690 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term110690, term110690.getClass(), "info", null);
        setField(term110690, term110690.getClass(), "documentation", null);
        setField(term110690, term110690.getClass(), "sourceName", null);
        setField(term110690, term110690.getClass(), "visibility", null);
        setIntField(term110690, term110690.getClass(), "bitset", 2);
        setField(term110690, term110690.getClass(), "type", null);
        setField(term110690, term110690.getClass(), "thisType", null);
        setBooleanField(term110690, term110690.getClass(), "includeDocumentation", false);
        setField(term110689, term110689.getClass(), "currentInfo", term110690);
        setBooleanField(term110689, term110689.getClass(), "populated", false);
        setBooleanField(term110689, term110689.getClass(), "parseDocumentation", false);
        setField(term110689, term110689.getClass(), "currentMarker", null);
        term110691 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term110691, term110691.getClass(), "root", null);
        setField(term110691, term110691.getClass(), "sourceName", null);
        setField(term110691, term110691.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term110383;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term110209, args);
        assertTrue(recursiveEquals(term110209, term110689));
        assertTrue(recursiveEquals(term110383, term110691));
        assertTrue(recursiveEquals(retValue, false));
    }

};


