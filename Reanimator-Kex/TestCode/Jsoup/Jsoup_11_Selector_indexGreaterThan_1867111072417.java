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

public class Selector_indexGreaterThan_1867111072417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724021;

    public Selector_indexGreaterThan_1867111072417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term724021 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term724081 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term724021, term724021.getClass(), "root", null);
        setField(term724081, term724081.getClass(), "queue", ")                                                                                                                                                                                                                                                     ");
        setIntField(term724081, term724081.getClass(), "pos", 246);
        setField(term724021, term724021.getClass(), "tq", term724081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "indexGreaterThan", argTypes, term724021, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


