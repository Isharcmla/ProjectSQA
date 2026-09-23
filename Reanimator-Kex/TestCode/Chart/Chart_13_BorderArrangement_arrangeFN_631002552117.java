package org.jfree.chart.block;

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
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BorderArrangement_arrangeFN_631002552117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42485;
     Object term42633;

    public BorderArrangement_arrangeFN_631002552117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42485 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term42555 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        setField(term42485, term42485.getClass(), "topBlock", null);
        setField(term42485, term42485.getClass(), "bottomBlock", null);
        setField(term42485, term42485.getClass(), "leftBlock", term42555);
        setField(term42485, term42485.getClass(), "rightBlock", null);
        setField(term42485, term42485.getClass(), "centerBlock", null);
        term42633 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term42633;
        args[1] = null;
        args[2] = 0.0;
        try {
            callMethod(klass, "arrangeFN", argTypes, term42485, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


