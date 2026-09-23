package org.apache.commons.math.stat.descriptive.moment;

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
import static org.apache.commons.math.stat.descriptive.moment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Variance_evaluate_1708698606131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180011;
     Object term179607;

    public Variance_evaluate_1708698606131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180011 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term180137 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.FourthMoment"));
        setBooleanField(term180011, term180011.getClass(), "incMoment", true);
        setField(term180011, term180011.getClass(), "moment", term180137);
        term179607 = (double[]) newDoubleArray(256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term179607;
        callMethod(klass, "evaluate", argTypes, term180011, args);
    }

};


