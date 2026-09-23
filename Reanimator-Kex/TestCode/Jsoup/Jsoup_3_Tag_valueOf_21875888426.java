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

public class Tag_valueOf_21875888426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2030;

    public Tag_valueOf_21875888426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2059 = new ArrayList();
        ((ArrayList) term2059).add((Object)null);
        Object term2051 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2051, term2051.getClass(), "tagName", "");
        setBooleanField(term2051, term2051.getClass(), "isBlock", true);
        setBooleanField(term2051, term2051.getClass(), "canContainBlock", true);
        setBooleanField(term2051, term2051.getClass(), "canContainInline", true);
        setBooleanField(term2051, term2051.getClass(), "optionalClosing", false);
        setBooleanField(term2051, term2051.getClass(), "empty", false);
        setBooleanField(term2051, term2051.getClass(), "preserveWhitespace", false);
        setField(term2051, term2051.getClass(), "ancestors", term2059);
        ArrayList term2049 = new ArrayList();
        ((ArrayList) term2049).add(term2051);
        term2030 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2030, term2030.getClass(), "tagName", "uuapigetmj");
        setBooleanField(term2030, term2030.getClass(), "isBlock", false);
        setBooleanField(term2030, term2030.getClass(), "canContainBlock", true);
        setBooleanField(term2030, term2030.getClass(), "canContainInline", true);
        setBooleanField(term2030, term2030.getClass(), "optionalClosing", false);
        setBooleanField(term2030, term2030.getClass(), "empty", false);
        setBooleanField(term2030, term2030.getClass(), "preserveWhitespace", false);
        setField(term2030, term2030.getClass(), "ancestors", term2049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuaPigETmJ";
        Object retValue = callMethod(klass, "valueOf", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term2030));
    }

};


