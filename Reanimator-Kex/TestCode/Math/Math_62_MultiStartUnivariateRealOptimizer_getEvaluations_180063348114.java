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

public class MultiStartUnivariateRealOptimizer_getEvaluations_180063348114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54;
     Object term1542;

    public MultiStartUnivariateRealOptimizer_getEvaluations_180063348114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term58 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 4);
        Object term59 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term62 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term65 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term68 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term54, term54.getClass(), "optimizer", null);
        setIntField(term54, term54.getClass(), "maxEvaluations", 1725571209);
        setIntField(term54, term54.getClass(), "totalEvaluations", -522618178);
        setIntField(term54, term54.getClass(), "starts", 1134449235);
        setField(term54, term54.getClass(), "generator", null);
        setDoubleField(term59, term59.getClass(), "point", 0.13481025392611334);
        setDoubleField(term59, term59.getClass(), "value", 0.3800088629986428);
        setElement(term58, 0, term59);
        setDoubleField(term62, term62.getClass(), "point", 0.5840714198152577);
        setDoubleField(term62, term62.getClass(), "value", 0.7559240768573477);
        setElement(term58, 1, term62);
        setDoubleField(term65, term65.getClass(), "point", 0.10667076642995188);
        setDoubleField(term65, term65.getClass(), "value", 0.11493000848982304);
        setElement(term58, 2, term65);
        setDoubleField(term68, term68.getClass(), "point", 0.37161417339133307);
        setDoubleField(term68, term68.getClass(), "value", 0.6805867182029153);
        setElement(term58, 3, term68);
        setField(term54, term54.getClass(), "optima", term58);
        term1542 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term1543 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 4);
        Object term1544 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1545 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1546 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term1547 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term1542, term1542.getClass(), "optimizer", null);
        setIntField(term1542, term1542.getClass(), "maxEvaluations", 1725571209);
        setIntField(term1542, term1542.getClass(), "totalEvaluations", -522618178);
        setIntField(term1542, term1542.getClass(), "starts", 1134449235);
        setField(term1542, term1542.getClass(), "generator", null);
        setDoubleField(term1544, term1544.getClass(), "point", 0.13481025392611334);
        setDoubleField(term1544, term1544.getClass(), "value", 0.3800088629986428);
        setElement(term1543, 0, term1544);
        setDoubleField(term1545, term1545.getClass(), "point", 0.5840714198152577);
        setDoubleField(term1545, term1545.getClass(), "value", 0.7559240768573477);
        setElement(term1543, 1, term1545);
        setDoubleField(term1546, term1546.getClass(), "point", 0.10667076642995188);
        setDoubleField(term1546, term1546.getClass(), "value", 0.11493000848982304);
        setElement(term1543, 2, term1546);
        setDoubleField(term1547, term1547.getClass(), "point", 0.37161417339133307);
        setDoubleField(term1547, term1547.getClass(), "value", 0.6805867182029153);
        setElement(term1543, 3, term1547);
        setField(term1542, term1542.getClass(), "optima", term1543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEvaluations", argTypes, term54, args);
        assertTrue(recursiveEquals(term54, term1542));
        assertTrue(recursiveEquals(retValue, -522618178));
    }

};


