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
     Object term13697;
     Object term14036;

    public Tag_hashCode_901271351177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13697 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13697, term13697.getClass(), "tagName", "");
        setBooleanField(term13697, term13697.getClass(), "isBlock", true);
        setBooleanField(term13697, term13697.getClass(), "formatAsBlock", false);
        setBooleanField(term13697, term13697.getClass(), "canContainBlock", true);
        setBooleanField(term13697, term13697.getClass(), "canContainInline", false);
        setBooleanField(term13697, term13697.getClass(), "empty", true);
        setBooleanField(term13697, term13697.getClass(), "selfClosing", true);
        term14036 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14036, term14036.getClass(), "tagName", "");
        setBooleanField(term14036, term14036.getClass(), "isBlock", true);
        setBooleanField(term14036, term14036.getClass(), "formatAsBlock", false);
        setBooleanField(term14036, term14036.getClass(), "canContainBlock", true);
        setBooleanField(term14036, term14036.getClass(), "canContainInline", false);
        setBooleanField(term14036, term14036.getClass(), "empty", true);
        setBooleanField(term14036, term14036.getClass(), "selfClosing", true);
        setBooleanField(term14036, term14036.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term13697, args);
        assertTrue(recursiveEquals(term13697, term14036));
        assertTrue(recursiveEquals(retValue, 888428194));
    }

};


