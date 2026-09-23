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

public class Tag_hashCode_901271351306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26639;
     Object term26834;

    public Tag_hashCode_901271351306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26639 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26639, term26639.getClass(), "tagName", "");
        setBooleanField(term26639, term26639.getClass(), "isBlock", true);
        setBooleanField(term26639, term26639.getClass(), "formatAsBlock", true);
        setBooleanField(term26639, term26639.getClass(), "canContainInline", false);
        setBooleanField(term26639, term26639.getClass(), "empty", true);
        setBooleanField(term26639, term26639.getClass(), "selfClosing", false);
        setBooleanField(term26639, term26639.getClass(), "preserveWhitespace", true);
        term26834 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26834, term26834.getClass(), "tagName", "");
        setBooleanField(term26834, term26834.getClass(), "isBlock", true);
        setBooleanField(term26834, term26834.getClass(), "formatAsBlock", true);
        setBooleanField(term26834, term26834.getClass(), "canContainInline", false);
        setBooleanField(term26834, term26834.getClass(), "empty", true);
        setBooleanField(term26834, term26834.getClass(), "selfClosing", false);
        setBooleanField(term26834, term26834.getClass(), "preserveWhitespace", true);
        setBooleanField(term26834, term26834.getClass(), "formList", false);
        setBooleanField(term26834, term26834.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26639, args);
        assertTrue(recursiveEquals(term26639, term26834));
        assertTrue(recursiveEquals(retValue, -1663728798));
    }

};


