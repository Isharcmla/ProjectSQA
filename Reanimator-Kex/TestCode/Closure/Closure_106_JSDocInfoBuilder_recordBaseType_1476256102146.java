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

public class JSDocInfoBuilder_recordBaseType_1476256102146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108283;
     Object term108457;
     Object term108477;
     Object term108479;

    public JSDocInfoBuilder_recordBaseType_1476256102146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108283 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term108363 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term108363, term108363.getClass(), "bitset", 536870912);
        setField(term108283, term108283.getClass(), "currentInfo", term108363);
        term108457 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term108477 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term108478 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term108478, term108478.getClass(), "info", null);
        setField(term108478, term108478.getClass(), "documentation", null);
        setField(term108478, term108478.getClass(), "sourceName", null);
        setField(term108478, term108478.getClass(), "visibility", null);
        setIntField(term108478, term108478.getClass(), "bitset", 536870912);
        setField(term108478, term108478.getClass(), "type", null);
        setField(term108478, term108478.getClass(), "thisType", null);
        setBooleanField(term108478, term108478.getClass(), "includeDocumentation", false);
        setField(term108477, term108477.getClass(), "currentInfo", term108478);
        setBooleanField(term108477, term108477.getClass(), "populated", false);
        setBooleanField(term108477, term108477.getClass(), "parseDocumentation", false);
        setField(term108477, term108477.getClass(), "currentMarker", null);
        term108479 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term108479, term108479.getClass(), "root", null);
        setField(term108479, term108479.getClass(), "sourceName", null);
        setField(term108479, term108479.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term108457;
        Object retValue = callMethod(klass, "recordBaseType", argTypes, term108283, args);
        assertTrue(recursiveEquals(term108283, term108477));
        assertTrue(recursiveEquals(term108457, term108479));
        assertTrue(recursiveEquals(retValue, false));
    }

};


