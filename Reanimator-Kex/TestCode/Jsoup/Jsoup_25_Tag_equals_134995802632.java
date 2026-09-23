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

public class Tag_equals_134995802632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397;
     Object term417;
     Object term1266;
     Object term1269;

    public Tag_equals_134995802632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term397, term397.getClass(), "tagName", "oVcInYnLWB");
        setBooleanField(term397, term397.getClass(), "isBlock", false);
        setBooleanField(term397, term397.getClass(), "formatAsBlock", false);
        setBooleanField(term397, term397.getClass(), "canContainBlock", true);
        setBooleanField(term397, term397.getClass(), "canContainInline", false);
        setBooleanField(term397, term397.getClass(), "empty", false);
        setBooleanField(term397, term397.getClass(), "selfClosing", true);
        setBooleanField(term397, term397.getClass(), "preserveWhitespace", false);
        term417 = newInstance(Class.forName("java.lang.Object"));
        term1266 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1266, term1266.getClass(), "tagName", "oVcInYnLWB");
        setBooleanField(term1266, term1266.getClass(), "isBlock", false);
        setBooleanField(term1266, term1266.getClass(), "formatAsBlock", false);
        setBooleanField(term1266, term1266.getClass(), "canContainBlock", true);
        setBooleanField(term1266, term1266.getClass(), "canContainInline", false);
        setBooleanField(term1266, term1266.getClass(), "empty", false);
        setBooleanField(term1266, term1266.getClass(), "selfClosing", true);
        setBooleanField(term1266, term1266.getClass(), "preserveWhitespace", false);
        term1269 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term417;
        Object retValue = callMethod(klass, "equals", argTypes, term397, args);
        assertTrue(recursiveEquals(term397, term1266));
        assertTrue(recursiveEquals(term417, term1269));
        assertTrue(recursiveEquals(retValue, false));
    }

};


