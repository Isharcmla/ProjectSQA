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

public class TimeSeries_delete_23482802582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3044;
     Object term3093;
     Object term3095;

    public TimeSeries_delete_23482802582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3069 = new ArrayList();
        term3044 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3087 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3088 = (Object[]) newArray("java.lang.Object", 0);
        Object term3089 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3090 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3091 = newInstance(Class.forName("java.lang.Object"));
        setField(term3044, term3044.getClass(), "domain", "MwwjNtdOFT");
        setField(term3044, term3044.getClass(), "range", "VYkqXKVlAJ");
        setField(term3044, term3044.getClass(), "timePeriodClass", null);
        setField(term3044, term3044.getClass(), "data", term3069);
        setIntField(term3044, term3044.getClass(), "maximumItemCount", -602026508);
        setLongField(term3044, term3044.getClass(), "maximumItemAge", 5907001541142728739L);
        setField(term3044, term3044.getClass(), "key", null);
        setField(term3044, term3044.getClass(), "description", "XkIoWJRNwN");
        setField(term3087, term3087.getClass(), "listenerList", term3088);
        setField(term3044, term3044.getClass(), "listeners", term3087);
        setField(term3090, term3090.getClass(), "map", null);
        setField(term3089, term3089.getClass(), "map", term3090);
        setField(term3089, term3089.getClass(), "source", term3091);
        setField(term3044, term3044.getClass(), "propertyChangeSupport", term3089);
        setBooleanField(term3044, term3044.getClass(), "notify", true);
        term3093 = new Integer(-157887805);
        term3095 = new Integer(1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3093;
        args[1] = term3095;
        try {
            callMethod(klass, "delete", argTypes, term3044, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


