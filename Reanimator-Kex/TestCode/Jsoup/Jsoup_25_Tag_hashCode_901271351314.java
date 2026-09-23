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
     Object term24956;
     Object term25177;

    public Tag_hashCode_901271351314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24956 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24956, term24956.getClass(), "tagName", "");
        setBooleanField(term24956, term24956.getClass(), "isBlock", true);
        setBooleanField(term24956, term24956.getClass(), "formatAsBlock", false);
        setBooleanField(term24956, term24956.getClass(), "canContainBlock", false);
        setBooleanField(term24956, term24956.getClass(), "canContainInline", true);
        setBooleanField(term24956, term24956.getClass(), "empty", true);
        setBooleanField(term24956, term24956.getClass(), "selfClosing", true);
        setBooleanField(term24956, term24956.getClass(), "preserveWhitespace", true);
        term25177 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25177, term25177.getClass(), "tagName", "");
        setBooleanField(term25177, term25177.getClass(), "isBlock", true);
        setBooleanField(term25177, term25177.getClass(), "formatAsBlock", false);
        setBooleanField(term25177, term25177.getClass(), "canContainBlock", false);
        setBooleanField(term25177, term25177.getClass(), "canContainInline", true);
        setBooleanField(term25177, term25177.getClass(), "empty", true);
        setBooleanField(term25177, term25177.getClass(), "selfClosing", true);
        setBooleanField(term25177, term25177.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term24956, args);
        assertTrue(recursiveEquals(term24956, term25177));
        assertTrue(recursiveEquals(retValue, 887534465));
    }

};


