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
import java.lang.Double;

public class TimeSeries_addOrUpdate_177816134589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2952;
     Object term3003;

    public TimeSeries_addOrUpdate_177816134589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2977 = new ArrayList();
        term2952 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2997 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2998 = (Object[]) newArray("java.lang.Object", 0);
        Object term2999 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3000 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3001 = newInstance(Class.forName("java.lang.Object"));
        setField(term2952, term2952.getClass(), "domain", "GgZWSjxjyE");
        setField(term2952, term2952.getClass(), "range", "EeBVbzjcCI");
        setField(term2952, term2952.getClass(), "timePeriodClass", null);
        setField(term2952, term2952.getClass(), "data", term2977);
        setIntField(term2952, term2952.getClass(), "maximumItemCount", 767834723);
        setLongField(term2952, term2952.getClass(), "maximumItemAge", 6617340557564669657L);
        setDoubleField(term2952, term2952.getClass(), "minY", 0.0022646783892913414);
        setDoubleField(term2952, term2952.getClass(), "maxY", 0.36226058076369927);
        setField(term2952, term2952.getClass(), "key", null);
        setField(term2952, term2952.getClass(), "description", "UfQtPRyWRC");
        setField(term2997, term2997.getClass(), "listenerList", term2998);
        setField(term2952, term2952.getClass(), "listeners", term2997);
        setField(term3000, term3000.getClass(), "map", null);
        setField(term2999, term2999.getClass(), "map", term3000);
        setField(term2999, term2999.getClass(), "source", term3001);
        setField(term2952, term2952.getClass(), "propertyChangeSupport", term2999);
        setBooleanField(term2952, term2952.getClass(), "notify", false);
        term3003 = new Double(0.03699061125289671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3003;
        try {
            callMethod(klass, "addOrUpdate", argTypes, term2952, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


