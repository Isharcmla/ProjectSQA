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

public class Tag_isValidParent_42817428157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8519;
     Object term8580;
     Object term8858;
     Object term8861;

    public Tag_isValidParent_42817428157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8519 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term8519, term8519.getClass(), "canContainBlock", false);
        setBooleanField(term8519, term8519.getClass(), "canContainInline", true);
        setBooleanField(term8519, term8519.getClass(), "empty", true);
        setBooleanField(term8519, term8519.getClass(), "isBlock", true);
        setBooleanField(term8519, term8519.getClass(), "optionalClosing", true);
        setField(term8519, term8519.getClass(), "tagName", "");
        Object term8655 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term8655, term8655.getClass(), "canContainBlock", true);
        Object term8678 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term8678, term8678.getClass(), "canContainBlock", false);
        setBooleanField(term8678, term8678.getClass(), "canContainInline", true);
        setBooleanField(term8678, term8678.getClass(), "empty", true);
        setBooleanField(term8678, term8678.getClass(), "isBlock", true);
        setBooleanField(term8678, term8678.getClass(), "optionalClosing", true);
        setField(term8678, term8678.getClass(), "tagName", null);
        Object term8701 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term8701, term8701.getClass(), "canContainBlock", false);
        setBooleanField(term8701, term8701.getClass(), "canContainInline", false);
        Object term8724 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term8724, term8724.getClass(), "canContainBlock", true);
        ArrayList term8632 = new ArrayList();
        ((ArrayList) term8632).add(term8655);
        ((ArrayList) term8632).add(term8678);
        ((ArrayList) term8632).add(term8580);
        ((ArrayList) term8632).add(term8655);
        ((ArrayList) term8632).add(term8701);
        ((ArrayList) term8632).add(term8724);
        term8580 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8580, term8580.getClass(), "ancestors", term8632);
        setBooleanField(term8580, term8580.getClass(), "canContainBlock", false);
        setBooleanField(term8580, term8580.getClass(), "canContainInline", false);
        term8858 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8858, term8858.getClass(), "tagName", "");
        setBooleanField(term8858, term8858.getClass(), "isBlock", true);
        setBooleanField(term8858, term8858.getClass(), "canContainBlock", false);
        setBooleanField(term8858, term8858.getClass(), "canContainInline", true);
        setBooleanField(term8858, term8858.getClass(), "optionalClosing", true);
        setBooleanField(term8858, term8858.getClass(), "empty", true);
        setBooleanField(term8858, term8858.getClass(), "preserveWhitespace", false);
        setField(term8858, term8858.getClass(), "ancestors", null);
        Object term8864 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8864, term8864.getClass(), "tagName", null);
        setBooleanField(term8864, term8864.getClass(), "isBlock", false);
        setBooleanField(term8864, term8864.getClass(), "canContainBlock", true);
        setBooleanField(term8864, term8864.getClass(), "canContainInline", false);
        setBooleanField(term8864, term8864.getClass(), "optionalClosing", false);
        setBooleanField(term8864, term8864.getClass(), "empty", false);
        setBooleanField(term8864, term8864.getClass(), "preserveWhitespace", false);
        setField(term8864, term8864.getClass(), "ancestors", null);
        Object term8865 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8865, term8865.getClass(), "tagName", null);
        setBooleanField(term8865, term8865.getClass(), "isBlock", true);
        setBooleanField(term8865, term8865.getClass(), "canContainBlock", false);
        setBooleanField(term8865, term8865.getClass(), "canContainInline", true);
        setBooleanField(term8865, term8865.getClass(), "optionalClosing", true);
        setBooleanField(term8865, term8865.getClass(), "empty", true);
        setBooleanField(term8865, term8865.getClass(), "preserveWhitespace", false);
        setField(term8865, term8865.getClass(), "ancestors", null);
        Object term8866 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8866, term8866.getClass(), "tagName", null);
        setBooleanField(term8866, term8866.getClass(), "isBlock", false);
        setBooleanField(term8866, term8866.getClass(), "canContainBlock", false);
        setBooleanField(term8866, term8866.getClass(), "canContainInline", false);
        setBooleanField(term8866, term8866.getClass(), "optionalClosing", false);
        setBooleanField(term8866, term8866.getClass(), "empty", false);
        setBooleanField(term8866, term8866.getClass(), "preserveWhitespace", false);
        setField(term8866, term8866.getClass(), "ancestors", null);
        Object term8867 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8867, term8867.getClass(), "tagName", null);
        setBooleanField(term8867, term8867.getClass(), "isBlock", false);
        setBooleanField(term8867, term8867.getClass(), "canContainBlock", true);
        setBooleanField(term8867, term8867.getClass(), "canContainInline", false);
        setBooleanField(term8867, term8867.getClass(), "optionalClosing", false);
        setBooleanField(term8867, term8867.getClass(), "empty", false);
        setBooleanField(term8867, term8867.getClass(), "preserveWhitespace", false);
        setField(term8867, term8867.getClass(), "ancestors", null);
        ArrayList term8862 = new ArrayList();
        ((ArrayList) term8862).add(term8864);
        ((ArrayList) term8862).add(term8865);
        ((ArrayList) term8862).add((Object)null);
        ((ArrayList) term8862).add(term8864);
        ((ArrayList) term8862).add(term8866);
        ((ArrayList) term8862).add(term8867);
        term8861 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8861, term8861.getClass(), "tagName", null);
        setBooleanField(term8861, term8861.getClass(), "isBlock", false);
        setBooleanField(term8861, term8861.getClass(), "canContainBlock", false);
        setBooleanField(term8861, term8861.getClass(), "canContainInline", false);
        setBooleanField(term8861, term8861.getClass(), "optionalClosing", false);
        setBooleanField(term8861, term8861.getClass(), "empty", false);
        setBooleanField(term8861, term8861.getClass(), "preserveWhitespace", false);
        setField(term8861, term8861.getClass(), "ancestors", term8862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term8580;
        Object retValue = callMethod(klass, "isValidParent", argTypes, term8519, args);
        assertTrue(recursiveEquals(term8519, term8858));
        assertTrue(recursiveEquals(term8580, term8861));
        assertTrue(recursiveEquals(retValue, false));
    }

};


