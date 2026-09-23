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

public class Period_withWeeks_1269818202835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3702917;

    public Period_withWeeks_1269818202835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3702917 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3702971 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3702630 = (Object[]) newArray("org.joda.time.DurationFieldType", 7);
        int[] term3702639 = (int[]) newIntArray(21);
        setField(term3702971, term3702971.getClass(), "iTypes", term3702630);
        setField(term3702917, term3702917.getClass(), "iType", term3702971);
        setField(term3702917, term3702917.getClass(), "iValues", term3702639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withWeeks", argTypes, term3702917, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


