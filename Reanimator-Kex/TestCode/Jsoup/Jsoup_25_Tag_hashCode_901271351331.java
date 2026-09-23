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

public class Tag_hashCode_901271351331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26262;
     Object term26599;

    public Tag_hashCode_901271351331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26262 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26262, term26262.getClass(), "tagName", "");
        setBooleanField(term26262, term26262.getClass(), "isBlock", true);
        setBooleanField(term26262, term26262.getClass(), "formatAsBlock", true);
        setBooleanField(term26262, term26262.getClass(), "canContainBlock", true);
        setBooleanField(term26262, term26262.getClass(), "canContainInline", true);
        setBooleanField(term26262, term26262.getClass(), "empty", true);
        setBooleanField(term26262, term26262.getClass(), "selfClosing", true);
        setBooleanField(term26262, term26262.getClass(), "preserveWhitespace", true);
        term26599 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26599, term26599.getClass(), "tagName", "");
        setBooleanField(term26599, term26599.getClass(), "isBlock", true);
        setBooleanField(term26599, term26599.getClass(), "formatAsBlock", true);
        setBooleanField(term26599, term26599.getClass(), "canContainBlock", true);
        setBooleanField(term26599, term26599.getClass(), "canContainInline", true);
        setBooleanField(term26599, term26599.getClass(), "empty", true);
        setBooleanField(term26599, term26599.getClass(), "selfClosing", true);
        setBooleanField(term26599, term26599.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26262, args);
        assertTrue(recursiveEquals(term26262, term26599));
        assertTrue(recursiveEquals(retValue, 917087137));
    }

};


