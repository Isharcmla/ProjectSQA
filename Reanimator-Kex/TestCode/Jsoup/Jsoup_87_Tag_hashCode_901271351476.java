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

public class Tag_hashCode_901271351476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41220;
     Object term41432;

    public Tag_hashCode_901271351476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41220 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41220, term41220.getClass(), "tagName", "");
        setBooleanField(term41220, term41220.getClass(), "isBlock", true);
        setBooleanField(term41220, term41220.getClass(), "formatAsBlock", true);
        setBooleanField(term41220, term41220.getClass(), "canContainInline", true);
        setBooleanField(term41220, term41220.getClass(), "empty", true);
        setBooleanField(term41220, term41220.getClass(), "selfClosing", true);
        setBooleanField(term41220, term41220.getClass(), "preserveWhitespace", true);
        setBooleanField(term41220, term41220.getClass(), "formList", false);
        setBooleanField(term41220, term41220.getClass(), "formSubmit", true);
        term41432 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41432, term41432.getClass(), "tagName", "");
        setBooleanField(term41432, term41432.getClass(), "isBlock", true);
        setBooleanField(term41432, term41432.getClass(), "formatAsBlock", true);
        setBooleanField(term41432, term41432.getClass(), "canContainInline", true);
        setBooleanField(term41432, term41432.getClass(), "empty", true);
        setBooleanField(term41432, term41432.getClass(), "selfClosing", true);
        setBooleanField(term41432, term41432.getClass(), "preserveWhitespace", true);
        setBooleanField(term41432, term41432.getClass(), "formList", false);
        setBooleanField(term41432, term41432.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term41220, args);
        assertTrue(recursiveEquals(term41220, term41432));
        assertTrue(recursiveEquals(retValue, -1635069855));
    }

};


