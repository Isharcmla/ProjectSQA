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

public class JSDocInfoBuilder_recordConstancy_45601473477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174133;
     Object term174335;

    public JSDocInfoBuilder_recordConstancy_45601473477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174133 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term174213 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term174213, term174213.getClass(), "bitset", 1);
        setField(term174133, term174133.getClass(), "currentInfo", term174213);
        term174335 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term174336 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term174336, term174336.getClass(), "info", null);
        setField(term174336, term174336.getClass(), "documentation", null);
        setField(term174336, term174336.getClass(), "sourceName", null);
        setField(term174336, term174336.getClass(), "visibility", null);
        setIntField(term174336, term174336.getClass(), "bitset", 1);
        setField(term174336, term174336.getClass(), "type", null);
        setField(term174336, term174336.getClass(), "thisType", null);
        setBooleanField(term174336, term174336.getClass(), "includeDocumentation", false);
        setField(term174335, term174335.getClass(), "currentInfo", term174336);
        setBooleanField(term174335, term174335.getClass(), "populated", false);
        setBooleanField(term174335, term174335.getClass(), "parseDocumentation", false);
        setField(term174335, term174335.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordConstancy", argTypes, term174133, args);
        assertTrue(recursiveEquals(term174133, term174335));
        assertTrue(recursiveEquals(retValue, false));
    }

};


