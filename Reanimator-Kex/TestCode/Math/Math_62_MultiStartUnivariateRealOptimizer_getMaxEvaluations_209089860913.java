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

public class MultiStartUnivariateRealOptimizer_getMaxEvaluations_209089860913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40;
     Object term1519;

    public MultiStartUnivariateRealOptimizer_getMaxEvaluations_209089860913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term44 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 3);
        Object term45 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term48 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term51 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term40, term40.getClass(), "optimizer", null);
        setIntField(term40, term40.getClass(), "maxEvaluations", -2038273078);
        setIntField(term40, term40.getClass(), "totalEvaluations", 1227103734);
        setIntField(term40, term40.getClass(), "starts", -1339778481);
        setField(term40, term40.getClass(), "generator", null);
        setDoubleField(term45, term45.getClass(), "point", 0.6436713023569729);
        setDoubleField(term45, term45.getClass(), "value", 0.7332741045694002);
        setElement(term44, 0, term45);
        setDoubleField(term48, term48.getClass(), "point", 0.4569171842750229);
        setDoubleField(term48, term48.getClass(), "value", 0.8598297828918529);
        setElement(term44, 1, term48);
        setDoubleField(term51, term51.getClass(), "point", 0.43692187681405226);
        setDoubleField(term51, term51.getClass(), "value", 0.7633268466829064);
        setElement(term44, 2, term51);
        setField(term40, term40.getClass(), "optima", term44);
        term1519 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term1520 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 3);
        Object term1521 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1522 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1523 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term1519, term1519.getClass(), "optimizer", null);
        setIntField(term1519, term1519.getClass(), "maxEvaluations", -2038273078);
        setIntField(term1519, term1519.getClass(), "totalEvaluations", 1227103734);
        setIntField(term1519, term1519.getClass(), "starts", -1339778481);
        setField(term1519, term1519.getClass(), "generator", null);
        setDoubleField(term1521, term1521.getClass(), "point", 0.6436713023569729);
        setDoubleField(term1521, term1521.getClass(), "value", 0.7332741045694002);
        setElement(term1520, 0, term1521);
        setDoubleField(term1522, term1522.getClass(), "point", 0.4569171842750229);
        setDoubleField(term1522, term1522.getClass(), "value", 0.8598297828918529);
        setElement(term1520, 1, term1522);
        setDoubleField(term1523, term1523.getClass(), "point", 0.43692187681405226);
        setDoubleField(term1523, term1523.getClass(), "value", 0.7633268466829064);
        setElement(term1520, 2, term1523);
        setField(term1519, term1519.getClass(), "optima", term1520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxEvaluations", argTypes, term40, args);
        assertTrue(recursiveEquals(term40, term1519));
        assertTrue(recursiveEquals(retValue, -2038273078));
    }

};


