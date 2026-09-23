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

public class JSDocInfoBuilder_recordInterface_182910988203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117092;
     Object term117618;

    public JSDocInfoBuilder_recordInterface_182910988203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117092 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term117172 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term117172, term117172.getClass(), "bitset", 536870912);
        setField(term117092, term117092.getClass(), "currentInfo", term117172);
        term117618 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term117619 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term117619, term117619.getClass(), "info", null);
        setField(term117619, term117619.getClass(), "documentation", null);
        setField(term117619, term117619.getClass(), "sourceName", null);
        setField(term117619, term117619.getClass(), "visibility", null);
        setIntField(term117619, term117619.getClass(), "bitset", 536870912);
        setField(term117619, term117619.getClass(), "type", null);
        setField(term117619, term117619.getClass(), "thisType", null);
        setBooleanField(term117619, term117619.getClass(), "includeDocumentation", false);
        setField(term117618, term117618.getClass(), "currentInfo", term117619);
        setBooleanField(term117618, term117618.getClass(), "populated", false);
        setBooleanField(term117618, term117618.getClass(), "parseDocumentation", false);
        setField(term117618, term117618.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordInterface", argTypes, term117092, args);
        assertTrue(recursiveEquals(term117092, term117618));
        assertTrue(recursiveEquals(retValue, false));
    }

};


