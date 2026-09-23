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

public class Selector_select_857999789193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160432;

    public Selector_select_857999789193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160432 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term160492 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term160492, term160492.getClass(), "queue", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setIntField(term160492, term160492.getClass(), "pos", 489);
        setField(term160432, term160432.getClass(), "tq", term160492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "select", argTypes, term160432, args);
    }

};


