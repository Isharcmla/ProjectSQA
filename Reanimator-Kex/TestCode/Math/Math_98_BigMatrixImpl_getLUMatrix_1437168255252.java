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

public class BigMatrixImpl_getLUMatrix_1437168255252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93341;

    public BigMatrixImpl_getLUMatrix_1437168255252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93341 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term93200 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 3);
        Object[] term93201 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term93387 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term93203 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term93433 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term93205 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term93479 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term93201, 0, term93387);
        setElement(term93200, 0, term93201);
        setElement(term93203, 0, term93433);
        setElement(term93200, 1, term93203);
        setElement(term93205, 0, term93479);
        setElement(term93200, 2, term93205);
        setField(term93341, term93341.getClass(), "lu", term93200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLUMatrix", argTypes, term93341, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


