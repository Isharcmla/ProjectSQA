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

public class Selector_indexLessThan_1966692131252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253869;

    public Selector_indexLessThan_1966692131252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253869 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term253929 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term253869, term253869.getClass(), "root", null);
        setField(term253929, term253929.getClass(), "queue", ")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        setIntField(term253929, term253929.getClass(), "pos", 489);
        setField(term253869, term253869.getClass(), "tq", term253929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "indexLessThan", argTypes, term253869, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


