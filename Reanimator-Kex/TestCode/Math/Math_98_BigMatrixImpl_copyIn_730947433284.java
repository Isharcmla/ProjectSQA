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

public class BigMatrixImpl_copyIn_730947433284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100799;
     Object term100676;

    public BigMatrixImpl_copyIn_730947433284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100799 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term100679 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        setField(term100799, term100799.getClass(), "data", term100679);
        term100676 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 1);
        Object[] term100677 = (Object[]) newArray("java.lang.String", 0);
        setElement(term100676, 0, term100677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term100676;
        callMethod(klass, "copyIn", argTypes, term100799, args);
    }

};


