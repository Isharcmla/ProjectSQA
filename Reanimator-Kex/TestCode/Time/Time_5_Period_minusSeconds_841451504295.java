package org.joda.time;

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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_minusSeconds_841451504295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142591;

    public Period_minusSeconds_841451504295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142591 = newInstance(Class.forName("org.joda.time.Period"));
        Object term142645 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term142522 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        setField(term142645, term142645.getClass(), "iTypes", term142522);
        setField(term142591, term142591.getClass(), "iType", term142645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusSeconds", argTypes, term142591, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


