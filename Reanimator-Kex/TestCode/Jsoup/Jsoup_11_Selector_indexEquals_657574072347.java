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
import java.lang.IllegalArgumentException;
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Selector_indexEquals_657574072347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670510;

    public Selector_indexEquals_657574072347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term670510 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term670570 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term670510, term670510.getClass(), "root", null);
        setField(term670570, term670570.getClass(), "queue", ")                                                                                                                                                                                                                                                     ");
        setIntField(term670570, term670570.getClass(), "pos", 246);
        setField(term670510, term670510.getClass(), "tq", term670570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "indexEquals", argTypes, term670510, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


