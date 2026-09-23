package org.jfree.data.xy;

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
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XYSeries_update_89198653759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term837;

    public XYSeries_update_89198653759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term838 = new ArrayList();
        term837 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term857 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term858 = (Object[]) newArray("java.lang.Object", 0);
        Object term859 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term860 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term861 = newInstance(Class.forName("java.lang.Object"));
        setField(term837, term837.getClass(), "data", term838);
        setIntField(term837, term837.getClass(), "maximumItemCount", -203030934);
        setBooleanField(term837, term837.getClass(), "autoSort", false);
        setBooleanField(term837, term837.getClass(), "allowDuplicateXValues", false);
        setField(term837, term837.getClass(), "key", null);
        setField(term837, term837.getClass(), "description", "BndsHwAFMv");
        setField(term857, term857.getClass(), "listenerList", term858);
        setField(term837, term837.getClass(), "listeners", term857);
        setField(term860, term860.getClass(), "map", null);
        setField(term859, term859.getClass(), "map", term860);
        setField(term859, term859.getClass(), "source", term861);
        setField(term837, term837.getClass(), "propertyChangeSupport", term859);
        setBooleanField(term837, term837.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Number");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "update", argTypes, term837, args);
            assertTrue(false);
        }
        catch (SeriesException e) {
        }

    }

};


