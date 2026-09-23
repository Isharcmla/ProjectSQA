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
import java.util.ArrayList;
import java.lang.Object;

public class SetUniqueList_listIterator_1428423488127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30238;
     Object term32324;
     Object term32311;

    public SetUniqueList_listIterator_1428423488127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term30290 = new ArrayList();
        term30238 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term30238, term30238.getClass(), "collection", term30290);
        ArrayList term32325 = new ArrayList();
        term32324 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term32324, term32324.getClass(), "set", null);
        setField(term32324, term32324.getClass(), "collection", term32325);
        ArrayList term32294 = new ArrayList();
        term32311 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList$SetListListIterator"));
        Object term32312 = newInstance(Class.forName("java.util.ArrayList$ListItr"));
        setField(term32311, term32311.getClass(), "set", null);
        setField(term32311, term32311.getClass(), "last", null);
        setField(term32312, term32312.getClass(), "this$0", term32294);
        setIntField(term32312, term32312.getClass(), "cursor", 0);
        setIntField(term32312, term32312.getClass(), "lastRet", -1);
        setIntField(term32312, term32312.getClass(), "expectedModCount", 0);
        setField(term32311, term32311.getClass(), "iterator", term32312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "listIterator", argTypes, term30238, args);
        assertTrue(recursiveEquals(term30238, term32324));
        assertTrue(recursiveEquals(retValue, term32311));
    }

};


