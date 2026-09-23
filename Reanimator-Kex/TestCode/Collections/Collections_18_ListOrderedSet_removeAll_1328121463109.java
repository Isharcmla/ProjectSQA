package org.apache.commons.collections.set;

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
import static org.apache.commons.collections.set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ListOrderedSet_removeAll_1328121463109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17349;
     Object term17453;

    public ListOrderedSet_removeAll_1328121463109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17349 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList term17505 = new ArrayList();
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ((ArrayList) term17505).add((Object)null);
        ArrayList term17557 = new ArrayList();
        term17453 = newInstance(Class.forName("org.apache.commons.collections.set.ListOrderedSet"));
        setField(term17453, term17453.getClass(), "setOrder", term17505);
        setField(term17453, term17453.getClass(), "collection", term17557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.set.ListOrderedSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term17453;
        try {
            callMethod(klass, "removeAll", argTypes, term17349, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


