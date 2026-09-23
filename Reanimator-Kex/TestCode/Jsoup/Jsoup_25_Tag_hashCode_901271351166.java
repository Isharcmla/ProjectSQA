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

public class Tag_hashCode_901271351166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12912;
     Object term13109;

    public Tag_hashCode_901271351166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12912 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12912, term12912.getClass(), "tagName", "");
        setBooleanField(term12912, term12912.getClass(), "isBlock", false);
        setBooleanField(term12912, term12912.getClass(), "formatAsBlock", false);
        setBooleanField(term12912, term12912.getClass(), "canContainBlock", false);
        setBooleanField(term12912, term12912.getClass(), "canContainInline", false);
        setBooleanField(term12912, term12912.getClass(), "empty", true);
        term13109 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13109, term13109.getClass(), "tagName", "");
        setBooleanField(term13109, term13109.getClass(), "isBlock", false);
        setBooleanField(term13109, term13109.getClass(), "formatAsBlock", false);
        setBooleanField(term13109, term13109.getClass(), "canContainBlock", false);
        setBooleanField(term13109, term13109.getClass(), "canContainInline", false);
        setBooleanField(term13109, term13109.getClass(), "empty", true);
        setBooleanField(term13109, term13109.getClass(), "selfClosing", false);
        setBooleanField(term13109, term13109.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12912, args);
        assertTrue(recursiveEquals(term12912, term13109));
        assertTrue(recursiveEquals(retValue, 961));
    }

};


