package org.apache.commons.collections.set;

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
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.set.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class ListOrderedSet_iterator_82920610657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6589;
     Object term7157;
     Object term7139;

    public ListOrderedSet_iterator_82920610657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6641 = new ArrayList();
        term6589 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term6589, term6589.getClass(), "setOrder", term6641);
        ArrayList term7158 = new ArrayList();
        term7157 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term7157, term7157.getClass(), "setOrder", term7158);
        setField(term7157, term7157.getClass(), "collection", null);
        ArrayList term7141 = new ArrayList();
        term7139 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator"));
        Object term7140 = newInstance(Class.forName("java.util.ArrayList$ListItr"));
        setField(term7139, term7139.getClass(), "set", null);
        setField(term7139, term7139.getClass(), "last", null);
        setField(term7140, term7140.getClass(), "this$0", term7141);
        setIntField(term7140, term7140.getClass(), "cursor", 0);
        setIntField(term7140, term7140.getClass(), "lastRet", -1);
        setIntField(term7140, term7140.getClass(), "expectedModCount", 0);
        setField(term7139, term7139.getClass(), "iterator", term7140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "iterator", argTypes, term6589, args);
        assertTrue(recursiveEquals(term6589, term7157));
        assertTrue(recursiveEquals(retValue, term7139));
    }

};


