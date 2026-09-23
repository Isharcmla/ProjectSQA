package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Elements_set_1268118544225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34563;

    public Elements_set_1268118544225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34563 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term34619 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term34563, term34563.getClass(), "contents", term34619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        try {
            callMethod(klass, "set", argTypes, term34563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


