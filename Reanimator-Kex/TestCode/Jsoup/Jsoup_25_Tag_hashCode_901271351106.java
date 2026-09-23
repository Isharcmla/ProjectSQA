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

public class Tag_hashCode_901271351106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8051;
     Object term8252;

    public Tag_hashCode_901271351106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8051 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8051, term8051.getClass(), "tagName", "");
        setBooleanField(term8051, term8051.getClass(), "isBlock", true);
        setBooleanField(term8051, term8051.getClass(), "formatAsBlock", true);
        setBooleanField(term8051, term8051.getClass(), "canContainBlock", false);
        setBooleanField(term8051, term8051.getClass(), "canContainInline", false);
        setBooleanField(term8051, term8051.getClass(), "empty", false);
        setBooleanField(term8051, term8051.getClass(), "selfClosing", false);
        setBooleanField(term8051, term8051.getClass(), "preserveWhitespace", true);
        term8252 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8252, term8252.getClass(), "tagName", "");
        setBooleanField(term8252, term8252.getClass(), "isBlock", true);
        setBooleanField(term8252, term8252.getClass(), "formatAsBlock", true);
        setBooleanField(term8252, term8252.getClass(), "canContainBlock", false);
        setBooleanField(term8252, term8252.getClass(), "canContainInline", false);
        setBooleanField(term8252, term8252.getClass(), "empty", false);
        setBooleanField(term8252, term8252.getClass(), "selfClosing", false);
        setBooleanField(term8252, term8252.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term8051, args);
        assertTrue(recursiveEquals(term8051, term8252));
        assertTrue(recursiveEquals(retValue, 916132833));
    }

};


