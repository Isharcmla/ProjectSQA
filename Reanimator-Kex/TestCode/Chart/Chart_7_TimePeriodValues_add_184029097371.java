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

public class TimePeriodValues_add_184029097371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11572;
     Object term11738;

    public TimePeriodValues_add_184029097371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11662 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11624 = new ArrayList();
        ((ArrayList) term11624).add(term11662);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        ((ArrayList) term11624).add((Object)null);
        term11572 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term11572, term11572.getClass(), "data", term11624);
        term11738 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValue"));
        Object term11796 = newInstance(Class.forName("org.jfree.data.time.Second"));
        setField(term11738, term11738.getClass(), "period", term11796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimePeriodValue");
        Object[] args = new Object[1];
        args[0] = term11738;
        try {
            callMethod(klass, "add", argTypes, term11572, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


