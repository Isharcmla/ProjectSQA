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

public class XYPlot_removeDomainMarker_1648996236349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515;
     Object term517;
     Object term530;

    public XYPlot_removeDomainMarker_1648996236349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term515 = new Integer(-73683645);
        term517 = newInstance(Class.forName("org.jfree.chart.util.Layer"));
        setField(term517, term517.getClass(), "name", "ZiaGIbnzTs");
        term530 = new Boolean(false);
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
        args[0] = term515;
        args[1] = null;
        args[2] = term517;
        args[3] = term530;
        try {
            callMethod(klass, "removeDomainMarker", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


