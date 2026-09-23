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

public class Tag_hashCode_901271351137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10764;
     Object term10842;

    public Tag_hashCode_901271351137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10764 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10764, term10764.getClass(), "tagName", "");
        setBooleanField(term10764, term10764.getClass(), "isBlock", true);
        setBooleanField(term10764, term10764.getClass(), "formatAsBlock", false);
        setBooleanField(term10764, term10764.getClass(), "canContainBlock", false);
        setBooleanField(term10764, term10764.getClass(), "canContainInline", true);
        setBooleanField(term10764, term10764.getClass(), "empty", false);
        setBooleanField(term10764, term10764.getClass(), "selfClosing", true);
        term10842 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10842, term10842.getClass(), "tagName", "");
        setBooleanField(term10842, term10842.getClass(), "isBlock", true);
        setBooleanField(term10842, term10842.getClass(), "formatAsBlock", false);
        setBooleanField(term10842, term10842.getClass(), "canContainBlock", false);
        setBooleanField(term10842, term10842.getClass(), "canContainInline", true);
        setBooleanField(term10842, term10842.getClass(), "empty", false);
        setBooleanField(term10842, term10842.getClass(), "selfClosing", true);
        setBooleanField(term10842, term10842.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term10764, args);
        assertTrue(recursiveEquals(term10764, term10842));
        assertTrue(recursiveEquals(retValue, 887533503));
    }

};


