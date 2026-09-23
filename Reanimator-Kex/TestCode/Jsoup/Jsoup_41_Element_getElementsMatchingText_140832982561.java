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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsMatchingText_140832982561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5139;

    public Element_getElementsMatchingText_140832982561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5162 = new ArrayList();
        ((ArrayList) term5162).add((Object)null);
        ((ArrayList) term5162).add((Object)null);
        ((ArrayList) term5162).add((Object)null);
        ((ArrayList) term5162).add((Object)null);
        ((ArrayList) term5162).add((Object)null);
        ((ArrayList) term5162).add((Object)null);
        ((ArrayList) term5162).add((Object)null);
        ((ArrayList) term5162).add((Object)null);
        LinkedHashMap term5167 = new LinkedHashMap();
        term5139 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5140 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5166 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5140, term5140.getClass(), "tagName", "RCOqfVsRHt");
        setBooleanField(term5140, term5140.getClass(), "isBlock", true);
        setBooleanField(term5140, term5140.getClass(), "formatAsBlock", false);
        setBooleanField(term5140, term5140.getClass(), "canContainBlock", true);
        setBooleanField(term5140, term5140.getClass(), "canContainInline", true);
        setBooleanField(term5140, term5140.getClass(), "empty", true);
        setBooleanField(term5140, term5140.getClass(), "selfClosing", false);
        setBooleanField(term5140, term5140.getClass(), "preserveWhitespace", false);
        setBooleanField(term5140, term5140.getClass(), "formList", false);
        setBooleanField(term5140, term5140.getClass(), "formSubmit", false);
        setField(term5139, term5139.getClass(), "tag", term5140);
        setField(term5139, term5139.getClass(), "parentNode", null);
        setField(term5139, term5139.getClass(), "childNodes", term5162);
        setField(term5166, term5166.getClass(), "attributes", term5167);
        setField(term5139, term5139.getClass(), "attributes", term5166);
        setField(term5139, term5139.getClass(), "baseUri", "fzeqPnzpnt");
        setIntField(term5139, term5139.getClass(), "siblingIndex", 1861318859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RxbhrFBjkO";
        callMethod(klass, "getElementsMatchingText", argTypes, term5139, args);
    }

};


