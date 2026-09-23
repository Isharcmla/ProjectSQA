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

public class Tag_hashCode_901271351200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15572;
     Object term15784;

    public Tag_hashCode_901271351200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15572 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15572, term15572.getClass(), "tagName", "");
        setBooleanField(term15572, term15572.getClass(), "isBlock", false);
        setBooleanField(term15572, term15572.getClass(), "formatAsBlock", false);
        setBooleanField(term15572, term15572.getClass(), "canContainBlock", false);
        setBooleanField(term15572, term15572.getClass(), "canContainInline", false);
        setBooleanField(term15572, term15572.getClass(), "empty", true);
        setBooleanField(term15572, term15572.getClass(), "selfClosing", true);
        term15784 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15784, term15784.getClass(), "tagName", "");
        setBooleanField(term15784, term15784.getClass(), "isBlock", false);
        setBooleanField(term15784, term15784.getClass(), "formatAsBlock", false);
        setBooleanField(term15784, term15784.getClass(), "canContainBlock", false);
        setBooleanField(term15784, term15784.getClass(), "canContainInline", false);
        setBooleanField(term15784, term15784.getClass(), "empty", true);
        setBooleanField(term15784, term15784.getClass(), "selfClosing", true);
        setBooleanField(term15784, term15784.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term15572, args);
        assertTrue(recursiveEquals(term15572, term15784));
        assertTrue(recursiveEquals(retValue, 992));
    }

};


