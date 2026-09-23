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

public class Tag_hashCode_901271351172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13360;
     Object term13575;

    public Tag_hashCode_901271351172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13360 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13360, term13360.getClass(), "tagName", "");
        setBooleanField(term13360, term13360.getClass(), "isBlock", false);
        setBooleanField(term13360, term13360.getClass(), "formatAsBlock", false);
        setBooleanField(term13360, term13360.getClass(), "canContainBlock", true);
        setBooleanField(term13360, term13360.getClass(), "canContainInline", false);
        setBooleanField(term13360, term13360.getClass(), "empty", true);
        term13575 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13575, term13575.getClass(), "tagName", "");
        setBooleanField(term13575, term13575.getClass(), "isBlock", false);
        setBooleanField(term13575, term13575.getClass(), "formatAsBlock", false);
        setBooleanField(term13575, term13575.getClass(), "canContainBlock", true);
        setBooleanField(term13575, term13575.getClass(), "canContainInline", false);
        setBooleanField(term13575, term13575.getClass(), "empty", true);
        setBooleanField(term13575, term13575.getClass(), "selfClosing", false);
        setBooleanField(term13575, term13575.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term13360, args);
        assertTrue(recursiveEquals(term13360, term13575));
        assertTrue(recursiveEquals(retValue, 924482));
    }

};


