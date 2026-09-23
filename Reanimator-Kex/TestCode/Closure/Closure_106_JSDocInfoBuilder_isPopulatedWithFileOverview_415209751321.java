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

public class JSDocInfoBuilder_isPopulatedWithFileOverview_415209751321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137659;
     Object term138322;

    public JSDocInfoBuilder_isPopulatedWithFileOverview_415209751321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137659 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setBooleanField(term137659, term137659.getClass(), "populated", false);
        term138322 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(term138322, term138322.getClass(), "currentInfo", null);
        setBooleanField(term138322, term138322.getClass(), "populated", false);
        setBooleanField(term138322, term138322.getClass(), "parseDocumentation", false);
        setField(term138322, term138322.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isPopulatedWithFileOverview", argTypes, term137659, args);
        assertTrue(recursiveEquals(term137659, term138322));
        assertTrue(recursiveEquals(retValue, false));
    }

};


