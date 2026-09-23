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

public class Tag_hashCode_901271351183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14237;
     Object term14544;

    public Tag_hashCode_901271351183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14237 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14237, term14237.getClass(), "tagName", "");
        setBooleanField(term14237, term14237.getClass(), "isBlock", false);
        setBooleanField(term14237, term14237.getClass(), "formatAsBlock", true);
        setBooleanField(term14237, term14237.getClass(), "canContainBlock", false);
        setBooleanField(term14237, term14237.getClass(), "canContainInline", false);
        setBooleanField(term14237, term14237.getClass(), "empty", false);
        setBooleanField(term14237, term14237.getClass(), "selfClosing", true);
        setBooleanField(term14237, term14237.getClass(), "preserveWhitespace", true);
        term14544 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14544, term14544.getClass(), "tagName", "");
        setBooleanField(term14544, term14544.getClass(), "isBlock", false);
        setBooleanField(term14544, term14544.getClass(), "formatAsBlock", true);
        setBooleanField(term14544, term14544.getClass(), "canContainBlock", false);
        setBooleanField(term14544, term14544.getClass(), "canContainInline", false);
        setBooleanField(term14544, term14544.getClass(), "empty", false);
        setBooleanField(term14544, term14544.getClass(), "selfClosing", true);
        setBooleanField(term14544, term14544.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14237, args);
        assertTrue(recursiveEquals(term14237, term14544));
        assertTrue(recursiveEquals(retValue, 28629183));
    }

};


