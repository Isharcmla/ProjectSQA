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
import java.lang.NullPointerException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_add_150513678380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2126;
     Object term2177;

    public TimeSeries_add_150513678380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2151 = new ArrayList();
        term2126 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2171 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2172 = (Object[]) newArray("java.lang.Object", 0);
        Object term2173 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2174 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2175 = newInstance(Class.forName("java.lang.Object"));
        setField(term2126, term2126.getClass(), "domain", "QXzGXbEXMu");
        setField(term2126, term2126.getClass(), "range", "qxSDVejjiY");
        setField(term2126, term2126.getClass(), "timePeriodClass", null);
        setField(term2126, term2126.getClass(), "data", term2151);
        setIntField(term2126, term2126.getClass(), "maximumItemCount", -203030934);
        setLongField(term2126, term2126.getClass(), "maximumItemAge", -7672528020740371001L);
        setDoubleField(term2126, term2126.getClass(), "minY", 0.6862221294683138);
        setDoubleField(term2126, term2126.getClass(), "maxY", 0.15917839663695388);
        setField(term2126, term2126.getClass(), "key", null);
        setField(term2126, term2126.getClass(), "description", "xBsXSDjXYK");
        setField(term2171, term2171.getClass(), "listenerList", term2172);
        setField(term2126, term2126.getClass(), "listeners", term2171);
        setField(term2174, term2174.getClass(), "map", null);
        setField(term2173, term2173.getClass(), "map", term2174);
        setField(term2173, term2173.getClass(), "source", term2175);
        setField(term2126, term2126.getClass(), "propertyChangeSupport", term2173);
        setBooleanField(term2126, term2126.getClass(), "notify", false);
        term2177 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term2177, term2177.getClass(), "period", null);
        setField(term2177, term2177.getClass(), "value", null);
        setBooleanField(term2177, term2177.getClass(), "selected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term2177;
        try {
            callMethod(klass, "add", argTypes, term2126, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


