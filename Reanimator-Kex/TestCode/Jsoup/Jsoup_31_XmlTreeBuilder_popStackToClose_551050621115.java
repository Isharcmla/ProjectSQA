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
import java.lang.Object;

public class XmlTreeBuilder_popStackToClose_551050621115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93960;
     Object term94106;
     Object term94560;
     Object term94562;

    public XmlTreeBuilder_popStackToClose_551050621115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93960 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term94042 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term93960, term93960.getClass(), "stack", term94042);
        term94106 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term94106, term94106.getClass(), "tagName", "                                                                                                                                ");
        term94560 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term94561 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term94560, term94560.getClass(), "reader", null);
        setField(term94560, term94560.getClass(), "tokeniser", null);
        setField(term94560, term94560.getClass(), "doc", null);
        setIntField(term94561, term94561.getClass(), "size", 0);
        setField(term94561, term94561.getClass(), "first", null);
        setField(term94561, term94561.getClass(), "last", null);
        setIntField(term94561, term94561.getClass(), "modCount", 0);
        setField(term94560, term94560.getClass(), "stack", term94561);
        setField(term94560, term94560.getClass(), "baseUri", null);
        setField(term94560, term94560.getClass(), "currentToken", null);
        setField(term94560, term94560.getClass(), "errors", null);
        term94562 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term94562, term94562.getClass(), "tagName", "                                                                                                                                ");
        setField(term94562, term94562.getClass(), "pendingAttributeName", null);
        setField(term94562, term94562.getClass(), "pendingAttributeValue", null);
        setBooleanField(term94562, term94562.getClass(), "selfClosing", false);
        setField(term94562, term94562.getClass(), "attributes", null);
        setField(term94562, term94562.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term94106;
        callMethod(klass, "popStackToClose", argTypes, term93960, args);
        assertTrue(recursiveEquals(term93960, term94560));
        assertTrue(recursiveEquals(term94106, term94562));
    }

};


