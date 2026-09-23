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

public class Tag_hashCode_90127135153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3608;
     Object term3686;

    public Tag_hashCode_90127135153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3608 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3608, term3608.getClass(), "tagName", "");
        setBooleanField(term3608, term3608.getClass(), "isBlock", true);
        setBooleanField(term3608, term3608.getClass(), "formatAsBlock", false);
        setBooleanField(term3608, term3608.getClass(), "canContainBlock", false);
        term3686 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3686, term3686.getClass(), "tagName", "");
        setBooleanField(term3686, term3686.getClass(), "isBlock", true);
        setBooleanField(term3686, term3686.getClass(), "formatAsBlock", false);
        setBooleanField(term3686, term3686.getClass(), "canContainBlock", false);
        setBooleanField(term3686, term3686.getClass(), "canContainInline", false);
        setBooleanField(term3686, term3686.getClass(), "empty", false);
        setBooleanField(term3686, term3686.getClass(), "selfClosing", false);
        setBooleanField(term3686, term3686.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3608, args);
        assertTrue(recursiveEquals(term3608, term3686));
        assertTrue(recursiveEquals(retValue, 887503681));
    }

};


