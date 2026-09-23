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
import java.lang.IllegalArgumentException;
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BorderArrangement_arrangeFR_66151503225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7731;
     Object term7887;

    public BorderArrangement_arrangeFR_66151503225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7731 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term7799 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        setField(term7731, term7731.getClass(), "topBlock", null);
        setField(term7731, term7731.getClass(), "bottomBlock", null);
        setField(term7731, term7731.getClass(), "leftBlock", term7799);
        term7887 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term7887, term7887.getClass(), "width", -9.223372036854776E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = Class.forName("org.jfree.chart.block.RectangleConstraint");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term7887;
        try {
            callMethod(klass, "arrangeFR", argTypes, term7731, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


