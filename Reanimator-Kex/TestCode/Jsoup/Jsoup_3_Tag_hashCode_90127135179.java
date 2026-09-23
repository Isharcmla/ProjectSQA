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

public class Tag_hashCode_90127135179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15749;
     Object term15764;

    public Tag_hashCode_90127135179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15749 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15749, term15749.getClass(), "tagName", null);
        term15764 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15764, term15764.getClass(), "tagName", null);
        setBooleanField(term15764, term15764.getClass(), "isBlock", false);
        setBooleanField(term15764, term15764.getClass(), "canContainBlock", false);
        setBooleanField(term15764, term15764.getClass(), "canContainInline", false);
        setBooleanField(term15764, term15764.getClass(), "optionalClosing", false);
        setBooleanField(term15764, term15764.getClass(), "empty", false);
        setBooleanField(term15764, term15764.getClass(), "preserveWhitespace", false);
        setField(term15764, term15764.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term15749, args);
        assertTrue(recursiveEquals(term15749, term15764));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


