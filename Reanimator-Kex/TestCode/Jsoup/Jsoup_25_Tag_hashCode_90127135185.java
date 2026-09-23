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

public class Tag_hashCode_90127135185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6557;
     Object term6638;

    public Tag_hashCode_90127135185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6557 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6557, term6557.getClass(), "tagName", "");
        setBooleanField(term6557, term6557.getClass(), "isBlock", true);
        setBooleanField(term6557, term6557.getClass(), "formatAsBlock", true);
        setBooleanField(term6557, term6557.getClass(), "canContainBlock", true);
        term6638 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6638, term6638.getClass(), "tagName", "");
        setBooleanField(term6638, term6638.getClass(), "isBlock", true);
        setBooleanField(term6638, term6638.getClass(), "formatAsBlock", true);
        setBooleanField(term6638, term6638.getClass(), "canContainBlock", true);
        setBooleanField(term6638, term6638.getClass(), "canContainInline", false);
        setBooleanField(term6638, term6638.getClass(), "empty", false);
        setBooleanField(term6638, term6638.getClass(), "selfClosing", false);
        setBooleanField(term6638, term6638.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term6557, args);
        assertTrue(recursiveEquals(term6557, term6638));
        assertTrue(recursiveEquals(retValue, 917056353));
    }

};


