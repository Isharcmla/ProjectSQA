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
import java.lang.Object;

public class XYPlot_datasetChanged_1108957756399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1103;

    public XYPlot_datasetChanged_1108957756399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1103 = newInstance(Class.forName("org.jfree.data.general.DatasetChangeEvent"));
        Object term1104 = newInstance(Class.forName("java.lang.Object"));
        setField(term1103, term1103.getClass(), "dataset", null);
        setField(term1103, term1103.getClass(), "source", term1104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.XYPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.general.DatasetChangeEvent");
        Object[] args = new Object[1];
        args[0] = term1103;
        try {
            callMethod(klass, "datasetChanged", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


