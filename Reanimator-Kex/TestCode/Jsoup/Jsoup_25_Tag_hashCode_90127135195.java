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

public class Tag_hashCode_90127135195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7150;
     Object term7452;

    public Tag_hashCode_90127135195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7150 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7150, term7150.getClass(), "tagName", "");
        setBooleanField(term7150, term7150.getClass(), "isBlock", false);
        setBooleanField(term7150, term7150.getClass(), "formatAsBlock", true);
        term7452 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7452, term7452.getClass(), "tagName", "");
        setBooleanField(term7452, term7452.getClass(), "isBlock", false);
        setBooleanField(term7452, term7452.getClass(), "formatAsBlock", true);
        setBooleanField(term7452, term7452.getClass(), "canContainBlock", false);
        setBooleanField(term7452, term7452.getClass(), "canContainInline", false);
        setBooleanField(term7452, term7452.getClass(), "empty", false);
        setBooleanField(term7452, term7452.getClass(), "selfClosing", false);
        setBooleanField(term7452, term7452.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term7150, args);
        assertTrue(recursiveEquals(term7150, term7452));
        assertTrue(recursiveEquals(retValue, 28629151));
    }

};


