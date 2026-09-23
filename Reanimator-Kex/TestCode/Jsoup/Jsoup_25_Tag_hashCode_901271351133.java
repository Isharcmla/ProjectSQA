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

public class Tag_hashCode_901271351133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10457;
     Object term10535;

    public Tag_hashCode_901271351133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10457 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10457, term10457.getClass(), "tagName", "");
        setBooleanField(term10457, term10457.getClass(), "isBlock", false);
        setBooleanField(term10457, term10457.getClass(), "formatAsBlock", true);
        setBooleanField(term10457, term10457.getClass(), "canContainBlock", false);
        setBooleanField(term10457, term10457.getClass(), "canContainInline", false);
        setBooleanField(term10457, term10457.getClass(), "empty", true);
        term10535 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10535, term10535.getClass(), "tagName", "");
        setBooleanField(term10535, term10535.getClass(), "isBlock", false);
        setBooleanField(term10535, term10535.getClass(), "formatAsBlock", true);
        setBooleanField(term10535, term10535.getClass(), "canContainBlock", false);
        setBooleanField(term10535, term10535.getClass(), "canContainInline", false);
        setBooleanField(term10535, term10535.getClass(), "empty", true);
        setBooleanField(term10535, term10535.getClass(), "selfClosing", false);
        setBooleanField(term10535, term10535.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term10457, args);
        assertTrue(recursiveEquals(term10457, term10535));
        assertTrue(recursiveEquals(retValue, 28630112));
    }

};


