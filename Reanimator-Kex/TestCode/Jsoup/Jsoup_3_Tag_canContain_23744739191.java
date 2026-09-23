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

public class Tag_canContain_23744739191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19924;
     Object term19947;

    public Tag_canContain_23744739191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19924 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term19924, term19924.getClass(), "canContainInline", true);
        setBooleanField(term19924, term19924.getClass(), "optionalClosing", true);
        setBooleanField(term19924, term19924.getClass(), "canContainBlock", true);
        term19947 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term19947, term19947.getClass(), "isBlock", false);
        setBooleanField(term19947, term19947.getClass(), "canContainBlock", true);
        setBooleanField(term19947, term19947.getClass(), "canContainInline", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term19947;
        try {
            callMethod(klass, "canContain", argTypes, term19924, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


