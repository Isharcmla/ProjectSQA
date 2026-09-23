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

public class Tag_hashCode_901271351341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27240;
     Object term27297;

    public Tag_hashCode_901271351341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27240 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27240, term27240.getClass(), "tagName", "");
        setBooleanField(term27240, term27240.getClass(), "isBlock", false);
        setBooleanField(term27240, term27240.getClass(), "formatAsBlock", false);
        setBooleanField(term27240, term27240.getClass(), "canContainBlock", true);
        setBooleanField(term27240, term27240.getClass(), "canContainInline", true);
        setBooleanField(term27240, term27240.getClass(), "empty", true);
        setBooleanField(term27240, term27240.getClass(), "selfClosing", true);
        setBooleanField(term27240, term27240.getClass(), "preserveWhitespace", true);
        term27297 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27297, term27297.getClass(), "tagName", "");
        setBooleanField(term27297, term27297.getClass(), "isBlock", false);
        setBooleanField(term27297, term27297.getClass(), "formatAsBlock", false);
        setBooleanField(term27297, term27297.getClass(), "canContainBlock", true);
        setBooleanField(term27297, term27297.getClass(), "canContainInline", true);
        setBooleanField(term27297, term27297.getClass(), "empty", true);
        setBooleanField(term27297, term27297.getClass(), "selfClosing", true);
        setBooleanField(term27297, term27297.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term27240, args);
        assertTrue(recursiveEquals(term27240, term27297));
        assertTrue(recursiveEquals(retValue, 954305));
    }

};


