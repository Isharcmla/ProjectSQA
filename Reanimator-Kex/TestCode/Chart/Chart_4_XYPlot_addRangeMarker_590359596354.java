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
import java.lang.Boolean;

public class XYPlot_addRangeMarker_590359596354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590;
     Object term592;
     Object term605;

    public XYPlot_addRangeMarker_590359596354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590 = new Integer(1193880199);
        term592 = newInstance(Class.forName("org.jfree.chart.util.Layer"));
        setField(term592, term592.getClass(), "name", "pCTimMblYc");
        term605 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.Marker");
        argTypes[2] = Class.forName("org.jfree.chart.util.Layer");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term590;
        args[1] = null;
        args[2] = term592;
        args[3] = term605;
        try {
            callMethod(klass, "addRangeMarker", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


