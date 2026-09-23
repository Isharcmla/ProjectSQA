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

public class SetUniqueList_listIterator_1428421566137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35706;
     Object term37782;
     Object term37769;

    public SetUniqueList_listIterator_1428421566137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term35758 = new ArrayList();
        term35706 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term35706, term35706.getClass(), "collection", term35758);
        ArrayList term37783 = new ArrayList();
        term37782 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term37782, term37782.getClass(), "set", null);
        setField(term37782, term37782.getClass(), "collection", term37783);
        ArrayList term37751 = new ArrayList();
        term37769 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList$SetListListIterator"));
        Object term37770 = newInstance(Class.forName("java.util.ArrayList$ListItr"));
        setField(term37769, term37769.getClass(), "set", null);
        setField(term37769, term37769.getClass(), "last", null);
        setField(term37770, term37770.getClass(), "this$0", term37751);
        setIntField(term37770, term37770.getClass(), "cursor", 0);
        setIntField(term37770, term37770.getClass(), "lastRet", -1);
        setIntField(term37770, term37770.getClass(), "expectedModCount", 0);
        setField(term37769, term37769.getClass(), "iterator", term37770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "listIterator", argTypes, term35706, args);
        assertTrue(recursiveEquals(term35706, term37782));
        assertTrue(recursiveEquals(retValue, term37769));
    }

};


