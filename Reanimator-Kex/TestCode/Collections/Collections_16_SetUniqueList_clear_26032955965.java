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

public class SetUniqueList_clear_26032955965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13560;

    public SetUniqueList_clear_26032955965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13560 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term13664 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term13768 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term13664, term13664.getClass(), "collection", term13768);
        setField(term13560, term13560.getClass(), "collection", term13664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term13560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


