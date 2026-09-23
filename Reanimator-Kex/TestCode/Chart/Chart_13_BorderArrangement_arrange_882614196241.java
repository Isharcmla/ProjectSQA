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

public class BorderArrangement_arrange_882614196241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88579;
     Object term88677;
     Object term88765;

    public BorderArrangement_arrange_882614196241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88579 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        term88677 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        term88765 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term88855 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        setDoubleField(term88765, term88765.getClass(), "width", 0.0);
        setField(term88765, term88765.getClass(), "widthRange", null);
        setField(term88855, term88855.getClass(), "name", "LengthConstraintType.NONE");
        setField(term88765, term88765.getClass(), "widthConstraintType", term88855);
        setDoubleField(term88765, term88765.getClass(), "height", 0.0);
        setField(term88765, term88765.getClass(), "heightRange", null);
        setField(term88765, term88765.getClass(), "heightConstraintType", term88855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = Class.forName("org.jfree.chart.block.RectangleConstraint");
        Object[] args = new Object[3];
        args[0] = term88677;
        args[1] = null;
        args[2] = term88765;
        try {
            callMethod(klass, "arrange", argTypes, term88579, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


