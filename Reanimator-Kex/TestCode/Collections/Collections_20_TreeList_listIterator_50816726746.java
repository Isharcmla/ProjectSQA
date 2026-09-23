package org.apache.commons.collections.list;

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
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.list.EqualityUtils.*;
import java.lang.Object;

public class TreeList_listIterator_50816726746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3746;
     Object term4280;
     Object term4276;

    public TreeList_listIterator_50816726746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3746 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term3856 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setIntField(term3746, term3746.getClass(), "size", 0);
        setIntField(term3746, term3746.getClass(), "modCount", 0);
        setField(term3746, term3746.getClass(), "root", term3856);
        term4280 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term4281 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term4281, term4281.getClass(), "left", null);
        setBooleanField(term4281, term4281.getClass(), "leftIsPrevious", false);
        setField(term4281, term4281.getClass(), "right", null);
        setBooleanField(term4281, term4281.getClass(), "rightIsNext", false);
        setIntField(term4281, term4281.getClass(), "height", 0);
        setIntField(term4281, term4281.getClass(), "relativePosition", 0);
        setField(term4281, term4281.getClass(), "value", null);
        setField(term4280, term4280.getClass(), "root", term4281);
        setIntField(term4280, term4280.getClass(), "size", 0);
        setIntField(term4280, term4280.getClass(), "modCount", 0);
        term4276 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        Object term4245 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList"));
        Object term4246 = newInstance(Class.forName("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(term4246, term4246.getClass(), "left", null);
        setBooleanField(term4246, term4246.getClass(), "leftIsPrevious", false);
        setField(term4246, term4246.getClass(), "right", null);
        setBooleanField(term4246, term4246.getClass(), "rightIsNext", false);
        setIntField(term4246, term4246.getClass(), "height", 0);
        setIntField(term4246, term4246.getClass(), "relativePosition", 0);
        setField(term4246, term4246.getClass(), "value", null);
        setField(term4245, term4245.getClass(), "root", term4246);
        setIntField(term4245, term4245.getClass(), "size", 0);
        setIntField(term4245, term4245.getClass(), "modCount", 0);
        setField(term4276, term4276.getClass(), "parent", term4245);
        setField(term4276, term4276.getClass(), "next", term4246);
        setIntField(term4276, term4276.getClass(), "nextIndex", 0);
        setField(term4276, term4276.getClass(), "current", null);
        setIntField(term4276, term4276.getClass(), "currentIndex", -1);
        setIntField(term4276, term4276.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.TreeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "listIterator", argTypes, term3746, args);
        assertTrue(recursiveEquals(term3746, term4280));
        assertTrue(recursiveEquals(retValue, term4276));
    }

};


