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

public class Tag_hashCode_90127135159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3367;
     Object term3449;

    public Tag_hashCode_90127135159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3367 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3367, term3367.getClass(), "tagName", "");
        setBooleanField(term3367, term3367.getClass(), "isBlock", false);
        setBooleanField(term3367, term3367.getClass(), "formatAsBlock", false);
        setBooleanField(term3367, term3367.getClass(), "canContainInline", true);
        setBooleanField(term3367, term3367.getClass(), "empty", true);
        setBooleanField(term3367, term3367.getClass(), "selfClosing", false);
        setBooleanField(term3367, term3367.getClass(), "preserveWhitespace", false);
        setBooleanField(term3367, term3367.getClass(), "formList", false);
        setBooleanField(term3367, term3367.getClass(), "formSubmit", true);
        term3449 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3449, term3449.getClass(), "tagName", "");
        setBooleanField(term3449, term3449.getClass(), "isBlock", false);
        setBooleanField(term3449, term3449.getClass(), "formatAsBlock", false);
        setBooleanField(term3449, term3449.getClass(), "canContainInline", true);
        setBooleanField(term3449, term3449.getClass(), "empty", true);
        setBooleanField(term3449, term3449.getClass(), "selfClosing", false);
        setBooleanField(term3449, term3449.getClass(), "preserveWhitespace", false);
        setBooleanField(term3449, term3449.getClass(), "formList", false);
        setBooleanField(term3449, term3449.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3367, args);
        assertTrue(recursiveEquals(term3367, term3449));
        assertTrue(recursiveEquals(retValue, 29552673));
    }

};


