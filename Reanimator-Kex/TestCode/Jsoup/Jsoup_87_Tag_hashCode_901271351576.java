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

public class Tag_hashCode_901271351576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49664;
     Object term49897;

    public Tag_hashCode_901271351576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49664 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49664, term49664.getClass(), "tagName", "");
        setBooleanField(term49664, term49664.getClass(), "isBlock", true);
        setBooleanField(term49664, term49664.getClass(), "formatAsBlock", true);
        setBooleanField(term49664, term49664.getClass(), "canContainInline", true);
        setBooleanField(term49664, term49664.getClass(), "empty", false);
        setBooleanField(term49664, term49664.getClass(), "selfClosing", false);
        setBooleanField(term49664, term49664.getClass(), "preserveWhitespace", true);
        setBooleanField(term49664, term49664.getClass(), "formList", true);
        term49897 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49897, term49897.getClass(), "tagName", "");
        setBooleanField(term49897, term49897.getClass(), "isBlock", true);
        setBooleanField(term49897, term49897.getClass(), "formatAsBlock", true);
        setBooleanField(term49897, term49897.getClass(), "canContainInline", true);
        setBooleanField(term49897, term49897.getClass(), "empty", false);
        setBooleanField(term49897, term49897.getClass(), "selfClosing", false);
        setBooleanField(term49897, term49897.getClass(), "preserveWhitespace", true);
        setBooleanField(term49897, term49897.getClass(), "formList", true);
        setBooleanField(term49897, term49897.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term49664, args);
        assertTrue(recursiveEquals(term49664, term49897));
        assertTrue(recursiveEquals(retValue, -1636023137));
    }

};


