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

public class Tag_hashCode_901271351271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21302;
     Object term21380;

    public Tag_hashCode_901271351271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21302 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21302, term21302.getClass(), "tagName", "");
        setBooleanField(term21302, term21302.getClass(), "isBlock", true);
        setBooleanField(term21302, term21302.getClass(), "formatAsBlock", true);
        setBooleanField(term21302, term21302.getClass(), "canContainBlock", false);
        setBooleanField(term21302, term21302.getClass(), "canContainInline", true);
        setBooleanField(term21302, term21302.getClass(), "empty", true);
        setBooleanField(term21302, term21302.getClass(), "selfClosing", false);
        setBooleanField(term21302, term21302.getClass(), "preserveWhitespace", true);
        term21380 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21380, term21380.getClass(), "tagName", "");
        setBooleanField(term21380, term21380.getClass(), "isBlock", true);
        setBooleanField(term21380, term21380.getClass(), "formatAsBlock", true);
        setBooleanField(term21380, term21380.getClass(), "canContainBlock", false);
        setBooleanField(term21380, term21380.getClass(), "canContainInline", true);
        setBooleanField(term21380, term21380.getClass(), "empty", true);
        setBooleanField(term21380, term21380.getClass(), "selfClosing", false);
        setBooleanField(term21380, term21380.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term21302, args);
        assertTrue(recursiveEquals(term21302, term21380));
        assertTrue(recursiveEquals(retValue, 916163585));
    }

};


