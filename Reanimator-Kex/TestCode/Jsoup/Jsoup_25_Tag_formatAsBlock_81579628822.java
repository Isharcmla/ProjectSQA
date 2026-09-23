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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class Tag_formatAsBlock_81579628822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;
     Object term836;

    public Tag_formatAsBlock_81579628822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term105, term105.getClass(), "tagName", "jJCZpVmanW");
        setBooleanField(term105, term105.getClass(), "isBlock", false);
        setBooleanField(term105, term105.getClass(), "formatAsBlock", false);
        setBooleanField(term105, term105.getClass(), "canContainBlock", true);
        setBooleanField(term105, term105.getClass(), "canContainInline", true);
        setBooleanField(term105, term105.getClass(), "empty", false);
        setBooleanField(term105, term105.getClass(), "selfClosing", false);
        setBooleanField(term105, term105.getClass(), "preserveWhitespace", true);
        term836 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term836, term836.getClass(), "tagName", "jJCZpVmanW");
        setBooleanField(term836, term836.getClass(), "isBlock", false);
        setBooleanField(term836, term836.getClass(), "formatAsBlock", false);
        setBooleanField(term836, term836.getClass(), "canContainBlock", true);
        setBooleanField(term836, term836.getClass(), "canContainInline", true);
        setBooleanField(term836, term836.getClass(), "empty", false);
        setBooleanField(term836, term836.getClass(), "selfClosing", false);
        setBooleanField(term836, term836.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "formatAsBlock", argTypes, term105, args);
        assertTrue(recursiveEquals(term105, term836));
    }

};


