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

public class Tag_hashCode_901271351121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25832;
     Object term25887;

    public Tag_hashCode_901271351121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25832 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25832, term25832.getClass(), "tagName", "");
        setBooleanField(term25832, term25832.getClass(), "isBlock", false);
        setBooleanField(term25832, term25832.getClass(), "canContainBlock", true);
        setBooleanField(term25832, term25832.getClass(), "canContainInline", true);
        setBooleanField(term25832, term25832.getClass(), "optionalClosing", true);
        term25887 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25887, term25887.getClass(), "tagName", "");
        setBooleanField(term25887, term25887.getClass(), "isBlock", false);
        setBooleanField(term25887, term25887.getClass(), "canContainBlock", true);
        setBooleanField(term25887, term25887.getClass(), "canContainInline", true);
        setBooleanField(term25887, term25887.getClass(), "optionalClosing", true);
        setBooleanField(term25887, term25887.getClass(), "empty", false);
        setBooleanField(term25887, term25887.getClass(), "preserveWhitespace", false);
        setField(term25887, term25887.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25832, args);
        assertTrue(recursiveEquals(term25832, term25887));
        assertTrue(recursiveEquals(retValue, 30783));
    }

};


