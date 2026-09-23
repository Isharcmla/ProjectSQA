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

public class JSDocInfoBuilder_recordDefineType_1936429508346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144274;
     Object term144448;
     Object term144553;
     Object term144555;

    public JSDocInfoBuilder_recordDefineType_1936429508346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144274 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term144354 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term144354, term144354.getClass(), "bitset", 1610612736);
        setField(term144354, term144354.getClass(), "info", null);
        setField(term144354, term144354.getClass(), "thisType", null);
        setField(term144274, term144274.getClass(), "currentInfo", term144354);
        term144448 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term144553 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term144554 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term144554, term144554.getClass(), "info", null);
        setField(term144554, term144554.getClass(), "documentation", null);
        setField(term144554, term144554.getClass(), "sourceName", null);
        setField(term144554, term144554.getClass(), "visibility", null);
        setIntField(term144554, term144554.getClass(), "bitset", 1610612736);
        setField(term144554, term144554.getClass(), "type", null);
        setField(term144554, term144554.getClass(), "thisType", null);
        setBooleanField(term144554, term144554.getClass(), "includeDocumentation", false);
        setField(term144553, term144553.getClass(), "currentInfo", term144554);
        setBooleanField(term144553, term144553.getClass(), "populated", false);
        setBooleanField(term144553, term144553.getClass(), "parseDocumentation", false);
        setField(term144553, term144553.getClass(), "currentMarker", null);
        term144555 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term144555, term144555.getClass(), "root", null);
        setField(term144555, term144555.getClass(), "sourceName", null);
        setField(term144555, term144555.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term144448;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term144274, args);
        assertTrue(recursiveEquals(term144274, term144553));
        assertTrue(recursiveEquals(term144448, term144555));
        assertTrue(recursiveEquals(retValue, false));
    }

};


