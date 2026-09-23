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

public class BorderArrangement_arrangeNN_689195361115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41783;
     Object term42746;
     Object term42748;
     Object term42749;
     Object term42753;
     Object term42731;

    public BorderArrangement_arrangeNN_689195361115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41783 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term41853 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        setField(term41783, term41783.getClass(), "topBlock", null);
        setField(term41783, term41783.getClass(), "bottomBlock", term41853);
        term42746 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        Object term42747 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setField(term42746, term42746.getClass(), "image", null);
        setField(term42746, term42746.getClass(), "position", null);
        setField(term42746, term42746.getClass(), "horizontalAlignment", null);
        setField(term42746, term42746.getClass(), "verticalAlignment", null);
        setField(term42746, term42746.getClass(), "listenerList", null);
        setBooleanField(term42746, term42746.getClass(), "notify", false);
        setField(term42746, term42746.getClass(), "id", null);
        setField(term42746, term42746.getClass(), "margin", null);
        setField(term42746, term42746.getClass(), "frame", null);
        setField(term42746, term42746.getClass(), "padding", null);
        setDoubleField(term42746, term42746.getClass(), "width", 0.0);
        setDoubleField(term42746, term42746.getClass(), "height", 0.0);
        setDoubleField(term42747, term42747.getClass(), "x", 0.0);
        setDoubleField(term42747, term42747.getClass(), "y", 0.0);
        setDoubleField(term42747, term42747.getClass(), "width", 0.0);
        setDoubleField(term42747, term42747.getClass(), "height", 0.0);
        setField(term42746, term42746.getClass(), "bounds", term42747);
        term42748 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term42748, term42748.getClass(), "width", 0.0);
        setDoubleField(term42748, term42748.getClass(), "height", 0.0);
        term42749 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term42750 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        setDoubleField(term42749, term42749.getClass(), "width", 0.0);
        setField(term42749, term42749.getClass(), "widthRange", null);
        setField(term42750, term42750.getClass(), "name", "LengthConstraintType.NONE");
        setField(term42749, term42749.getClass(), "widthConstraintType", term42750);
        setDoubleField(term42749, term42749.getClass(), "height", 0.0);
        setField(term42749, term42749.getClass(), "heightRange", null);
        setField(term42749, term42749.getClass(), "heightConstraintType", term42750);
        term42753 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setDoubleField(term42753, term42753.getClass(), "x", 0.0);
        setDoubleField(term42753, term42753.getClass(), "y", 0.0);
        setDoubleField(term42753, term42753.getClass(), "width", 0.0);
        setDoubleField(term42753, term42753.getClass(), "height", 0.0);
        term42731 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term42731, term42731.getClass(), "width", 0.0);
        setDoubleField(term42731, term42731.getClass(), "height", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "arrangeNN", argTypes, term41783, args);
        assertTrue(recursiveEquals(term41783, term42746));
        assertTrue(recursiveEquals(retValue, term42731));
    }

};


