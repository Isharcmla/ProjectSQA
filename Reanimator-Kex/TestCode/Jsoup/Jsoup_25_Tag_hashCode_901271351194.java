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

public class Tag_hashCode_901271351194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15091;
     Object term15315;

    public Tag_hashCode_901271351194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15091 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15091, term15091.getClass(), "tagName", "");
        setBooleanField(term15091, term15091.getClass(), "isBlock", false);
        setBooleanField(term15091, term15091.getClass(), "formatAsBlock", false);
        setBooleanField(term15091, term15091.getClass(), "canContainBlock", false);
        setBooleanField(term15091, term15091.getClass(), "canContainInline", true);
        setBooleanField(term15091, term15091.getClass(), "empty", true);
        term15315 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15315, term15315.getClass(), "tagName", "");
        setBooleanField(term15315, term15315.getClass(), "isBlock", false);
        setBooleanField(term15315, term15315.getClass(), "formatAsBlock", false);
        setBooleanField(term15315, term15315.getClass(), "canContainBlock", false);
        setBooleanField(term15315, term15315.getClass(), "canContainInline", true);
        setBooleanField(term15315, term15315.getClass(), "empty", true);
        setBooleanField(term15315, term15315.getClass(), "selfClosing", false);
        setBooleanField(term15315, term15315.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term15091, args);
        assertTrue(recursiveEquals(term15091, term15315));
        assertTrue(recursiveEquals(retValue, 30752));
    }

};


