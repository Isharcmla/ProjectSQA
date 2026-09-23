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

public class Element_getElementsByAttributeValueEnding_604542315149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4147;
     Object term26793;
     Object term26789;

    public Element_getElementsByAttributeValueEnding_604542315149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4169 = new ArrayList();
        ((ArrayList) term4169).add((Object)null);
        LinkedHashMap term4174 = new LinkedHashMap();
        term4147 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4148 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4173 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4148, term4148.getClass(), "tagName", "MYWYUeLGOp");
        setBooleanField(term4148, term4148.getClass(), "isBlock", true);
        setBooleanField(term4148, term4148.getClass(), "formatAsBlock", true);
        setBooleanField(term4148, term4148.getClass(), "canContainInline", false);
        setBooleanField(term4148, term4148.getClass(), "empty", false);
        setBooleanField(term4148, term4148.getClass(), "selfClosing", true);
        setBooleanField(term4148, term4148.getClass(), "preserveWhitespace", false);
        setBooleanField(term4148, term4148.getClass(), "formList", false);
        setBooleanField(term4148, term4148.getClass(), "formSubmit", true);
        setField(term4147, term4147.getClass(), "tag", term4148);
        setField(term4147, term4147.getClass(), "parentNode", null);
        setField(term4147, term4147.getClass(), "childNodes", term4169);
        setField(term4173, term4173.getClass(), "attributes", term4174);
        setField(term4147, term4147.getClass(), "attributes", term4173);
        setField(term4147, term4147.getClass(), "baseUri", "zNdorvdUgu");
        setIntField(term4147, term4147.getClass(), "siblingIndex", -1786399638);
        ArrayList term26797 = new ArrayList();
        ((ArrayList) term26797).add((Object)null);
        LinkedHashMap term26800 = new LinkedHashMap();
        term26793 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term26794 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term26799 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term26794, term26794.getClass(), "tagName", "MYWYUeLGOp");
        setBooleanField(term26794, term26794.getClass(), "isBlock", true);
        setBooleanField(term26794, term26794.getClass(), "formatAsBlock", true);
        setBooleanField(term26794, term26794.getClass(), "canContainInline", false);
        setBooleanField(term26794, term26794.getClass(), "empty", false);
        setBooleanField(term26794, term26794.getClass(), "selfClosing", true);
        setBooleanField(term26794, term26794.getClass(), "preserveWhitespace", false);
        setBooleanField(term26794, term26794.getClass(), "formList", false);
        setBooleanField(term26794, term26794.getClass(), "formSubmit", true);
        setField(term26793, term26793.getClass(), "tag", term26794);
        setField(term26793, term26793.getClass(), "parentNode", null);
        setField(term26793, term26793.getClass(), "childNodes", term26797);
        setField(term26799, term26799.getClass(), "attributes", term26800);
        setField(term26793, term26793.getClass(), "attributes", term26799);
        setField(term26793, term26793.getClass(), "baseUri", "zNdorvdUgu");
        setIntField(term26793, term26793.getClass(), "siblingIndex", -1786399638);
        term26789 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term26790 = (Object[]) newArray("java.lang.Object", 0);
        setField(term26789, term26789.getClass(), "elementData", term26790);
        setIntField(term26789, term26789.getClass(), "size", 0);
        setIntField(term26789, term26789.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "oPxuZbkYio";
        args[1] = "vKitydDVnM";
        Object retValue = callMethod(klass, "getElementsByAttributeValueEnding", argTypes, term4147, args);
        assertTrue(recursiveEquals(term4147, term26793));
        assertTrue(recursiveEquals(retValue, term26789));
    }

};


