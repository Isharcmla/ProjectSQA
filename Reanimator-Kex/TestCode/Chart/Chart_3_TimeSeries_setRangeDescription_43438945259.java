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

public class TimeSeries_setRangeDescription_43438945259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310;
     Object term5861;

    public TimeSeries_setRangeDescription_43438945259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term335 = new ArrayList();
        term310 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term355 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term356 = (Object[]) newArray("java.lang.Object", 0);
        Object term357 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term358 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term359 = newInstance(Class.forName("java.lang.Object"));
        setField(term310, term310.getClass(), "domain", "aJlieCFVtF");
        setField(term310, term310.getClass(), "range", "ZiaGIbnzTs");
        setField(term310, term310.getClass(), "timePeriodClass", null);
        setField(term310, term310.getClass(), "data", term335);
        setIntField(term310, term310.getClass(), "maximumItemCount", 391863371);
        setLongField(term310, term310.getClass(), "maximumItemAge", -8400487765614892086L);
        setDoubleField(term310, term310.getClass(), "minY", 0.2641345529914265);
        setDoubleField(term310, term310.getClass(), "maxY", 0.36923381893433327);
        setField(term310, term310.getClass(), "key", null);
        setField(term310, term310.getClass(), "description", "tbcdzjIfER");
        setField(term355, term355.getClass(), "listenerList", term356);
        setField(term310, term310.getClass(), "listeners", term355);
        setField(term358, term358.getClass(), "map", null);
        setField(term357, term357.getClass(), "map", term358);
        setField(term357, term357.getClass(), "source", term359);
        setField(term310, term310.getClass(), "propertyChangeSupport", term357);
        setBooleanField(term310, term310.getClass(), "notify", false);
        ArrayList term5866 = new ArrayList();
        term5861 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term5870 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5871 = (Object[]) newArray("java.lang.Object", 0);
        Object term5872 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5873 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5874 = newInstance(Class.forName("java.lang.Object"));
        setField(term5861, term5861.getClass(), "domain", "aJlieCFVtF");
        setField(term5861, term5861.getClass(), "range", "pCTimMblYc");
        setField(term5861, term5861.getClass(), "timePeriodClass", null);
        setField(term5861, term5861.getClass(), "data", term5866);
        setIntField(term5861, term5861.getClass(), "maximumItemCount", 391863371);
        setLongField(term5861, term5861.getClass(), "maximumItemAge", -8400487765614892086L);
        setDoubleField(term5861, term5861.getClass(), "minY", 0.2641345529914265);
        setDoubleField(term5861, term5861.getClass(), "maxY", 0.36923381893433327);
        setField(term5861, term5861.getClass(), "key", null);
        setField(term5861, term5861.getClass(), "description", "tbcdzjIfER");
        setField(term5870, term5870.getClass(), "listenerList", term5871);
        setField(term5861, term5861.getClass(), "listeners", term5870);
        setField(term5873, term5873.getClass(), "map", null);
        setField(term5872, term5872.getClass(), "map", term5873);
        setField(term5872, term5872.getClass(), "source", term5874);
        setField(term5861, term5861.getClass(), "propertyChangeSupport", term5872);
        setBooleanField(term5861, term5861.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        callMethod(klass, "setRangeDescription", argTypes, term310, args);
        assertTrue(recursiveEquals(term310, term5861));
    }

};


