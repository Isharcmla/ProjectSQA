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

public class Tag_hashCode_901271351307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26775;
     Object term26857;

    public Tag_hashCode_901271351307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26775 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26775, term26775.getClass(), "tagName", "");
        setBooleanField(term26775, term26775.getClass(), "isBlock", true);
        setBooleanField(term26775, term26775.getClass(), "formatAsBlock", false);
        setBooleanField(term26775, term26775.getClass(), "canContainInline", false);
        setBooleanField(term26775, term26775.getClass(), "empty", false);
        setBooleanField(term26775, term26775.getClass(), "selfClosing", true);
        setBooleanField(term26775, term26775.getClass(), "preserveWhitespace", true);
        term26857 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26857, term26857.getClass(), "tagName", "");
        setBooleanField(term26857, term26857.getClass(), "isBlock", true);
        setBooleanField(term26857, term26857.getClass(), "formatAsBlock", false);
        setBooleanField(term26857, term26857.getClass(), "canContainInline", false);
        setBooleanField(term26857, term26857.getClass(), "empty", false);
        setBooleanField(term26857, term26857.getClass(), "selfClosing", true);
        setBooleanField(term26857, term26857.getClass(), "preserveWhitespace", true);
        setBooleanField(term26857, term26857.getClass(), "formList", false);
        setBooleanField(term26857, term26857.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26775, args);
        assertTrue(recursiveEquals(term26775, term26857));
        assertTrue(recursiveEquals(retValue, 1742841087));
    }

};


