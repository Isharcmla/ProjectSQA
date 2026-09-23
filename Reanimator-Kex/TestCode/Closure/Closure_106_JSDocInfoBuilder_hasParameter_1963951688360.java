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

public class JSDocInfoBuilder_hasParameter_1963951688360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146673;
     Object term146766;

    public JSDocInfoBuilder_hasParameter_1963951688360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146673 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term146753 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term146753, term146753.getClass(), "info", null);
        setField(term146673, term146673.getClass(), "currentInfo", term146753);
        term146766 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term146767 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term146767, term146767.getClass(), "info", null);
        setField(term146767, term146767.getClass(), "documentation", null);
        setField(term146767, term146767.getClass(), "sourceName", null);
        setField(term146767, term146767.getClass(), "visibility", null);
        setIntField(term146767, term146767.getClass(), "bitset", 0);
        setField(term146767, term146767.getClass(), "type", null);
        setField(term146767, term146767.getClass(), "thisType", null);
        setBooleanField(term146767, term146767.getClass(), "includeDocumentation", false);
        setField(term146766, term146766.getClass(), "currentInfo", term146767);
        setBooleanField(term146766, term146766.getClass(), "populated", false);
        setBooleanField(term146766, term146766.getClass(), "parseDocumentation", false);
        setField(term146766, term146766.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasParameter", argTypes, term146673, args);
        assertTrue(recursiveEquals(term146673, term146766));
    }

};


