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

public class Tag_isSelfClosing_150217477938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1534;
     Object term1603;

    public Tag_isSelfClosing_150217477938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1534 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term1534, term1534.getClass(), "empty", false);
        setBooleanField(term1534, term1534.getClass(), "selfClosing", false);
        term1603 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1603, term1603.getClass(), "tagName", null);
        setBooleanField(term1603, term1603.getClass(), "isBlock", false);
        setBooleanField(term1603, term1603.getClass(), "formatAsBlock", false);
        setBooleanField(term1603, term1603.getClass(), "canContainBlock", false);
        setBooleanField(term1603, term1603.getClass(), "canContainInline", false);
        setBooleanField(term1603, term1603.getClass(), "empty", false);
        setBooleanField(term1603, term1603.getClass(), "selfClosing", false);
        setBooleanField(term1603, term1603.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSelfClosing", argTypes, term1534, args);
        assertTrue(recursiveEquals(term1534, term1603));
        assertTrue(recursiveEquals(retValue, false));
    }

};


