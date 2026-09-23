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

public class Tag_hashCode_901271351161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12613;
     Object term12691;

    public Tag_hashCode_901271351161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12613 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12613, term12613.getClass(), "tagName", "");
        setBooleanField(term12613, term12613.getClass(), "isBlock", false);
        setBooleanField(term12613, term12613.getClass(), "formatAsBlock", true);
        setBooleanField(term12613, term12613.getClass(), "canContainBlock", false);
        setBooleanField(term12613, term12613.getClass(), "canContainInline", true);
        term12691 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12691, term12691.getClass(), "tagName", "");
        setBooleanField(term12691, term12691.getClass(), "isBlock", false);
        setBooleanField(term12691, term12691.getClass(), "formatAsBlock", true);
        setBooleanField(term12691, term12691.getClass(), "canContainBlock", false);
        setBooleanField(term12691, term12691.getClass(), "canContainInline", true);
        setBooleanField(term12691, term12691.getClass(), "empty", false);
        setBooleanField(term12691, term12691.getClass(), "selfClosing", false);
        setBooleanField(term12691, term12691.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12613, args);
        assertTrue(recursiveEquals(term12613, term12691));
        assertTrue(recursiveEquals(retValue, 28658942));
    }

};


