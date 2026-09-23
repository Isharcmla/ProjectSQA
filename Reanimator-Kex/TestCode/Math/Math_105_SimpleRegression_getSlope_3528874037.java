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

public class SimpleRegression_getSlope_3528874037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;

    public SimpleRegression_getSlope_3528874037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term103, term103.getClass(), "sumX", 0.9126850255993704);
        setDoubleField(term103, term103.getClass(), "sumXX", 0.11179067076100713);
        setDoubleField(term103, term103.getClass(), "sumY", 0.5306473989087822);
        setDoubleField(term103, term103.getClass(), "sumYY", 0.022483645678509023);
        setDoubleField(term103, term103.getClass(), "sumXY", 0.025133051616627267);
        setLongField(term103, term103.getClass(), "n", 4872422362414183754L);
        setDoubleField(term103, term103.getClass(), "xbar", 0.016575281023182953);
        setDoubleField(term103, term103.getClass(), "ybar", 0.5308350402051779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlope", argTypes, term103, args);
    }

};


