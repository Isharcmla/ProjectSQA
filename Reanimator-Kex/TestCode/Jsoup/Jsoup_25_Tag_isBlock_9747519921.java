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

public class Tag_isBlock_9747519921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term771;

    public Tag_isBlock_9747519921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term75, term75.getClass(), "tagName", "xxtlPwDYFs");
        setBooleanField(term75, term75.getClass(), "isBlock", true);
        setBooleanField(term75, term75.getClass(), "formatAsBlock", false);
        setBooleanField(term75, term75.getClass(), "canContainBlock", true);
        setBooleanField(term75, term75.getClass(), "canContainInline", false);
        setBooleanField(term75, term75.getClass(), "empty", true);
        setBooleanField(term75, term75.getClass(), "selfClosing", false);
        setBooleanField(term75, term75.getClass(), "preserveWhitespace", true);
        term771 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term771, term771.getClass(), "tagName", "xxtlPwDYFs");
        setBooleanField(term771, term771.getClass(), "isBlock", true);
        setBooleanField(term771, term771.getClass(), "formatAsBlock", false);
        setBooleanField(term771, term771.getClass(), "canContainBlock", true);
        setBooleanField(term771, term771.getClass(), "canContainInline", false);
        setBooleanField(term771, term771.getClass(), "empty", true);
        setBooleanField(term771, term771.getClass(), "selfClosing", false);
        setBooleanField(term771, term771.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term75, args);
        assertTrue(recursiveEquals(term75, term771));
    }

};


