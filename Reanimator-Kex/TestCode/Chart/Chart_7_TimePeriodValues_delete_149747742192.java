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

public class TimePeriodValues_delete_149747742192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16575;

    public TimePeriodValues_delete_149747742192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16627 = new ArrayList();
        term16575 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setIntField(term16575, term16575.getClass(), "minStartIndex", 0);
        setIntField(term16575, term16575.getClass(), "minMiddleIndex", 0);
        setIntField(term16575, term16575.getClass(), "minEndIndex", 0);
        setIntField(term16575, term16575.getClass(), "maxStartIndex", 0);
        setIntField(term16575, term16575.getClass(), "maxMiddleIndex", 0);
        setIntField(term16575, term16575.getClass(), "maxEndIndex", 0);
        setField(term16575, term16575.getClass(), "data", term16627);
        setBooleanField(term16575, term16575.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = -1;
        try {
            callMethod(klass, "delete", argTypes, term16575, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


