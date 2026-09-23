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
import java.lang.Boolean;

public class XYPlot_setFixedDomainAxisSpace_440358989425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1298;
     Object term1303;

    public XYPlot_setFixedDomainAxisSpace_440358989425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1298 = newInstance(Class.forName("org.jfree.chart.axis.AxisSpace"));
        setDoubleField(term1298, term1298.getClass(), "top", 0.7559240768573477);
        setDoubleField(term1298, term1298.getClass(), "bottom", 0.10667076642995188);
        setDoubleField(term1298, term1298.getClass(), "left", 0.11493000848982304);
        setDoubleField(term1298, term1298.getClass(), "right", 0.37161417339133307);
        term1303 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.chart.axis.AxisSpace");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1298;
        args[1] = term1303;
        try {
            callMethod(klass, "setFixedDomainAxisSpace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


