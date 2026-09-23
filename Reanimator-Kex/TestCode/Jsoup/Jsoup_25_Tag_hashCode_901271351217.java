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

public class Tag_hashCode_901271351217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16803;
     Object term17133;

    public Tag_hashCode_901271351217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16803 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16803, term16803.getClass(), "tagName", "");
        setBooleanField(term16803, term16803.getClass(), "isBlock", false);
        setBooleanField(term16803, term16803.getClass(), "formatAsBlock", true);
        setBooleanField(term16803, term16803.getClass(), "canContainBlock", false);
        setBooleanField(term16803, term16803.getClass(), "canContainInline", true);
        setBooleanField(term16803, term16803.getClass(), "empty", true);
        term17133 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17133, term17133.getClass(), "tagName", "");
        setBooleanField(term17133, term17133.getClass(), "isBlock", false);
        setBooleanField(term17133, term17133.getClass(), "formatAsBlock", true);
        setBooleanField(term17133, term17133.getClass(), "canContainBlock", false);
        setBooleanField(term17133, term17133.getClass(), "canContainInline", true);
        setBooleanField(term17133, term17133.getClass(), "empty", true);
        setBooleanField(term17133, term17133.getClass(), "selfClosing", false);
        setBooleanField(term17133, term17133.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16803, args);
        assertTrue(recursiveEquals(term16803, term17133));
        assertTrue(recursiveEquals(retValue, 28659903));
    }

};


