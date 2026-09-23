package org.jfree.data.xy;

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
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XYSeries_hashCode_193325815533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1134;

    public XYSeries_hashCode_193325815533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1135 = new ArrayList();
        term1134 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term1154 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1155 = (Object[]) newArray("java.lang.Object", 0);
        Object term1156 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1157 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1158 = newInstance(Class.forName("java.lang.Object"));
        setField(term1134, term1134.getClass(), "data", term1135);
        setIntField(term1134, term1134.getClass(), "maximumItemCount", 1962444399);
        setBooleanField(term1134, term1134.getClass(), "autoSort", true);
        setBooleanField(term1134, term1134.getClass(), "allowDuplicateXValues", true);
        setField(term1134, term1134.getClass(), "key", null);
        setField(term1134, term1134.getClass(), "description", "ieCtQFdkii");
        setField(term1154, term1154.getClass(), "listenerList", term1155);
        setField(term1134, term1134.getClass(), "listeners", term1154);
        setField(term1157, term1157.getClass(), "map", null);
        setField(term1156, term1156.getClass(), "map", term1157);
        setField(term1156, term1156.getClass(), "source", term1158);
        setField(term1134, term1134.getClass(), "propertyChangeSupport", term1156);
        setBooleanField(term1134, term1134.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1134, args);
    }

};


