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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class JSDocInfoBuilder_markAnnotation_1356395335413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159423;

    public JSDocInfoBuilder_markAnnotation_1356395335413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term159697 = new ArrayList();
        term159423 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term159503 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term159645 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term159503, term159503.getClass(), "includeDocumentation", true);
        setField(term159645, term159645.getClass(), "markers", term159697);
        setField(term159503, term159503.getClass(), "documentation", term159645);
        setField(term159423, term159423.getClass(), "currentInfo", term159503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        try {
            callMethod(klass, "markAnnotation", argTypes, term159423, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


