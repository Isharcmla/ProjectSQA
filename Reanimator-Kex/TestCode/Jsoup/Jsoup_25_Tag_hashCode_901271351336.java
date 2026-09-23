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

public class Tag_hashCode_901271351336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26747;
     Object term26947;

    public Tag_hashCode_901271351336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26747 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26747, term26747.getClass(), "tagName", "");
        setBooleanField(term26747, term26747.getClass(), "isBlock", false);
        setBooleanField(term26747, term26747.getClass(), "formatAsBlock", false);
        setBooleanField(term26747, term26747.getClass(), "canContainBlock", true);
        setBooleanField(term26747, term26747.getClass(), "canContainInline", true);
        setBooleanField(term26747, term26747.getClass(), "empty", true);
        setBooleanField(term26747, term26747.getClass(), "selfClosing", false);
        setBooleanField(term26747, term26747.getClass(), "preserveWhitespace", true);
        term26947 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26947, term26947.getClass(), "tagName", "");
        setBooleanField(term26947, term26947.getClass(), "isBlock", false);
        setBooleanField(term26947, term26947.getClass(), "formatAsBlock", false);
        setBooleanField(term26947, term26947.getClass(), "canContainBlock", true);
        setBooleanField(term26947, term26947.getClass(), "canContainInline", true);
        setBooleanField(term26947, term26947.getClass(), "empty", true);
        setBooleanField(term26947, term26947.getClass(), "selfClosing", false);
        setBooleanField(term26947, term26947.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26747, args);
        assertTrue(recursiveEquals(term26747, term26947));
        assertTrue(recursiveEquals(retValue, 954274));
    }

};


