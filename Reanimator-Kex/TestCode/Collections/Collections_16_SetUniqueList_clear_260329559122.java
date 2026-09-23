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
import java.lang.StackOverflowError;
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetUniqueList_clear_260329559122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29260;

    public SetUniqueList_clear_260329559122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29260 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term29364 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term29468 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term29468, term29468.getClass(), "collection", term29468);
        setField(term29364, term29364.getClass(), "collection", term29468);
        setField(term29260, term29260.getClass(), "collection", term29364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term29260, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


