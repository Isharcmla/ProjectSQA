package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591311651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537987;
     Object term538486;
     Object term538483;

    public Fraction_reduce_5358591311651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537987 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term537987, term537987.getClass(), "numerator", -538366558);
        setIntField(term537987, term537987.getClass(), "denominator", 547077335);
        term538486 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term538486, term538486.getClass(), "numerator", -538366558);
        setIntField(term538486, term538486.getClass(), "denominator", 547077335);
        setField(term538486, term538486.getClass(), "toString", null);
        setField(term538486, term538486.getClass(), "toProperString", null);
        term538483 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term538483, term538483.getClass(), "numerator", -538366558);
        setIntField(term538483, term538483.getClass(), "denominator", 547077335);
        setField(term538483, term538483.getClass(), "toString", null);
        setField(term538483, term538483.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term537987, args);
        assertTrue(recursiveEquals(term537987, term538486));
        assertTrue(recursiveEquals(retValue, term538483));
    }

};


