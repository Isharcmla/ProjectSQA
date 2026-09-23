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

public class Tag_hashCode_901271351243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19036;
     Object term19114;

    public Tag_hashCode_901271351243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19036 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19036, term19036.getClass(), "tagName", "");
        setBooleanField(term19036, term19036.getClass(), "isBlock", true);
        setBooleanField(term19036, term19036.getClass(), "formatAsBlock", false);
        setBooleanField(term19036, term19036.getClass(), "canContainBlock", false);
        setBooleanField(term19036, term19036.getClass(), "canContainInline", false);
        setBooleanField(term19036, term19036.getClass(), "empty", true);
        setBooleanField(term19036, term19036.getClass(), "selfClosing", true);
        setBooleanField(term19036, term19036.getClass(), "preserveWhitespace", true);
        term19114 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19114, term19114.getClass(), "tagName", "");
        setBooleanField(term19114, term19114.getClass(), "isBlock", true);
        setBooleanField(term19114, term19114.getClass(), "formatAsBlock", false);
        setBooleanField(term19114, term19114.getClass(), "canContainBlock", false);
        setBooleanField(term19114, term19114.getClass(), "canContainInline", false);
        setBooleanField(term19114, term19114.getClass(), "empty", true);
        setBooleanField(term19114, term19114.getClass(), "selfClosing", true);
        setBooleanField(term19114, term19114.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term19036, args);
        assertTrue(recursiveEquals(term19036, term19114));
        assertTrue(recursiveEquals(retValue, 887504674));
    }

};


