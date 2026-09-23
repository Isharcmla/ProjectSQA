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

public class TimeSeries_delete_23482802596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3529;
     Object term3580;
     Object term3582;

    public TimeSeries_delete_23482802596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3554 = new ArrayList();
        term3529 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3574 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3575 = (Object[]) newArray("java.lang.Object", 0);
        Object term3576 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3577 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3578 = newInstance(Class.forName("java.lang.Object"));
        setField(term3529, term3529.getClass(), "domain", "zUlRdimJtU");
        setField(term3529, term3529.getClass(), "range", "vwbEQQNQrx");
        setField(term3529, term3529.getClass(), "timePeriodClass", null);
        setField(term3529, term3529.getClass(), "data", term3554);
        setIntField(term3529, term3529.getClass(), "maximumItemCount", 579005622);
        setLongField(term3529, term3529.getClass(), "maximumItemAge", 4784595517102746672L);
        setDoubleField(term3529, term3529.getClass(), "minY", 0.1544348383112728);
        setDoubleField(term3529, term3529.getClass(), "maxY", 0.5187846213101265);
        setField(term3529, term3529.getClass(), "key", null);
        setField(term3529, term3529.getClass(), "description", "xtftXXMbem");
        setField(term3574, term3574.getClass(), "listenerList", term3575);
        setField(term3529, term3529.getClass(), "listeners", term3574);
        setField(term3577, term3577.getClass(), "map", null);
        setField(term3576, term3576.getClass(), "map", term3577);
        setField(term3576, term3576.getClass(), "source", term3578);
        setField(term3529, term3529.getClass(), "propertyChangeSupport", term3576);
        setBooleanField(term3529, term3529.getClass(), "notify", false);
        term3580 = new Integer(-14890619);
        term3582 = new Integer(1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3580;
        args[1] = term3582;
        try {
            callMethod(klass, "delete", argTypes, term3529, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


