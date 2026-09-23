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

public class TimeSeries_getMaximumItemAge_167283210055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;
     Object term5875;

    public TimeSeries_getMaximumItemAge_167283210055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term748 = new ArrayList();
        term723 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term766 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term767 = (Object[]) newArray("java.lang.Object", 0);
        Object term768 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term769 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term770 = newInstance(Class.forName("java.lang.Object"));
        setField(term723, term723.getClass(), "domain", "xrwlQZdwCp");
        setField(term723, term723.getClass(), "range", "IDCWpPLRkE");
        setField(term723, term723.getClass(), "timePeriodClass", null);
        setField(term723, term723.getClass(), "data", term748);
        setIntField(term723, term723.getClass(), "maximumItemCount", -1339778481);
        setLongField(term723, term723.getClass(), "maximumItemAge", -7237588299778557629L);
        setField(term723, term723.getClass(), "key", null);
        setField(term723, term723.getClass(), "description", "nyiiPDVjAc");
        setField(term766, term766.getClass(), "listenerList", term767);
        setField(term723, term723.getClass(), "listeners", term766);
        setField(term769, term769.getClass(), "map", null);
        setField(term768, term768.getClass(), "map", term769);
        setField(term768, term768.getClass(), "source", term770);
        setField(term723, term723.getClass(), "propertyChangeSupport", term768);
        setBooleanField(term723, term723.getClass(), "notify", false);
        ArrayList term5880 = new ArrayList();
        term5875 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term5884 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5885 = (Object[]) newArray("java.lang.Object", 0);
        Object term5886 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5887 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5888 = newInstance(Class.forName("java.lang.Object"));
        setField(term5875, term5875.getClass(), "domain", "xrwlQZdwCp");
        setField(term5875, term5875.getClass(), "range", "IDCWpPLRkE");
        setField(term5875, term5875.getClass(), "timePeriodClass", null);
        setField(term5875, term5875.getClass(), "data", term5880);
        setIntField(term5875, term5875.getClass(), "maximumItemCount", -1339778481);
        setLongField(term5875, term5875.getClass(), "maximumItemAge", -7237588299778557629L);
        setField(term5875, term5875.getClass(), "key", null);
        setField(term5875, term5875.getClass(), "description", "nyiiPDVjAc");
        setField(term5884, term5884.getClass(), "listenerList", term5885);
        setField(term5875, term5875.getClass(), "listeners", term5884);
        setField(term5887, term5887.getClass(), "map", null);
        setField(term5886, term5886.getClass(), "map", term5887);
        setField(term5886, term5886.getClass(), "source", term5888);
        setField(term5875, term5875.getClass(), "propertyChangeSupport", term5886);
        setBooleanField(term5875, term5875.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaximumItemAge", argTypes, term723, args);
        assertTrue(recursiveEquals(term723, term5875));
        assertTrue(recursiveEquals(retValue, -7237588299778557629L));
    }

};


