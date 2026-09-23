package org.jfree.data.general;

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
import static org.jfree.data.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.general.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class DatasetUtilities_createCategoryDataset_17074769461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;
     Object term11472;
     Object term7618;

    public DatasetUtilities_createCategoryDataset_17074769461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term122 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term123 = (Object[]) newArray("java.lang.Number", 7);
        setElement(term121, 0, term122);
        setElement(term121, 1, term123);
        term11472 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 2);
        Object[] term11473 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term11474 = (Object[]) newArray("java.lang.Number", 7);
        setElement(term11472, 0, term11473);
        setElement(term11472, 1, term11474);
        ArrayList term7620 = new ArrayList();
        ((ArrayList) term7620).add("");
        ((ArrayList) term7620).add("");
        ArrayList term7626 = new ArrayList();
        ((ArrayList) term7626).add("");
        ((ArrayList) term7626).add("");
        ((ArrayList) term7626).add("");
        ((ArrayList) term7626).add("");
        ((ArrayList) term7626).add("");
        ((ArrayList) term7626).add("");
        ((ArrayList) term7626).add("");
        Object term7639 = newInstance(Class.forName("org.jfree.data.KeyedObjects"));
        setField(term7639, term7639.getClass(), "data", null);
        Object term7640 = newInstance(Class.forName("org.jfree.data.KeyedObjects"));
        setField(term7640, term7640.getClass(), "data", null);
        ArrayList term7637 = new ArrayList();
        ((ArrayList) term7637).add(term7639);
        ((ArrayList) term7637).add(term7640);
        term7618 = newInstance(Class.forName("org.jfree.data.category.DefaultCategoryDataset"));
        Object term7619 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        Object term7643 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term7650 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7651 = (Object[]) newArray("java.lang.Object", 0);
        setField(term7619, term7619.getClass(), "rowKeys", term7620);
        setField(term7619, term7619.getClass(), "columnKeys", term7626);
        setField(term7619, term7619.getClass(), "rows", term7637);
        setField(term7618, term7618.getClass(), "data", term7619);
        setField(term7618, term7618.getClass(), "selectionState", term7618);
        setField(term7643, term7643.getClass(), "id", "NOID");
        setField(term7618, term7618.getClass(), "group", term7643);
        setField(term7650, term7650.getClass(), "listenerList", term7651);
        setField(term7618, term7618.getClass(), "listenerList", term7650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "MuLcgQHgqz";
        args[1] = "xxtlPwDYFs";
        args[2] = term121;
        Object retValue = callMethod(klass, "createCategoryDataset", argTypes, null, args);
        assertTrue(recursiveEquals(term121, term11472));
        assertTrue(recursiveEquals(retValue, term7618));
    }

};


