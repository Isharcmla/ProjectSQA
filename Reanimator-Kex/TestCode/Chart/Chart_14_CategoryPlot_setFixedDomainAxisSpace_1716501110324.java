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

public class CategoryPlot_setFixedDomainAxisSpace_1716501110324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3400;
     Object term3405;

    public CategoryPlot_setFixedDomainAxisSpace_1716501110324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3400 = newInstance(Class.forName("org.jfree.chart.axis.AxisSpace"));
        setDoubleField(term3400, term3400.getClass(), "top", 0.3202192021706908);
        setDoubleField(term3400, term3400.getClass(), "bottom", 0.22651340641904605);
        setDoubleField(term3400, term3400.getClass(), "left", 0.8878841294187743);
        setDoubleField(term3400, term3400.getClass(), "right", 0.6588948704887806);
        term3405 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.chart.axis.AxisSpace");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term3400;
        args[1] = term3405;
        try {
            callMethod(klass, "setFixedDomainAxisSpace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


