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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigMatrixImpl_getData_1969997431136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76956;

    public BigMatrixImpl_getData_1969997431136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76956 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term76804 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 3);
        Object[] term76805 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term77002 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term76807 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term76808 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term76805, 0, term77002);
        setElement(term76804, 0, term76805);
        setElement(term76804, 1, term76807);
        setElement(term76804, 2, term76808);
        setField(term76956, term76956.getClass(), "data", term76804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getData", argTypes, term76956, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


