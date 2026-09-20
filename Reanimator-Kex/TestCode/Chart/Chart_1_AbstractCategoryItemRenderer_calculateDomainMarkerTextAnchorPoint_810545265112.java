package org.jfree.chart.renderer.category;

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
import static org.jfree.chart.renderer.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AbstractCategoryItemRenderer_calculateDomainMarkerTextAnchorPoint_810545265112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716;
     Object term729;
     Object term754;
     Object term767;

    public AbstractCategoryItemRenderer_calculateDomainMarkerTextAnchorPoint_810545265112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716 = newInstance(Class.forName("org.jfree.chart.plot.PlotOrientation"));
        setField(term716, term716.getClass(), "name", "NRdvgJlhkX");
        term729 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term730 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        setField(term730, term730.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term729, term729.getClass(), "unitType", term730);
        setDoubleField(term729, term729.getClass(), "top", 1.0);
        setDoubleField(term729, term729.getClass(), "left", 1.0);
        setDoubleField(term729, term729.getClass(), "bottom", 1.0);
        setDoubleField(term729, term729.getClass(), "right", 1.0);
        term754 = newInstance(Class.forName("org.jfree.chart.util.LengthAdjustmentType"));
        setField(term754, term754.getClass(), "name", "uuaPigETmJ");
        term767 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        setField(term767, term767.getClass(), "name", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("org.jfree.chart.plot.PlotOrientation");
        argTypes[2] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[3] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[4] = Class.forName("org.jfree.chart.util.RectangleInsets");
        argTypes[5] = Class.forName("org.jfree.chart.util.LengthAdjustmentType");
        argTypes[6] = Class.forName("org.jfree.chart.util.RectangleAnchor");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = term716;
        args[2] = null;
        args[3] = null;
        args[4] = term729;
        args[5] = term754;
        args[6] = term767;
        try {
            callMethod(klass, "calculateDomainMarkerTextAnchorPoint", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
