package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class PeriodFormatterBuilder_toParser_585569977185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39541;

    public PeriodFormatterBuilder_toParser_585569977185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39593 = new ArrayList();
        term39541 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setBooleanField(term39541, term39541.getClass(), "iNotParser", false);
        setField(term39541, term39541.getClass(), "iElementPairs", term39593);
        setBooleanField(term39541, term39541.getClass(), "iNotPrinter", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toParser", argTypes, term39541, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


