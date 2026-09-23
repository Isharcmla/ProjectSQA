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

public class TimePeriodValues_getValue_28295394436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674;
     Object term727;

    public TimePeriodValues_getValue_28295394436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term699 = new ArrayList();
        term674 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term721 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term722 = (Object[]) newArray("java.lang.Object", 0);
        Object term723 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term724 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term725 = newInstance(Class.forName("java.lang.Object"));
        setField(term674, term674.getClass(), "domain", "AijpHYOFuy");
        setField(term674, term674.getClass(), "range", "SbAoxhfrkn");
        setField(term674, term674.getClass(), "data", term699);
        setIntField(term674, term674.getClass(), "minStartIndex", 1876565163);
        setIntField(term674, term674.getClass(), "maxStartIndex", -817164822);
        setIntField(term674, term674.getClass(), "minMiddleIndex", -1016503459);
        setIntField(term674, term674.getClass(), "maxMiddleIndex", -1968847291);
        setIntField(term674, term674.getClass(), "minEndIndex", 579005622);
        setIntField(term674, term674.getClass(), "maxEndIndex", -14890619);
        setField(term674, term674.getClass(), "key", null);
        setField(term674, term674.getClass(), "description", "kuTXqwMtDB");
        setField(term721, term721.getClass(), "listenerList", term722);
        setField(term674, term674.getClass(), "listeners", term721);
        setField(term724, term724.getClass(), "map", null);
        setField(term723, term723.getClass(), "map", term724);
        setField(term723, term723.getClass(), "source", term725);
        setField(term674, term674.getClass(), "propertyChangeSupport", term723);
        setBooleanField(term674, term674.getClass(), "notify", true);
        term727 = new Integer(1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term727;
        try {
            callMethod(klass, "getValue", argTypes, term674, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


