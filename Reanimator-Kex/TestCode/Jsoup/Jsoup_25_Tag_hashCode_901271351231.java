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

public class Tag_hashCode_901271351231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17916;
     Object term18248;

    public Tag_hashCode_901271351231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17916 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17916, term17916.getClass(), "tagName", "");
        setBooleanField(term17916, term17916.getClass(), "isBlock", false);
        setBooleanField(term17916, term17916.getClass(), "formatAsBlock", false);
        setBooleanField(term17916, term17916.getClass(), "canContainBlock", false);
        setBooleanField(term17916, term17916.getClass(), "canContainInline", false);
        setBooleanField(term17916, term17916.getClass(), "empty", true);
        setBooleanField(term17916, term17916.getClass(), "selfClosing", true);
        setBooleanField(term17916, term17916.getClass(), "preserveWhitespace", true);
        term18248 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18248, term18248.getClass(), "tagName", "");
        setBooleanField(term18248, term18248.getClass(), "isBlock", false);
        setBooleanField(term18248, term18248.getClass(), "formatAsBlock", false);
        setBooleanField(term18248, term18248.getClass(), "canContainBlock", false);
        setBooleanField(term18248, term18248.getClass(), "canContainInline", false);
        setBooleanField(term18248, term18248.getClass(), "empty", true);
        setBooleanField(term18248, term18248.getClass(), "selfClosing", true);
        setBooleanField(term18248, term18248.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17916, args);
        assertTrue(recursiveEquals(term17916, term18248));
        assertTrue(recursiveEquals(retValue, 993));
    }

};


