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
import java.lang.NullPointerException;
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetUniqueList_clear_260329559129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32950;

    public SetUniqueList_clear_260329559129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32950 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term33054 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term33158 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term33262 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term33158, term33158.getClass(), "collection", term33262);
        setField(term33054, term33054.getClass(), "collection", term33158);
        setField(term32950, term32950.getClass(), "collection", term33054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term32950, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


