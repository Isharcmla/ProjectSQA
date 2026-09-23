package org.jsoup.nodes;

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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attribute_setKey_585994216147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240258;

    public Attribute_setKey_585994216147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240258 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term240316 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term240176 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term240316, term240316.getClass(), "size", 1);
        setField(term240316, term240316.getClass(), "keys", term240176);
        setField(term240258, term240258.getClass(), "parent", term240316);
        setField(term240258, term240258.getClass(), "key", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        try {
            callMethod(klass, "setKey", argTypes, term240258, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


