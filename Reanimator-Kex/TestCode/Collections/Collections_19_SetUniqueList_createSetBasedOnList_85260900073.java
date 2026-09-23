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
import java.util.HashSet;

public class SetUniqueList_createSetBasedOnList_85260900073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12496;
     Object term12520;

    public SetUniqueList_createSetBasedOnList_85260900073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12496 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        term12520 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term12520;
        args[1] = null;
        try {
            callMethod(klass, "createSetBasedOnList", argTypes, term12496, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


