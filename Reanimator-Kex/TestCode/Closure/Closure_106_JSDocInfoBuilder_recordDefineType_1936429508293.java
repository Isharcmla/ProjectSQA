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

public class JSDocInfoBuilder_recordDefineType_1936429508293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132933;
     Object term133107;
     Object term133468;
     Object term133470;

    public JSDocInfoBuilder_recordDefineType_1936429508293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132933 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term133013 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term133013, term133013.getClass(), "bitset", 1073741824);
        setField(term133013, term133013.getClass(), "info", null);
        setField(term132933, term132933.getClass(), "currentInfo", term133013);
        term133107 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term133468 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term133469 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term133469, term133469.getClass(), "info", null);
        setField(term133469, term133469.getClass(), "documentation", null);
        setField(term133469, term133469.getClass(), "sourceName", null);
        setField(term133469, term133469.getClass(), "visibility", null);
        setIntField(term133469, term133469.getClass(), "bitset", 1073741824);
        setField(term133469, term133469.getClass(), "type", null);
        setField(term133469, term133469.getClass(), "thisType", null);
        setBooleanField(term133469, term133469.getClass(), "includeDocumentation", false);
        setField(term133468, term133468.getClass(), "currentInfo", term133469);
        setBooleanField(term133468, term133468.getClass(), "populated", false);
        setBooleanField(term133468, term133468.getClass(), "parseDocumentation", false);
        setField(term133468, term133468.getClass(), "currentMarker", null);
        term133470 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term133470, term133470.getClass(), "root", null);
        setField(term133470, term133470.getClass(), "sourceName", null);
        setField(term133470, term133470.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term133107;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term132933, args);
        assertTrue(recursiveEquals(term132933, term133468));
        assertTrue(recursiveEquals(term133107, term133470));
        assertTrue(recursiveEquals(retValue, false));
    }

};


