package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_3355035252531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754922;
     Object term755132;
     Object term755126;

    public Fraction_reduce_3355035252531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term754922 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term754922, term754922.getClass(), "numerator", 671354930);
        setIntField(term754922, term754922.getClass(), "denominator", 1375863825);
        term755132 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term755132, term755132.getClass(), "numerator", 671354930);
        setIntField(term755132, term755132.getClass(), "denominator", 1375863825);
        setField(term755132, term755132.getClass(), "toString", null);
        setField(term755132, term755132.getClass(), "toProperString", null);
        term755126 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term755126, term755126.getClass(), "numerator", 134270986);
        setIntField(term755126, term755126.getClass(), "denominator", 275172765);
        setField(term755126, term755126.getClass(), "toString", null);
        setField(term755126, term755126.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term754922, args);
        assertTrue(recursiveEquals(term754922, term755132));
        assertTrue(recursiveEquals(retValue, term755126));
    }

};


