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

public class SummaryStatistics_setMaxImpl_135912322466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term758;
     Object term6290;

    public SummaryStatistics_setMaxImpl_135912322466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term758 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term760 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term766 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term769 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term772 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term775 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term778 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term781 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term782 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term784 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term758, term758.getClass(), "n", -7672528020740371001L);
        setDoubleField(term760, term760.getClass(), "m2", Double.NaN);
        setLongField(term760, term760.getClass(), "n", 0L);
        setDoubleField(term760, term760.getClass(), "m1", Double.NaN);
        setDoubleField(term760, term760.getClass(), "dev", Double.NaN);
        setDoubleField(term760, term760.getClass(), "nDev", Double.NaN);
        setField(term760, term760.getClass(), "storedData", null);
        setField(term758, term758.getClass(), "secondMoment", term760);
        setLongField(term766, term766.getClass(), "n", 0L);
        setDoubleField(term766, term766.getClass(), "value", 0.0);
        setField(term766, term766.getClass(), "storedData", null);
        setField(term758, term758.getClass(), "sum", term766);
        setLongField(term769, term769.getClass(), "n", 0L);
        setDoubleField(term769, term769.getClass(), "value", 0.0);
        setField(term769, term769.getClass(), "storedData", null);
        setField(term758, term758.getClass(), "sumsq", term769);
        setLongField(term772, term772.getClass(), "n", 0L);
        setDoubleField(term772, term772.getClass(), "value", Double.NaN);
        setField(term772, term772.getClass(), "storedData", null);
        setField(term758, term758.getClass(), "min", term772);
        setLongField(term775, term775.getClass(), "n", 0L);
        setDoubleField(term775, term775.getClass(), "value", Double.NaN);
        setField(term775, term775.getClass(), "storedData", null);
        setField(term758, term758.getClass(), "max", term775);
        setIntField(term778, term778.getClass(), "n", 0);
        setDoubleField(term778, term778.getClass(), "value", 0.0);
        setField(term778, term778.getClass(), "storedData", null);
        setField(term758, term758.getClass(), "sumLog", term778);
        setField(term781, term781.getClass(), "sumOfLogs", term778);
        setField(term781, term781.getClass(), "storedData", null);
        setField(term758, term758.getClass(), "geoMean", term781);
        setField(term782, term782.getClass(), "moment", term760);
        setBooleanField(term782, term782.getClass(), "incMoment", false);
        setField(term782, term782.getClass(), "storedData", null);
        setField(term758, term758.getClass(), "mean", term782);
        setField(term784, term784.getClass(), "moment", term760);
        setBooleanField(term784, term784.getClass(), "incMoment", false);
        setBooleanField(term784, term784.getClass(), "isBiasCorrected", true);
        setField(term784, term784.getClass(), "storedData", null);
        setField(term758, term758.getClass(), "variance", term784);
        setField(term758, term758.getClass(), "sumImpl", term766);
        setField(term758, term758.getClass(), "sumsqImpl", term769);
        setField(term758, term758.getClass(), "minImpl", term772);
        setField(term758, term758.getClass(), "maxImpl", term775);
        setField(term758, term758.getClass(), "sumLogImpl", term778);
        setField(term758, term758.getClass(), "geoMeanImpl", term781);
        setField(term758, term758.getClass(), "meanImpl", term782);
        setField(term758, term758.getClass(), "varianceImpl", term784);
        term6290 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term6291 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term6292 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term6293 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term6294 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term6295 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term6296 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term6297 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term6298 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term6299 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term6290, term6290.getClass(), "n", -7672528020740371001L);
        setDoubleField(term6291, term6291.getClass(), "m2", Double.NaN);
        setLongField(term6291, term6291.getClass(), "n", 0L);
        setDoubleField(term6291, term6291.getClass(), "m1", Double.NaN);
        setDoubleField(term6291, term6291.getClass(), "dev", Double.NaN);
        setDoubleField(term6291, term6291.getClass(), "nDev", Double.NaN);
        setField(term6291, term6291.getClass(), "storedData", null);
        setField(term6290, term6290.getClass(), "secondMoment", term6291);
        setLongField(term6292, term6292.getClass(), "n", 0L);
        setDoubleField(term6292, term6292.getClass(), "value", 0.0);
        setField(term6292, term6292.getClass(), "storedData", null);
        setField(term6290, term6290.getClass(), "sum", term6292);
        setLongField(term6293, term6293.getClass(), "n", 0L);
        setDoubleField(term6293, term6293.getClass(), "value", 0.0);
        setField(term6293, term6293.getClass(), "storedData", null);
        setField(term6290, term6290.getClass(), "sumsq", term6293);
        setLongField(term6294, term6294.getClass(), "n", 0L);
        setDoubleField(term6294, term6294.getClass(), "value", Double.NaN);
        setField(term6294, term6294.getClass(), "storedData", null);
        setField(term6290, term6290.getClass(), "min", term6294);
        setLongField(term6295, term6295.getClass(), "n", 0L);
        setDoubleField(term6295, term6295.getClass(), "value", Double.NaN);
        setField(term6295, term6295.getClass(), "storedData", null);
        setField(term6290, term6290.getClass(), "max", term6295);
        setIntField(term6296, term6296.getClass(), "n", 0);
        setDoubleField(term6296, term6296.getClass(), "value", 0.0);
        setField(term6296, term6296.getClass(), "storedData", null);
        setField(term6290, term6290.getClass(), "sumLog", term6296);
        setField(term6297, term6297.getClass(), "sumOfLogs", term6296);
        setField(term6297, term6297.getClass(), "storedData", null);
        setField(term6290, term6290.getClass(), "geoMean", term6297);
        setField(term6298, term6298.getClass(), "moment", term6291);
        setBooleanField(term6298, term6298.getClass(), "incMoment", false);
        setField(term6298, term6298.getClass(), "storedData", null);
        setField(term6290, term6290.getClass(), "mean", term6298);
        setField(term6299, term6299.getClass(), "moment", term6291);
        setBooleanField(term6299, term6299.getClass(), "incMoment", false);
        setBooleanField(term6299, term6299.getClass(), "isBiasCorrected", true);
        setField(term6299, term6299.getClass(), "storedData", null);
        setField(term6290, term6290.getClass(), "variance", term6299);
        setField(term6290, term6290.getClass(), "sumImpl", term6292);
        setField(term6290, term6290.getClass(), "sumsqImpl", term6293);
        setField(term6290, term6290.getClass(), "minImpl", term6294);
        setField(term6290, term6290.getClass(), "maxImpl", null);
        setField(term6290, term6290.getClass(), "sumLogImpl", term6296);
        setField(term6290, term6290.getClass(), "geoMeanImpl", term6297);
        setField(term6290, term6290.getClass(), "meanImpl", term6298);
        setField(term6290, term6290.getClass(), "varianceImpl", term6299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMaxImpl", argTypes, term758, args);
        assertTrue(recursiveEquals(term758, term6290));
    }

};


