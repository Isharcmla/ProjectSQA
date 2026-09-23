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
import java.util.ArrayList;
import java.lang.Object;

public class Tag_createInline_204283515140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3888;

    public Tag_createInline_204283515140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3917 = new ArrayList();
        ((ArrayList) term3917).add((Object)null);
        Object term3909 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3909, term3909.getClass(), "tagName", "");
        setBooleanField(term3909, term3909.getClass(), "isBlock", true);
        setBooleanField(term3909, term3909.getClass(), "canContainBlock", true);
        setBooleanField(term3909, term3909.getClass(), "canContainInline", true);
        setBooleanField(term3909, term3909.getClass(), "optionalClosing", false);
        setBooleanField(term3909, term3909.getClass(), "empty", false);
        setBooleanField(term3909, term3909.getClass(), "preserveWhitespace", false);
        setField(term3909, term3909.getClass(), "ancestors", term3917);
        ArrayList term3907 = new ArrayList();
        ((ArrayList) term3907).add(term3909);
        term3888 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3888, term3888.getClass(), "tagName", "fwkjosocwe");
        setBooleanField(term3888, term3888.getClass(), "isBlock", false);
        setBooleanField(term3888, term3888.getClass(), "canContainBlock", false);
        setBooleanField(term3888, term3888.getClass(), "canContainInline", true);
        setBooleanField(term3888, term3888.getClass(), "optionalClosing", false);
        setBooleanField(term3888, term3888.getClass(), "empty", false);
        setBooleanField(term3888, term3888.getClass(), "preserveWhitespace", false);
        setField(term3888, term3888.getClass(), "ancestors", term3907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fWKJoSoCwE";
        Object retValue = callMethod(klass, "createInline", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3888));
    }

};


