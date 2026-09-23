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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class XYSeries_getY_131571261257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761;
     Object term787;

    public XYSeries_getY_131571261257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term762 = new ArrayList();
        term761 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term781 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term782 = (Object[]) newArray("java.lang.Object", 0);
        Object term783 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term784 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term785 = newInstance(Class.forName("java.lang.Object"));
        setField(term761, term761.getClass(), "data", term762);
        setIntField(term761, term761.getClass(), "maximumItemCount", 590364439);
        setBooleanField(term761, term761.getClass(), "autoSort", true);
        setBooleanField(term761, term761.getClass(), "allowDuplicateXValues", true);
        setField(term761, term761.getClass(), "key", null);
        setField(term761, term761.getClass(), "description", "wSQxaModmm");
        setField(term781, term781.getClass(), "listenerList", term782);
        setField(term761, term761.getClass(), "listeners", term781);
        setField(term784, term784.getClass(), "map", null);
        setField(term783, term783.getClass(), "map", term784);
        setField(term783, term783.getClass(), "source", term785);
        setField(term761, term761.getClass(), "propertyChangeSupport", term783);
        setBooleanField(term761, term761.getClass(), "notify", false);
        term787 = new Integer(865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term787;
        try {
            callMethod(klass, "getY", argTypes, term761, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


