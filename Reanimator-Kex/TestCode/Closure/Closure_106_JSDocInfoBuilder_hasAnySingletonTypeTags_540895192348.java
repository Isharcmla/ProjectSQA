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

public class JSDocInfoBuilder_hasAnySingletonTypeTags_540895192348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144670;
     Object term144766;

    public JSDocInfoBuilder_hasAnySingletonTypeTags_540895192348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144670 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term144750 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term144750, term144750.getClass(), "bitset", 536870912);
        setField(term144670, term144670.getClass(), "currentInfo", term144750);
        term144766 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term144767 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term144767, term144767.getClass(), "info", null);
        setField(term144767, term144767.getClass(), "documentation", null);
        setField(term144767, term144767.getClass(), "sourceName", null);
        setField(term144767, term144767.getClass(), "visibility", null);
        setIntField(term144767, term144767.getClass(), "bitset", 536870912);
        setField(term144767, term144767.getClass(), "type", null);
        setField(term144767, term144767.getClass(), "thisType", null);
        setBooleanField(term144767, term144767.getClass(), "includeDocumentation", false);
        setField(term144766, term144766.getClass(), "currentInfo", term144767);
        setBooleanField(term144766, term144766.getClass(), "populated", false);
        setBooleanField(term144766, term144766.getClass(), "parseDocumentation", false);
        setField(term144766, term144766.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnySingletonTypeTags", argTypes, term144670, args);
        assertTrue(recursiveEquals(term144670, term144766));
        assertTrue(recursiveEquals(retValue, true));
    }

};


