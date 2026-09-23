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

public class Tag_hashCode_901271351140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10936;
     Object term11134;

    public Tag_hashCode_901271351140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10936 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10936, term10936.getClass(), "tagName", "");
        setBooleanField(term10936, term10936.getClass(), "isBlock", true);
        setBooleanField(term10936, term10936.getClass(), "formatAsBlock", true);
        setBooleanField(term10936, term10936.getClass(), "canContainBlock", false);
        setBooleanField(term10936, term10936.getClass(), "canContainInline", true);
        setBooleanField(term10936, term10936.getClass(), "empty", true);
        term11134 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11134, term11134.getClass(), "tagName", "");
        setBooleanField(term11134, term11134.getClass(), "isBlock", true);
        setBooleanField(term11134, term11134.getClass(), "formatAsBlock", true);
        setBooleanField(term11134, term11134.getClass(), "canContainBlock", false);
        setBooleanField(term11134, term11134.getClass(), "canContainInline", true);
        setBooleanField(term11134, term11134.getClass(), "empty", true);
        setBooleanField(term11134, term11134.getClass(), "selfClosing", false);
        setBooleanField(term11134, term11134.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term10936, args);
        assertTrue(recursiveEquals(term10936, term11134));
        assertTrue(recursiveEquals(retValue, 916163584));
    }

};


