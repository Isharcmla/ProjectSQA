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

public class Tag_hashCode_901271351214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19028;
     Object term19223;

    public Tag_hashCode_901271351214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19028 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19028, term19028.getClass(), "tagName", "");
        setBooleanField(term19028, term19028.getClass(), "isBlock", false);
        setBooleanField(term19028, term19028.getClass(), "formatAsBlock", false);
        setBooleanField(term19028, term19028.getClass(), "canContainInline", true);
        setBooleanField(term19028, term19028.getClass(), "empty", true);
        setBooleanField(term19028, term19028.getClass(), "selfClosing", true);
        setBooleanField(term19028, term19028.getClass(), "preserveWhitespace", true);
        setBooleanField(term19028, term19028.getClass(), "formList", true);
        setBooleanField(term19028, term19028.getClass(), "formSubmit", true);
        term19223 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19223, term19223.getClass(), "tagName", "");
        setBooleanField(term19223, term19223.getClass(), "isBlock", false);
        setBooleanField(term19223, term19223.getClass(), "formatAsBlock", false);
        setBooleanField(term19223, term19223.getClass(), "canContainInline", true);
        setBooleanField(term19223, term19223.getClass(), "empty", true);
        setBooleanField(term19223, term19223.getClass(), "selfClosing", true);
        setBooleanField(term19223, term19223.getClass(), "preserveWhitespace", true);
        setBooleanField(term19223, term19223.getClass(), "formList", true);
        setBooleanField(term19223, term19223.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term19028, args);
        assertTrue(recursiveEquals(term19028, term19223));
        assertTrue(recursiveEquals(retValue, 29583456));
    }

};


