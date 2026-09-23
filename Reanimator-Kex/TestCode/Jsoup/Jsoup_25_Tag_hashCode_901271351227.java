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

public class Tag_hashCode_901271351227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17714;
     Object term17813;

    public Tag_hashCode_901271351227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17714 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17714, term17714.getClass(), "tagName", "");
        setBooleanField(term17714, term17714.getClass(), "isBlock", false);
        setBooleanField(term17714, term17714.getClass(), "formatAsBlock", false);
        setBooleanField(term17714, term17714.getClass(), "canContainBlock", false);
        setBooleanField(term17714, term17714.getClass(), "canContainInline", true);
        setBooleanField(term17714, term17714.getClass(), "empty", true);
        setBooleanField(term17714, term17714.getClass(), "selfClosing", true);
        term17813 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17813, term17813.getClass(), "tagName", "");
        setBooleanField(term17813, term17813.getClass(), "isBlock", false);
        setBooleanField(term17813, term17813.getClass(), "formatAsBlock", false);
        setBooleanField(term17813, term17813.getClass(), "canContainBlock", false);
        setBooleanField(term17813, term17813.getClass(), "canContainInline", true);
        setBooleanField(term17813, term17813.getClass(), "empty", true);
        setBooleanField(term17813, term17813.getClass(), "selfClosing", true);
        setBooleanField(term17813, term17813.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17714, args);
        assertTrue(recursiveEquals(term17714, term17813));
        assertTrue(recursiveEquals(retValue, 30783));
    }

};


