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

public class Tag_hashCode_901271351136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10628;
     Object term10821;

    public Tag_hashCode_901271351136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10628 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10628, term10628.getClass(), "tagName", "");
        setBooleanField(term10628, term10628.getClass(), "isBlock", true);
        setBooleanField(term10628, term10628.getClass(), "formatAsBlock", false);
        setBooleanField(term10628, term10628.getClass(), "canContainBlock", false);
        setBooleanField(term10628, term10628.getClass(), "canContainInline", true);
        setBooleanField(term10628, term10628.getClass(), "empty", true);
        term10821 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10821, term10821.getClass(), "tagName", "");
        setBooleanField(term10821, term10821.getClass(), "isBlock", true);
        setBooleanField(term10821, term10821.getClass(), "formatAsBlock", false);
        setBooleanField(term10821, term10821.getClass(), "canContainBlock", false);
        setBooleanField(term10821, term10821.getClass(), "canContainInline", true);
        setBooleanField(term10821, term10821.getClass(), "empty", true);
        setBooleanField(term10821, term10821.getClass(), "selfClosing", false);
        setBooleanField(term10821, term10821.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term10628, args);
        assertTrue(recursiveEquals(term10628, term10821));
        assertTrue(recursiveEquals(retValue, 887534433));
    }

};


