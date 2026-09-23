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

public class TimeSeries_getDataItem_170955740059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1043;

    public TimeSeries_getDataItem_170955740059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1068 = new ArrayList();
        term1043 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1086 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1087 = (Object[]) newArray("java.lang.Object", 0);
        Object term1088 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1089 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1090 = newInstance(Class.forName("java.lang.Object"));
        setField(term1043, term1043.getClass(), "domain", "UoYtihxVaS");
        setField(term1043, term1043.getClass(), "range", "JDswTTCZHV");
        setField(term1043, term1043.getClass(), "timePeriodClass", null);
        setField(term1043, term1043.getClass(), "data", term1068);
        setIntField(term1043, term1043.getClass(), "maximumItemCount", 1585847225);
        setLongField(term1043, term1043.getClass(), "maximumItemAge", 2535595959091595249L);
        setField(term1043, term1043.getClass(), "key", null);
        setField(term1043, term1043.getClass(), "description", "onpbIeEKoi");
        setField(term1086, term1086.getClass(), "listenerList", term1087);
        setField(term1043, term1043.getClass(), "listeners", term1086);
        setField(term1089, term1089.getClass(), "map", null);
        setField(term1088, term1088.getClass(), "map", term1089);
        setField(term1088, term1088.getClass(), "source", term1090);
        setField(term1043, term1043.getClass(), "propertyChangeSupport", term1088);
        setBooleanField(term1043, term1043.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getDataItem", argTypes, term1043, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


