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

public class SetUniqueList_removeAll_154635530942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4937;
     Object term5043;

    public SetUniqueList_removeAll_154635530942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4937 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        term5043 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term5043;
        try {
            callMethod(klass, "removeAll", argTypes, term4937, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


