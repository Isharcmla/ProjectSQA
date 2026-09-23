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

public class TimeSeries_createCopy_365721776181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34699;
     Object term34789;
     Object term34775;

    public TimeSeries_createCopy_365721776181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34751 = new ArrayList();
        term34699 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term34699, term34699.getClass(), "data", term34751);
        ArrayList term34790 = new ArrayList();
        term34789 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        setField(term34789, term34789.getClass(), "domain", null);
        setField(term34789, term34789.getClass(), "range", null);
        setField(term34789, term34789.getClass(), "timePeriodClass", null);
        setField(term34789, term34789.getClass(), "data", term34790);
        setIntField(term34789, term34789.getClass(), "maximumItemCount", 0);
        setLongField(term34789, term34789.getClass(), "maximumItemAge", 0L);
        setField(term34789, term34789.getClass(), "key", null);
        setField(term34789, term34789.getClass(), "description", null);
        setField(term34789, term34789.getClass(), "listeners", null);
        setField(term34789, term34789.getClass(), "propertyChangeSupport", null);
        setBooleanField(term34789, term34789.getClass(), "notify", false);
        ArrayList term34776 = new ArrayList();
        term34775 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term34782 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term34783 = (Object[]) newArray("java.lang.Object", 0);
        Object term34784 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term34785 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term34775, term34775.getClass(), "domain", null);
        setField(term34775, term34775.getClass(), "range", null);
        setField(term34775, term34775.getClass(), "timePeriodClass", null);
        setField(term34775, term34775.getClass(), "data", term34776);
        setIntField(term34775, term34775.getClass(), "maximumItemCount", 0);
        setLongField(term34775, term34775.getClass(), "maximumItemAge", 0L);
        setField(term34775, term34775.getClass(), "key", null);
        setField(term34775, term34775.getClass(), "description", null);
        setField(term34782, term34782.getClass(), "listenerList", term34783);
        setField(term34775, term34775.getClass(), "listeners", term34782);
        setField(term34785, term34785.getClass(), "map", null);
        setField(term34784, term34784.getClass(), "map", term34785);
        setField(term34784, term34784.getClass(), "source", term34775);
        setField(term34775, term34775.getClass(), "propertyChangeSupport", term34784);
        setBooleanField(term34775, term34775.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0;
        Object retValue = callMethod(klass, "createCopy", argTypes, term34699, args);
        assertTrue(recursiveEquals(term34699, term34789));
        assertTrue(recursiveEquals(retValue, term34775));
    }

};


