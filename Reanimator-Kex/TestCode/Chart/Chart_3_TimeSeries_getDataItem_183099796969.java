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

public class TimeSeries_getDataItem_183099796969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1146;
     Object term1197;

    public TimeSeries_getDataItem_183099796969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1171 = new ArrayList();
        term1146 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1191 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1192 = (Object[]) newArray("java.lang.Object", 0);
        Object term1193 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1194 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1195 = newInstance(Class.forName("java.lang.Object"));
        setField(term1146, term1146.getClass(), "domain", "ffYhPOzlUs");
        setField(term1146, term1146.getClass(), "range", "MLqYREekMl");
        setField(term1146, term1146.getClass(), "timePeriodClass", null);
        setField(term1146, term1146.getClass(), "data", term1171);
        setIntField(term1146, term1146.getClass(), "maximumItemCount", 1585847225);
        setLongField(term1146, term1146.getClass(), "maximumItemAge", -5476826692763582090L);
        setDoubleField(term1146, term1146.getClass(), "minY", 0.5840714198152577);
        setDoubleField(term1146, term1146.getClass(), "maxY", 0.7559240768573477);
        setField(term1146, term1146.getClass(), "key", null);
        setField(term1146, term1146.getClass(), "description", "ytSBIKXogI");
        setField(term1191, term1191.getClass(), "listenerList", term1192);
        setField(term1146, term1146.getClass(), "listeners", term1191);
        setField(term1194, term1194.getClass(), "map", null);
        setField(term1193, term1193.getClass(), "map", term1194);
        setField(term1193, term1193.getClass(), "source", term1195);
        setField(term1146, term1146.getClass(), "propertyChangeSupport", term1193);
        setBooleanField(term1146, term1146.getClass(), "notify", true);
        term1197 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1197;
        try {
            callMethod(klass, "getDataItem", argTypes, term1146, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


