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

public class Tag_hashCode_90127135173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14149;
     Object term14204;

    public Tag_hashCode_90127135173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14149 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14149, term14149.getClass(), "tagName", "");
        setBooleanField(term14149, term14149.getClass(), "isBlock", false);
        setBooleanField(term14149, term14149.getClass(), "canContainBlock", false);
        setBooleanField(term14149, term14149.getClass(), "canContainInline", false);
        term14204 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14204, term14204.getClass(), "tagName", "");
        setBooleanField(term14204, term14204.getClass(), "isBlock", false);
        setBooleanField(term14204, term14204.getClass(), "canContainBlock", false);
        setBooleanField(term14204, term14204.getClass(), "canContainInline", false);
        setBooleanField(term14204, term14204.getClass(), "optionalClosing", false);
        setBooleanField(term14204, term14204.getClass(), "empty", false);
        setBooleanField(term14204, term14204.getClass(), "preserveWhitespace", false);
        setField(term14204, term14204.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14149, args);
        assertTrue(recursiveEquals(term14149, term14204));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


