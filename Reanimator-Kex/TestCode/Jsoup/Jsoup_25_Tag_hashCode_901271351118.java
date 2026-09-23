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

public class Tag_hashCode_901271351118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9249;
     Object term9443;

    public Tag_hashCode_901271351118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9249 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9249, term9249.getClass(), "tagName", "");
        setBooleanField(term9249, term9249.getClass(), "isBlock", true);
        setBooleanField(term9249, term9249.getClass(), "formatAsBlock", false);
        setBooleanField(term9249, term9249.getClass(), "canContainBlock", false);
        setBooleanField(term9249, term9249.getClass(), "canContainInline", false);
        setBooleanField(term9249, term9249.getClass(), "empty", false);
        setBooleanField(term9249, term9249.getClass(), "selfClosing", true);
        term9443 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9443, term9443.getClass(), "tagName", "");
        setBooleanField(term9443, term9443.getClass(), "isBlock", true);
        setBooleanField(term9443, term9443.getClass(), "formatAsBlock", false);
        setBooleanField(term9443, term9443.getClass(), "canContainBlock", false);
        setBooleanField(term9443, term9443.getClass(), "canContainInline", false);
        setBooleanField(term9443, term9443.getClass(), "empty", false);
        setBooleanField(term9443, term9443.getClass(), "selfClosing", true);
        setBooleanField(term9443, term9443.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term9249, args);
        assertTrue(recursiveEquals(term9249, term9443));
        assertTrue(recursiveEquals(retValue, 887503712));
    }

};


