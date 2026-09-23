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
import java.lang.NullPointerException;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SummaryStatistics_addValue_1491054911214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48800;

    public SummaryStatistics_addValue_1491054911214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48800 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term48910 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term49038 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term49142 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term49252 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term49362 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setDoubleField(term48910, term48910.getClass(), "value", 4.6116860915760497E18);
        setLongField(term48910, term48910.getClass(), "n", 0L);
        setField(term48800, term48800.getClass(), "sumImpl", term48910);
        setDoubleField(term49038, term49038.getClass(), "value", 4.6116860915760497E18);
        setLongField(term49038, term49038.getClass(), "n", 0L);
        setField(term48800, term48800.getClass(), "sumsqImpl", term49038);
        setDoubleField(term49142, term49142.getClass(), "value", 4.6116860915760497E18);
        setLongField(term49142, term49142.getClass(), "n", 0L);
        setField(term48800, term48800.getClass(), "minImpl", term49142);
        setBooleanField(term49252, term49252.getClass(), "incMoment", false);
        setField(term48800, term48800.getClass(), "maxImpl", term49252);
        setField(term48800, term48800.getClass(), "sumLogImpl", term49362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 2.0005207657814026;
        try {
            callMethod(klass, "addValue", argTypes, term48800, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


