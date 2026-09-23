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

public class BigMatrixImpl_getData_1969997431181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86791;

    public BigMatrixImpl_getData_1969997431181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86791 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term86614 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 5);
        Object[] term86615 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term86837 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term86617 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term86883 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term86619 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term86929 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term86621 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term86622 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term86615, 0, term86837);
        setElement(term86614, 0, term86615);
        setElement(term86617, 0, term86883);
        setElement(term86614, 1, term86617);
        setElement(term86619, 0, term86929);
        setElement(term86614, 2, term86619);
        setElement(term86614, 3, term86621);
        setElement(term86614, 4, term86622);
        setField(term86791, term86791.getClass(), "data", term86614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term86791, args);
    }

};


