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

public class Tag_hashCode_901271351160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12472;
     Object term12670;

    public Tag_hashCode_901271351160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12472 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12472, term12472.getClass(), "tagName", "");
        setBooleanField(term12472, term12472.getClass(), "isBlock", true);
        setBooleanField(term12472, term12472.getClass(), "formatAsBlock", false);
        setBooleanField(term12472, term12472.getClass(), "canContainBlock", true);
        setBooleanField(term12472, term12472.getClass(), "canContainInline", false);
        setBooleanField(term12472, term12472.getClass(), "empty", true);
        setBooleanField(term12472, term12472.getClass(), "selfClosing", false);
        setBooleanField(term12472, term12472.getClass(), "preserveWhitespace", true);
        term12670 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12670, term12670.getClass(), "tagName", "");
        setBooleanField(term12670, term12670.getClass(), "isBlock", true);
        setBooleanField(term12670, term12670.getClass(), "formatAsBlock", false);
        setBooleanField(term12670, term12670.getClass(), "canContainBlock", true);
        setBooleanField(term12670, term12670.getClass(), "canContainInline", false);
        setBooleanField(term12670, term12670.getClass(), "empty", true);
        setBooleanField(term12670, term12670.getClass(), "selfClosing", false);
        setBooleanField(term12670, term12670.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12472, args);
        assertTrue(recursiveEquals(term12472, term12670));
        assertTrue(recursiveEquals(retValue, 888428164));
    }

};


