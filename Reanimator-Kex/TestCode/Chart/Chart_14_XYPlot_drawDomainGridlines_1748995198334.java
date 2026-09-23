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
import java.util.LinkedList;
import java.lang.Object;

public class XYPlot_drawDomainGridlines_1748995198334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803;

    public XYPlot_drawDomainGridlines_1748995198334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term806 = newInstance(Class.forName("java.lang.Object"));
        Object term808 = newInstance(Class.forName("java.lang.Object"));
        Object term810 = newInstance(Class.forName("java.lang.Object"));
        term803 = new LinkedList();
        ((LinkedList) term803).add(term806);
        ((LinkedList) term803).add(term808);
        ((LinkedList) term803).add(term810);
        ((LinkedList) term803).add((Object)null);
        ((LinkedList) term803).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term803;
        try {
            callMethod(klass, "drawDomainGridlines", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


