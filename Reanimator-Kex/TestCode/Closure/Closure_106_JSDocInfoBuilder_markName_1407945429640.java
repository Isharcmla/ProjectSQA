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

public class JSDocInfoBuilder_markName_1407945429640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219512;

    public JSDocInfoBuilder_markName_1407945429640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219512 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term219606 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term219716 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$StringPosition"));
        setField(term219606, term219606.getClass(), "name", term219716);
        setField(term219512, term219512.getClass(), "currentMarker", term219606);
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
            callMethod(klass, "markName", argTypes, term219512, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


