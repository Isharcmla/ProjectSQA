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

public class JSDocInfoBuilder_recordDefineType_1936429508192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115226;
     Object term115400;
     Object term115553;
     Object term115556;

    public JSDocInfoBuilder_recordDefineType_1936429508192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115226 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term115306 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term115306, term115306.getClass(), "bitset", 0);
        setField(term115226, term115226.getClass(), "currentInfo", term115306);
        term115400 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term115553 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term115554 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term115555 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term115554, term115554.getClass(), "info", null);
        setField(term115554, term115554.getClass(), "documentation", null);
        setField(term115554, term115554.getClass(), "sourceName", null);
        setField(term115554, term115554.getClass(), "visibility", null);
        setIntField(term115554, term115554.getClass(), "bitset", 536870916);
        setField(term115555, term115555.getClass(), "root", null);
        setField(term115555, term115555.getClass(), "sourceName", null);
        setField(term115555, term115555.getClass(), "registry", null);
        setField(term115554, term115554.getClass(), "type", term115555);
        setField(term115554, term115554.getClass(), "thisType", null);
        setBooleanField(term115554, term115554.getClass(), "includeDocumentation", false);
        setField(term115553, term115553.getClass(), "currentInfo", term115554);
        setBooleanField(term115553, term115553.getClass(), "populated", true);
        setBooleanField(term115553, term115553.getClass(), "parseDocumentation", false);
        setField(term115553, term115553.getClass(), "currentMarker", null);
        term115556 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term115556, term115556.getClass(), "root", null);
        setField(term115556, term115556.getClass(), "sourceName", null);
        setField(term115556, term115556.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term115400;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term115226, args);
        assertTrue(recursiveEquals(term115226, term115553));
        assertTrue(recursiveEquals(term115400, term115556));
        assertTrue(recursiveEquals(retValue, true));
    }

};


