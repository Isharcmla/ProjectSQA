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

public class SetUniqueList_addAll_765265236121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30323;

    public SetUniqueList_addAll_765265236121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30323 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term30427 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term30531 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term30635 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term30531, term30531.getClass(), "collection", term30635);
        setField(term30427, term30427.getClass(), "collection", term30531);
        setField(term30323, term30323.getClass(), "collection", term30427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "addAll", argTypes, term30323, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


