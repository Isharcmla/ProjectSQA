package org.apache.commons.collections4.list;

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
import static org.apache.commons.collections4.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.list.EqualityUtils.*;
import java.util.ArrayList;

public class SetUniqueList_removeAll_154635530997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23619;
     Object term23701;
     Object term23704;

    public SetUniqueList_removeAll_154635530997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23645 = new ArrayList();
        term23619 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term23619, term23619.getClass(), "collection", term23645);
        ArrayList term23702 = new ArrayList();
        term23701 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term23701, term23701.getClass(), "set", null);
        setField(term23701, term23701.getClass(), "collection", term23702);
        ArrayList term23705 = new ArrayList();
        term23704 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term23704, term23704.getClass(), "set", null);
        setField(term23704, term23704.getClass(), "collection", term23705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term23619;
        Object retValue = callMethod(klass, "removeAll", argTypes, term23619, args);
        assertTrue(recursiveEquals(term23619, term23701));
        assertTrue(recursiveEquals(term23619, term23704));
        assertTrue(recursiveEquals(retValue, false));
    }

};


