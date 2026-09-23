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

public class JSDocInfoBuilder_recordTypedef_595478264350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144869;
     Object term144875;

    public JSDocInfoBuilder_recordTypedef_595478264350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144869 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        term144875 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(term144875, term144875.getClass(), "currentInfo", null);
        setBooleanField(term144875, term144875.getClass(), "populated", false);
        setBooleanField(term144875, term144875.getClass(), "parseDocumentation", false);
        setField(term144875, term144875.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term144869, args);
        assertTrue(recursiveEquals(term144869, term144875));
        assertTrue(recursiveEquals(retValue, false));
    }

};


