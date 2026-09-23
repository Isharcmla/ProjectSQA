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

public class BorderArrangement_arrangeFR_661515032265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98679;
     Object term98865;

    public BorderArrangement_arrangeFR_661515032265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98679 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term98777 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term98679, term98679.getClass(), "topBlock", term98777);
        term98865 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term98865, term98865.getClass(), "width", 0.0);
        setField(null, Class.forName("org.jfree.chart.block.LengthConstraintType"), "name", "LengthConstraintType.NONE");
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
        args[2] = term98865;
        callMethod(klass, "arrangeFR", argTypes, term98679, args);
    }

};


