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

public class Selector_select_857999789154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238400;

    public Selector_select_857999789154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238400 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term238460 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term238460, term238460.getClass(), "queue", "\u0002\u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        setIntField(term238460, term238460.getClass(), "pos", 489);
        setField(term238400, term238400.getClass(), "tq", term238460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "select", argTypes, term238400, args);
    }

};


