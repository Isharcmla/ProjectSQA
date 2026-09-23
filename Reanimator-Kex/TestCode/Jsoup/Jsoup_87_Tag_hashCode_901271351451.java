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

public class Tag_hashCode_901271351451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38908;
     Object term39217;

    public Tag_hashCode_901271351451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38908 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38908, term38908.getClass(), "tagName", "");
        setBooleanField(term38908, term38908.getClass(), "isBlock", true);
        setBooleanField(term38908, term38908.getClass(), "formatAsBlock", false);
        setBooleanField(term38908, term38908.getClass(), "canContainInline", true);
        setBooleanField(term38908, term38908.getClass(), "empty", false);
        setBooleanField(term38908, term38908.getClass(), "selfClosing", true);
        setBooleanField(term38908, term38908.getClass(), "preserveWhitespace", true);
        term39217 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39217, term39217.getClass(), "tagName", "");
        setBooleanField(term39217, term39217.getClass(), "isBlock", true);
        setBooleanField(term39217, term39217.getClass(), "formatAsBlock", false);
        setBooleanField(term39217, term39217.getClass(), "canContainInline", true);
        setBooleanField(term39217, term39217.getClass(), "empty", false);
        setBooleanField(term39217, term39217.getClass(), "selfClosing", true);
        setBooleanField(term39217, term39217.getClass(), "preserveWhitespace", true);
        setBooleanField(term39217, term39217.getClass(), "formList", false);
        setBooleanField(term39217, term39217.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term38908, args);
        assertTrue(recursiveEquals(term38908, term39217));
        assertTrue(recursiveEquals(retValue, 1771470238));
    }

};


