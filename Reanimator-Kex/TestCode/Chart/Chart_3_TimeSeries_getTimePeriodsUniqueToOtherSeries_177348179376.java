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

public class TimeSeries_getTimePeriodsUniqueToOtherSeries_177348179376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1719;
     Object term1770;
     Object term9524;
     Object term9538;
     Object term9469;

    public TimeSeries_getTimePeriodsUniqueToOtherSeries_177348179376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1744 = new ArrayList();
        term1719 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1764 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1765 = (Object[]) newArray("java.lang.Object", 0);
        Object term1766 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1767 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1768 = newInstance(Class.forName("java.lang.Object"));
        setField(term1719, term1719.getClass(), "domain", "cAPeiZHKGJ");
        setField(term1719, term1719.getClass(), "range", "LvJFtLBaxj");
        setField(term1719, term1719.getClass(), "timePeriodClass", null);
        setField(term1719, term1719.getClass(), "data", term1744);
        setIntField(term1719, term1719.getClass(), "maximumItemCount", -1007160944);
        setLongField(term1719, term1719.getClass(), "maximumItemAge", -2585684163342970173L);
        setDoubleField(term1719, term1719.getClass(), "minY", 0.22651340641904605);
        setDoubleField(term1719, term1719.getClass(), "maxY", 0.8878841294187743);
        setField(term1719, term1719.getClass(), "key", null);
        setField(term1719, term1719.getClass(), "description", "PHvxnGHptP");
        setField(term1764, term1764.getClass(), "listenerList", term1765);
        setField(term1719, term1719.getClass(), "listeners", term1764);
        setField(term1767, term1767.getClass(), "map", null);
        setField(term1766, term1766.getClass(), "map", term1767);
        setField(term1766, term1766.getClass(), "source", term1768);
        setField(term1719, term1719.getClass(), "propertyChangeSupport", term1766);
        setBooleanField(term1719, term1719.getClass(), "notify", true);
        ArrayList term1795 = new ArrayList();
        term1770 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1815 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1816 = (Object[]) newArray("java.lang.Object", 0);
        Object term1817 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1818 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1819 = newInstance(Class.forName("java.lang.Object"));
        setField(term1770, term1770.getClass(), "domain", "PkWMRdJcBb");
        setField(term1770, term1770.getClass(), "range", "jSpAteRute");
        setField(term1770, term1770.getClass(), "timePeriodClass", null);
        setField(term1770, term1770.getClass(), "data", term1795);
        setIntField(term1770, term1770.getClass(), "maximumItemCount", 1135664017);
        setLongField(term1770, term1770.getClass(), "maximumItemAge", 8059786003080744426L);
        setDoubleField(term1770, term1770.getClass(), "minY", 0.6588948704887806);
        setDoubleField(term1770, term1770.getClass(), "maxY", 0.6397214730945112);
        setField(term1770, term1770.getClass(), "key", null);
        setField(term1770, term1770.getClass(), "description", "swZVeJAxjt");
        setField(term1815, term1815.getClass(), "listenerList", term1816);
        setField(term1770, term1770.getClass(), "listeners", term1815);
        setField(term1818, term1818.getClass(), "map", null);
        setField(term1817, term1817.getClass(), "map", term1818);
        setField(term1817, term1817.getClass(), "source", term1819);
        setField(term1770, term1770.getClass(), "propertyChangeSupport", term1817);
        setBooleanField(term1770, term1770.getClass(), "notify", true);
        ArrayList term9529 = new ArrayList();
        term9524 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term9533 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term9534 = (Object[]) newArray("java.lang.Object", 0);
        Object term9535 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term9536 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term9537 = newInstance(Class.forName("java.lang.Object"));
        setField(term9524, term9524.getClass(), "domain", "cAPeiZHKGJ");
        setField(term9524, term9524.getClass(), "range", "LvJFtLBaxj");
        setField(term9524, term9524.getClass(), "timePeriodClass", null);
        setField(term9524, term9524.getClass(), "data", term9529);
        setIntField(term9524, term9524.getClass(), "maximumItemCount", -1007160944);
        setLongField(term9524, term9524.getClass(), "maximumItemAge", -2585684163342970173L);
        setDoubleField(term9524, term9524.getClass(), "minY", 0.22651340641904605);
        setDoubleField(term9524, term9524.getClass(), "maxY", 0.8878841294187743);
        setField(term9524, term9524.getClass(), "key", null);
        setField(term9524, term9524.getClass(), "description", "PHvxnGHptP");
        setField(term9533, term9533.getClass(), "listenerList", term9534);
        setField(term9524, term9524.getClass(), "listeners", term9533);
        setField(term9536, term9536.getClass(), "map", null);
        setField(term9535, term9535.getClass(), "map", term9536);
        setField(term9535, term9535.getClass(), "source", term9537);
        setField(term9524, term9524.getClass(), "propertyChangeSupport", term9535);
        setBooleanField(term9524, term9524.getClass(), "notify", true);
        ArrayList term9543 = new ArrayList();
        term9538 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term9547 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term9548 = (Object[]) newArray("java.lang.Object", 0);
        Object term9549 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term9550 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term9551 = newInstance(Class.forName("java.lang.Object"));
        setField(term9538, term9538.getClass(), "domain", "PkWMRdJcBb");
        setField(term9538, term9538.getClass(), "range", "jSpAteRute");
        setField(term9538, term9538.getClass(), "timePeriodClass", null);
        setField(term9538, term9538.getClass(), "data", term9543);
        setIntField(term9538, term9538.getClass(), "maximumItemCount", 1135664017);
        setLongField(term9538, term9538.getClass(), "maximumItemAge", 8059786003080744426L);
        setDoubleField(term9538, term9538.getClass(), "minY", 0.6588948704887806);
        setDoubleField(term9538, term9538.getClass(), "maxY", 0.6397214730945112);
        setField(term9538, term9538.getClass(), "key", null);
        setField(term9538, term9538.getClass(), "description", "swZVeJAxjt");
        setField(term9547, term9547.getClass(), "listenerList", term9548);
        setField(term9538, term9538.getClass(), "listeners", term9547);
        setField(term9550, term9550.getClass(), "map", null);
        setField(term9549, term9549.getClass(), "map", term9550);
        setField(term9549, term9549.getClass(), "source", term9551);
        setField(term9538, term9538.getClass(), "propertyChangeSupport", term9549);
        setBooleanField(term9538, term9538.getClass(), "notify", true);
        term9469 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeries");
        Object[] args = new Object[1];
        args[0] = term1770;
        Object retValue = callMethod(klass, "getTimePeriodsUniqueToOtherSeries", argTypes, term1719, args);
        assertTrue(recursiveEquals(term1719, term9524));
        assertTrue(recursiveEquals(term1770, term9538));
        assertTrue(recursiveEquals(retValue, term9469));
    }

};


