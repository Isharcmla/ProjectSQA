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

public class Tag_isValidParent_42817428159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9437;
     Object term9521;
     Object term9794;
     Object term9797;

    public Tag_isValidParent_42817428159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9437 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term9437, term9437.getClass(), "canContainBlock", true);
        setBooleanField(term9437, term9437.getClass(), "canContainInline", false);
        setBooleanField(term9437, term9437.getClass(), "empty", true);
        setBooleanField(term9437, term9437.getClass(), "isBlock", true);
        setBooleanField(term9437, term9437.getClass(), "optionalClosing", true);
        setField(term9437, term9437.getClass(), "tagName", "byte[]");
        Object term9596 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term9596, term9596.getClass(), "canContainBlock", false);
        Object term9619 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term9619, term9619.getClass(), "canContainBlock", true);
        setBooleanField(term9619, term9619.getClass(), "canContainInline", false);
        setBooleanField(term9619, term9619.getClass(), "empty", true);
        setBooleanField(term9619, term9619.getClass(), "isBlock", true);
        setBooleanField(term9619, term9619.getClass(), "optionalClosing", true);
        setField(term9619, term9619.getClass(), "tagName", null);
        Object term9642 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term9642, term9642.getClass(), "canContainBlock", true);
        setBooleanField(term9642, term9642.getClass(), "canContainInline", true);
        Object term9665 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term9665, term9665.getClass(), "canContainBlock", true);
        ArrayList term9573 = new ArrayList();
        ((ArrayList) term9573).add(term9596);
        ((ArrayList) term9573).add(term9619);
        ((ArrayList) term9573).add(term9642);
        ((ArrayList) term9573).add(term9665);
        term9521 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9521, term9521.getClass(), "ancestors", term9573);
        term9794 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9794, term9794.getClass(), "tagName", "byte[]");
        setBooleanField(term9794, term9794.getClass(), "isBlock", true);
        setBooleanField(term9794, term9794.getClass(), "canContainBlock", true);
        setBooleanField(term9794, term9794.getClass(), "canContainInline", false);
        setBooleanField(term9794, term9794.getClass(), "optionalClosing", true);
        setBooleanField(term9794, term9794.getClass(), "empty", true);
        setBooleanField(term9794, term9794.getClass(), "preserveWhitespace", false);
        setField(term9794, term9794.getClass(), "ancestors", null);
        Object term9800 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9800, term9800.getClass(), "tagName", null);
        setBooleanField(term9800, term9800.getClass(), "isBlock", false);
        setBooleanField(term9800, term9800.getClass(), "canContainBlock", false);
        setBooleanField(term9800, term9800.getClass(), "canContainInline", false);
        setBooleanField(term9800, term9800.getClass(), "optionalClosing", false);
        setBooleanField(term9800, term9800.getClass(), "empty", false);
        setBooleanField(term9800, term9800.getClass(), "preserveWhitespace", false);
        setField(term9800, term9800.getClass(), "ancestors", null);
        Object term9801 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9801, term9801.getClass(), "tagName", null);
        setBooleanField(term9801, term9801.getClass(), "isBlock", true);
        setBooleanField(term9801, term9801.getClass(), "canContainBlock", true);
        setBooleanField(term9801, term9801.getClass(), "canContainInline", false);
        setBooleanField(term9801, term9801.getClass(), "optionalClosing", true);
        setBooleanField(term9801, term9801.getClass(), "empty", true);
        setBooleanField(term9801, term9801.getClass(), "preserveWhitespace", false);
        setField(term9801, term9801.getClass(), "ancestors", null);
        Object term9802 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9802, term9802.getClass(), "tagName", null);
        setBooleanField(term9802, term9802.getClass(), "isBlock", false);
        setBooleanField(term9802, term9802.getClass(), "canContainBlock", true);
        setBooleanField(term9802, term9802.getClass(), "canContainInline", true);
        setBooleanField(term9802, term9802.getClass(), "optionalClosing", false);
        setBooleanField(term9802, term9802.getClass(), "empty", false);
        setBooleanField(term9802, term9802.getClass(), "preserveWhitespace", false);
        setField(term9802, term9802.getClass(), "ancestors", null);
        Object term9803 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9803, term9803.getClass(), "tagName", null);
        setBooleanField(term9803, term9803.getClass(), "isBlock", false);
        setBooleanField(term9803, term9803.getClass(), "canContainBlock", true);
        setBooleanField(term9803, term9803.getClass(), "canContainInline", false);
        setBooleanField(term9803, term9803.getClass(), "optionalClosing", false);
        setBooleanField(term9803, term9803.getClass(), "empty", false);
        setBooleanField(term9803, term9803.getClass(), "preserveWhitespace", false);
        setField(term9803, term9803.getClass(), "ancestors", null);
        ArrayList term9798 = new ArrayList();
        ((ArrayList) term9798).add(term9800);
        ((ArrayList) term9798).add(term9801);
        ((ArrayList) term9798).add(term9802);
        ((ArrayList) term9798).add(term9803);
        term9797 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9797, term9797.getClass(), "tagName", null);
        setBooleanField(term9797, term9797.getClass(), "isBlock", false);
        setBooleanField(term9797, term9797.getClass(), "canContainBlock", false);
        setBooleanField(term9797, term9797.getClass(), "canContainInline", false);
        setBooleanField(term9797, term9797.getClass(), "optionalClosing", false);
        setBooleanField(term9797, term9797.getClass(), "empty", false);
        setBooleanField(term9797, term9797.getClass(), "preserveWhitespace", false);
        setField(term9797, term9797.getClass(), "ancestors", term9798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term9521;
        Object retValue = callMethod(klass, "isValidParent", argTypes, term9437, args);
        assertTrue(recursiveEquals(term9437, term9794));
        assertTrue(recursiveEquals(term9521, term9797));
        assertTrue(recursiveEquals(retValue, false));
    }

};


