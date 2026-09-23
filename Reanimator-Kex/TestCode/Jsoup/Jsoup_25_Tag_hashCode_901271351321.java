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

public class Tag_hashCode_901271351321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25596;
     Object term25674;

    public Tag_hashCode_901271351321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25596 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25596, term25596.getClass(), "tagName", "");
        setBooleanField(term25596, term25596.getClass(), "isBlock", false);
        setBooleanField(term25596, term25596.getClass(), "formatAsBlock", true);
        setBooleanField(term25596, term25596.getClass(), "canContainBlock", true);
        setBooleanField(term25596, term25596.getClass(), "canContainInline", true);
        setBooleanField(term25596, term25596.getClass(), "empty", false);
        setBooleanField(term25596, term25596.getClass(), "selfClosing", false);
        setBooleanField(term25596, term25596.getClass(), "preserveWhitespace", true);
        term25674 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25674, term25674.getClass(), "tagName", "");
        setBooleanField(term25674, term25674.getClass(), "isBlock", false);
        setBooleanField(term25674, term25674.getClass(), "formatAsBlock", true);
        setBooleanField(term25674, term25674.getClass(), "canContainBlock", true);
        setBooleanField(term25674, term25674.getClass(), "canContainInline", true);
        setBooleanField(term25674, term25674.getClass(), "empty", false);
        setBooleanField(term25674, term25674.getClass(), "selfClosing", false);
        setBooleanField(term25674, term25674.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25596, args);
        assertTrue(recursiveEquals(term25596, term25674));
        assertTrue(recursiveEquals(retValue, 29582464));
    }

};


