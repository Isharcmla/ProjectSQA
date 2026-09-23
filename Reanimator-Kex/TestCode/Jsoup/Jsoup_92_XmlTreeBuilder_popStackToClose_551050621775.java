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
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_551050621775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589505;
     Object term589823;
     Object term592384;
     Object term592390;

    public XmlTreeBuilder_popStackToClose_551050621775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term589675 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term589721 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term589721, term589721.getClass(), "tagName", "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001");
        setField(term589675, term589675.getClass(), "tag", term589721);
        ArrayList term589623 = new ArrayList();
        ((ArrayList) term589623).add(term589675);
        term589505 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term589571 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term589571, term589571.getClass(), "preserveTagCase", true);
        setField(term589505, term589505.getClass(), "settings", term589571);
        setField(term589505, term589505.getClass(), "stack", term589623);
        term589823 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term589823, term589823.getClass(), "tagName", "");
        Object term592387 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term592388 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term592388, term592388.getClass(), "tagName", null);
        setField(term592388, term592388.getClass(), "normalName", null);
        setBooleanField(term592388, term592388.getClass(), "isBlock", false);
        setBooleanField(term592388, term592388.getClass(), "formatAsBlock", false);
        setBooleanField(term592388, term592388.getClass(), "canContainInline", false);
        setBooleanField(term592388, term592388.getClass(), "empty", false);
        setBooleanField(term592388, term592388.getClass(), "selfClosing", false);
        setBooleanField(term592388, term592388.getClass(), "preserveWhitespace", false);
        setBooleanField(term592388, term592388.getClass(), "formList", false);
        setBooleanField(term592388, term592388.getClass(), "formSubmit", false);
        setField(term592387, term592387.getClass(), "tag", term592388);
        setField(term592387, term592387.getClass(), "shadowChildrenRef", null);
        setField(term592387, term592387.getClass(), "childNodes", null);
        setField(term592387, term592387.getClass(), "attributes", null);
        setField(term592387, term592387.getClass(), "baseUri", null);
        setField(term592387, term592387.getClass(), "parentNode", null);
        setIntField(term592387, term592387.getClass(), "siblingIndex", 0);
        ArrayList term592385 = new ArrayList();
        ((ArrayList) term592385).add(term592387);
        term592384 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term592389 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term592384, term592384.getClass(), "parser", null);
        setField(term592384, term592384.getClass(), "reader", null);
        setField(term592384, term592384.getClass(), "tokeniser", null);
        setField(term592384, term592384.getClass(), "doc", null);
        setField(term592384, term592384.getClass(), "stack", term592385);
        setField(term592384, term592384.getClass(), "baseUri", null);
        setField(term592384, term592384.getClass(), "currentToken", null);
        setBooleanField(term592389, term592389.getClass(), "preserveTagCase", true);
        setBooleanField(term592389, term592389.getClass(), "preserveAttributeCase", false);
        setField(term592384, term592384.getClass(), "settings", term592389);
        setField(term592384, term592384.getClass(), "start", null);
        setField(term592384, term592384.getClass(), "end", null);
        term592390 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term592390, term592390.getClass(), "tagName", "");
        setField(term592390, term592390.getClass(), "normalName", null);
        setField(term592390, term592390.getClass(), "pendingAttributeName", null);
        setField(term592390, term592390.getClass(), "pendingAttributeValue", null);
        setField(term592390, term592390.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term592390, term592390.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term592390, term592390.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term592390, term592390.getClass(), "selfClosing", false);
        setField(term592390, term592390.getClass(), "attributes", null);
        setField(term592390, term592390.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term589823;
        callMethod(klass, "popStackToClose", argTypes, term589505, args);
        assertTrue(recursiveEquals(term589505, term592384));
        assertTrue(recursiveEquals(term589823, term592390));
    }

};


