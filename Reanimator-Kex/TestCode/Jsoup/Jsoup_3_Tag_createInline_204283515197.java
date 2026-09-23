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

public class Tag_createInline_204283515197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20946;

    public Tag_createInline_204283515197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20965 = new ArrayList();
        ((ArrayList) term20965).add((Object)null);
        Object term20957 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20957, term20957.getClass(), "tagName", "");
        setBooleanField(term20957, term20957.getClass(), "isBlock", true);
        setBooleanField(term20957, term20957.getClass(), "canContainBlock", true);
        setBooleanField(term20957, term20957.getClass(), "canContainInline", true);
        setBooleanField(term20957, term20957.getClass(), "optionalClosing", false);
        setBooleanField(term20957, term20957.getClass(), "empty", false);
        setBooleanField(term20957, term20957.getClass(), "preserveWhitespace", false);
        setField(term20957, term20957.getClass(), "ancestors", term20965);
        ArrayList term20955 = new ArrayList();
        ((ArrayList) term20955).add(term20957);
        term20946 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20946, term20946.getClass(), "tagName", "");
        setBooleanField(term20946, term20946.getClass(), "isBlock", false);
        setBooleanField(term20946, term20946.getClass(), "canContainBlock", false);
        setBooleanField(term20946, term20946.getClass(), "canContainInline", true);
        setBooleanField(term20946, term20946.getClass(), "optionalClosing", false);
        setBooleanField(term20946, term20946.getClass(), "empty", false);
        setBooleanField(term20946, term20946.getClass(), "preserveWhitespace", false);
        setField(term20946, term20946.getClass(), "ancestors", term20955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "createInline", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term20946));
    }

};


