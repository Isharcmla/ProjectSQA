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

public class XYPlot_removeRangeMarker_1379910765314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;
     Object term627;

    public XYPlot_removeRangeMarker_1379910765314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625 = new Integer(1193880199);
        term627 = newInstance(Class.forName("org.jfree.chart.util.Layer"));
        setField(term627, term627.getClass(), "name", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.Marker");
        argTypes[2] = Class.forName("org.jfree.chart.util.Layer");
        Object[] args = new Object[3];
        args[0] = term625;
        args[1] = null;
        args[2] = term627;
        try {
            callMethod(klass, "removeRangeMarker", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


