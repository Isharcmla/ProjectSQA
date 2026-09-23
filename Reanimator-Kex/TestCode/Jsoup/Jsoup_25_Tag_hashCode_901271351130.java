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

public class Tag_hashCode_901271351130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10166;
     Object term10366;

    public Tag_hashCode_901271351130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10166 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10166, term10166.getClass(), "tagName", "");
        setBooleanField(term10166, term10166.getClass(), "isBlock", false);
        setBooleanField(term10166, term10166.getClass(), "formatAsBlock", false);
        setBooleanField(term10166, term10166.getClass(), "canContainBlock", false);
        setBooleanField(term10166, term10166.getClass(), "canContainInline", true);
        term10366 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10366, term10366.getClass(), "tagName", "");
        setBooleanField(term10366, term10366.getClass(), "isBlock", false);
        setBooleanField(term10366, term10366.getClass(), "formatAsBlock", false);
        setBooleanField(term10366, term10366.getClass(), "canContainBlock", false);
        setBooleanField(term10366, term10366.getClass(), "canContainInline", true);
        setBooleanField(term10366, term10366.getClass(), "empty", false);
        setBooleanField(term10366, term10366.getClass(), "selfClosing", false);
        setBooleanField(term10366, term10366.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term10166, args);
        assertTrue(recursiveEquals(term10166, term10366));
        assertTrue(recursiveEquals(retValue, 29791));
    }

};


