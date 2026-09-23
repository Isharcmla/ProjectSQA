package org.apache.commons.collections4.map;

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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class ListOrderedMap_remove_34214140354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5528;
     Object term5548;

    public ListOrderedMap_remove_34214140354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5531 = newInstance(Class.forName("java.lang.Object"));
        Object term5532 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5529 = new ArrayList();
        ((ArrayList) term5529).add(term5531);
        ((ArrayList) term5529).add(term5532);
        HashMap term5535 = new HashMap();
        term5528 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5528, term5528.getClass(), "insertOrder", term5529);
        setField(term5528, term5528.getClass(), "map", term5535);
        term5548 = new Integer(-93135961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5548;
        try {
            callMethod(klass, "remove", argTypes, term5528, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


