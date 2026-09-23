package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigMatrixImpl_getData_1969997431187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87988;

    public BigMatrixImpl_getData_1969997431187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87988 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term87807 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 224);
        Object[] term87808 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term88034 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term87810 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term87811 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term87812 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term88080 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term87814 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term88126 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term87808, 0, term88034);
        setElement(term87807, 0, term87808);
        setElement(term87807, 1, term87810);
        setElement(term87807, 2, term87811);
        setElement(term87812, 0, term88080);
        setElement(term87807, 3, term87812);
        setElement(term87814, 0, term88126);
        setElement(term87807, 4, term87814);
        setField(term87988, term87988.getClass(), "data", term87807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term87988, args);
    }

};


