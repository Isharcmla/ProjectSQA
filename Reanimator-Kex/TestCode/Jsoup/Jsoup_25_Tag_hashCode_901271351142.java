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

public class Tag_hashCode_901271351142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11077;
     Object term11299;

    public Tag_hashCode_901271351142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11077 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11077, term11077.getClass(), "tagName", "");
        setBooleanField(term11077, term11077.getClass(), "isBlock", false);
        setBooleanField(term11077, term11077.getClass(), "formatAsBlock", true);
        setBooleanField(term11077, term11077.getClass(), "canContainBlock", false);
        setBooleanField(term11077, term11077.getClass(), "canContainInline", false);
        setBooleanField(term11077, term11077.getClass(), "empty", false);
        setBooleanField(term11077, term11077.getClass(), "selfClosing", false);
        setBooleanField(term11077, term11077.getClass(), "preserveWhitespace", true);
        term11299 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11299, term11299.getClass(), "tagName", "");
        setBooleanField(term11299, term11299.getClass(), "isBlock", false);
        setBooleanField(term11299, term11299.getClass(), "formatAsBlock", true);
        setBooleanField(term11299, term11299.getClass(), "canContainBlock", false);
        setBooleanField(term11299, term11299.getClass(), "canContainInline", false);
        setBooleanField(term11299, term11299.getClass(), "empty", false);
        setBooleanField(term11299, term11299.getClass(), "selfClosing", false);
        setBooleanField(term11299, term11299.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term11077, args);
        assertTrue(recursiveEquals(term11077, term11299));
        assertTrue(recursiveEquals(retValue, 28629152));
    }

};


