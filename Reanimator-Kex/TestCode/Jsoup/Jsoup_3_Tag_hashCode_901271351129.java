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

public class Tag_hashCode_901271351129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26833;
     Object term26848;

    public Tag_hashCode_901271351129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26833 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26833, term26833.getClass(), "tagName", null);
        setBooleanField(term26833, term26833.getClass(), "isBlock", false);
        setBooleanField(term26833, term26833.getClass(), "canContainBlock", true);
        term26848 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26848, term26848.getClass(), "tagName", null);
        setBooleanField(term26848, term26848.getClass(), "isBlock", false);
        setBooleanField(term26848, term26848.getClass(), "canContainBlock", true);
        setBooleanField(term26848, term26848.getClass(), "canContainInline", false);
        setBooleanField(term26848, term26848.getClass(), "optionalClosing", false);
        setBooleanField(term26848, term26848.getClass(), "empty", false);
        setBooleanField(term26848, term26848.getClass(), "preserveWhitespace", false);
        setField(term26848, term26848.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26833, args);
        assertTrue(recursiveEquals(term26833, term26848));
        assertTrue(recursiveEquals(retValue, 29791));
    }

};


