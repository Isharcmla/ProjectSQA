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

public class JSDocInfoBuilder_recordBaseType_1476256102342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143747;
     Object term143753;

    public JSDocInfoBuilder_recordBaseType_1476256102342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143747 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        term143753 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(term143753, term143753.getClass(), "currentInfo", null);
        setBooleanField(term143753, term143753.getClass(), "populated", false);
        setBooleanField(term143753, term143753.getClass(), "parseDocumentation", false);
        setField(term143753, term143753.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordBaseType", argTypes, term143747, args);
        assertTrue(recursiveEquals(term143747, term143753));
        assertTrue(recursiveEquals(retValue, false));
    }

};


