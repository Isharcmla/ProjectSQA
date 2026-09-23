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

public class SetUniqueList_retainAll_90976236083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17855;

    public SetUniqueList_retainAll_90976236083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17855 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term17959 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term18063 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term17959, term17959.getClass(), "collection", term18063);
        setField(term17855, term17855.getClass(), "collection", term17959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "retainAll", argTypes, term17855, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


