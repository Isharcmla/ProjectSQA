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

public class Tag_isInline_250365279119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25720;
     Object term25746;

    public Tag_isInline_250365279119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25720 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term25720, term25720.getClass(), "isBlock", false);
        term25746 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25746, term25746.getClass(), "tagName", null);
        setBooleanField(term25746, term25746.getClass(), "isBlock", false);
        setBooleanField(term25746, term25746.getClass(), "canContainBlock", false);
        setBooleanField(term25746, term25746.getClass(), "canContainInline", false);
        setBooleanField(term25746, term25746.getClass(), "optionalClosing", false);
        setBooleanField(term25746, term25746.getClass(), "empty", false);
        setBooleanField(term25746, term25746.getClass(), "preserveWhitespace", false);
        setField(term25746, term25746.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInline", argTypes, term25720, args);
        assertTrue(recursiveEquals(term25720, term25746));
        assertTrue(recursiveEquals(retValue, true));
    }

};


