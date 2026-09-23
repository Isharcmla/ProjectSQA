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

public class Tag_hashCode_90127135163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4395;
     Object term4678;

    public Tag_hashCode_90127135163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4395 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4395, term4395.getClass(), "tagName", "");
        setBooleanField(term4395, term4395.getClass(), "isBlock", true);
        setBooleanField(term4395, term4395.getClass(), "formatAsBlock", false);
        setBooleanField(term4395, term4395.getClass(), "canContainBlock", true);
        setBooleanField(term4395, term4395.getClass(), "canContainInline", true);
        term4678 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4678, term4678.getClass(), "tagName", "");
        setBooleanField(term4678, term4678.getClass(), "isBlock", true);
        setBooleanField(term4678, term4678.getClass(), "formatAsBlock", false);
        setBooleanField(term4678, term4678.getClass(), "canContainBlock", true);
        setBooleanField(term4678, term4678.getClass(), "canContainInline", true);
        setBooleanField(term4678, term4678.getClass(), "empty", false);
        setBooleanField(term4678, term4678.getClass(), "selfClosing", false);
        setBooleanField(term4678, term4678.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term4395, args);
        assertTrue(recursiveEquals(term4395, term4678));
        assertTrue(recursiveEquals(retValue, 888456993));
    }

};


