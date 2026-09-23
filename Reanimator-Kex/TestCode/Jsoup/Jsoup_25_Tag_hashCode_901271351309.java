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

public class Tag_hashCode_901271351309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24607;
     Object term24706;

    public Tag_hashCode_901271351309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24607 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24607, term24607.getClass(), "tagName", "");
        setBooleanField(term24607, term24607.getClass(), "isBlock", true);
        setBooleanField(term24607, term24607.getClass(), "formatAsBlock", true);
        setBooleanField(term24607, term24607.getClass(), "canContainBlock", false);
        setBooleanField(term24607, term24607.getClass(), "canContainInline", false);
        setBooleanField(term24607, term24607.getClass(), "empty", true);
        setBooleanField(term24607, term24607.getClass(), "selfClosing", true);
        setBooleanField(term24607, term24607.getClass(), "preserveWhitespace", true);
        term24706 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24706, term24706.getClass(), "tagName", "");
        setBooleanField(term24706, term24706.getClass(), "isBlock", true);
        setBooleanField(term24706, term24706.getClass(), "formatAsBlock", true);
        setBooleanField(term24706, term24706.getClass(), "canContainBlock", false);
        setBooleanField(term24706, term24706.getClass(), "canContainInline", false);
        setBooleanField(term24706, term24706.getClass(), "empty", true);
        setBooleanField(term24706, term24706.getClass(), "selfClosing", true);
        setBooleanField(term24706, term24706.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term24607, args);
        assertTrue(recursiveEquals(term24607, term24706));
        assertTrue(recursiveEquals(retValue, 916133825));
    }

};


