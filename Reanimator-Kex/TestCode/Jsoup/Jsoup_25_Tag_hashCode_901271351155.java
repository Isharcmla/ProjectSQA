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

public class Tag_hashCode_901271351155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12150;
     Object term12228;

    public Tag_hashCode_901271351155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12150 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12150, term12150.getClass(), "tagName", "");
        setBooleanField(term12150, term12150.getClass(), "isBlock", true);
        setBooleanField(term12150, term12150.getClass(), "formatAsBlock", false);
        setBooleanField(term12150, term12150.getClass(), "canContainBlock", true);
        setBooleanField(term12150, term12150.getClass(), "canContainInline", true);
        setBooleanField(term12150, term12150.getClass(), "empty", true);
        setBooleanField(term12150, term12150.getClass(), "selfClosing", true);
        term12228 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12228, term12228.getClass(), "tagName", "");
        setBooleanField(term12228, term12228.getClass(), "isBlock", true);
        setBooleanField(term12228, term12228.getClass(), "formatAsBlock", false);
        setBooleanField(term12228, term12228.getClass(), "canContainBlock", true);
        setBooleanField(term12228, term12228.getClass(), "canContainInline", true);
        setBooleanField(term12228, term12228.getClass(), "empty", true);
        setBooleanField(term12228, term12228.getClass(), "selfClosing", true);
        setBooleanField(term12228, term12228.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12150, args);
        assertTrue(recursiveEquals(term12150, term12228));
        assertTrue(recursiveEquals(retValue, 888457985));
    }

};


