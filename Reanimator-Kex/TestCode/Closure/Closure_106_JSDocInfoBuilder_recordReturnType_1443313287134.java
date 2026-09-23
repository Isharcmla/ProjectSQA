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

public class JSDocInfoBuilder_recordReturnType_1443313287134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106565;
     Object term106739;
     Object term106781;
     Object term106783;

    public JSDocInfoBuilder_recordReturnType_1443313287134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106565 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term106645 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term106645, term106645.getClass(), "bitset", 1610612736);
        setField(term106565, term106565.getClass(), "currentInfo", term106645);
        term106739 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term106781 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term106782 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term106782, term106782.getClass(), "info", null);
        setField(term106782, term106782.getClass(), "documentation", null);
        setField(term106782, term106782.getClass(), "sourceName", null);
        setField(term106782, term106782.getClass(), "visibility", null);
        setIntField(term106782, term106782.getClass(), "bitset", 1610612736);
        setField(term106782, term106782.getClass(), "type", null);
        setField(term106782, term106782.getClass(), "thisType", null);
        setBooleanField(term106782, term106782.getClass(), "includeDocumentation", false);
        setField(term106781, term106781.getClass(), "currentInfo", term106782);
        setBooleanField(term106781, term106781.getClass(), "populated", false);
        setBooleanField(term106781, term106781.getClass(), "parseDocumentation", false);
        setField(term106781, term106781.getClass(), "currentMarker", null);
        term106783 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term106783, term106783.getClass(), "root", null);
        setField(term106783, term106783.getClass(), "sourceName", null);
        setField(term106783, term106783.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term106739;
        Object retValue = callMethod(klass, "recordReturnType", argTypes, term106565, args);
        assertTrue(recursiveEquals(term106565, term106781));
        assertTrue(recursiveEquals(term106739, term106783));
        assertTrue(recursiveEquals(retValue, false));
    }

};


