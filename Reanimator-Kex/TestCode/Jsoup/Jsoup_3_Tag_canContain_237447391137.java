package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Tag_canContain_237447391137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27934;
     Object term27957;

    public Tag_canContain_237447391137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27934 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term27934, term27934.getClass(), "canContainInline", true);
        setBooleanField(term27934, term27934.getClass(), "optionalClosing", true);
        setBooleanField(term27934, term27934.getClass(), "canContainBlock", true);
        setBooleanField(term27934, term27934.getClass(), "empty", false);
        term27957 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term27957, term27957.getClass(), "isBlock", false);
        setBooleanField(term27957, term27957.getClass(), "canContainBlock", true);
        setBooleanField(term27957, term27957.getClass(), "canContainInline", true);
        setBooleanField(term27957, term27957.getClass(), "empty", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term27957;
        try {
            callMethod(klass, "canContain", argTypes, term27934, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


