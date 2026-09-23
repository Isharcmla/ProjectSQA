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
import java.util.ArrayList;

public class JSDocInfoBuilder_recordImplementedInterface_679699770278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130194;
     Object term130429;

    public JSDocInfoBuilder_recordImplementedInterface_679699770278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130194 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term130274 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term130398 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term130398, term130398.getClass(), "implementedInterfaces", null);
        setField(term130274, term130274.getClass(), "info", term130398);
        setField(term130194, term130194.getClass(), "currentInfo", term130274);
        ArrayList term130432 = new ArrayList();
        ((ArrayList) term130432).add((Object)null);
        term130429 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term130430 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term130431 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term130431, term130431.getClass(), "baseType", null);
        setField(term130431, term130431.getClass(), "implementedInterfaces", term130432);
        setField(term130431, term130431.getClass(), "parameters", null);
        setField(term130431, term130431.getClass(), "thrownTypes", null);
        setField(term130431, term130431.getClass(), "templateTypeName", null);
        setField(term130431, term130431.getClass(), "description", null);
        setField(term130431, term130431.getClass(), "deprecated", null);
        setField(term130431, term130431.getClass(), "license", null);
        setField(term130431, term130431.getClass(), "suppressions", null);
        setField(term130430, term130430.getClass(), "info", term130431);
        setField(term130430, term130430.getClass(), "documentation", null);
        setField(term130430, term130430.getClass(), "sourceName", null);
        setField(term130430, term130430.getClass(), "visibility", null);
        setIntField(term130430, term130430.getClass(), "bitset", 0);
        setField(term130430, term130430.getClass(), "type", null);
        setField(term130430, term130430.getClass(), "thisType", null);
        setBooleanField(term130430, term130430.getClass(), "includeDocumentation", false);
        setField(term130429, term130429.getClass(), "currentInfo", term130430);
        setBooleanField(term130429, term130429.getClass(), "populated", true);
        setBooleanField(term130429, term130429.getClass(), "parseDocumentation", false);
        setField(term130429, term130429.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordImplementedInterface", argTypes, term130194, args);
        assertTrue(recursiveEquals(term130194, term130429));
        assertTrue(recursiveEquals(retValue, true));
    }

};


