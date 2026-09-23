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

public class Tag_createBlock_108526837139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3722;

    public Tag_createBlock_108526837139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3751 = new ArrayList();
        ((ArrayList) term3751).add((Object)null);
        Object term3743 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3743, term3743.getClass(), "tagName", "");
        setBooleanField(term3743, term3743.getClass(), "isBlock", true);
        setBooleanField(term3743, term3743.getClass(), "canContainBlock", true);
        setBooleanField(term3743, term3743.getClass(), "canContainInline", true);
        setBooleanField(term3743, term3743.getClass(), "optionalClosing", false);
        setBooleanField(term3743, term3743.getClass(), "empty", false);
        setBooleanField(term3743, term3743.getClass(), "preserveWhitespace", false);
        setField(term3743, term3743.getClass(), "ancestors", term3751);
        ArrayList term3741 = new ArrayList();
        ((ArrayList) term3741).add(term3743);
        term3722 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3722, term3722.getClass(), "tagName", "gcwtlvkvve");
        setBooleanField(term3722, term3722.getClass(), "isBlock", true);
        setBooleanField(term3722, term3722.getClass(), "canContainBlock", true);
        setBooleanField(term3722, term3722.getClass(), "canContainInline", true);
        setBooleanField(term3722, term3722.getClass(), "optionalClosing", false);
        setBooleanField(term3722, term3722.getClass(), "empty", false);
        setBooleanField(term3722, term3722.getClass(), "preserveWhitespace", false);
        setField(term3722, term3722.getClass(), "ancestors", term3741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gCWtLVKVVe";
        Object retValue = callMethod(klass, "createBlock", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3722));
    }

};


