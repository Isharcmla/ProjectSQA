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

public class Tag_hashCode_90127135188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6724;
     Object term6911;

    public Tag_hashCode_90127135188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6724 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6724, term6724.getClass(), "tagName", "");
        setBooleanField(term6724, term6724.getClass(), "isBlock", true);
        setBooleanField(term6724, term6724.getClass(), "formatAsBlock", true);
        setBooleanField(term6724, term6724.getClass(), "canContainBlock", false);
        setBooleanField(term6724, term6724.getClass(), "canContainInline", true);
        term6911 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6911, term6911.getClass(), "tagName", "");
        setBooleanField(term6911, term6911.getClass(), "isBlock", true);
        setBooleanField(term6911, term6911.getClass(), "formatAsBlock", true);
        setBooleanField(term6911, term6911.getClass(), "canContainBlock", false);
        setBooleanField(term6911, term6911.getClass(), "canContainInline", true);
        setBooleanField(term6911, term6911.getClass(), "empty", false);
        setBooleanField(term6911, term6911.getClass(), "selfClosing", false);
        setBooleanField(term6911, term6911.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term6724, args);
        assertTrue(recursiveEquals(term6724, term6911));
        assertTrue(recursiveEquals(retValue, 916162623));
    }

};


