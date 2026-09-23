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

public class TimePeriodValues_add_184029097337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term759;
     Object term812;

    public TimePeriodValues_add_184029097337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term784 = new ArrayList();
        term759 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term806 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term807 = (Object[]) newArray("java.lang.Object", 0);
        Object term808 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term809 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term810 = newInstance(Class.forName("java.lang.Object"));
        setField(term759, term759.getClass(), "domain", "xrwlQZdwCp");
        setField(term759, term759.getClass(), "range", "IDCWpPLRkE");
        setField(term759, term759.getClass(), "data", term784);
        setIntField(term759, term759.getClass(), "minStartIndex", 454281060);
        setIntField(term759, term759.getClass(), "maxStartIndex", -1786399638);
        setIntField(term759, term759.getClass(), "minMiddleIndex", 2055867847);
        setIntField(term759, term759.getClass(), "maxMiddleIndex", -1048298087);
        setIntField(term759, term759.getClass(), "minEndIndex", 292681826);
        setIntField(term759, term759.getClass(), "maxEndIndex", 458147407);
        setField(term759, term759.getClass(), "key", null);
        setField(term759, term759.getClass(), "description", "nyiiPDVjAc");
        setField(term806, term806.getClass(), "listenerList", term807);
        setField(term759, term759.getClass(), "listeners", term806);
        setField(term809, term809.getClass(), "map", null);
        setField(term808, term808.getClass(), "map", term809);
        setField(term808, term808.getClass(), "source", term810);
        setField(term759, term759.getClass(), "propertyChangeSupport", term808);
        setBooleanField(term759, term759.getClass(), "notify", false);
        term812 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValue"));
        setField(term812, term812.getClass(), "period", null);
        setField(term812, term812.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimePeriodValue");
        Object[] args = new Object[1];
        args[0] = term812;
        try {
            callMethod(klass, "add", argTypes, term759, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


