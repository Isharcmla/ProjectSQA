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

public class Tag_canContain_237447391101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21571;
     Object term21632;

    public Tag_canContain_237447391101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21571 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term21571, term21571.getClass(), "canContainInline", true);
        setBooleanField(term21571, term21571.getClass(), "optionalClosing", true);
        setBooleanField(term21571, term21571.getClass(), "canContainBlock", true);
        setBooleanField(term21571, term21571.getClass(), "empty", false);
        setField(term21571, term21571.getClass(), "tagName", "dt");
        term21632 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term21632, term21632.getClass(), "isBlock", false);
        setBooleanField(term21632, term21632.getClass(), "canContainBlock", true);
        setBooleanField(term21632, term21632.getClass(), "canContainInline", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term21632;
        try {
            callMethod(klass, "canContain", argTypes, term21571, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


