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

public class XmlTreeBuilder_popStackToClose_55105062177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94511;
     Object term94763;
     Object term98777;
     Object term98782;

    public XmlTreeBuilder_popStackToClose_55105062177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term94615 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term94661 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term94661, term94661.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term94615, term94615.getClass(), "tag", term94661);
        ArrayList term94563 = new ArrayList();
        ((ArrayList) term94563).add(term94615);
        term94511 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term94511, term94511.getClass(), "stack", term94563);
        term94763 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term94763, term94763.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        Object term98780 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term98781 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term98781, term98781.getClass(), "tagName", null);
        setBooleanField(term98781, term98781.getClass(), "isBlock", false);
        setBooleanField(term98781, term98781.getClass(), "formatAsBlock", false);
        setBooleanField(term98781, term98781.getClass(), "canContainBlock", false);
        setBooleanField(term98781, term98781.getClass(), "canContainInline", false);
        setBooleanField(term98781, term98781.getClass(), "empty", false);
        setBooleanField(term98781, term98781.getClass(), "selfClosing", false);
        setBooleanField(term98781, term98781.getClass(), "preserveWhitespace", false);
        setBooleanField(term98781, term98781.getClass(), "formList", false);
        setBooleanField(term98781, term98781.getClass(), "formSubmit", false);
        setField(term98780, term98780.getClass(), "tag", term98781);
        setField(term98780, term98780.getClass(), "parentNode", null);
        setField(term98780, term98780.getClass(), "childNodes", null);
        setField(term98780, term98780.getClass(), "attributes", null);
        setField(term98780, term98780.getClass(), "baseUri", null);
        setIntField(term98780, term98780.getClass(), "siblingIndex", 0);
        ArrayList term98778 = new ArrayList();
        ((ArrayList) term98778).add(term98780);
        term98777 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term98777, term98777.getClass(), "reader", null);
        setField(term98777, term98777.getClass(), "tokeniser", null);
        setField(term98777, term98777.getClass(), "doc", null);
        setField(term98777, term98777.getClass(), "stack", term98778);
        setField(term98777, term98777.getClass(), "baseUri", null);
        setField(term98777, term98777.getClass(), "currentToken", null);
        setField(term98777, term98777.getClass(), "errors", null);
        setField(term98777, term98777.getClass(), "settings", null);
        setField(term98777, term98777.getClass(), "start", null);
        setField(term98777, term98777.getClass(), "end", null);
        term98782 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term98782, term98782.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term98782, term98782.getClass(), "normalName", null);
        setField(term98782, term98782.getClass(), "pendingAttributeName", null);
        setField(term98782, term98782.getClass(), "pendingAttributeValue", null);
        setField(term98782, term98782.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term98782, term98782.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term98782, term98782.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term98782, term98782.getClass(), "selfClosing", false);
        setField(term98782, term98782.getClass(), "attributes", null);
        setField(term98782, term98782.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term94763;
        callMethod(klass, "popStackToClose", argTypes, term94511, args);
        assertTrue(recursiveEquals(term94511, term98777));
        assertTrue(recursiveEquals(term94763, term98782));
    }

};


