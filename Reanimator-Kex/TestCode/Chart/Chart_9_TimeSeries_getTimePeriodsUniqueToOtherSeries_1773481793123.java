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
import java.lang.NullPointerException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_getTimePeriodsUniqueToOtherSeries_1773481793123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23559;
     Object term23625;

    public TimeSeries_getTimePeriodsUniqueToOtherSeries_1773481793123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23559 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        ArrayList term23677 = new ArrayList();
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        ((ArrayList) term23677).add((Object)null);
        term23625 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term23625, term23625.getClass(), "data", term23677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeries");
        Object[] args = new Object[1];
        args[0] = term23625;
        try {
            callMethod(klass, "getTimePeriodsUniqueToOtherSeries", argTypes, term23559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


