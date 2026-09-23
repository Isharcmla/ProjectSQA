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

public class Tag_hashCode_901271351177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15838;
     Object term15897;

    public Tag_hashCode_901271351177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15838 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15838, term15838.getClass(), "tagName", "");
        setBooleanField(term15838, term15838.getClass(), "isBlock", false);
        setBooleanField(term15838, term15838.getClass(), "formatAsBlock", false);
        setBooleanField(term15838, term15838.getClass(), "canContainInline", true);
        setBooleanField(term15838, term15838.getClass(), "empty", true);
        setBooleanField(term15838, term15838.getClass(), "selfClosing", true);
        setBooleanField(term15838, term15838.getClass(), "preserveWhitespace", false);
        setBooleanField(term15838, term15838.getClass(), "formList", false);
        setBooleanField(term15838, term15838.getClass(), "formSubmit", true);
        term15897 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15897, term15897.getClass(), "tagName", "");
        setBooleanField(term15897, term15897.getClass(), "isBlock", false);
        setBooleanField(term15897, term15897.getClass(), "formatAsBlock", false);
        setBooleanField(term15897, term15897.getClass(), "canContainInline", true);
        setBooleanField(term15897, term15897.getClass(), "empty", true);
        setBooleanField(term15897, term15897.getClass(), "selfClosing", true);
        setBooleanField(term15897, term15897.getClass(), "preserveWhitespace", false);
        setBooleanField(term15897, term15897.getClass(), "formList", false);
        setBooleanField(term15897, term15897.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term15838, args);
        assertTrue(recursiveEquals(term15838, term15897));
        assertTrue(recursiveEquals(retValue, 29582464));
    }

};


