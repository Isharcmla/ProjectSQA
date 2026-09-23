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

public class TimeSeries_getTimePeriodsUniqueToOtherSeries_177348179363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1361;
     Object term1410;
     Object term7993;
     Object term8007;
     Object term7940;

    public TimeSeries_getTimePeriodsUniqueToOtherSeries_177348179363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1386 = new ArrayList();
        term1361 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1404 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1405 = (Object[]) newArray("java.lang.Object", 0);
        Object term1406 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1407 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1408 = newInstance(Class.forName("java.lang.Object"));
        setField(term1361, term1361.getClass(), "domain", "tPlsykYBqO");
        setField(term1361, term1361.getClass(), "range", "bLPjGVBhlX");
        setField(term1361, term1361.getClass(), "timePeriodClass", null);
        setField(term1361, term1361.getClass(), "data", term1386);
        setIntField(term1361, term1361.getClass(), "maximumItemCount", 1048535127);
        setLongField(term1361, term1361.getClass(), "maximumItemAge", 5127676408959197577L);
        setField(term1361, term1361.getClass(), "key", null);
        setField(term1361, term1361.getClass(), "description", "whBvTVIIlC");
        setField(term1404, term1404.getClass(), "listenerList", term1405);
        setField(term1361, term1361.getClass(), "listeners", term1404);
        setField(term1407, term1407.getClass(), "map", null);
        setField(term1406, term1406.getClass(), "map", term1407);
        setField(term1406, term1406.getClass(), "source", term1408);
        setField(term1361, term1361.getClass(), "propertyChangeSupport", term1406);
        setBooleanField(term1361, term1361.getClass(), "notify", true);
        ArrayList term1435 = new ArrayList();
        term1410 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1453 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1454 = (Object[]) newArray("java.lang.Object", 0);
        Object term1455 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1456 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1457 = newInstance(Class.forName("java.lang.Object"));
        setField(term1410, term1410.getClass(), "domain", "JUmudUmaaV");
        setField(term1410, term1410.getClass(), "range", "KoyGrUJeJW");
        setField(term1410, term1410.getClass(), "timePeriodClass", null);
        setField(term1410, term1410.getClass(), "data", term1435);
        setIntField(term1410, term1410.getClass(), "maximumItemCount", -655067527);
        setLongField(term1410, term1410.getClass(), "maximumItemAge", -6573104506744284592L);
        setField(term1410, term1410.getClass(), "key", null);
        setField(term1410, term1410.getClass(), "description", "HqBOwkVqjD");
        setField(term1453, term1453.getClass(), "listenerList", term1454);
        setField(term1410, term1410.getClass(), "listeners", term1453);
        setField(term1456, term1456.getClass(), "map", null);
        setField(term1455, term1455.getClass(), "map", term1456);
        setField(term1455, term1455.getClass(), "source", term1457);
        setField(term1410, term1410.getClass(), "propertyChangeSupport", term1455);
        setBooleanField(term1410, term1410.getClass(), "notify", true);
        ArrayList term7998 = new ArrayList();
        term7993 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term8002 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term8003 = (Object[]) newArray("java.lang.Object", 0);
        Object term8004 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term8005 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term8006 = newInstance(Class.forName("java.lang.Object"));
        setField(term7993, term7993.getClass(), "domain", "tPlsykYBqO");
        setField(term7993, term7993.getClass(), "range", "bLPjGVBhlX");
        setField(term7993, term7993.getClass(), "timePeriodClass", null);
        setField(term7993, term7993.getClass(), "data", term7998);
        setIntField(term7993, term7993.getClass(), "maximumItemCount", 1048535127);
        setLongField(term7993, term7993.getClass(), "maximumItemAge", 5127676408959197577L);
        setField(term7993, term7993.getClass(), "key", null);
        setField(term7993, term7993.getClass(), "description", "whBvTVIIlC");
        setField(term8002, term8002.getClass(), "listenerList", term8003);
        setField(term7993, term7993.getClass(), "listeners", term8002);
        setField(term8005, term8005.getClass(), "map", null);
        setField(term8004, term8004.getClass(), "map", term8005);
        setField(term8004, term8004.getClass(), "source", term8006);
        setField(term7993, term7993.getClass(), "propertyChangeSupport", term8004);
        setBooleanField(term7993, term7993.getClass(), "notify", true);
        ArrayList term8012 = new ArrayList();
        term8007 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term8016 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term8017 = (Object[]) newArray("java.lang.Object", 0);
        Object term8018 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term8019 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term8020 = newInstance(Class.forName("java.lang.Object"));
        setField(term8007, term8007.getClass(), "domain", "JUmudUmaaV");
        setField(term8007, term8007.getClass(), "range", "KoyGrUJeJW");
        setField(term8007, term8007.getClass(), "timePeriodClass", null);
        setField(term8007, term8007.getClass(), "data", term8012);
        setIntField(term8007, term8007.getClass(), "maximumItemCount", -655067527);
        setLongField(term8007, term8007.getClass(), "maximumItemAge", -6573104506744284592L);
        setField(term8007, term8007.getClass(), "key", null);
        setField(term8007, term8007.getClass(), "description", "HqBOwkVqjD");
        setField(term8016, term8016.getClass(), "listenerList", term8017);
        setField(term8007, term8007.getClass(), "listeners", term8016);
        setField(term8019, term8019.getClass(), "map", null);
        setField(term8018, term8018.getClass(), "map", term8019);
        setField(term8018, term8018.getClass(), "source", term8020);
        setField(term8007, term8007.getClass(), "propertyChangeSupport", term8018);
        setBooleanField(term8007, term8007.getClass(), "notify", true);
        term7940 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeries");
        Object[] args = new Object[1];
        args[0] = term1410;
        Object retValue = callMethod(klass, "getTimePeriodsUniqueToOtherSeries", argTypes, term1361, args);
        assertTrue(recursiveEquals(term1361, term7993));
        assertTrue(recursiveEquals(term1410, term8007));
        assertTrue(recursiveEquals(retValue, term7940));
    }

};


