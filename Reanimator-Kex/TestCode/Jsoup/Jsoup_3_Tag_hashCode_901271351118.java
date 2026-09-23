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
     Object term25666;
     Object term25735;

    public Tag_hashCode_901271351118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25666 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25666, term25666.getClass(), "tagName", null);
        setBooleanField(term25666, term25666.getClass(), "isBlock", true);
        term25735 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25735, term25735.getClass(), "tagName", null);
        setBooleanField(term25735, term25735.getClass(), "isBlock", true);
        setBooleanField(term25735, term25735.getClass(), "canContainBlock", false);
        setBooleanField(term25735, term25735.getClass(), "canContainInline", false);
        setBooleanField(term25735, term25735.getClass(), "optionalClosing", false);
        setBooleanField(term25735, term25735.getClass(), "empty", false);
        setBooleanField(term25735, term25735.getClass(), "preserveWhitespace", false);
        setField(term25735, term25735.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25666, args);
        assertTrue(recursiveEquals(term25666, term25735));
        assertTrue(recursiveEquals(retValue, 923521));
    }

};


