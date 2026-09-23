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

public class SetUniqueList_add_958215368123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31005;

    public SetUniqueList_add_958215368123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31005 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term31109 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term31213 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term31317 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term31213, term31213.getClass(), "collection", term31317);
        setField(term31109, term31109.getClass(), "collection", term31213);
        setField(term31005, term31005.getClass(), "collection", term31109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "add", argTypes, term31005, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


