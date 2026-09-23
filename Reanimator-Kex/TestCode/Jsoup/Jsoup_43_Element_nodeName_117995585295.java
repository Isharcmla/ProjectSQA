package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_nodeName_117995585295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;
     Object term8721;

    public Element_nodeName_117995585295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term157 = new ArrayList();
        ((ArrayList) term157).add((Object)null);
        ((ArrayList) term157).add((Object)null);
        ((ArrayList) term157).add((Object)null);
        ((ArrayList) term157).add((Object)null);
        ((ArrayList) term157).add((Object)null);
        LinkedHashMap term162 = new LinkedHashMap();
        term134 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term135 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term161 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term135, term135.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term135, term135.getClass(), "isBlock", false);
        setBooleanField(term135, term135.getClass(), "formatAsBlock", false);
        setBooleanField(term135, term135.getClass(), "canContainBlock", true);
        setBooleanField(term135, term135.getClass(), "canContainInline", true);
        setBooleanField(term135, term135.getClass(), "empty", true);
        setBooleanField(term135, term135.getClass(), "selfClosing", true);
        setBooleanField(term135, term135.getClass(), "preserveWhitespace", true);
        setBooleanField(term135, term135.getClass(), "formList", false);
        setBooleanField(term135, term135.getClass(), "formSubmit", false);
        setField(term134, term134.getClass(), "tag", term135);
        setField(term134, term134.getClass(), "parentNode", null);
        setField(term134, term134.getClass(), "childNodes", term157);
        setField(term161, term161.getClass(), "attributes", term162);
        setField(term134, term134.getClass(), "attributes", term161);
        setField(term134, term134.getClass(), "baseUri", "uuaPigETmJ");
        setIntField(term134, term134.getClass(), "siblingIndex", 568599855);
        ArrayList term8725 = new ArrayList();
        ((ArrayList) term8725).add((Object)null);
        ((ArrayList) term8725).add((Object)null);
        ((ArrayList) term8725).add((Object)null);
        ((ArrayList) term8725).add((Object)null);
        ((ArrayList) term8725).add((Object)null);
        LinkedHashMap term8728 = new LinkedHashMap();
        term8721 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8722 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8727 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8722, term8722.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term8722, term8722.getClass(), "isBlock", false);
        setBooleanField(term8722, term8722.getClass(), "formatAsBlock", false);
        setBooleanField(term8722, term8722.getClass(), "canContainBlock", true);
        setBooleanField(term8722, term8722.getClass(), "canContainInline", true);
        setBooleanField(term8722, term8722.getClass(), "empty", true);
        setBooleanField(term8722, term8722.getClass(), "selfClosing", true);
        setBooleanField(term8722, term8722.getClass(), "preserveWhitespace", true);
        setBooleanField(term8722, term8722.getClass(), "formList", false);
        setBooleanField(term8722, term8722.getClass(), "formSubmit", false);
        setField(term8721, term8721.getClass(), "tag", term8722);
        setField(term8721, term8721.getClass(), "parentNode", null);
        setField(term8721, term8721.getClass(), "childNodes", term8725);
        setField(term8727, term8727.getClass(), "attributes", term8728);
        setField(term8721, term8721.getClass(), "attributes", term8727);
        setField(term8721, term8721.getClass(), "baseUri", "uuaPigETmJ");
        setIntField(term8721, term8721.getClass(), "siblingIndex", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term134, args);
        assertTrue(recursiveEquals(term134, term8721));
        assertTrue(recursiveEquals(retValue, "MjGYSRKTNF"));
    }

};


