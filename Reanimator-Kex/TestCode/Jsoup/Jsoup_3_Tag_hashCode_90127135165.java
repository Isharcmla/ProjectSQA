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

public class Tag_hashCode_90127135165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11203;
     Object term11462;

    public Tag_hashCode_90127135165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11203 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11203, term11203.getClass(), "tagName", "");
        setBooleanField(term11203, term11203.getClass(), "isBlock", false);
        setBooleanField(term11203, term11203.getClass(), "canContainBlock", true);
        term11462 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11462, term11462.getClass(), "tagName", "");
        setBooleanField(term11462, term11462.getClass(), "isBlock", false);
        setBooleanField(term11462, term11462.getClass(), "canContainBlock", true);
        setBooleanField(term11462, term11462.getClass(), "canContainInline", false);
        setBooleanField(term11462, term11462.getClass(), "optionalClosing", false);
        setBooleanField(term11462, term11462.getClass(), "empty", false);
        setBooleanField(term11462, term11462.getClass(), "preserveWhitespace", false);
        setField(term11462, term11462.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term11203, args);
        assertTrue(recursiveEquals(term11203, term11462));
        assertTrue(recursiveEquals(retValue, 29791));
    }

};


