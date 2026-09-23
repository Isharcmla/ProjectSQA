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
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BorderArrangement_arrangeFN_631002552208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77195;

    public BorderArrangement_arrangeFN_631002552208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77195 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term77277 = newInstance(Class.forName("org.jfree.chart.title.PaintScaleLegend"));
        setField(term77195, term77195.getClass(), "topBlock", null);
        setField(term77195, term77195.getClass(), "bottomBlock", term77277);
        setField(null, Class.forName("org.jfree.chart.block.LengthConstraintType"), "name", "LengthConstraintType.NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = 0.0;
        callMethod(klass, "arrangeFN", argTypes, term77195, args);
    }

};


