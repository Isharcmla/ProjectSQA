package org.apache.commons.math.stat.descriptive;

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
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SummaryStatistics_copy_2134835667288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78054;
     Object term78420;

    public SummaryStatistics_copy_2134835667288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78054 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term78172 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Product"));
        Object term78298 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        setField(term78172, term78172.getClass(), "storedData", null);
        setLongField(term78172, term78172.getClass(), "n", 0L);
        setDoubleField(term78172, term78172.getClass(), "value", 0.0);
        setField(term78054, term78054.getClass(), "maxImpl", term78172);
        setField(term78054, term78054.getClass(), "minImpl", term78298);
        term78420 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        setField(term78420, term78420.getClass(), "maxImpl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        argTypes[1] = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Object[] args = new Object[2];
        args[0] = term78054;
        args[1] = term78420;
        callMethod(klass, "copy", argTypes, null, args);
    }

};


