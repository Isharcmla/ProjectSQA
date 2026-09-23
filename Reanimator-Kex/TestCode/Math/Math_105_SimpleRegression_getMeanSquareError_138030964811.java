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

public class SimpleRegression_getMeanSquareError_138030964811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public SimpleRegression_getMeanSquareError_138030964811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term139, term139.getClass(), "sumX", 0.3163771663728089);
        setDoubleField(term139, term139.getClass(), "sumXX", 0.8819646072665548);
        setDoubleField(term139, term139.getClass(), "sumY", 0.5412182593116958);
        setDoubleField(term139, term139.getClass(), "sumYY", 0.16988691727397487);
        setDoubleField(term139, term139.getClass(), "sumXY", 0.39286935532362843);
        setLongField(term139, term139.getClass(), "n", -2813493605142626659L);
        setDoubleField(term139, term139.getClass(), "xbar", 0.11577948268926874);
        setDoubleField(term139, term139.getClass(), "ybar", 0.5617009352394552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeanSquareError", argTypes, term139, args);
    }

};


