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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Selector_findElements_175762179985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21761;

    public Selector_findElements_175762179985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21761 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term21821 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term21821, term21821.getClass(), "queue", ".                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        setIntField(term21821, term21821.getClass(), "pos", 489);
        setField(term21761, term21761.getClass(), "tq", term21821);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findElements", argTypes, term21761, args);
    }

};


