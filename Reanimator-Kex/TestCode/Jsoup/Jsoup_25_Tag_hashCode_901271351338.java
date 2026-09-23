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

public class Tag_hashCode_901271351338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26890;
     Object term27112;

    public Tag_hashCode_901271351338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26890 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26890, term26890.getClass(), "tagName", "");
        setBooleanField(term26890, term26890.getClass(), "isBlock", false);
        setBooleanField(term26890, term26890.getClass(), "formatAsBlock", true);
        setBooleanField(term26890, term26890.getClass(), "canContainBlock", false);
        setBooleanField(term26890, term26890.getClass(), "canContainInline", true);
        setBooleanField(term26890, term26890.getClass(), "empty", false);
        setBooleanField(term26890, term26890.getClass(), "selfClosing", true);
        setBooleanField(term26890, term26890.getClass(), "preserveWhitespace", true);
        term27112 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27112, term27112.getClass(), "tagName", "");
        setBooleanField(term27112, term27112.getClass(), "isBlock", false);
        setBooleanField(term27112, term27112.getClass(), "formatAsBlock", true);
        setBooleanField(term27112, term27112.getClass(), "canContainBlock", false);
        setBooleanField(term27112, term27112.getClass(), "canContainInline", true);
        setBooleanField(term27112, term27112.getClass(), "empty", false);
        setBooleanField(term27112, term27112.getClass(), "selfClosing", true);
        setBooleanField(term27112, term27112.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26890, args);
        assertTrue(recursiveEquals(term26890, term27112));
        assertTrue(recursiveEquals(retValue, 28658974));
    }

};


