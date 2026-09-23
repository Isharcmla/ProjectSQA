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
import java.lang.NullPointerException;
import static org.apache.commons.collections4.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.lang.Object;
import java.util.ArrayList;

public class SetUniqueList_retainAll_459584140135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34702;
     Object term34954;

    public SetUniqueList_retainAll_459584140135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term34750 = new HashSet();
        ((HashSet) term34750).add((Object)null);
        term34702 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term34702, term34702.getClass(), "set", term34750);
        Object term35060 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList term35112 = new ArrayList();
        HashSet term35160 = new HashSet();
        term34954 = new ArrayList();
        ((ArrayList) term34954).add(term35060);
        ((ArrayList) term34954).add(term35112);
        ((ArrayList) term34954).add(term35060);
        ((ArrayList) term34954).add(term35160);
        ((ArrayList) term34954).add((Object)null);
        ((ArrayList) term34954).add((Object)null);
        ((ArrayList) term34954).add((Object)null);
        ((ArrayList) term34954).add((Object)null);
        ((ArrayList) term34954).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term34954;
        try {
            callMethod(klass, "retainAll", argTypes, term34702, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


