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

public class TimePeriodValues_clone_67403859489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15880;

    public TimePeriodValues_clone_67403859489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15932 = new ArrayList();
        ((ArrayList) term15932).add((Object)null);
        ((ArrayList) term15932).add((Object)null);
        ((ArrayList) term15932).add((Object)null);
        ((ArrayList) term15932).add((Object)null);
        ((ArrayList) term15932).add((Object)null);
        ((ArrayList) term15932).add((Object)null);
        ((ArrayList) term15932).add((Object)null);
        ((ArrayList) term15932).add((Object)null);
        ((ArrayList) term15932).add((Object)null);
        term15880 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term15880, term15880.getClass(), "data", term15932);
        setField(term15880, term15880.getClass(), "listeners", null);
        setField(term15880, term15880.getClass(), "propertyChangeSupport", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clone", argTypes, term15880, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


