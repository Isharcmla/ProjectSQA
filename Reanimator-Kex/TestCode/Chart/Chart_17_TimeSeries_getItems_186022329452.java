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

public class TimeSeries_getItems_186022329452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484;
     Object term5501;
     Object term5451;

    public TimeSeries_getItems_186022329452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term509 = new ArrayList();
        term484 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term527 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term528 = (Object[]) newArray("java.lang.Object", 0);
        Object term529 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term530 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term531 = newInstance(Class.forName("java.lang.Object"));
        setField(term484, term484.getClass(), "domain", "BYqFIqCKAV");
        setField(term484, term484.getClass(), "range", "vrQLuWIDJX");
        setField(term484, term484.getClass(), "timePeriodClass", null);
        setField(term484, term484.getClass(), "data", term509);
        setIntField(term484, term484.getClass(), "maximumItemCount", -616727354);
        setLongField(term484, term484.getClass(), "maximumItemAge", 7411271909051562686L);
        setField(term484, term484.getClass(), "key", null);
        setField(term484, term484.getClass(), "description", "flxyYxBRtu");
        setField(term527, term527.getClass(), "listenerList", term528);
        setField(term484, term484.getClass(), "listeners", term527);
        setField(term530, term530.getClass(), "map", null);
        setField(term529, term529.getClass(), "map", term530);
        setField(term529, term529.getClass(), "source", term531);
        setField(term484, term484.getClass(), "propertyChangeSupport", term529);
        setBooleanField(term484, term484.getClass(), "notify", true);
        ArrayList term5506 = new ArrayList();
        term5501 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term5510 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5511 = (Object[]) newArray("java.lang.Object", 0);
        Object term5512 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5513 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5514 = newInstance(Class.forName("java.lang.Object"));
        setField(term5501, term5501.getClass(), "domain", "BYqFIqCKAV");
        setField(term5501, term5501.getClass(), "range", "vrQLuWIDJX");
        setField(term5501, term5501.getClass(), "timePeriodClass", null);
        setField(term5501, term5501.getClass(), "data", term5506);
        setIntField(term5501, term5501.getClass(), "maximumItemCount", -616727354);
        setLongField(term5501, term5501.getClass(), "maximumItemAge", 7411271909051562686L);
        setField(term5501, term5501.getClass(), "key", null);
        setField(term5501, term5501.getClass(), "description", "flxyYxBRtu");
        setField(term5510, term5510.getClass(), "listenerList", term5511);
        setField(term5501, term5501.getClass(), "listeners", term5510);
        setField(term5513, term5513.getClass(), "map", null);
        setField(term5512, term5512.getClass(), "map", term5513);
        setField(term5512, term5512.getClass(), "source", term5514);
        setField(term5501, term5501.getClass(), "propertyChangeSupport", term5512);
        setBooleanField(term5501, term5501.getClass(), "notify", true);
        ArrayList term5452 = new ArrayList();
        term5451 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term5451, term5451.getClass(), "list", term5452);
        setField(term5451, term5451.getClass(), "c", term5452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getItems", argTypes, term484, args);
        assertTrue(recursiveEquals(term484, term5501));
        assertTrue(recursiveEquals(retValue, term5451));
    }

};


