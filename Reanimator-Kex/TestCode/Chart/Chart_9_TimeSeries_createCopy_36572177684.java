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
import java.lang.Integer;

public class TimeSeries_createCopy_36572177684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3206;
     Object term3255;
     Object term3257;

    public TimeSeries_createCopy_36572177684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3231 = new ArrayList();
        term3206 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3249 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3250 = (Object[]) newArray("java.lang.Object", 0);
        Object term3251 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3252 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3253 = newInstance(Class.forName("java.lang.Object"));
        setField(term3206, term3206.getClass(), "domain", "VeDtgDzGAN");
        setField(term3206, term3206.getClass(), "range", "aWYOWZFyaX");
        setField(term3206, term3206.getClass(), "timePeriodClass", null);
        setField(term3206, term3206.getClass(), "data", term3231);
        setIntField(term3206, term3206.getClass(), "maximumItemCount", -1016503459);
        setLongField(term3206, term3206.getClass(), "maximumItemAge", -2068172595987555756L);
        setField(term3206, term3206.getClass(), "key", null);
        setField(term3206, term3206.getClass(), "description", "BRIVNtfUWU");
        setField(term3249, term3249.getClass(), "listenerList", term3250);
        setField(term3206, term3206.getClass(), "listeners", term3249);
        setField(term3252, term3252.getClass(), "map", null);
        setField(term3251, term3251.getClass(), "map", term3252);
        setField(term3251, term3251.getClass(), "source", term3253);
        setField(term3206, term3206.getClass(), "propertyChangeSupport", term3251);
        setBooleanField(term3206, term3206.getClass(), "notify", false);
        term3255 = new Integer(-1968847291);
        term3257 = new Integer(579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3255;
        args[1] = term3257;
        try {
            callMethod(klass, "createCopy", argTypes, term3206, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


