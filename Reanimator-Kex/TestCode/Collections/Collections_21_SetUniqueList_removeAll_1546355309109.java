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
import java.util.ArrayList;
import java.lang.Object;

public class SetUniqueList_removeAll_1546355309109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26174;
     Object term26280;

    public SetUniqueList_removeAll_1546355309109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26174 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        Object term26370 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term26332 = new ArrayList();
        ((ArrayList) term26332).add(term26370);
        ((ArrayList) term26332).add(term26370);
        ((ArrayList) term26332).add(term26370);
        ((ArrayList) term26332).add(term26370);
        ((ArrayList) term26332).add(term26370);
        ((ArrayList) term26332).add(term26370);
        ((ArrayList) term26332).add(term26370);
        ((ArrayList) term26332).add(term26370);
        ((ArrayList) term26332).add(term26370);
        ((ArrayList) term26332).add(term26370);
        term26280 = newInstance(Class.forName("org.apache.commons.collections4.list.SetUniqueList"));
        setField(term26280, term26280.getClass(), "collection", term26332);
        setField(term26280, term26280.getClass(), "set", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term26280;
        try {
            callMethod(klass, "removeAll", argTypes, term26174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


