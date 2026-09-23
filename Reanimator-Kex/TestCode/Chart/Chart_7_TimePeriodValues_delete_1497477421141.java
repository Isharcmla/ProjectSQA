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
import java.util.ArrayList;
import java.lang.Object;

public class TimePeriodValues_delete_1497477421141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29710;

    public TimePeriodValues_delete_1497477421141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29762 = new ArrayList();
        term29710 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object[] term29603 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term29710, term29710.getClass(), "minStartIndex", 0);
        setIntField(term29710, term29710.getClass(), "minMiddleIndex", 0);
        setIntField(term29710, term29710.getClass(), "minEndIndex", 0);
        setIntField(term29710, term29710.getClass(), "maxStartIndex", 0);
        setIntField(term29710, term29710.getClass(), "maxMiddleIndex", 0);
        setIntField(term29710, term29710.getClass(), "maxEndIndex", 0);
        setField(term29710, term29710.getClass(), "data", term29762);
        setBooleanField(term29710, term29710.getClass(), "notify", true);
        setField(term29710, term29710.getClass(), "listeners", term29603);
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
        callMethod(klass, "delete", argTypes, term29710, args);
    }

};


