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

public class Tag_hashCode_901271351225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17441;
     Object term17771;

    public Tag_hashCode_901271351225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17441 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17441, term17441.getClass(), "tagName", "");
        setBooleanField(term17441, term17441.getClass(), "isBlock", false);
        setBooleanField(term17441, term17441.getClass(), "formatAsBlock", true);
        setBooleanField(term17441, term17441.getClass(), "canContainBlock", true);
        setBooleanField(term17441, term17441.getClass(), "canContainInline", true);
        setBooleanField(term17441, term17441.getClass(), "empty", false);
        setBooleanField(term17441, term17441.getClass(), "selfClosing", true);
        term17771 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17771, term17771.getClass(), "tagName", "");
        setBooleanField(term17771, term17771.getClass(), "isBlock", false);
        setBooleanField(term17771, term17771.getClass(), "formatAsBlock", true);
        setBooleanField(term17771, term17771.getClass(), "canContainBlock", true);
        setBooleanField(term17771, term17771.getClass(), "canContainInline", true);
        setBooleanField(term17771, term17771.getClass(), "empty", false);
        setBooleanField(term17771, term17771.getClass(), "selfClosing", true);
        setBooleanField(term17771, term17771.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17441, args);
        assertTrue(recursiveEquals(term17441, term17771));
        assertTrue(recursiveEquals(retValue, 29582494));
    }

};


