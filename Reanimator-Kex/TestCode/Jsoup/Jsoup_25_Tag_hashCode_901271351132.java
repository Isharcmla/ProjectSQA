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

public class Tag_hashCode_901271351132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10309;
     Object term10514;

    public Tag_hashCode_901271351132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10309 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10309, term10309.getClass(), "tagName", "");
        setBooleanField(term10309, term10309.getClass(), "isBlock", true);
        setBooleanField(term10309, term10309.getClass(), "formatAsBlock", false);
        setBooleanField(term10309, term10309.getClass(), "canContainBlock", false);
        setBooleanField(term10309, term10309.getClass(), "canContainInline", true);
        setBooleanField(term10309, term10309.getClass(), "empty", false);
        setBooleanField(term10309, term10309.getClass(), "selfClosing", false);
        setBooleanField(term10309, term10309.getClass(), "preserveWhitespace", true);
        term10514 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10514, term10514.getClass(), "tagName", "");
        setBooleanField(term10514, term10514.getClass(), "isBlock", true);
        setBooleanField(term10514, term10514.getClass(), "formatAsBlock", false);
        setBooleanField(term10514, term10514.getClass(), "canContainBlock", false);
        setBooleanField(term10514, term10514.getClass(), "canContainInline", true);
        setBooleanField(term10514, term10514.getClass(), "empty", false);
        setBooleanField(term10514, term10514.getClass(), "selfClosing", false);
        setBooleanField(term10514, term10514.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term10309, args);
        assertTrue(recursiveEquals(term10309, term10514));
        assertTrue(recursiveEquals(retValue, 887533473));
    }

};


