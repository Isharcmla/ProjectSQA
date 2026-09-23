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
import java.lang.Integer;
import java.lang.Boolean;

public class TimeSeries_delete_23667407543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3614;
     Object term3665;
     Object term3667;
     Object term3669;

    public TimeSeries_delete_23667407543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3639 = new ArrayList();
        term3614 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3659 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3660 = (Object[]) newArray("java.lang.Object", 0);
        Object term3661 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3662 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3663 = newInstance(Class.forName("java.lang.Object"));
        setField(term3614, term3614.getClass(), "domain", "lihXWlGDxk");
        setField(term3614, term3614.getClass(), "range", "JmcmxoGhIK");
        setField(term3614, term3614.getClass(), "timePeriodClass", null);
        setField(term3614, term3614.getClass(), "data", term3639);
        setIntField(term3614, term3614.getClass(), "maximumItemCount", 454281060);
        setLongField(term3614, term3614.getClass(), "maximumItemAge", -7612550318181586304L);
        setDoubleField(term3614, term3614.getClass(), "minY", 0.045893173090043815);
        setDoubleField(term3614, term3614.getClass(), "maxY", 0.3626177854778667);
        setField(term3614, term3614.getClass(), "key", null);
        setField(term3614, term3614.getClass(), "description", "jXzmYyrnnT");
        setField(term3659, term3659.getClass(), "listenerList", term3660);
        setField(term3614, term3614.getClass(), "listeners", term3659);
        setField(term3662, term3662.getClass(), "map", null);
        setField(term3661, term3661.getClass(), "map", term3662);
        setField(term3661, term3661.getClass(), "source", term3663);
        setField(term3614, term3614.getClass(), "propertyChangeSupport", term3661);
        setBooleanField(term3614, term3614.getClass(), "notify", false);
        term3665 = new Integer(-1786399638);
        term3667 = new Integer(2055867847);
        term3669 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term3665;
        args[1] = term3667;
        args[2] = term3669;
        callMethod(klass, "delete", argTypes, term3614, args);
    }

};


