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
import static org.jfree.data.time.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_getMaxY_129965946667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term984;
     Object term7077;

    public TimeSeries_getMaxY_129965946667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1009 = new ArrayList();
        term984 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1029 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1030 = (Object[]) newArray("java.lang.Object", 0);
        Object term1031 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1032 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1033 = newInstance(Class.forName("java.lang.Object"));
        setField(term984, term984.getClass(), "domain", "xLbjWUgOIL");
        setField(term984, term984.getClass(), "range", "jDtqGUpnZN");
        setField(term984, term984.getClass(), "timePeriodClass", null);
        setField(term984, term984.getClass(), "data", term1009);
        setIntField(term984, term984.getClass(), "maximumItemCount", 1134449235);
        setLongField(term984, term984.getClass(), "maximumItemAge", -4325723315152823407L);
        setDoubleField(term984, term984.getClass(), "minY", 0.43692187681405226);
        setDoubleField(term984, term984.getClass(), "maxY", 0.7633268466829064);
        setField(term984, term984.getClass(), "key", null);
        setField(term984, term984.getClass(), "description", "nGKItKLYNC");
        setField(term1029, term1029.getClass(), "listenerList", term1030);
        setField(term984, term984.getClass(), "listeners", term1029);
        setField(term1032, term1032.getClass(), "map", null);
        setField(term1031, term1031.getClass(), "map", term1032);
        setField(term1031, term1031.getClass(), "source", term1033);
        setField(term984, term984.getClass(), "propertyChangeSupport", term1031);
        setBooleanField(term984, term984.getClass(), "notify", true);
        ArrayList term7082 = new ArrayList();
        term7077 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term7086 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7087 = (Object[]) newArray("java.lang.Object", 0);
        Object term7088 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term7089 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term7090 = newInstance(Class.forName("java.lang.Object"));
        setField(term7077, term7077.getClass(), "domain", "xLbjWUgOIL");
        setField(term7077, term7077.getClass(), "range", "jDtqGUpnZN");
        setField(term7077, term7077.getClass(), "timePeriodClass", null);
        setField(term7077, term7077.getClass(), "data", term7082);
        setIntField(term7077, term7077.getClass(), "maximumItemCount", 1134449235);
        setLongField(term7077, term7077.getClass(), "maximumItemAge", -4325723315152823407L);
        setDoubleField(term7077, term7077.getClass(), "minY", 0.43692187681405226);
        setDoubleField(term7077, term7077.getClass(), "maxY", 0.7633268466829064);
        setField(term7077, term7077.getClass(), "key", null);
        setField(term7077, term7077.getClass(), "description", "nGKItKLYNC");
        setField(term7086, term7086.getClass(), "listenerList", term7087);
        setField(term7077, term7077.getClass(), "listeners", term7086);
        setField(term7089, term7089.getClass(), "map", null);
        setField(term7088, term7088.getClass(), "map", term7089);
        setField(term7088, term7088.getClass(), "source", term7090);
        setField(term7077, term7077.getClass(), "propertyChangeSupport", term7088);
        setBooleanField(term7077, term7077.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxY", argTypes, term984, args);
        assertTrue(recursiveEquals(term984, term7077));
        assertTrue(recursiveEquals(retValue, 0.7633268466829064));
    }

};


