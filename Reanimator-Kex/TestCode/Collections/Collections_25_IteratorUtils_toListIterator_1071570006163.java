package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class IteratorUtils_toListIterator_1071570006163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20701;
     Object term20717;
     Object term20704;

    public IteratorUtils_toListIterator_1071570006163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20701 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ArrayListIterator"));
        term20717 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ArrayListIterator"));
        setIntField(term20717, term20717.getClass(), "lastItemIndex", 0);
        setField(term20717, term20717.getClass(), "array", null);
        setIntField(term20717, term20717.getClass(), "startIndex", 0);
        setIntField(term20717, term20717.getClass(), "endIndex", 0);
        setIntField(term20717, term20717.getClass(), "index", 0);
        ArrayList term20710 = new ArrayList();
        term20704 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ListIteratorWrapper"));
        Object term20705 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ArrayListIterator"));
        setIntField(term20705, term20705.getClass(), "lastItemIndex", 0);
        setField(term20705, term20705.getClass(), "array", null);
        setIntField(term20705, term20705.getClass(), "startIndex", 0);
        setIntField(term20705, term20705.getClass(), "endIndex", 0);
        setIntField(term20705, term20705.getClass(), "index", 0);
        setField(term20704, term20704.getClass(), "iterator", term20705);
        setField(term20704, term20704.getClass(), "list", term20710);
        setIntField(term20704, term20704.getClass(), "currentIndex", 0);
        setIntField(term20704, term20704.getClass(), "wrappedIteratorIndex", 0);
        setBooleanField(term20704, term20704.getClass(), "removeState", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term20701;
        Object retValue = callMethod(klass, "toListIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term20701, term20717));
        assertTrue(recursiveEquals(retValue, term20704));
    }

};


