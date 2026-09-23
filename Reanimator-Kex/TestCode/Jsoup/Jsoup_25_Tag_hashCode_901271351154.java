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

public class Tag_hashCode_901271351154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11991;
     Object term12207;

    public Tag_hashCode_901271351154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11991 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11991, term11991.getClass(), "tagName", "");
        setBooleanField(term11991, term11991.getClass(), "isBlock", true);
        setBooleanField(term11991, term11991.getClass(), "formatAsBlock", true);
        setBooleanField(term11991, term11991.getClass(), "canContainBlock", true);
        setBooleanField(term11991, term11991.getClass(), "canContainInline", true);
        term12207 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12207, term12207.getClass(), "tagName", "");
        setBooleanField(term12207, term12207.getClass(), "isBlock", true);
        setBooleanField(term12207, term12207.getClass(), "formatAsBlock", true);
        setBooleanField(term12207, term12207.getClass(), "canContainBlock", true);
        setBooleanField(term12207, term12207.getClass(), "canContainInline", true);
        setBooleanField(term12207, term12207.getClass(), "empty", false);
        setBooleanField(term12207, term12207.getClass(), "selfClosing", false);
        setBooleanField(term12207, term12207.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term11991, args);
        assertTrue(recursiveEquals(term11991, term12207));
        assertTrue(recursiveEquals(retValue, 917086144));
    }

};


