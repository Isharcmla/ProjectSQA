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

public class SetUniqueList_removeAll_177008809105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21004;
     Object term21086;
     Object term21089;

    public SetUniqueList_removeAll_177008809105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21030 = new ArrayList();
        term21004 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term21004, term21004.getClass(), "collection", term21030);
        ArrayList term21087 = new ArrayList();
        term21086 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term21086, term21086.getClass(), "set", null);
        setField(term21086, term21086.getClass(), "collection", term21087);
        ArrayList term21090 = new ArrayList();
        term21089 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term21089, term21089.getClass(), "set", null);
        setField(term21089, term21089.getClass(), "collection", term21090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term21004;
        Object retValue = callMethod(klass, "removeAll", argTypes, term21004, args);
        assertTrue(recursiveEquals(term21004, term21086));
        assertTrue(recursiveEquals(term21004, term21089));
        assertTrue(recursiveEquals(retValue, false));
    }

};


