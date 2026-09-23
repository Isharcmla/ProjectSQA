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

public class Tag_hashCode_901271351565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48724;
     Object term48806;

    public Tag_hashCode_901271351565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48724 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48724, term48724.getClass(), "tagName", "");
        setBooleanField(term48724, term48724.getClass(), "isBlock", true);
        setBooleanField(term48724, term48724.getClass(), "formatAsBlock", false);
        setBooleanField(term48724, term48724.getClass(), "canContainInline", false);
        setBooleanField(term48724, term48724.getClass(), "empty", true);
        setBooleanField(term48724, term48724.getClass(), "selfClosing", true);
        setBooleanField(term48724, term48724.getClass(), "preserveWhitespace", false);
        setBooleanField(term48724, term48724.getClass(), "formList", true);
        setBooleanField(term48724, term48724.getClass(), "formSubmit", true);
        term48806 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48806, term48806.getClass(), "tagName", "");
        setBooleanField(term48806, term48806.getClass(), "isBlock", true);
        setBooleanField(term48806, term48806.getClass(), "formatAsBlock", false);
        setBooleanField(term48806, term48806.getClass(), "canContainInline", false);
        setBooleanField(term48806, term48806.getClass(), "empty", true);
        setBooleanField(term48806, term48806.getClass(), "selfClosing", true);
        setBooleanField(term48806, term48806.getClass(), "preserveWhitespace", false);
        setBooleanField(term48806, term48806.getClass(), "formList", true);
        setBooleanField(term48806, term48806.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term48724, args);
        assertTrue(recursiveEquals(term48724, term48806));
        assertTrue(recursiveEquals(retValue, 1743763679));
    }

};


