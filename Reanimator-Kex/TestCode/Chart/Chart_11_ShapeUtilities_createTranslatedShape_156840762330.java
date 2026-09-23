package org.jfree.chart.util;

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
import java.lang.IllegalArgumentException;
import static org.jfree.chart.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class ShapeUtilities_createTranslatedShape_156840762330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307;
     Object term320;
     Object term322;

    public ShapeUtilities_createTranslatedShape_156840762330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        setField(term307, term307.getClass(), "name", "PAEBtnZtTD");
        term320 = new Double(0.5523635872663106);
        term322 = new Double(0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.Shape");
        argTypes[1] = Class.forName("org.jfree.chart.util.RectangleAnchor");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term307;
        args[2] = term320;
        args[3] = term322;
        try {
            callMethod(klass, "createTranslatedShape", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


