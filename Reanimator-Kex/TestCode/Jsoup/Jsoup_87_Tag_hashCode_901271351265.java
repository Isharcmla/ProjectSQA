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

public class Tag_hashCode_901271351265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23305;
     Object term23387;

    public Tag_hashCode_901271351265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23305 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23305, term23305.getClass(), "tagName", "");
        setBooleanField(term23305, term23305.getClass(), "isBlock", true);
        setBooleanField(term23305, term23305.getClass(), "formatAsBlock", true);
        setBooleanField(term23305, term23305.getClass(), "canContainInline", true);
        setBooleanField(term23305, term23305.getClass(), "empty", false);
        setBooleanField(term23305, term23305.getClass(), "selfClosing", false);
        setBooleanField(term23305, term23305.getClass(), "preserveWhitespace", false);
        setBooleanField(term23305, term23305.getClass(), "formList", true);
        term23387 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23387, term23387.getClass(), "tagName", "");
        setBooleanField(term23387, term23387.getClass(), "isBlock", true);
        setBooleanField(term23387, term23387.getClass(), "formatAsBlock", true);
        setBooleanField(term23387, term23387.getClass(), "canContainInline", true);
        setBooleanField(term23387, term23387.getClass(), "empty", false);
        setBooleanField(term23387, term23387.getClass(), "selfClosing", false);
        setBooleanField(term23387, term23387.getClass(), "preserveWhitespace", false);
        setBooleanField(term23387, term23387.getClass(), "formList", true);
        setBooleanField(term23387, term23387.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23305, args);
        assertTrue(recursiveEquals(term23305, term23387));
        assertTrue(recursiveEquals(retValue, -1636024098));
    }

};


