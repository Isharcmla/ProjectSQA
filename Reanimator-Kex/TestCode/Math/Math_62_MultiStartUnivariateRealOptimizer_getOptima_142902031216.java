package org.apache.commons.math.optimization.univariate;

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
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.univariate.EqualityUtils.*;
import java.lang.Object;

public class MultiStartUnivariateRealOptimizer_getOptima_142902031216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81;
     Object term1821;
     Object term1797;

    public MultiStartUnivariateRealOptimizer_getOptima_142902031216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term85 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 6);
        Object term86 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term89 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term92 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term95 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term98 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term101 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term81, term81.getClass(), "optimizer", null);
        setIntField(term81, term81.getClass(), "maxEvaluations", -1456670397);
        setIntField(term81, term81.getClass(), "totalEvaluations", 1622346318);
        setIntField(term81, term81.getClass(), "starts", 1048535127);
        setField(term81, term81.getClass(), "generator", null);
        setDoubleField(term86, term86.getClass(), "point", 0.9737083944266686);
        setDoubleField(term86, term86.getClass(), "value", 0.0668892744806211);
        setElement(term85, 0, term86);
        setDoubleField(term89, term89.getClass(), "point", 0.3587267442738795);
        setDoubleField(term89, term89.getClass(), "value", 0.07802449704920456);
        setElement(term85, 1, term89);
        setDoubleField(term92, term92.getClass(), "point", 0.5279279537140873);
        setDoubleField(term92, term92.getClass(), "value", 0.3202192021706908);
        setElement(term85, 2, term92);
        setDoubleField(term95, term95.getClass(), "point", 0.22651340641904605);
        setDoubleField(term95, term95.getClass(), "value", 0.8878841294187743);
        setElement(term85, 3, term95);
        setDoubleField(term98, term98.getClass(), "point", 0.6588948704887806);
        setDoubleField(term98, term98.getClass(), "value", 0.6397214730945112);
        setElement(term85, 4, term98);
        setDoubleField(term101, term101.getClass(), "point", 0.25937345430928016);
        setDoubleField(term101, term101.getClass(), "value", 0.5873228247510078);
        setElement(term85, 5, term101);
        setField(term81, term81.getClass(), "optima", term85);
        term1821 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term1822 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 6);
        Object term1823 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1824 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1825 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1826 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1827 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1828 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term1821, term1821.getClass(), "optimizer", null);
        setIntField(term1821, term1821.getClass(), "maxEvaluations", -1456670397);
        setIntField(term1821, term1821.getClass(), "totalEvaluations", 1622346318);
        setIntField(term1821, term1821.getClass(), "starts", 1048535127);
        setField(term1821, term1821.getClass(), "generator", null);
        setDoubleField(term1823, term1823.getClass(), "point", 0.9737083944266686);
        setDoubleField(term1823, term1823.getClass(), "value", 0.0668892744806211);
        setElement(term1822, 0, term1823);
        setDoubleField(term1824, term1824.getClass(), "point", 0.3587267442738795);
        setDoubleField(term1824, term1824.getClass(), "value", 0.07802449704920456);
        setElement(term1822, 1, term1824);
        setDoubleField(term1825, term1825.getClass(), "point", 0.5279279537140873);
        setDoubleField(term1825, term1825.getClass(), "value", 0.3202192021706908);
        setElement(term1822, 2, term1825);
        setDoubleField(term1826, term1826.getClass(), "point", 0.22651340641904605);
        setDoubleField(term1826, term1826.getClass(), "value", 0.8878841294187743);
        setElement(term1822, 3, term1826);
        setDoubleField(term1827, term1827.getClass(), "point", 0.6588948704887806);
        setDoubleField(term1827, term1827.getClass(), "value", 0.6397214730945112);
        setElement(term1822, 4, term1827);
        setDoubleField(term1828, term1828.getClass(), "point", 0.25937345430928016);
        setDoubleField(term1828, term1828.getClass(), "value", 0.5873228247510078);
        setElement(term1822, 5, term1828);
        setField(term1821, term1821.getClass(), "optima", term1822);
        term1797 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 6);
        Object term1798 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1801 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1804 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1807 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1810 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1813 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setDoubleField(term1798, term1798.getClass(), "point", 0.9737083944266686);
        setDoubleField(term1798, term1798.getClass(), "value", 0.0668892744806211);
        setElement(term1797, 0, term1798);
        setDoubleField(term1801, term1801.getClass(), "point", 0.3587267442738795);
        setDoubleField(term1801, term1801.getClass(), "value", 0.07802449704920456);
        setElement(term1797, 1, term1801);
        setDoubleField(term1804, term1804.getClass(), "point", 0.5279279537140873);
        setDoubleField(term1804, term1804.getClass(), "value", 0.3202192021706908);
        setElement(term1797, 2, term1804);
        setDoubleField(term1807, term1807.getClass(), "point", 0.22651340641904605);
        setDoubleField(term1807, term1807.getClass(), "value", 0.8878841294187743);
        setElement(term1797, 3, term1807);
        setDoubleField(term1810, term1810.getClass(), "point", 0.6588948704887806);
        setDoubleField(term1810, term1810.getClass(), "value", 0.6397214730945112);
        setElement(term1797, 4, term1810);
        setDoubleField(term1813, term1813.getClass(), "point", 0.25937345430928016);
        setDoubleField(term1813, term1813.getClass(), "value", 0.5873228247510078);
        setElement(term1797, 5, term1813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptima", argTypes, term81, args);
        assertTrue(recursiveEquals(term81, term1821));
        assertTrue(recursiveEquals(retValue, term1797));
    }

};


