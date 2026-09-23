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

public class Tag_hashCode_901271351242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18871;
     Object term19093;

    public Tag_hashCode_901271351242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18871 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18871, term18871.getClass(), "tagName", "");
        setBooleanField(term18871, term18871.getClass(), "isBlock", true);
        setBooleanField(term18871, term18871.getClass(), "formatAsBlock", true);
        setBooleanField(term18871, term18871.getClass(), "canContainBlock", false);
        setBooleanField(term18871, term18871.getClass(), "canContainInline", false);
        setBooleanField(term18871, term18871.getClass(), "empty", false);
        setBooleanField(term18871, term18871.getClass(), "selfClosing", true);
        setBooleanField(term18871, term18871.getClass(), "preserveWhitespace", true);
        term19093 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19093, term19093.getClass(), "tagName", "");
        setBooleanField(term19093, term19093.getClass(), "isBlock", true);
        setBooleanField(term19093, term19093.getClass(), "formatAsBlock", true);
        setBooleanField(term19093, term19093.getClass(), "canContainBlock", false);
        setBooleanField(term19093, term19093.getClass(), "canContainInline", false);
        setBooleanField(term19093, term19093.getClass(), "empty", false);
        setBooleanField(term19093, term19093.getClass(), "selfClosing", true);
        setBooleanField(term19093, term19093.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term18871, args);
        assertTrue(recursiveEquals(term18871, term19093));
        assertTrue(recursiveEquals(retValue, 916132864));
    }

};


