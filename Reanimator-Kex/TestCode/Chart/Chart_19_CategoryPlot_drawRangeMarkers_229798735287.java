package org.jfree.chart.plot;

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
import java.lang.NoClassDefFoundError;
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CategoryPlot_drawRangeMarkers_229798735287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3064;
     Object term3066;

    public CategoryPlot_drawRangeMarkers_229798735287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3064 = new Integer(454281060);
        term3066 = newInstance(Class.forName("org.jfree.chart.util.Layer"));
        setField(term3066, term3066.getClass(), "name", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.jfree.chart.util.Layer");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term3064;
        args[3] = term3066;
        try {
            callMethod(klass, "drawRangeMarkers", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


