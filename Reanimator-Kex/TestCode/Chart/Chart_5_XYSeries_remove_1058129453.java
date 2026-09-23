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

public class XYSeries_remove_1058129453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;

    public XYSeries_remove_1058129453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term614 = new ArrayList();
        term613 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term633 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term634 = (Object[]) newArray("java.lang.Object", 0);
        Object term635 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term636 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term637 = newInstance(Class.forName("java.lang.Object"));
        setField(term613, term613.getClass(), "data", term614);
        setIntField(term613, term613.getClass(), "maximumItemCount", -655067527);
        setBooleanField(term613, term613.getClass(), "autoSort", false);
        setBooleanField(term613, term613.getClass(), "allowDuplicateXValues", false);
        setField(term613, term613.getClass(), "key", null);
        setField(term613, term613.getClass(), "description", "AijpHYOFuy");
        setField(term633, term633.getClass(), "listenerList", term634);
        setField(term613, term613.getClass(), "listeners", term633);
        setField(term636, term636.getClass(), "map", null);
        setField(term635, term635.getClass(), "map", term636);
        setField(term635, term635.getClass(), "source", term637);
        setField(term613, term613.getClass(), "propertyChangeSupport", term635);
        setBooleanField(term613, term613.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "remove", argTypes, term613, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


