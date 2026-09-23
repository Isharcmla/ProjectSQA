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

public class XYPlot_calculateDomainAxisSpace_1654887730323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681;

    public XYPlot_calculateDomainAxisSpace_1654887730323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681 = newInstance(Class.forName("org.jfree.chart.axis.AxisSpace"));
        setDoubleField(term681, term681.getClass(), "top", 0.13238746331190498);
        setDoubleField(term681, term681.getClass(), "bottom", 0.3455959125047594);
        setDoubleField(term681, term681.getClass(), "left", 0.5523635872663106);
        setDoubleField(term681, term681.getClass(), "right", 0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("org.jfree.chart.axis.AxisSpace");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term681;
        try {
            callMethod(klass, "calculateDomainAxisSpace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


