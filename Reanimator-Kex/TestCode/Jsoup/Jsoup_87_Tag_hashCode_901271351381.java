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

public class Tag_hashCode_901271351381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32957;
     Object term33077;

    public Tag_hashCode_901271351381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32957 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32957, term32957.getClass(), "tagName", "");
        setBooleanField(term32957, term32957.getClass(), "isBlock", false);
        setBooleanField(term32957, term32957.getClass(), "formatAsBlock", false);
        setBooleanField(term32957, term32957.getClass(), "canContainInline", false);
        setBooleanField(term32957, term32957.getClass(), "empty", false);
        setBooleanField(term32957, term32957.getClass(), "selfClosing", true);
        setBooleanField(term32957, term32957.getClass(), "preserveWhitespace", true);
        setBooleanField(term32957, term32957.getClass(), "formList", true);
        term33077 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33077, term33077.getClass(), "tagName", "");
        setBooleanField(term33077, term33077.getClass(), "isBlock", false);
        setBooleanField(term33077, term33077.getClass(), "formatAsBlock", false);
        setBooleanField(term33077, term33077.getClass(), "canContainInline", false);
        setBooleanField(term33077, term33077.getClass(), "empty", false);
        setBooleanField(term33077, term33077.getClass(), "selfClosing", true);
        setBooleanField(term33077, term33077.getClass(), "preserveWhitespace", true);
        setBooleanField(term33077, term33077.getClass(), "formList", true);
        setBooleanField(term33077, term33077.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term32957, args);
        assertTrue(recursiveEquals(term32957, term33077));
        assertTrue(recursiveEquals(retValue, 30783));
    }

};


