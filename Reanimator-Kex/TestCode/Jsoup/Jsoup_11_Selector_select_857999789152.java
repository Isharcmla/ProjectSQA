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

public class Selector_select_857999789152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226534;

    public Selector_select_857999789152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226534 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term226594 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term226594, term226594.getClass(), "queue", "\u0002\u0002\u0002\u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        setIntField(term226594, term226594.getClass(), "pos", 489);
        setField(term226534, term226534.getClass(), "tq", term226594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "select", argTypes, term226534, args);
    }

};


