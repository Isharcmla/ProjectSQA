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

public class Tag_hashCode_901271351511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44053;
     Object term44158;

    public Tag_hashCode_901271351511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44053 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term44053, term44053.getClass(), "tagName", "");
        setBooleanField(term44053, term44053.getClass(), "isBlock", true);
        setBooleanField(term44053, term44053.getClass(), "formatAsBlock", true);
        setBooleanField(term44053, term44053.getClass(), "canContainInline", false);
        setBooleanField(term44053, term44053.getClass(), "empty", true);
        setBooleanField(term44053, term44053.getClass(), "selfClosing", false);
        setBooleanField(term44053, term44053.getClass(), "preserveWhitespace", true);
        setBooleanField(term44053, term44053.getClass(), "formList", false);
        setBooleanField(term44053, term44053.getClass(), "formSubmit", true);
        term44158 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term44158, term44158.getClass(), "tagName", "");
        setBooleanField(term44158, term44158.getClass(), "isBlock", true);
        setBooleanField(term44158, term44158.getClass(), "formatAsBlock", true);
        setBooleanField(term44158, term44158.getClass(), "canContainInline", false);
        setBooleanField(term44158, term44158.getClass(), "empty", true);
        setBooleanField(term44158, term44158.getClass(), "selfClosing", false);
        setBooleanField(term44158, term44158.getClass(), "preserveWhitespace", true);
        setBooleanField(term44158, term44158.getClass(), "formList", false);
        setBooleanField(term44158, term44158.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term44053, args);
        assertTrue(recursiveEquals(term44053, term44158));
        assertTrue(recursiveEquals(retValue, -1663728797));
    }

};


