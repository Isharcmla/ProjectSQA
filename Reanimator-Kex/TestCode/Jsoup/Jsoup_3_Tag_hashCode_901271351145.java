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

public class Tag_hashCode_901271351145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30330;
     Object term30385;

    public Tag_hashCode_901271351145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30330 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30330, term30330.getClass(), "tagName", "");
        setBooleanField(term30330, term30330.getClass(), "isBlock", true);
        setBooleanField(term30330, term30330.getClass(), "canContainBlock", false);
        setBooleanField(term30330, term30330.getClass(), "canContainInline", true);
        term30385 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30385, term30385.getClass(), "tagName", "");
        setBooleanField(term30385, term30385.getClass(), "isBlock", true);
        setBooleanField(term30385, term30385.getClass(), "canContainBlock", false);
        setBooleanField(term30385, term30385.getClass(), "canContainInline", true);
        setBooleanField(term30385, term30385.getClass(), "optionalClosing", false);
        setBooleanField(term30385, term30385.getClass(), "empty", false);
        setBooleanField(term30385, term30385.getClass(), "preserveWhitespace", false);
        setField(term30385, term30385.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term30330, args);
        assertTrue(recursiveEquals(term30330, term30385));
        assertTrue(recursiveEquals(retValue, 924482));
    }

};


