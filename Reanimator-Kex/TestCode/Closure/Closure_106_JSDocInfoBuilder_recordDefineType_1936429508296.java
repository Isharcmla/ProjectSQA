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

public class JSDocInfoBuilder_recordDefineType_1936429508296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133667;
     Object term133935;
     Object term134023;
     Object term134026;

    public JSDocInfoBuilder_recordDefineType_1936429508296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133667 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term133747 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term133841 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term133747, term133747.getClass(), "bitset", 0);
        setField(term133747, term133747.getClass(), "info", null);
        setField(term133747, term133747.getClass(), "thisType", term133841);
        setField(term133667, term133667.getClass(), "currentInfo", term133747);
        term133935 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term134023 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term134024 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term134025 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term134024, term134024.getClass(), "info", null);
        setField(term134024, term134024.getClass(), "documentation", null);
        setField(term134024, term134024.getClass(), "sourceName", null);
        setField(term134024, term134024.getClass(), "visibility", null);
        setIntField(term134024, term134024.getClass(), "bitset", 0);
        setField(term134024, term134024.getClass(), "type", null);
        setField(term134025, term134025.getClass(), "root", null);
        setField(term134025, term134025.getClass(), "sourceName", null);
        setField(term134025, term134025.getClass(), "registry", null);
        setField(term134024, term134024.getClass(), "thisType", term134025);
        setBooleanField(term134024, term134024.getClass(), "includeDocumentation", false);
        setField(term134023, term134023.getClass(), "currentInfo", term134024);
        setBooleanField(term134023, term134023.getClass(), "populated", false);
        setBooleanField(term134023, term134023.getClass(), "parseDocumentation", false);
        setField(term134023, term134023.getClass(), "currentMarker", null);
        term134026 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term134026, term134026.getClass(), "root", null);
        setField(term134026, term134026.getClass(), "sourceName", null);
        setField(term134026, term134026.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term133935;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term133667, args);
        assertTrue(recursiveEquals(term133667, term134023));
        assertTrue(recursiveEquals(term133935, term134026));
        assertTrue(recursiveEquals(retValue, false));
    }

};


