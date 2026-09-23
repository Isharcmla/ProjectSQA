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

public class CategoryPlot_setFixedDomainAxisSpace_357570240296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3122;

    public CategoryPlot_setFixedDomainAxisSpace_357570240296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3122 = newInstance(Class.forName("org.jfree.chart.axis.AxisSpace"));
        setDoubleField(term3122, term3122.getClass(), "top", 0.0668892744806211);
        setDoubleField(term3122, term3122.getClass(), "bottom", 0.3587267442738795);
        setDoubleField(term3122, term3122.getClass(), "left", 0.07802449704920456);
        setDoubleField(term3122, term3122.getClass(), "right", 0.5279279537140873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.axis.AxisSpace");
        Object[] args = new Object[1];
        args[0] = term3122;
        try {
            callMethod(klass, "setFixedDomainAxisSpace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


