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
import java.lang.String;
import java.lang.Object;

public class JSDocInfoBuilder_populateDefaults_836025194380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151241;
     Object term151676;

    public JSDocInfoBuilder_populateDefaults_836025194380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term151681 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term151680 = ((Class) term151681).getDeclaredField((String) "PRIVATE");
        ((Field) term151680).setAccessible(true);
        Object enum153 = ((Field) term151680).get((Object) null);
        term151241 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term151241, term151241.getClass(), "visibility", enum153);
        Class<? extends Object> term151949 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term151948 = ((Class) term151949).getDeclaredField((String) "PRIVATE");
        ((Field) term151948).setAccessible(true);
        Object enum154 = ((Field) term151948).get((Object) null);
        term151676 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term151676, term151676.getClass(), "info", null);
        setField(term151676, term151676.getClass(), "documentation", null);
        setField(term151676, term151676.getClass(), "sourceName", null);
        setField(term151676, term151676.getClass(), "visibility", enum154);
        setIntField(term151676, term151676.getClass(), "bitset", 0);
        setField(term151676, term151676.getClass(), "type", null);
        setField(term151676, term151676.getClass(), "thisType", null);
        setBooleanField(term151676, term151676.getClass(), "includeDocumentation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term151241;
        callMethod(klass, "populateDefaults", argTypes, null, args);
        assertTrue(recursiveEquals(term151241, term151676));
    }

};


