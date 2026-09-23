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
import java.lang.Integer;

public class Element_getElementsByIndexLessThan_751556693146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4547;
     Object term4599;
     Object term28124;
     Object term28120;

    public Element_getElementsByIndexLessThan_751556693146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4570 = new ArrayList();
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        ((ArrayList) term4570).add((Object)null);
        LinkedHashMap term4575 = new LinkedHashMap();
        term4547 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4548 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4574 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4548, term4548.getClass(), "tagName", "qnvxzwuGKX");
        setBooleanField(term4548, term4548.getClass(), "isBlock", true);
        setBooleanField(term4548, term4548.getClass(), "formatAsBlock", false);
        setBooleanField(term4548, term4548.getClass(), "canContainBlock", true);
        setBooleanField(term4548, term4548.getClass(), "canContainInline", true);
        setBooleanField(term4548, term4548.getClass(), "empty", false);
        setBooleanField(term4548, term4548.getClass(), "selfClosing", true);
        setBooleanField(term4548, term4548.getClass(), "preserveWhitespace", false);
        setBooleanField(term4548, term4548.getClass(), "formList", false);
        setBooleanField(term4548, term4548.getClass(), "formSubmit", true);
        setField(term4547, term4547.getClass(), "tag", term4548);
        setField(term4547, term4547.getClass(), "parentNode", null);
        setField(term4547, term4547.getClass(), "childNodes", term4570);
        setField(term4574, term4574.getClass(), "attributes", term4575);
        setField(term4547, term4547.getClass(), "attributes", term4574);
        setField(term4547, term4547.getClass(), "baseUri", "ZfBIVGBQOE");
        setIntField(term4547, term4547.getClass(), "siblingIndex", 941650513);
        term4599 = new Integer(444029505);
        ArrayList term28127 = new ArrayList();
        ((ArrayList) term28127).add((Object)null);
        ((ArrayList) term28127).add((Object)null);
        ((ArrayList) term28127).add((Object)null);
        ((ArrayList) term28127).add((Object)null);
        ((ArrayList) term28127).add((Object)null);
        ((ArrayList) term28127).add((Object)null);
        ((ArrayList) term28127).add((Object)null);
        ((ArrayList) term28127).add((Object)null);
        ((ArrayList) term28127).add((Object)null);
        LinkedHashMap term28130 = new LinkedHashMap();
        term28124 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28125 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28129 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28125, term28125.getClass(), "tagName", "");
        setBooleanField(term28125, term28125.getClass(), "isBlock", true);
        setBooleanField(term28125, term28125.getClass(), "formatAsBlock", false);
        setBooleanField(term28125, term28125.getClass(), "canContainBlock", true);
        setBooleanField(term28125, term28125.getClass(), "canContainInline", true);
        setBooleanField(term28125, term28125.getClass(), "empty", false);
        setBooleanField(term28125, term28125.getClass(), "selfClosing", true);
        setBooleanField(term28125, term28125.getClass(), "preserveWhitespace", false);
        setBooleanField(term28125, term28125.getClass(), "formList", false);
        setBooleanField(term28125, term28125.getClass(), "formSubmit", true);
        setField(term28124, term28124.getClass(), "tag", term28125);
        setField(term28124, term28124.getClass(), "parentNode", null);
        setField(term28124, term28124.getClass(), "childNodes", term28127);
        setField(term28129, term28129.getClass(), "attributes", term28130);
        setField(term28124, term28124.getClass(), "attributes", term28129);
        setField(term28124, term28124.getClass(), "baseUri", "ZfBIVGBQOE");
        setIntField(term28124, term28124.getClass(), "siblingIndex", 941650513);
        ArrayList term27889 = new ArrayList();
        ((ArrayList) term27889).add((Object)null);
        ((ArrayList) term27889).add((Object)null);
        ((ArrayList) term27889).add((Object)null);
        ((ArrayList) term27889).add((Object)null);
        ((ArrayList) term27889).add((Object)null);
        ((ArrayList) term27889).add((Object)null);
        ((ArrayList) term27889).add((Object)null);
        ((ArrayList) term27889).add((Object)null);
        ((ArrayList) term27889).add((Object)null);
        LinkedHashMap term27894 = new LinkedHashMap();
        term28120 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term28121 = (Object[]) newArray("java.lang.Object", 10);
        Object term27877 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term27878 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term27893 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term27878, term27878.getClass(), "tagName", "");
        setBooleanField(term27878, term27878.getClass(), "isBlock", true);
        setBooleanField(term27878, term27878.getClass(), "formatAsBlock", false);
        setBooleanField(term27878, term27878.getClass(), "canContainBlock", true);
        setBooleanField(term27878, term27878.getClass(), "canContainInline", true);
        setBooleanField(term27878, term27878.getClass(), "empty", false);
        setBooleanField(term27878, term27878.getClass(), "selfClosing", true);
        setBooleanField(term27878, term27878.getClass(), "preserveWhitespace", false);
        setBooleanField(term27878, term27878.getClass(), "formList", false);
        setBooleanField(term27878, term27878.getClass(), "formSubmit", true);
        setField(term27877, term27877.getClass(), "tag", term27878);
        setField(term27877, term27877.getClass(), "parentNode", null);
        setField(term27877, term27877.getClass(), "childNodes", term27889);
        setField(term27893, term27893.getClass(), "attributes", term27894);
        setField(term27877, term27877.getClass(), "attributes", term27893);
        setField(term27877, term27877.getClass(), "baseUri", "ZfBIVGBQOE");
        setIntField(term27877, term27877.getClass(), "siblingIndex", 941650513);
        setElement(term28121, 0, term27877);
        setField(term28120, term28120.getClass(), "elementData", term28121);
        setIntField(term28120, term28120.getClass(), "size", 1);
        setIntField(term28120, term28120.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4599;
        Object retValue = callMethod(klass, "getElementsByIndexLessThan", argTypes, term4547, args);
        assertTrue(recursiveEquals(term4547, term28124));
        assertTrue(recursiveEquals(term4599, 444029505));
        assertTrue(recursiveEquals(retValue, term28120));
    }

};


