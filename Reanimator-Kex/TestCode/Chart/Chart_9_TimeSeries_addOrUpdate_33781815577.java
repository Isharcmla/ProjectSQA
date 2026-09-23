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
import java.lang.IllegalArgumentException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_addOrUpdate_33781815577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2643;

    public TimeSeries_addOrUpdate_33781815577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2668 = new ArrayList();
        term2643 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2686 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2687 = (Object[]) newArray("java.lang.Object", 0);
        Object term2688 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2689 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2690 = newInstance(Class.forName("java.lang.Object"));
        setField(term2643, term2643.getClass(), "domain", "xJgPlLxpgC");
        setField(term2643, term2643.getClass(), "range", "EYtfuJaxiM");
        setField(term2643, term2643.getClass(), "timePeriodClass", null);
        setField(term2643, term2643.getClass(), "data", term2668);
        setIntField(term2643, term2643.getClass(), "maximumItemCount", -469968304);
        setLongField(term2643, term2643.getClass(), "maximumItemAge", -6823727938421990489L);
        setField(term2643, term2643.getClass(), "key", null);
        setField(term2643, term2643.getClass(), "description", "gCWtLVKVVe");
        setField(term2686, term2686.getClass(), "listenerList", term2687);
        setField(term2643, term2643.getClass(), "listeners", term2686);
        setField(term2689, term2689.getClass(), "map", null);
        setField(term2688, term2688.getClass(), "map", term2689);
        setField(term2688, term2688.getClass(), "source", term2690);
        setField(term2643, term2643.getClass(), "propertyChangeSupport", term2688);
        setBooleanField(term2643, term2643.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "addOrUpdate", argTypes, term2643, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


