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
import java.lang.Double;

public class TimeSeries_minIgnoreNaN_1485461506106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4358;
     Object term4409;
     Object term4411;
     Object term17824;

    public TimeSeries_minIgnoreNaN_1485461506106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4383 = new ArrayList();
        term4358 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term4403 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term4404 = (Object[]) newArray("java.lang.Object", 0);
        Object term4405 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term4406 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term4407 = newInstance(Class.forName("java.lang.Object"));
        setField(term4358, term4358.getClass(), "domain", "izPpKDErnQ");
        setField(term4358, term4358.getClass(), "range", "NnpwZBUTvx");
        setField(term4358, term4358.getClass(), "timePeriodClass", null);
        setField(term4358, term4358.getClass(), "data", term4383);
        setIntField(term4358, term4358.getClass(), "maximumItemCount", 1225272962);
        setLongField(term4358, term4358.getClass(), "maximumItemAge", -2644215923136513282L);
        setDoubleField(term4358, term4358.getClass(), "minY", 0.39446728256884744);
        setDoubleField(term4358, term4358.getClass(), "maxY", 0.7865909711092062);
        setField(term4358, term4358.getClass(), "key", null);
        setField(term4358, term4358.getClass(), "description", "tlQSNgTkQX");
        setField(term4403, term4403.getClass(), "listenerList", term4404);
        setField(term4358, term4358.getClass(), "listeners", term4403);
        setField(term4406, term4406.getClass(), "map", null);
        setField(term4405, term4405.getClass(), "map", term4406);
        setField(term4405, term4405.getClass(), "source", term4407);
        setField(term4358, term4358.getClass(), "propertyChangeSupport", term4405);
        setBooleanField(term4358, term4358.getClass(), "notify", true);
        term4409 = new Double(0.06587158449170749);
        term4411 = new Double(0.0865998004187658);
        ArrayList term17829 = new ArrayList();
        term17824 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term17833 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term17834 = (Object[]) newArray("java.lang.Object", 0);
        Object term17835 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term17836 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term17837 = newInstance(Class.forName("java.lang.Object"));
        setField(term17824, term17824.getClass(), "domain", "izPpKDErnQ");
        setField(term17824, term17824.getClass(), "range", "NnpwZBUTvx");
        setField(term17824, term17824.getClass(), "timePeriodClass", null);
        setField(term17824, term17824.getClass(), "data", term17829);
        setIntField(term17824, term17824.getClass(), "maximumItemCount", 1225272962);
        setLongField(term17824, term17824.getClass(), "maximumItemAge", -2644215923136513282L);
        setDoubleField(term17824, term17824.getClass(), "minY", 0.39446728256884744);
        setDoubleField(term17824, term17824.getClass(), "maxY", 0.7865909711092062);
        setField(term17824, term17824.getClass(), "key", null);
        setField(term17824, term17824.getClass(), "description", "tlQSNgTkQX");
        setField(term17833, term17833.getClass(), "listenerList", term17834);
        setField(term17824, term17824.getClass(), "listeners", term17833);
        setField(term17836, term17836.getClass(), "map", null);
        setField(term17835, term17835.getClass(), "map", term17836);
        setField(term17835, term17835.getClass(), "source", term17837);
        setField(term17824, term17824.getClass(), "propertyChangeSupport", term17835);
        setBooleanField(term17824, term17824.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term4409;
        args[1] = term4411;
        Object retValue = callMethod(klass, "minIgnoreNaN", argTypes, term4358, args);
        assertTrue(recursiveEquals(term4358, term17824));
        assertTrue(recursiveEquals(term4409, 0.06587158449170749));
        assertTrue(recursiveEquals(term4411, 0.0865998004187658));
        assertTrue(recursiveEquals(retValue, 0.06587158449170749));
    }

};


