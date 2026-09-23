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

public class JSDocInfoBuilder_addAuthor_1555190229182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113554;
     Object term113678;

    public JSDocInfoBuilder_addAuthor_1555190229182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113554 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term113634 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term113634, term113634.getClass(), "includeDocumentation", false);
        setField(term113554, term113554.getClass(), "currentInfo", term113634);
        term113678 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term113679 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term113679, term113679.getClass(), "info", null);
        setField(term113679, term113679.getClass(), "documentation", null);
        setField(term113679, term113679.getClass(), "sourceName", null);
        setField(term113679, term113679.getClass(), "visibility", null);
        setIntField(term113679, term113679.getClass(), "bitset", 0);
        setField(term113679, term113679.getClass(), "type", null);
        setField(term113679, term113679.getClass(), "thisType", null);
        setBooleanField(term113679, term113679.getClass(), "includeDocumentation", false);
        setField(term113678, term113678.getClass(), "currentInfo", term113679);
        setBooleanField(term113678, term113678.getClass(), "populated", true);
        setBooleanField(term113678, term113678.getClass(), "parseDocumentation", false);
        setField(term113678, term113678.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "addAuthor", argTypes, term113554, args);
        assertTrue(recursiveEquals(term113554, term113678));
        assertTrue(recursiveEquals(retValue, true));
    }

};


