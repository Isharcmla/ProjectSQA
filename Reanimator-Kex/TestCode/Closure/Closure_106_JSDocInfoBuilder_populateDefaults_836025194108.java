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

public class JSDocInfoBuilder_populateDefaults_836025194108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102332;
     Object term102612;

    public JSDocInfoBuilder_populateDefaults_836025194108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102332 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Class<? extends Object> term102617 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term102616 = ((Class) term102617).getDeclaredField((String) "INHERITED");
        ((Field) term102616).setAccessible(true);
        Object enum150 = ((Field) term102616).get((Object) null);
        term102612 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term102612, term102612.getClass(), "info", null);
        setField(term102612, term102612.getClass(), "documentation", null);
        setField(term102612, term102612.getClass(), "sourceName", null);
        setField(term102612, term102612.getClass(), "visibility", enum150);
        setIntField(term102612, term102612.getClass(), "bitset", 0);
        setField(term102612, term102612.getClass(), "type", null);
        setField(term102612, term102612.getClass(), "thisType", null);
        setBooleanField(term102612, term102612.getClass(), "includeDocumentation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term102332;
        callMethod(klass, "populateDefaults", argTypes, null, args);
        assertTrue(recursiveEquals(term102332, term102612));
    }

};


