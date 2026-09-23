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

public class Element_getElementsByAttribute_599263456137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3424;
     Object term22704;
     Object term22700;

    public Element_getElementsByAttribute_599263456137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3447 = new ArrayList();
        ((ArrayList) term3447).add((Object)null);
        ((ArrayList) term3447).add((Object)null);
        ((ArrayList) term3447).add((Object)null);
        ((ArrayList) term3447).add((Object)null);
        LinkedHashMap term3452 = new LinkedHashMap();
        term3424 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3425 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3451 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3425, term3425.getClass(), "tagName", "IpQuOGMgmj");
        setBooleanField(term3425, term3425.getClass(), "isBlock", false);
        setBooleanField(term3425, term3425.getClass(), "formatAsBlock", false);
        setBooleanField(term3425, term3425.getClass(), "canContainBlock", true);
        setBooleanField(term3425, term3425.getClass(), "canContainInline", false);
        setBooleanField(term3425, term3425.getClass(), "empty", false);
        setBooleanField(term3425, term3425.getClass(), "selfClosing", false);
        setBooleanField(term3425, term3425.getClass(), "preserveWhitespace", false);
        setBooleanField(term3425, term3425.getClass(), "formList", true);
        setBooleanField(term3425, term3425.getClass(), "formSubmit", true);
        setField(term3424, term3424.getClass(), "tag", term3425);
        setField(term3424, term3424.getClass(), "parentNode", null);
        setField(term3424, term3424.getClass(), "childNodes", term3447);
        setField(term3451, term3451.getClass(), "attributes", term3452);
        setField(term3424, term3424.getClass(), "attributes", term3451);
        setField(term3424, term3424.getClass(), "baseUri", "WBAOTqErtm");
        setIntField(term3424, term3424.getClass(), "siblingIndex", -817164822);
        ArrayList term22708 = new ArrayList();
        ((ArrayList) term22708).add((Object)null);
        ((ArrayList) term22708).add((Object)null);
        ((ArrayList) term22708).add((Object)null);
        ((ArrayList) term22708).add((Object)null);
        LinkedHashMap term22711 = new LinkedHashMap();
        term22704 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term22705 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term22710 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22705, term22705.getClass(), "tagName", "IpQuOGMgmj");
        setBooleanField(term22705, term22705.getClass(), "isBlock", false);
        setBooleanField(term22705, term22705.getClass(), "formatAsBlock", false);
        setBooleanField(term22705, term22705.getClass(), "canContainBlock", true);
        setBooleanField(term22705, term22705.getClass(), "canContainInline", false);
        setBooleanField(term22705, term22705.getClass(), "empty", false);
        setBooleanField(term22705, term22705.getClass(), "selfClosing", false);
        setBooleanField(term22705, term22705.getClass(), "preserveWhitespace", false);
        setBooleanField(term22705, term22705.getClass(), "formList", true);
        setBooleanField(term22705, term22705.getClass(), "formSubmit", true);
        setField(term22704, term22704.getClass(), "tag", term22705);
        setField(term22704, term22704.getClass(), "parentNode", null);
        setField(term22704, term22704.getClass(), "childNodes", term22708);
        setField(term22710, term22710.getClass(), "attributes", term22711);
        setField(term22704, term22704.getClass(), "attributes", term22710);
        setField(term22704, term22704.getClass(), "baseUri", "WBAOTqErtm");
        setIntField(term22704, term22704.getClass(), "siblingIndex", -817164822);
        term22700 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term22701 = (Object[]) newArray("java.lang.Object", 0);
        setField(term22700, term22700.getClass(), "elementData", term22701);
        setIntField(term22700, term22700.getClass(), "size", 0);
        setIntField(term22700, term22700.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PqtVXXZMqK";
        Object retValue = callMethod(klass, "getElementsByAttribute", argTypes, term3424, args);
        assertTrue(recursiveEquals(term3424, term22704));
        assertTrue(recursiveEquals(retValue, term22700));
    }

};


