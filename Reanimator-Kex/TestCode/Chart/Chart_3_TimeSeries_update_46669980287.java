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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TimeSeries_update_46669980287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2707;
     Object term2758;

    public TimeSeries_update_46669980287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2732 = new ArrayList();
        term2707 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2752 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2753 = (Object[]) newArray("java.lang.Object", 0);
        Object term2754 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2755 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2756 = newInstance(Class.forName("java.lang.Object"));
        setField(term2707, term2707.getClass(), "domain", "xJgPlLxpgC");
        setField(term2707, term2707.getClass(), "range", "EYtfuJaxiM");
        setField(term2707, term2707.getClass(), "timePeriodClass", null);
        setField(term2707, term2707.getClass(), "data", term2732);
        setIntField(term2707, term2707.getClass(), "maximumItemCount", -469968304);
        setLongField(term2707, term2707.getClass(), "maximumItemAge", -6823727938421990489L);
        setDoubleField(term2707, term2707.getClass(), "minY", 0.022483645678509023);
        setDoubleField(term2707, term2707.getClass(), "maxY", 0.025133051616627267);
        setField(term2707, term2707.getClass(), "key", null);
        setField(term2707, term2707.getClass(), "description", "gCWtLVKVVe");
        setField(term2752, term2752.getClass(), "listenerList", term2753);
        setField(term2707, term2707.getClass(), "listeners", term2752);
        setField(term2755, term2755.getClass(), "map", null);
        setField(term2754, term2754.getClass(), "map", term2755);
        setField(term2754, term2754.getClass(), "source", term2756);
        setField(term2707, term2707.getClass(), "propertyChangeSupport", term2754);
        setBooleanField(term2707, term2707.getClass(), "notify", true);
        term2758 = new Integer(-1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term2758;
        args[1] = null;
        try {
            callMethod(klass, "update", argTypes, term2707, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


