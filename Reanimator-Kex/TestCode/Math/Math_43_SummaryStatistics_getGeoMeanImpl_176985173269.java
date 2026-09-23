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
import static org.apache.commons.math.stat.descriptive.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class SummaryStatistics_getGeoMeanImpl_176985173269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term845;
     Object term7164;
     Object term7135;

    public SummaryStatistics_getGeoMeanImpl_176985173269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term845 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term847 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term853 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term856 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term859 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term862 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term865 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term868 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term869 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term871 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term845, term845.getClass(), "n", 2120084523938730454L);
        setDoubleField(term847, term847.getClass(), "m2", Double.NaN);
        setLongField(term847, term847.getClass(), "n", 0L);
        setDoubleField(term847, term847.getClass(), "m1", Double.NaN);
        setDoubleField(term847, term847.getClass(), "dev", Double.NaN);
        setDoubleField(term847, term847.getClass(), "nDev", Double.NaN);
        setField(term847, term847.getClass(), "storedData", null);
        setField(term845, term845.getClass(), "secondMoment", term847);
        setLongField(term853, term853.getClass(), "n", 0L);
        setDoubleField(term853, term853.getClass(), "value", 0.0);
        setField(term853, term853.getClass(), "storedData", null);
        setField(term845, term845.getClass(), "sum", term853);
        setLongField(term856, term856.getClass(), "n", 0L);
        setDoubleField(term856, term856.getClass(), "value", 0.0);
        setField(term856, term856.getClass(), "storedData", null);
        setField(term845, term845.getClass(), "sumsq", term856);
        setLongField(term859, term859.getClass(), "n", 0L);
        setDoubleField(term859, term859.getClass(), "value", Double.NaN);
        setField(term859, term859.getClass(), "storedData", null);
        setField(term845, term845.getClass(), "min", term859);
        setLongField(term862, term862.getClass(), "n", 0L);
        setDoubleField(term862, term862.getClass(), "value", Double.NaN);
        setField(term862, term862.getClass(), "storedData", null);
        setField(term845, term845.getClass(), "max", term862);
        setIntField(term865, term865.getClass(), "n", 0);
        setDoubleField(term865, term865.getClass(), "value", 0.0);
        setField(term865, term865.getClass(), "storedData", null);
        setField(term845, term845.getClass(), "sumLog", term865);
        setField(term868, term868.getClass(), "sumOfLogs", term865);
        setField(term868, term868.getClass(), "storedData", null);
        setField(term845, term845.getClass(), "geoMean", term868);
        setField(term869, term869.getClass(), "moment", term847);
        setBooleanField(term869, term869.getClass(), "incMoment", false);
        setField(term869, term869.getClass(), "storedData", null);
        setField(term845, term845.getClass(), "mean", term869);
        setField(term871, term871.getClass(), "moment", term847);
        setBooleanField(term871, term871.getClass(), "incMoment", false);
        setBooleanField(term871, term871.getClass(), "isBiasCorrected", true);
        setField(term871, term871.getClass(), "storedData", null);
        setField(term845, term845.getClass(), "variance", term871);
        setField(term845, term845.getClass(), "sumImpl", term853);
        setField(term845, term845.getClass(), "sumsqImpl", term856);
        setField(term845, term845.getClass(), "minImpl", term859);
        setField(term845, term845.getClass(), "maxImpl", term862);
        setField(term845, term845.getClass(), "sumLogImpl", term865);
        setField(term845, term845.getClass(), "geoMeanImpl", term868);
        setField(term845, term845.getClass(), "meanImpl", term869);
        setField(term845, term845.getClass(), "varianceImpl", term871);
        term7164 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term7165 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term7166 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term7167 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term7168 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term7169 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term7170 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term7171 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term7172 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term7173 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term7164, term7164.getClass(), "n", 2120084523938730454L);
        setDoubleField(term7165, term7165.getClass(), "m2", Double.NaN);
        setLongField(term7165, term7165.getClass(), "n", 0L);
        setDoubleField(term7165, term7165.getClass(), "m1", Double.NaN);
        setDoubleField(term7165, term7165.getClass(), "dev", Double.NaN);
        setDoubleField(term7165, term7165.getClass(), "nDev", Double.NaN);
        setField(term7165, term7165.getClass(), "storedData", null);
        setField(term7164, term7164.getClass(), "secondMoment", term7165);
        setLongField(term7166, term7166.getClass(), "n", 0L);
        setDoubleField(term7166, term7166.getClass(), "value", 0.0);
        setField(term7166, term7166.getClass(), "storedData", null);
        setField(term7164, term7164.getClass(), "sum", term7166);
        setLongField(term7167, term7167.getClass(), "n", 0L);
        setDoubleField(term7167, term7167.getClass(), "value", 0.0);
        setField(term7167, term7167.getClass(), "storedData", null);
        setField(term7164, term7164.getClass(), "sumsq", term7167);
        setLongField(term7168, term7168.getClass(), "n", 0L);
        setDoubleField(term7168, term7168.getClass(), "value", Double.NaN);
        setField(term7168, term7168.getClass(), "storedData", null);
        setField(term7164, term7164.getClass(), "min", term7168);
        setLongField(term7169, term7169.getClass(), "n", 0L);
        setDoubleField(term7169, term7169.getClass(), "value", Double.NaN);
        setField(term7169, term7169.getClass(), "storedData", null);
        setField(term7164, term7164.getClass(), "max", term7169);
        setIntField(term7170, term7170.getClass(), "n", 0);
        setDoubleField(term7170, term7170.getClass(), "value", 0.0);
        setField(term7170, term7170.getClass(), "storedData", null);
        setField(term7164, term7164.getClass(), "sumLog", term7170);
        setField(term7171, term7171.getClass(), "sumOfLogs", term7170);
        setField(term7171, term7171.getClass(), "storedData", null);
        setField(term7164, term7164.getClass(), "geoMean", term7171);
        setField(term7172, term7172.getClass(), "moment", term7165);
        setBooleanField(term7172, term7172.getClass(), "incMoment", false);
        setField(term7172, term7172.getClass(), "storedData", null);
        setField(term7164, term7164.getClass(), "mean", term7172);
        setField(term7173, term7173.getClass(), "moment", term7165);
        setBooleanField(term7173, term7173.getClass(), "incMoment", false);
        setBooleanField(term7173, term7173.getClass(), "isBiasCorrected", true);
        setField(term7173, term7173.getClass(), "storedData", null);
        setField(term7164, term7164.getClass(), "variance", term7173);
        setField(term7164, term7164.getClass(), "sumImpl", term7166);
        setField(term7164, term7164.getClass(), "sumsqImpl", term7167);
        setField(term7164, term7164.getClass(), "minImpl", term7168);
        setField(term7164, term7164.getClass(), "maxImpl", term7169);
        setField(term7164, term7164.getClass(), "sumLogImpl", term7170);
        setField(term7164, term7164.getClass(), "geoMeanImpl", term7171);
        setField(term7164, term7164.getClass(), "meanImpl", term7172);
        setField(term7164, term7164.getClass(), "varianceImpl", term7173);
        term7135 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term7136 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setIntField(term7136, term7136.getClass(), "n", 0);
        setDoubleField(term7136, term7136.getClass(), "value", 0.0);
        setField(term7136, term7136.getClass(), "storedData", null);
        setField(term7135, term7135.getClass(), "sumOfLogs", term7136);
        setField(term7135, term7135.getClass(), "storedData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getGeoMeanImpl", argTypes, term845, args);
        assertTrue(recursiveEquals(term845, term7164));
        assertTrue(recursiveEquals(retValue, term7135));
    }

};


