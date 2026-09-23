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

public class Tag_hashCode_901271351206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16006;
     Object term16208;

    public Tag_hashCode_901271351206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16006 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16006, term16006.getClass(), "tagName", "");
        setBooleanField(term16006, term16006.getClass(), "isBlock", false);
        setBooleanField(term16006, term16006.getClass(), "formatAsBlock", true);
        setBooleanField(term16006, term16006.getClass(), "canContainBlock", false);
        setBooleanField(term16006, term16006.getClass(), "canContainInline", true);
        setBooleanField(term16006, term16006.getClass(), "empty", false);
        setBooleanField(term16006, term16006.getClass(), "selfClosing", false);
        setBooleanField(term16006, term16006.getClass(), "preserveWhitespace", true);
        term16208 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16208, term16208.getClass(), "tagName", "");
        setBooleanField(term16208, term16208.getClass(), "isBlock", false);
        setBooleanField(term16208, term16208.getClass(), "formatAsBlock", true);
        setBooleanField(term16208, term16208.getClass(), "canContainBlock", false);
        setBooleanField(term16208, term16208.getClass(), "canContainInline", true);
        setBooleanField(term16208, term16208.getClass(), "empty", false);
        setBooleanField(term16208, term16208.getClass(), "selfClosing", false);
        setBooleanField(term16208, term16208.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16006, args);
        assertTrue(recursiveEquals(term16006, term16208));
        assertTrue(recursiveEquals(retValue, 28658943));
    }

};


