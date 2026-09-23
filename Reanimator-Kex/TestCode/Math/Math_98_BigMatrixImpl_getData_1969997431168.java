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

public class BigMatrixImpl_getData_1969997431168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84821;

    public BigMatrixImpl_getData_1969997431168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84821 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term84657 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 4);
        Object[] term84658 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term84867 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term84660 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term84661 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term84662 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term84658, 0, term84867);
        setElement(term84657, 0, term84658);
        setElement(term84657, 1, term84660);
        setElement(term84657, 2, term84661);
        setElement(term84657, 3, term84662);
        setField(term84821, term84821.getClass(), "data", term84657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term84821, args);
    }

};


