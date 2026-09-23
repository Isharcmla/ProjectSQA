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

public class Tag_hashCode_901271351127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10006;
     Object term10084;

    public Tag_hashCode_901271351127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10006 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10006, term10006.getClass(), "tagName", "");
        setBooleanField(term10006, term10006.getClass(), "isBlock", true);
        setBooleanField(term10006, term10006.getClass(), "formatAsBlock", false);
        setBooleanField(term10006, term10006.getClass(), "canContainBlock", false);
        setBooleanField(term10006, term10006.getClass(), "canContainInline", false);
        setBooleanField(term10006, term10006.getClass(), "empty", false);
        setBooleanField(term10006, term10006.getClass(), "selfClosing", false);
        setBooleanField(term10006, term10006.getClass(), "preserveWhitespace", true);
        term10084 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10084, term10084.getClass(), "tagName", "");
        setBooleanField(term10084, term10084.getClass(), "isBlock", true);
        setBooleanField(term10084, term10084.getClass(), "formatAsBlock", false);
        setBooleanField(term10084, term10084.getClass(), "canContainBlock", false);
        setBooleanField(term10084, term10084.getClass(), "canContainInline", false);
        setBooleanField(term10084, term10084.getClass(), "empty", false);
        setBooleanField(term10084, term10084.getClass(), "selfClosing", false);
        setBooleanField(term10084, term10084.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term10006, args);
        assertTrue(recursiveEquals(term10006, term10084));
        assertTrue(recursiveEquals(retValue, 887503682));
    }

};


