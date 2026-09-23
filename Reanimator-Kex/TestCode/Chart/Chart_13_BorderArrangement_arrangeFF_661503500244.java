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
import static org.jfree.chart.block.EqualityUtils.*;
import java.lang.Object;

public class BorderArrangement_arrangeFF_661503500244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90021;
     Object term90249;
     Object term90867;
     Object term90869;
     Object term90870;
     Object term90871;
     Object term90875;
     Object term90843;

    public BorderArrangement_arrangeFF_661503500244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90021 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term90091 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        Object term90161 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        setField(term90021, term90021.getClass(), "topBlock", term90091);
        setField(term90021, term90021.getClass(), "bottomBlock", null);
        setField(term90021, term90021.getClass(), "leftBlock", null);
        setField(term90021, term90021.getClass(), "rightBlock", null);
        setField(term90021, term90021.getClass(), "centerBlock", term90161);
        term90249 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term90249, term90249.getClass(), "width", 103.0);
        setDoubleField(term90249, term90249.getClass(), "height", 6.755399441055744E15);
        term90867 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        Object term90868 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setField(term90867, term90867.getClass(), "image", null);
        setField(term90867, term90867.getClass(), "position", null);
        setField(term90867, term90867.getClass(), "horizontalAlignment", null);
        setField(term90867, term90867.getClass(), "verticalAlignment", null);
        setField(term90867, term90867.getClass(), "listenerList", null);
        setBooleanField(term90867, term90867.getClass(), "notify", false);
        setField(term90867, term90867.getClass(), "id", null);
        setField(term90867, term90867.getClass(), "margin", null);
        setField(term90867, term90867.getClass(), "frame", null);
        setField(term90867, term90867.getClass(), "padding", null);
        setDoubleField(term90867, term90867.getClass(), "width", 0.0);
        setDoubleField(term90867, term90867.getClass(), "height", 0.0);
        setDoubleField(term90868, term90868.getClass(), "x", 0.0);
        setDoubleField(term90868, term90868.getClass(), "y", 0.0);
        setDoubleField(term90868, term90868.getClass(), "width", 103.0);
        setDoubleField(term90868, term90868.getClass(), "height", 6.755399441055744E15);
        setField(term90867, term90867.getClass(), "bounds", term90868);
        term90869 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term90869, term90869.getClass(), "width", 103.0);
        setField(term90869, term90869.getClass(), "widthRange", null);
        setField(term90869, term90869.getClass(), "widthConstraintType", null);
        setDoubleField(term90869, term90869.getClass(), "height", 6.755399441055744E15);
        setField(term90869, term90869.getClass(), "heightRange", null);
        setField(term90869, term90869.getClass(), "heightConstraintType", null);
        term90870 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term90870, term90870.getClass(), "width", 0.0);
        setDoubleField(term90870, term90870.getClass(), "height", 0.0);
        term90871 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term90872 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        setDoubleField(term90871, term90871.getClass(), "width", 103.0);
        setField(term90871, term90871.getClass(), "widthRange", null);
        setField(term90872, term90872.getClass(), "name", "LengthConstraintType.FIXED");
        setField(term90871, term90871.getClass(), "widthConstraintType", term90872);
        setDoubleField(term90871, term90871.getClass(), "height", 6.755399441055744E15);
        setField(term90871, term90871.getClass(), "heightRange", null);
        setField(term90871, term90871.getClass(), "heightConstraintType", term90872);
        term90875 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setDoubleField(term90875, term90875.getClass(), "x", 0.0);
        setDoubleField(term90875, term90875.getClass(), "y", 0.0);
        setDoubleField(term90875, term90875.getClass(), "width", 103.0);
        setDoubleField(term90875, term90875.getClass(), "height", 6.755399441055744E15);
        term90843 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term90843, term90843.getClass(), "width", 103.0);
        setDoubleField(term90843, term90843.getClass(), "height", 6.755399441055744E15);
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
        args[2] = term90249;
        Object retValue = callMethod(klass, "arrangeFF", argTypes, term90021, args);
        assertTrue(recursiveEquals(term90021, term90867));
        assertTrue(recursiveEquals(term90249, 0.0));
        assertTrue(recursiveEquals(retValue, term90843));
    }

};


