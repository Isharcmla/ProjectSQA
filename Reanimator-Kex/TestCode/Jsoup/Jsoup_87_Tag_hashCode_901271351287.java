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

public class Tag_hashCode_901271351287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25136;
     Object term25218;

    public Tag_hashCode_901271351287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25136 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25136, term25136.getClass(), "tagName", "");
        setBooleanField(term25136, term25136.getClass(), "isBlock", false);
        setBooleanField(term25136, term25136.getClass(), "formatAsBlock", true);
        setBooleanField(term25136, term25136.getClass(), "canContainInline", false);
        setBooleanField(term25136, term25136.getClass(), "empty", true);
        setBooleanField(term25136, term25136.getClass(), "selfClosing", false);
        setBooleanField(term25136, term25136.getClass(), "preserveWhitespace", true);
        setBooleanField(term25136, term25136.getClass(), "formList", false);
        setBooleanField(term25136, term25136.getClass(), "formSubmit", true);
        term25218 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25218, term25218.getClass(), "tagName", "");
        setBooleanField(term25218, term25218.getClass(), "isBlock", false);
        setBooleanField(term25218, term25218.getClass(), "formatAsBlock", true);
        setBooleanField(term25218, term25218.getClass(), "canContainInline", false);
        setBooleanField(term25218, term25218.getClass(), "empty", true);
        setBooleanField(term25218, term25218.getClass(), "selfClosing", false);
        setBooleanField(term25218, term25218.getClass(), "preserveWhitespace", true);
        setBooleanField(term25218, term25218.getClass(), "formList", false);
        setBooleanField(term25218, term25218.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25136, args);
        assertTrue(recursiveEquals(term25136, term25218));
        assertTrue(recursiveEquals(retValue, 888428164));
    }

};


