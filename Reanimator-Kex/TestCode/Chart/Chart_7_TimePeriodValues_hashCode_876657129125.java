package org.jfree.data.time;

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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.time.EqualityUtils.*;
import java.util.ArrayList;

public class TimePeriodValues_hashCode_876657129125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23974;
     Object term24379;

    public TimePeriodValues_hashCode_876657129125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24026 = new ArrayList();
        term23974 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term23974, term23974.getClass(), "domain", null);
        setField(term23974, term23974.getClass(), "range", null);
        setField(term23974, term23974.getClass(), "data", term24026);
        ArrayList term24380 = new ArrayList();
        term24379 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term24379, term24379.getClass(), "domain", null);
        setField(term24379, term24379.getClass(), "range", null);
        setField(term24379, term24379.getClass(), "data", term24380);
        setIntField(term24379, term24379.getClass(), "minStartIndex", 0);
        setIntField(term24379, term24379.getClass(), "maxStartIndex", 0);
        setIntField(term24379, term24379.getClass(), "minMiddleIndex", 0);
        setIntField(term24379, term24379.getClass(), "maxMiddleIndex", 0);
        setIntField(term24379, term24379.getClass(), "minEndIndex", 0);
        setIntField(term24379, term24379.getClass(), "maxEndIndex", 0);
        setField(term24379, term24379.getClass(), "key", null);
        setField(term24379, term24379.getClass(), "description", null);
        setField(term24379, term24379.getClass(), "listeners", null);
        setField(term24379, term24379.getClass(), "propertyChangeSupport", null);
        setBooleanField(term24379, term24379.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23974, args);
        assertTrue(recursiveEquals(term23974, term24379));
        assertTrue(recursiveEquals(retValue, 594823321));
    }

};


