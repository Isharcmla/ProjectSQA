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

public class TimeSeries_createCopy_36572177699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3782;
     Object term3833;
     Object term3835;

    public TimeSeries_createCopy_36572177699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3807 = new ArrayList();
        term3782 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3827 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3828 = (Object[]) newArray("java.lang.Object", 0);
        Object term3829 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3830 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3831 = newInstance(Class.forName("java.lang.Object"));
        setField(term3782, term3782.getClass(), "domain", "RbVQXSpxXy");
        setField(term3782, term3782.getClass(), "range", "YpJbIgJWWv");
        setField(term3782, term3782.getClass(), "timePeriodClass", null);
        setField(term3782, term3782.getClass(), "data", term3807);
        setIntField(term3782, term3782.getClass(), "maximumItemCount", 292681826);
        setLongField(term3782, term3782.getClass(), "maximumItemAge", 4044358158040652353L);
        setDoubleField(term3782, term3782.getClass(), "minY", 0.5412182593116958);
        setDoubleField(term3782, term3782.getClass(), "maxY", 0.16988691727397487);
        setField(term3782, term3782.getClass(), "key", null);
        setField(term3782, term3782.getClass(), "description", "JppkknKVOw");
        setField(term3827, term3827.getClass(), "listenerList", term3828);
        setField(term3782, term3782.getClass(), "listeners", term3827);
        setField(term3830, term3830.getClass(), "map", null);
        setField(term3829, term3829.getClass(), "map", term3830);
        setField(term3829, term3829.getClass(), "source", term3831);
        setField(term3782, term3782.getClass(), "propertyChangeSupport", term3829);
        setBooleanField(term3782, term3782.getClass(), "notify", true);
        term3833 = new Integer(458147407);
        term3835 = new Integer(-184153539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3833;
        args[1] = term3835;
        try {
            callMethod(klass, "createCopy", argTypes, term3782, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


