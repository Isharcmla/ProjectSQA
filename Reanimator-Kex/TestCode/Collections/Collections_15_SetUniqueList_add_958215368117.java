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

public class SetUniqueList_add_958215368117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27532;

    public SetUniqueList_add_958215368117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27532 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term27636 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term27740 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term27844 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term27740, term27740.getClass(), "collection", term27844);
        setField(term27636, term27636.getClass(), "collection", term27740);
        setField(term27532, term27532.getClass(), "collection", term27636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "add", argTypes, term27532, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


