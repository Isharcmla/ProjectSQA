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

public class Tag_hashCode_901271351175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15666;
     Object term15725;

    public Tag_hashCode_901271351175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15666 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15666, term15666.getClass(), "tagName", "");
        setBooleanField(term15666, term15666.getClass(), "isBlock", true);
        setBooleanField(term15666, term15666.getClass(), "formatAsBlock", true);
        setBooleanField(term15666, term15666.getClass(), "canContainInline", false);
        setBooleanField(term15666, term15666.getClass(), "empty", false);
        setBooleanField(term15666, term15666.getClass(), "selfClosing", false);
        setBooleanField(term15666, term15666.getClass(), "preserveWhitespace", false);
        setBooleanField(term15666, term15666.getClass(), "formList", false);
        setBooleanField(term15666, term15666.getClass(), "formSubmit", true);
        term15725 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15725, term15725.getClass(), "tagName", "");
        setBooleanField(term15725, term15725.getClass(), "isBlock", true);
        setBooleanField(term15725, term15725.getClass(), "formatAsBlock", true);
        setBooleanField(term15725, term15725.getClass(), "canContainInline", false);
        setBooleanField(term15725, term15725.getClass(), "empty", false);
        setBooleanField(term15725, term15725.getClass(), "selfClosing", false);
        setBooleanField(term15725, term15725.getClass(), "preserveWhitespace", false);
        setBooleanField(term15725, term15725.getClass(), "formList", false);
        setBooleanField(term15725, term15725.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term15666, args);
        assertTrue(recursiveEquals(term15666, term15725));
        assertTrue(recursiveEquals(retValue, -1664653279));
    }

};


