package org.apache.commons.math.stat.regression;

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
import static org.apache.commons.math.stat.regression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.regression.EqualityUtils.*;

public class SimpleRegression_getN_80021837526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;
     Object term616;

    public SimpleRegression_getN_80021837526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term74, term74.getClass(), "sumX", 0.8878841294187743);
        setDoubleField(term74, term74.getClass(), "sumXX", 0.6588948704887806);
        setDoubleField(term74, term74.getClass(), "sumY", 0.6397214730945112);
        setDoubleField(term74, term74.getClass(), "sumYY", 0.25937345430928016);
        setDoubleField(term74, term74.getClass(), "sumXY", 0.5873228247510078);
        setLongField(term74, term74.getClass(), "n", -8400487765614892086L);
        setDoubleField(term74, term74.getClass(), "xbar", 0.8823181080774973);
        setDoubleField(term74, term74.getClass(), "ybar", 0.2192450926212024);
        term616 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term616, term616.getClass(), "sumX", 0.8878841294187743);
        setDoubleField(term616, term616.getClass(), "sumXX", 0.6588948704887806);
        setDoubleField(term616, term616.getClass(), "sumY", 0.6397214730945112);
        setDoubleField(term616, term616.getClass(), "sumYY", 0.25937345430928016);
        setDoubleField(term616, term616.getClass(), "sumXY", 0.5873228247510078);
        setLongField(term616, term616.getClass(), "n", -8400487765614892086L);
        setDoubleField(term616, term616.getClass(), "xbar", 0.8823181080774973);
        setDoubleField(term616, term616.getClass(), "ybar", 0.2192450926212024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getN", argTypes, term74, args);
        assertTrue(recursiveEquals(term74, term616));
        assertTrue(recursiveEquals(retValue, -8400487765614892086L));
    }

};


