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
import java.lang.Long;

public class TimeSeries_setMaximumItemAge_108203555065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term820;
     Object term871;

    public TimeSeries_setMaximumItemAge_108203555065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term845 = new ArrayList();
        term820 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term865 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term866 = (Object[]) newArray("java.lang.Object", 0);
        Object term867 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term868 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term869 = newInstance(Class.forName("java.lang.Object"));
        setField(term820, term820.getClass(), "domain", "wSQxaModmm");
        setField(term820, term820.getClass(), "range", "UlajhuVLaP");
        setField(term820, term820.getClass(), "timePeriodClass", null);
        setField(term820, term820.getClass(), "data", term845);
        setIntField(term820, term820.getClass(), "maximumItemCount", 1725571209);
        setLongField(term820, term820.getClass(), "maximumItemAge", 6967924379644551255L);
        setDoubleField(term820, term820.getClass(), "minY", 0.6436713023569729);
        setDoubleField(term820, term820.getClass(), "maxY", 0.7332741045694002);
        setField(term820, term820.getClass(), "key", null);
        setField(term820, term820.getClass(), "description", "gGSMzuGICf");
        setField(term865, term865.getClass(), "listenerList", term866);
        setField(term820, term820.getClass(), "listeners", term865);
        setField(term868, term868.getClass(), "map", null);
        setField(term867, term867.getClass(), "map", term868);
        setField(term867, term867.getClass(), "source", term869);
        setField(term820, term820.getClass(), "propertyChangeSupport", term867);
        setBooleanField(term820, term820.getClass(), "notify", true);
        term871 = new Long(-2813493605142626659L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term871;
        try {
            callMethod(klass, "setMaximumItemAge", argTypes, term820, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


