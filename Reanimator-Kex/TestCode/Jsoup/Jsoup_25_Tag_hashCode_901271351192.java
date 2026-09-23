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

public class Tag_hashCode_901271351192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14966;
     Object term15148;

    public Tag_hashCode_901271351192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14966 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14966, term14966.getClass(), "tagName", "");
        setBooleanField(term14966, term14966.getClass(), "isBlock", false);
        setBooleanField(term14966, term14966.getClass(), "formatAsBlock", true);
        setBooleanField(term14966, term14966.getClass(), "canContainBlock", true);
        setBooleanField(term14966, term14966.getClass(), "canContainInline", true);
        term15148 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15148, term15148.getClass(), "tagName", "");
        setBooleanField(term15148, term15148.getClass(), "isBlock", false);
        setBooleanField(term15148, term15148.getClass(), "formatAsBlock", true);
        setBooleanField(term15148, term15148.getClass(), "canContainBlock", true);
        setBooleanField(term15148, term15148.getClass(), "canContainInline", true);
        setBooleanField(term15148, term15148.getClass(), "empty", false);
        setBooleanField(term15148, term15148.getClass(), "selfClosing", false);
        setBooleanField(term15148, term15148.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14966, args);
        assertTrue(recursiveEquals(term14966, term15148));
        assertTrue(recursiveEquals(retValue, 29582463));
    }

};


