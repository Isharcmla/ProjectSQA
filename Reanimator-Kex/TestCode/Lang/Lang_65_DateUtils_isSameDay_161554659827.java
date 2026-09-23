package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.time.EqualityUtils.*;

public class DateUtils_isSameDay_161554659827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term6797;
     Object term6798;

    public DateUtils_isSameDay_161554659827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1, term1.getClass(), "fastTime", 1345889412244L);
        setField(term1, term1.getClass(), "cdate", null);
        term3 = newInstance(Class.forName("java.util.Date"));
        setLongField(term3, term3.getClass(), "fastTime", 1480456351369L);
        setField(term3, term3.getClass(), "cdate", null);
        term6797 = newInstance(Class.forName("java.util.Date"));
        setLongField(term6797, term6797.getClass(), "fastTime", 1345889412244L);
        setField(term6797, term6797.getClass(), "cdate", null);
        term6798 = newInstance(Class.forName("java.util.Date"));
        setLongField(term6798, term6798.getClass(), "fastTime", 1480456351369L);
        setField(term6798, term6798.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DateUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term3;
        callMethod(klass, "isSameDay", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term6797));
        assertTrue(recursiveEquals(term3, term6798));
    }

};


