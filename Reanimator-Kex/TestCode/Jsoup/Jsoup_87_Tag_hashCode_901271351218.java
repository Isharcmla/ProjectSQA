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

public class Tag_hashCode_901271351218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19346;
     Object term19556;

    public Tag_hashCode_901271351218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19346 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19346, term19346.getClass(), "tagName", "");
        setBooleanField(term19346, term19346.getClass(), "isBlock", false);
        setBooleanField(term19346, term19346.getClass(), "formatAsBlock", true);
        setBooleanField(term19346, term19346.getClass(), "canContainInline", false);
        setBooleanField(term19346, term19346.getClass(), "empty", true);
        setBooleanField(term19346, term19346.getClass(), "selfClosing", true);
        setBooleanField(term19346, term19346.getClass(), "preserveWhitespace", true);
        term19556 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19556, term19556.getClass(), "tagName", "");
        setBooleanField(term19556, term19556.getClass(), "isBlock", false);
        setBooleanField(term19556, term19556.getClass(), "formatAsBlock", true);
        setBooleanField(term19556, term19556.getClass(), "canContainInline", false);
        setBooleanField(term19556, term19556.getClass(), "empty", true);
        setBooleanField(term19556, term19556.getClass(), "selfClosing", true);
        setBooleanField(term19556, term19556.getClass(), "preserveWhitespace", true);
        setBooleanField(term19556, term19556.getClass(), "formList", false);
        setBooleanField(term19556, term19556.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term19346, args);
        assertTrue(recursiveEquals(term19346, term19556));
        assertTrue(recursiveEquals(retValue, 888457954));
    }

};


