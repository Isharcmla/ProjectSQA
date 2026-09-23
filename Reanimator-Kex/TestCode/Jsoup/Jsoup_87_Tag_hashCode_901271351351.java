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

public class Tag_hashCode_901271351351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30417;
     Object term30522;

    public Tag_hashCode_901271351351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30417 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30417, term30417.getClass(), "tagName", "");
        setBooleanField(term30417, term30417.getClass(), "isBlock", true);
        setBooleanField(term30417, term30417.getClass(), "formatAsBlock", true);
        setBooleanField(term30417, term30417.getClass(), "canContainInline", true);
        setBooleanField(term30417, term30417.getClass(), "empty", false);
        setBooleanField(term30417, term30417.getClass(), "selfClosing", false);
        setBooleanField(term30417, term30417.getClass(), "preserveWhitespace", false);
        setBooleanField(term30417, term30417.getClass(), "formList", true);
        setBooleanField(term30417, term30417.getClass(), "formSubmit", true);
        term30522 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30522, term30522.getClass(), "tagName", "");
        setBooleanField(term30522, term30522.getClass(), "isBlock", true);
        setBooleanField(term30522, term30522.getClass(), "formatAsBlock", true);
        setBooleanField(term30522, term30522.getClass(), "canContainInline", true);
        setBooleanField(term30522, term30522.getClass(), "empty", false);
        setBooleanField(term30522, term30522.getClass(), "selfClosing", false);
        setBooleanField(term30522, term30522.getClass(), "preserveWhitespace", false);
        setBooleanField(term30522, term30522.getClass(), "formList", true);
        setBooleanField(term30522, term30522.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term30417, args);
        assertTrue(recursiveEquals(term30417, term30522));
        assertTrue(recursiveEquals(retValue, -1636024097));
    }

};


