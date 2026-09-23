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

public class BorderArrangement_arrangeRR_1759471585324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118876;
     Object term118992;
     Object term119038;
     Object term136597;
     Object term136599;
     Object term136600;
     Object term136601;
     Object term136602;
     Object term136608;
     Object term136582;

    public BorderArrangement_arrangeRR_1759471585324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118876 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term118946 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        setField(term118876, term118876.getClass(), "topBlock", null);
        setField(term118876, term118876.getClass(), "bottomBlock", null);
        setField(term118876, term118876.getClass(), "leftBlock", null);
        setField(term118876, term118876.getClass(), "rightBlock", null);
        setField(term118876, term118876.getClass(), "centerBlock", term118946);
        term118992 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term118992, term118992.getClass(), "lower", -9.2132389376931922E18);
        setDoubleField(term118992, term118992.getClass(), "upper", 5.8124582690750464E17);
        term119038 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term119038, term119038.getClass(), "lower", 3.4227357168015821E17);
        setDoubleField(term119038, term119038.getClass(), "upper", 6.8454721207979213E17);
        term136597 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        Object term136598 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setField(term136597, term136597.getClass(), "image", null);
        setField(term136597, term136597.getClass(), "position", null);
        setField(term136597, term136597.getClass(), "horizontalAlignment", null);
        setField(term136597, term136597.getClass(), "verticalAlignment", null);
        setField(term136597, term136597.getClass(), "listenerList", null);
        setBooleanField(term136597, term136597.getClass(), "notify", false);
        setField(term136597, term136597.getClass(), "id", null);
        setField(term136597, term136597.getClass(), "margin", null);
        setField(term136597, term136597.getClass(), "frame", null);
        setField(term136597, term136597.getClass(), "padding", null);
        setDoubleField(term136597, term136597.getClass(), "width", 0.0);
        setDoubleField(term136597, term136597.getClass(), "height", 0.0);
        setDoubleField(term136598, term136598.getClass(), "x", 0.0);
        setDoubleField(term136598, term136598.getClass(), "y", 0.0);
        setDoubleField(term136598, term136598.getClass(), "width", 0.0);
        setDoubleField(term136598, term136598.getClass(), "height", 3.4227357168015821E17);
        setField(term136597, term136597.getClass(), "bounds", term136598);
        term136599 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term136599, term136599.getClass(), "lower", 3.4227357168015821E17);
        setDoubleField(term136599, term136599.getClass(), "upper", 6.8454721207979213E17);
        term136600 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term136600, term136600.getClass(), "lower", -9.2132389376931922E18);
        setDoubleField(term136600, term136600.getClass(), "upper", 5.8124582690750464E17);
        term136601 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term136601, term136601.getClass(), "width", 0.0);
        setDoubleField(term136601, term136601.getClass(), "height", 0.0);
        term136602 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term136603 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term136604 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        Object term136607 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term136602, term136602.getClass(), "width", 0.0);
        setDoubleField(term136603, term136603.getClass(), "lower", -9.2132389376931922E18);
        setDoubleField(term136603, term136603.getClass(), "upper", 5.8124582690750464E17);
        setField(term136602, term136602.getClass(), "widthRange", term136603);
        setField(term136604, term136604.getClass(), "name", "RectangleConstraintType.RANGE");
        setField(term136602, term136602.getClass(), "widthConstraintType", term136604);
        setDoubleField(term136602, term136602.getClass(), "height", 0.0);
        setDoubleField(term136607, term136607.getClass(), "lower", 3.4227357168015821E17);
        setDoubleField(term136607, term136607.getClass(), "upper", 6.8454721207979213E17);
        setField(term136602, term136602.getClass(), "heightRange", term136607);
        setField(term136602, term136602.getClass(), "heightConstraintType", term136604);
        term136608 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setDoubleField(term136608, term136608.getClass(), "x", 0.0);
        setDoubleField(term136608, term136608.getClass(), "y", 0.0);
        setDoubleField(term136608, term136608.getClass(), "width", 0.0);
        setDoubleField(term136608, term136608.getClass(), "height", 3.4227357168015821E17);
        term136582 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term136582, term136582.getClass(), "width", 0.0);
        setDoubleField(term136582, term136582.getClass(), "height", 3.4227357168015821E17);
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
        args[1] = term118992;
        args[2] = term119038;
        args[3] = null;
        Object retValue = callMethod(klass, "arrangeRR", argTypes, term118876, args);
        assertTrue(recursiveEquals(term118876, term136597));
        assertTrue(recursiveEquals(term118992, term136600));
        assertTrue(recursiveEquals(term119038, 0.0));
        assertTrue(recursiveEquals(retValue, term136582));
    }

};


