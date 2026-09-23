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

public class SetUniqueList_retainAll_459584140119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28838;
     Object term29090;

    public SetUniqueList_retainAll_459584140119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term28886 = new HashSet();
        ((HashSet) term28886).add((Object)null);
        ((HashSet) term28886).add((Object)null);
        ((HashSet) term28886).add((Object)null);
        ((HashSet) term28886).add((Object)null);
        ((HashSet) term28886).add((Object)null);
        ((HashSet) term28886).add((Object)null);
        ((HashSet) term28886).add((Object)null);
        ((HashSet) term28886).add((Object)null);
        ((HashSet) term28886).add((Object)null);
        term28838 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term28838, term28838.getClass(), "set", term28886);
        term29090 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term29090;
        try {
            callMethod(klass, "retainAll", argTypes, term28838, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


