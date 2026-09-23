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

public class XYPlot_convertToDataSpace_750574058456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7504;

    public XYPlot_convertToDataSpace_750574058456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7504 = newInstance(Class.forName("java.awt.geom.GeneralPath"));
        float[] term7505 = (float[]) newFloatArray(40);
        byte[] term7546 = (byte[]) newByteArray(20);
        setField(term7504, term7504.getClass(), "floatCoords", term7505);
        setField(term7504, term7504.getClass(), "pointTypes", term7546);
        setIntField(term7504, term7504.getClass(), "numTypes", -1801760683);
        setIntField(term7504, term7504.getClass(), "numCoords", 1141317871);
        setIntField(term7504, term7504.getClass(), "windingRule", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.geom.GeneralPath");
        argTypes[1] = Class.forName("java.awt.geom.Rectangle2D");
        argTypes[2] = Class.forName("org.jfree.data.xy.XYDataset");
        Object[] args = new Object[3];
        args[0] = term7504;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "convertToDataSpace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


