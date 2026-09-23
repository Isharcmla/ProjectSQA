package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DisambiguateProperties_addInvalidatingType_1040538549115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38510;
     Object term38750;

    public DisambiguateProperties_addInvalidatingType_1040538549115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38510 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term38656 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term38510, term38510.getClass(), "typeSystem", term38656);
        term38750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term38750;
        args[1] = null;
        try {
            callMethod(klass, "addInvalidatingType", argTypes, term38510, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


