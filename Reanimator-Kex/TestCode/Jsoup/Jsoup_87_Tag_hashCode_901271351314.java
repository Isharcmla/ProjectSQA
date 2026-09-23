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

public class Tag_hashCode_901271351314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27290;
     Object term27491;

    public Tag_hashCode_901271351314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27290 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27290, term27290.getClass(), "tagName", "");
        setBooleanField(term27290, term27290.getClass(), "isBlock", false);
        setBooleanField(term27290, term27290.getClass(), "formatAsBlock", false);
        setBooleanField(term27290, term27290.getClass(), "canContainInline", true);
        setBooleanField(term27290, term27290.getClass(), "empty", false);
        setBooleanField(term27290, term27290.getClass(), "selfClosing", true);
        setBooleanField(term27290, term27290.getClass(), "preserveWhitespace", true);
        term27491 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27491, term27491.getClass(), "tagName", "");
        setBooleanField(term27491, term27491.getClass(), "isBlock", false);
        setBooleanField(term27491, term27491.getClass(), "formatAsBlock", false);
        setBooleanField(term27491, term27491.getClass(), "canContainInline", true);
        setBooleanField(term27491, term27491.getClass(), "empty", false);
        setBooleanField(term27491, term27491.getClass(), "selfClosing", true);
        setBooleanField(term27491, term27491.getClass(), "preserveWhitespace", true);
        setBooleanField(term27491, term27491.getClass(), "formList", false);
        setBooleanField(term27491, term27491.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term27290, args);
        assertTrue(recursiveEquals(term27290, term27491));
        assertTrue(recursiveEquals(retValue, 28659903));
    }

};


