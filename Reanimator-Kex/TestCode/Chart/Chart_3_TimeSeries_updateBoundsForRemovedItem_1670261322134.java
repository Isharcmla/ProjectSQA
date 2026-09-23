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
import java.lang.Float;

public class TimeSeries_updateBoundsForRemovedItem_1670261322134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21805;
     Object term21887;

    public TimeSeries_updateBoundsForRemovedItem_1670261322134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21805 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Float term21931 = new Float(0.0F);
        term21887 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term21887, term21887.getClass(), "value", term21931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term21887;
        callMethod(klass, "updateBoundsForRemovedItem", argTypes, term21805, args);
    }

};


