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

public class Tag_hashCode_901271351171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15321;
     Object term15380;

    public Tag_hashCode_901271351171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15321 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15321, term15321.getClass(), "tagName", "");
        setBooleanField(term15321, term15321.getClass(), "isBlock", false);
        setBooleanField(term15321, term15321.getClass(), "formatAsBlock", false);
        setBooleanField(term15321, term15321.getClass(), "canContainInline", true);
        setBooleanField(term15321, term15321.getClass(), "empty", true);
        setBooleanField(term15321, term15321.getClass(), "selfClosing", false);
        setBooleanField(term15321, term15321.getClass(), "preserveWhitespace", true);
        setBooleanField(term15321, term15321.getClass(), "formList", true);
        setBooleanField(term15321, term15321.getClass(), "formSubmit", true);
        term15380 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15380, term15380.getClass(), "tagName", "");
        setBooleanField(term15380, term15380.getClass(), "isBlock", false);
        setBooleanField(term15380, term15380.getClass(), "formatAsBlock", false);
        setBooleanField(term15380, term15380.getClass(), "canContainInline", true);
        setBooleanField(term15380, term15380.getClass(), "empty", true);
        setBooleanField(term15380, term15380.getClass(), "selfClosing", false);
        setBooleanField(term15380, term15380.getClass(), "preserveWhitespace", true);
        setBooleanField(term15380, term15380.getClass(), "formList", true);
        setBooleanField(term15380, term15380.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term15321, args);
        assertTrue(recursiveEquals(term15321, term15380));
        assertTrue(recursiveEquals(retValue, 29553665));
    }

};


