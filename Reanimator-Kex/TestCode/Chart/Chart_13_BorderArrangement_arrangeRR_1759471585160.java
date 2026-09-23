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

public class BorderArrangement_arrangeRR_1759471585160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57808;
     Object term57924;
     Object term57970;
     Object term58675;
     Object term58677;
     Object term58678;
     Object term58679;
     Object term58680;
     Object term58686;
     Object term58660;

    public BorderArrangement_arrangeRR_1759471585160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57808 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term57878 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        setField(term57808, term57808.getClass(), "topBlock", null);
        setField(term57808, term57808.getClass(), "bottomBlock", null);
        setField(term57808, term57808.getClass(), "leftBlock", null);
        setField(term57808, term57808.getClass(), "rightBlock", null);
        setField(term57808, term57808.getClass(), "centerBlock", term57878);
        term57924 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term57924, term57924.getClass(), "lower", -9.0792568487789199E18);
        setDoubleField(term57924, term57924.getClass(), "upper", 0.0);
        term57970 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term57970, term57970.getClass(), "lower", 8.031944300517421E15);
        setDoubleField(term57970, term57970.getClass(), "upper", 4.6221734384943237E18);
        term58675 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        Object term58676 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setField(term58675, term58675.getClass(), "image", null);
        setField(term58675, term58675.getClass(), "position", null);
        setField(term58675, term58675.getClass(), "horizontalAlignment", null);
        setField(term58675, term58675.getClass(), "verticalAlignment", null);
        setField(term58675, term58675.getClass(), "listenerList", null);
        setBooleanField(term58675, term58675.getClass(), "notify", false);
        setField(term58675, term58675.getClass(), "id", null);
        setField(term58675, term58675.getClass(), "margin", null);
        setField(term58675, term58675.getClass(), "frame", null);
        setField(term58675, term58675.getClass(), "padding", null);
        setDoubleField(term58675, term58675.getClass(), "width", 0.0);
        setDoubleField(term58675, term58675.getClass(), "height", 0.0);
        setDoubleField(term58676, term58676.getClass(), "x", 0.0);
        setDoubleField(term58676, term58676.getClass(), "y", 0.0);
        setDoubleField(term58676, term58676.getClass(), "width", 0.0);
        setDoubleField(term58676, term58676.getClass(), "height", 8.031944300517421E15);
        setField(term58675, term58675.getClass(), "bounds", term58676);
        term58677 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term58677, term58677.getClass(), "lower", 8.031944300517421E15);
        setDoubleField(term58677, term58677.getClass(), "upper", 4.6221734384943237E18);
        term58678 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term58678, term58678.getClass(), "lower", -9.0792568487789199E18);
        setDoubleField(term58678, term58678.getClass(), "upper", 0.0);
        term58679 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term58679, term58679.getClass(), "width", 0.0);
        setDoubleField(term58679, term58679.getClass(), "height", 0.0);
        term58680 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term58681 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term58682 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        Object term58685 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term58680, term58680.getClass(), "width", 0.0);
        setDoubleField(term58681, term58681.getClass(), "lower", -9.0792568487789199E18);
        setDoubleField(term58681, term58681.getClass(), "upper", 0.0);
        setField(term58680, term58680.getClass(), "widthRange", term58681);
        setField(term58682, term58682.getClass(), "name", "RectangleConstraintType.RANGE");
        setField(term58680, term58680.getClass(), "widthConstraintType", term58682);
        setDoubleField(term58680, term58680.getClass(), "height", 0.0);
        setDoubleField(term58685, term58685.getClass(), "lower", 8.031944300517421E15);
        setDoubleField(term58685, term58685.getClass(), "upper", 4.6221734384943237E18);
        setField(term58680, term58680.getClass(), "heightRange", term58685);
        setField(term58680, term58680.getClass(), "heightConstraintType", term58682);
        term58686 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setDoubleField(term58686, term58686.getClass(), "x", 0.0);
        setDoubleField(term58686, term58686.getClass(), "y", 0.0);
        setDoubleField(term58686, term58686.getClass(), "width", 0.0);
        setDoubleField(term58686, term58686.getClass(), "height", 8.031944300517421E15);
        term58660 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term58660, term58660.getClass(), "width", 0.0);
        setDoubleField(term58660, term58660.getClass(), "height", 8.031944300517421E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("org.jfree.data.Range");
        argTypes[2] = Class.forName("org.jfree.data.Range");
        argTypes[3] = Class.forName("java.awt.Graphics2D");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term57924;
        args[2] = term57970;
        args[3] = null;
        Object retValue = callMethod(klass, "arrangeRR", argTypes, term57808, args);
        assertTrue(recursiveEquals(term57808, term58675));
        assertTrue(recursiveEquals(term57924, term58678));
        assertTrue(recursiveEquals(term57970, 0.0));
        assertTrue(recursiveEquals(retValue, term58660));
    }

};


