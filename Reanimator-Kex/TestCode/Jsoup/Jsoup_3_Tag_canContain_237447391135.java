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

public class Tag_canContain_237447391135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27428;
     Object term27451;

    public Tag_canContain_237447391135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27428 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term27428, term27428.getClass(), "canContainInline", true);
        setBooleanField(term27428, term27428.getClass(), "optionalClosing", true);
        term27451 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term27451, term27451.getClass(), "isBlock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term27451;
        try {
            callMethod(klass, "canContain", argTypes, term27428, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


