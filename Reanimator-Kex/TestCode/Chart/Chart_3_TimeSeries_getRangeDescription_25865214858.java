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

public class TimeSeries_getRangeDescription_25865214858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;
     Object term5695;

    public TimeSeries_getRangeDescription_25865214858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term254 = new ArrayList();
        term229 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term274 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term275 = (Object[]) newArray("java.lang.Object", 0);
        Object term276 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term277 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term278 = newInstance(Class.forName("java.lang.Object"));
        setField(term229, term229.getClass(), "domain", "uuaPigETmJ");
        setField(term229, term229.getClass(), "range", "MxlszYVzRf");
        setField(term229, term229.getClass(), "timePeriodClass", null);
        setField(term229, term229.getClass(), "data", term254);
        setIntField(term229, term229.getClass(), "maximumItemCount", 1484323161);
        setLongField(term229, term229.getClass(), "maximumItemAge", -8257434502486459194L);
        setDoubleField(term229, term229.getClass(), "minY", 0.28570734989730284);
        setDoubleField(term229, term229.getClass(), "maxY", 0.40176586625454525);
        setField(term229, term229.getClass(), "key", null);
        setField(term229, term229.getClass(), "description", "LQFpaHEwXR");
        setField(term274, term274.getClass(), "listenerList", term275);
        setField(term229, term229.getClass(), "listeners", term274);
        setField(term277, term277.getClass(), "map", null);
        setField(term276, term276.getClass(), "map", term277);
        setField(term276, term276.getClass(), "source", term278);
        setField(term229, term229.getClass(), "propertyChangeSupport", term276);
        setBooleanField(term229, term229.getClass(), "notify", false);
        ArrayList term5700 = new ArrayList();
        term5695 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term5704 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5705 = (Object[]) newArray("java.lang.Object", 0);
        Object term5706 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5707 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5708 = newInstance(Class.forName("java.lang.Object"));
        setField(term5695, term5695.getClass(), "domain", "uuaPigETmJ");
        setField(term5695, term5695.getClass(), "range", "MxlszYVzRf");
        setField(term5695, term5695.getClass(), "timePeriodClass", null);
        setField(term5695, term5695.getClass(), "data", term5700);
        setIntField(term5695, term5695.getClass(), "maximumItemCount", 1484323161);
        setLongField(term5695, term5695.getClass(), "maximumItemAge", -8257434502486459194L);
        setDoubleField(term5695, term5695.getClass(), "minY", 0.28570734989730284);
        setDoubleField(term5695, term5695.getClass(), "maxY", 0.40176586625454525);
        setField(term5695, term5695.getClass(), "key", null);
        setField(term5695, term5695.getClass(), "description", "LQFpaHEwXR");
        setField(term5704, term5704.getClass(), "listenerList", term5705);
        setField(term5695, term5695.getClass(), "listeners", term5704);
        setField(term5707, term5707.getClass(), "map", null);
        setField(term5706, term5706.getClass(), "map", term5707);
        setField(term5706, term5706.getClass(), "source", term5708);
        setField(term5695, term5695.getClass(), "propertyChangeSupport", term5706);
        setBooleanField(term5695, term5695.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRangeDescription", argTypes, term229, args);
        assertTrue(recursiveEquals(term229, term5695));
        assertTrue(recursiveEquals(retValue, "MxlszYVzRf"));
    }

};


