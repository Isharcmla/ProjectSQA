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

public class Tag_hashCode_901271351133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12257;
     Object term12316;

    public Tag_hashCode_901271351133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12257 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12257, term12257.getClass(), "tagName", "");
        setBooleanField(term12257, term12257.getClass(), "isBlock", false);
        setBooleanField(term12257, term12257.getClass(), "formatAsBlock", false);
        setBooleanField(term12257, term12257.getClass(), "canContainInline", true);
        setBooleanField(term12257, term12257.getClass(), "empty", true);
        setBooleanField(term12257, term12257.getClass(), "selfClosing", true);
        setBooleanField(term12257, term12257.getClass(), "preserveWhitespace", true);
        setBooleanField(term12257, term12257.getClass(), "formList", true);
        term12316 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12316, term12316.getClass(), "tagName", "");
        setBooleanField(term12316, term12316.getClass(), "isBlock", false);
        setBooleanField(term12316, term12316.getClass(), "formatAsBlock", false);
        setBooleanField(term12316, term12316.getClass(), "canContainInline", true);
        setBooleanField(term12316, term12316.getClass(), "empty", true);
        setBooleanField(term12316, term12316.getClass(), "selfClosing", true);
        setBooleanField(term12316, term12316.getClass(), "preserveWhitespace", true);
        setBooleanField(term12316, term12316.getClass(), "formList", true);
        setBooleanField(term12316, term12316.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12257, args);
        assertTrue(recursiveEquals(term12257, term12316));
        assertTrue(recursiveEquals(retValue, 29583455));
    }

};


