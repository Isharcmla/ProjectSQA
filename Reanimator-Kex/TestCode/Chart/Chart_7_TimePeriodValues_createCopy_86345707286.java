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
import java.lang.ClassCastException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimePeriodValues_createCopy_86345707286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14950;

    public TimePeriodValues_createCopy_86345707286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15040 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term15002 = new ArrayList();
        ((ArrayList) term15002).add(term15040);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        ((ArrayList) term15002).add((Object)null);
        term14950 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term14950, term14950.getClass(), "data", term15002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0;
        try {
            callMethod(klass, "createCopy", argTypes, term14950, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


