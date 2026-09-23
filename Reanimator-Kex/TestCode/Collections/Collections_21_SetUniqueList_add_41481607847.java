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

public class SetUniqueList_add_41481607847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5888;

    public SetUniqueList_add_41481607847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term5936 = new HashSet();
        term5888 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term5888, term5888.getClass(), "set", term5936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        try {
            callMethod(klass, "add", argTypes, term5888, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


