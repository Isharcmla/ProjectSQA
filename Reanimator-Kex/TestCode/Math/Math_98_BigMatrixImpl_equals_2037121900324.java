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
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class BigMatrixImpl_equals_2037121900324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107945;
     Object term107983;
     Object term107984;

    public BigMatrixImpl_equals_2037121900324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107945 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term107836 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 113);
        setField(term107945, term107945.getClass(), "data", term107836);
        term107983 = newInstance(Class.forName("java.lang.Object"));
        term107984 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term107985 = newInstance(Class.forName("java.math.BigInteger"));
        setIntField(term107985, term107985.getClass(), "signum", 1);
        setField(term107985, term107985.getClass(), "mag", null);
        setIntField(term107985, term107985.getClass(), "bitCountPlusOne", 0);
        setIntField(term107985, term107985.getClass(), "bitLengthPlusOne", 0);
        setIntField(term107985, term107985.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term107985, term107985.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term107984, term107984.getClass(), "intVal", term107985);
        setIntField(term107984, term107984.getClass(), "scale", 52);
        setIntField(term107984, term107984.getClass(), "precision", 0);
        setField(term107984, term107984.getClass(), "stringCache", null);
        setLongField(term107984, term107984.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term107983;
        callMethod(klass, "equals", argTypes, term107945, args);
        assertTrue(recursiveEquals(term107945, term107984));
        assertTrue(recursiveEquals(term107983, 0));
    }

};


