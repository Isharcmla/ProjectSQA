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

public class Tag_hashCode_901271351268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20990;
     Object term21193;

    public Tag_hashCode_901271351268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20990 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20990, term20990.getClass(), "tagName", "");
        setBooleanField(term20990, term20990.getClass(), "isBlock", true);
        setBooleanField(term20990, term20990.getClass(), "formatAsBlock", true);
        setBooleanField(term20990, term20990.getClass(), "canContainBlock", true);
        setBooleanField(term20990, term20990.getClass(), "canContainInline", true);
        setBooleanField(term20990, term20990.getClass(), "empty", false);
        setBooleanField(term20990, term20990.getClass(), "selfClosing", true);
        term21193 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21193, term21193.getClass(), "tagName", "");
        setBooleanField(term21193, term21193.getClass(), "isBlock", true);
        setBooleanField(term21193, term21193.getClass(), "formatAsBlock", true);
        setBooleanField(term21193, term21193.getClass(), "canContainBlock", true);
        setBooleanField(term21193, term21193.getClass(), "canContainInline", true);
        setBooleanField(term21193, term21193.getClass(), "empty", false);
        setBooleanField(term21193, term21193.getClass(), "selfClosing", true);
        setBooleanField(term21193, term21193.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20990, args);
        assertTrue(recursiveEquals(term20990, term21193));
        assertTrue(recursiveEquals(retValue, 917086175));
    }

};


