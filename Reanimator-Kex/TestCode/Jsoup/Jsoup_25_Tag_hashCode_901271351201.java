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

public class Tag_hashCode_901271351201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15706;
     Object term15805;

    public Tag_hashCode_901271351201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15706 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15706, term15706.getClass(), "tagName", "");
        setBooleanField(term15706, term15706.getClass(), "isBlock", false);
        setBooleanField(term15706, term15706.getClass(), "formatAsBlock", false);
        setBooleanField(term15706, term15706.getClass(), "canContainBlock", true);
        setBooleanField(term15706, term15706.getClass(), "canContainInline", true);
        setBooleanField(term15706, term15706.getClass(), "empty", false);
        setBooleanField(term15706, term15706.getClass(), "selfClosing", true);
        term15805 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15805, term15805.getClass(), "tagName", "");
        setBooleanField(term15805, term15805.getClass(), "isBlock", false);
        setBooleanField(term15805, term15805.getClass(), "formatAsBlock", false);
        setBooleanField(term15805, term15805.getClass(), "canContainBlock", true);
        setBooleanField(term15805, term15805.getClass(), "canContainInline", true);
        setBooleanField(term15805, term15805.getClass(), "empty", false);
        setBooleanField(term15805, term15805.getClass(), "selfClosing", true);
        setBooleanField(term15805, term15805.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term15706, args);
        assertTrue(recursiveEquals(term15706, term15805));
        assertTrue(recursiveEquals(retValue, 953343));
    }

};


