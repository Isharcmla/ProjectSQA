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

public class Tag_hashCode_901271351584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50379;
     Object term50591;

    public Tag_hashCode_901271351584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50379 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50379, term50379.getClass(), "tagName", "");
        setBooleanField(term50379, term50379.getClass(), "isBlock", true);
        setBooleanField(term50379, term50379.getClass(), "formatAsBlock", false);
        setBooleanField(term50379, term50379.getClass(), "canContainInline", true);
        setBooleanField(term50379, term50379.getClass(), "empty", false);
        setBooleanField(term50379, term50379.getClass(), "selfClosing", true);
        setBooleanField(term50379, term50379.getClass(), "preserveWhitespace", false);
        setBooleanField(term50379, term50379.getClass(), "formList", true);
        setBooleanField(term50379, term50379.getClass(), "formSubmit", true);
        term50591 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50591, term50591.getClass(), "tagName", "");
        setBooleanField(term50591, term50591.getClass(), "isBlock", true);
        setBooleanField(term50591, term50591.getClass(), "formatAsBlock", false);
        setBooleanField(term50591, term50591.getClass(), "canContainInline", true);
        setBooleanField(term50591, term50591.getClass(), "empty", false);
        setBooleanField(term50591, term50591.getClass(), "selfClosing", true);
        setBooleanField(term50591, term50591.getClass(), "preserveWhitespace", false);
        setBooleanField(term50591, term50591.getClass(), "formList", true);
        setBooleanField(term50591, term50591.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term50379, args);
        assertTrue(recursiveEquals(term50379, term50591));
        assertTrue(recursiveEquals(retValue, 1771469309));
    }

};


