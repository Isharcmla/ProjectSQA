package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.time.EqualityUtils.*;

public class DateUtils_isSameDay_68036969958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term13628;
     Object term13629;

    public DateUtils_isSameDay_68036969958() {
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
        term13628 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13628, term13628.getClass(), "fastTime", 1345889412244L);
        setField(term13628, term13628.getClass(), "cdate", null);
        term13629 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13629, term13629.getClass(), "fastTime", 1480456351369L);
        setField(term13629, term13629.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term3;
        callMethod(klass, "isSameDay", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term13628));
        assertTrue(recursiveEquals(term3, term13629));
    }

};


