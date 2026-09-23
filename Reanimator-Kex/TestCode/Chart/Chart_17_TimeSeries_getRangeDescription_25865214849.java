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

public class TimeSeries_getRangeDescription_25865214849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;
     Object term5067;

    public TimeSeries_getRangeDescription_25865214849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term250 = new ArrayList();
        term225 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term268 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term269 = (Object[]) newArray("java.lang.Object", 0);
        Object term270 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term271 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term272 = newInstance(Class.forName("java.lang.Object"));
        setField(term225, term225.getClass(), "domain", "uuaPigETmJ");
        setField(term225, term225.getClass(), "range", "MxlszYVzRf");
        setField(term225, term225.getClass(), "timePeriodClass", null);
        setField(term225, term225.getClass(), "data", term250);
        setIntField(term225, term225.getClass(), "maximumItemCount", 1484323161);
        setLongField(term225, term225.getClass(), "maximumItemAge", -8257434502486459194L);
        setField(term225, term225.getClass(), "key", null);
        setField(term225, term225.getClass(), "description", "LQFpaHEwXR");
        setField(term268, term268.getClass(), "listenerList", term269);
        setField(term225, term225.getClass(), "listeners", term268);
        setField(term271, term271.getClass(), "map", null);
        setField(term270, term270.getClass(), "map", term271);
        setField(term270, term270.getClass(), "source", term272);
        setField(term225, term225.getClass(), "propertyChangeSupport", term270);
        setBooleanField(term225, term225.getClass(), "notify", false);
        ArrayList term5072 = new ArrayList();
        term5067 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term5076 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5077 = (Object[]) newArray("java.lang.Object", 0);
        Object term5078 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5079 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5080 = newInstance(Class.forName("java.lang.Object"));
        setField(term5067, term5067.getClass(), "domain", "uuaPigETmJ");
        setField(term5067, term5067.getClass(), "range", "MxlszYVzRf");
        setField(term5067, term5067.getClass(), "timePeriodClass", null);
        setField(term5067, term5067.getClass(), "data", term5072);
        setIntField(term5067, term5067.getClass(), "maximumItemCount", 1484323161);
        setLongField(term5067, term5067.getClass(), "maximumItemAge", -8257434502486459194L);
        setField(term5067, term5067.getClass(), "key", null);
        setField(term5067, term5067.getClass(), "description", "LQFpaHEwXR");
        setField(term5076, term5076.getClass(), "listenerList", term5077);
        setField(term5067, term5067.getClass(), "listeners", term5076);
        setField(term5079, term5079.getClass(), "map", null);
        setField(term5078, term5078.getClass(), "map", term5079);
        setField(term5078, term5078.getClass(), "source", term5080);
        setField(term5067, term5067.getClass(), "propertyChangeSupport", term5078);
        setBooleanField(term5067, term5067.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRangeDescription", argTypes, term225, args);
        assertTrue(recursiveEquals(term225, term5067));
        assertTrue(recursiveEquals(retValue, "MxlszYVzRf"));
    }

};


