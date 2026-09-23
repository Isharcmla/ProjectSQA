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
import org.jfree.data.general.SeriesException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;

public class TimeSeries_add_1148696891321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108398;
     Object term108464;
     Object term108510;

    public TimeSeries_add_1148696891321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108434 = Class.forName((String) "java.util.regex.Pattern$Neg");
        term108398 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term108398, term108398.getClass(), "timePeriodClass", term108434);
        term108464 = newInstance(Class.forName("org.jfree.data.time.Quarter"));
        term108510 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term108464;
        args[1] = term108510;
        try {
            callMethod(klass, "add", argTypes, term108398, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


