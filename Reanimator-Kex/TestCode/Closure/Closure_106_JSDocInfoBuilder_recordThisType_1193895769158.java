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

public class JSDocInfoBuilder_recordThisType_1193895769158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109868;
     Object term110042;
     Object term110094;
     Object term110096;

    public JSDocInfoBuilder_recordThisType_1193895769158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109868 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term109948 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term109948, term109948.getClass(), "bitset", -2147483648);
        setField(term109868, term109868.getClass(), "currentInfo", term109948);
        term110042 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term110094 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term110095 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term110095, term110095.getClass(), "info", null);
        setField(term110095, term110095.getClass(), "documentation", null);
        setField(term110095, term110095.getClass(), "sourceName", null);
        setField(term110095, term110095.getClass(), "visibility", null);
        setIntField(term110095, term110095.getClass(), "bitset", -2147483648);
        setField(term110095, term110095.getClass(), "type", null);
        setField(term110095, term110095.getClass(), "thisType", null);
        setBooleanField(term110095, term110095.getClass(), "includeDocumentation", false);
        setField(term110094, term110094.getClass(), "currentInfo", term110095);
        setBooleanField(term110094, term110094.getClass(), "populated", false);
        setBooleanField(term110094, term110094.getClass(), "parseDocumentation", false);
        setField(term110094, term110094.getClass(), "currentMarker", null);
        term110096 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term110096, term110096.getClass(), "root", null);
        setField(term110096, term110096.getClass(), "sourceName", null);
        setField(term110096, term110096.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term110042;
        Object retValue = callMethod(klass, "recordThisType", argTypes, term109868, args);
        assertTrue(recursiveEquals(term109868, term110094));
        assertTrue(recursiveEquals(term110042, term110096));
        assertTrue(recursiveEquals(retValue, false));
    }

};


