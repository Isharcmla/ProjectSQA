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

public class JSDocInfoBuilder_recordInterface_182910988194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115681;
     Object term115795;

    public JSDocInfoBuilder_recordInterface_182910988194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115681 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term115761 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term115761, term115761.getClass(), "bitset", 1610612736);
        setField(term115681, term115681.getClass(), "currentInfo", term115761);
        term115795 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term115796 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term115796, term115796.getClass(), "info", null);
        setField(term115796, term115796.getClass(), "documentation", null);
        setField(term115796, term115796.getClass(), "sourceName", null);
        setField(term115796, term115796.getClass(), "visibility", null);
        setIntField(term115796, term115796.getClass(), "bitset", 1610612736);
        setField(term115796, term115796.getClass(), "type", null);
        setField(term115796, term115796.getClass(), "thisType", null);
        setBooleanField(term115796, term115796.getClass(), "includeDocumentation", false);
        setField(term115795, term115795.getClass(), "currentInfo", term115796);
        setBooleanField(term115795, term115795.getClass(), "populated", false);
        setBooleanField(term115795, term115795.getClass(), "parseDocumentation", false);
        setField(term115795, term115795.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordInterface", argTypes, term115681, args);
        assertTrue(recursiveEquals(term115681, term115795));
        assertTrue(recursiveEquals(retValue, false));
    }

};


