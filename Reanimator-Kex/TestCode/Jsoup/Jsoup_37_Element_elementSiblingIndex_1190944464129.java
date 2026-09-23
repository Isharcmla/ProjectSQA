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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Integer;

public class Element_elementSiblingIndex_1190944464129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3330;
     Object term20598;
     Object term20596;

    public Element_elementSiblingIndex_1190944464129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3354 = new HashMap();
        Set<Object> term20620 =  ((Map) term3354).keySet();
        HashSet term3353 = new HashSet((Collection<? extends Object>) term20620);
        ArrayList term3359 = new ArrayList();
        ((ArrayList) term3359).add((Object)null);
        ((ArrayList) term3359).add((Object)null);
        ((ArrayList) term3359).add((Object)null);
        ((ArrayList) term3359).add((Object)null);
        ((ArrayList) term3359).add((Object)null);
        ((ArrayList) term3359).add((Object)null);
        LinkedHashMap term3364 = new LinkedHashMap();
        term3330 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3331 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3363 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3331, term3331.getClass(), "tagName", "IoSfuKDFRe");
        setBooleanField(term3331, term3331.getClass(), "isBlock", false);
        setBooleanField(term3331, term3331.getClass(), "formatAsBlock", true);
        setBooleanField(term3331, term3331.getClass(), "canContainBlock", false);
        setBooleanField(term3331, term3331.getClass(), "canContainInline", true);
        setBooleanField(term3331, term3331.getClass(), "empty", true);
        setBooleanField(term3331, term3331.getClass(), "selfClosing", false);
        setBooleanField(term3331, term3331.getClass(), "preserveWhitespace", true);
        setBooleanField(term3331, term3331.getClass(), "formList", false);
        setBooleanField(term3331, term3331.getClass(), "formSubmit", false);
        setField(term3330, term3330.getClass(), "tag", term3331);
        setField(term3330, term3330.getClass(), "classNames", term3353);
        setField(term3330, term3330.getClass(), "parentNode", null);
        setField(term3330, term3330.getClass(), "childNodes", term3359);
        setField(term3363, term3363.getClass(), "attributes", term3364);
        setField(term3330, term3330.getClass(), "attributes", term3363);
        setField(term3330, term3330.getClass(), "baseUri", "sUEeHQTWkA");
        setIntField(term3330, term3330.getClass(), "siblingIndex", -469968304);
        HashMap term20603 = new HashMap();
        Set<Object> term20641 =  ((Map) term20603).keySet();
        HashSet term20602 = new HashSet((Collection<? extends Object>) term20641);
        ArrayList term20604 = new ArrayList();
        ((ArrayList) term20604).add((Object)null);
        ((ArrayList) term20604).add((Object)null);
        ((ArrayList) term20604).add((Object)null);
        ((ArrayList) term20604).add((Object)null);
        ((ArrayList) term20604).add((Object)null);
        ((ArrayList) term20604).add((Object)null);
        LinkedHashMap term20607 = new LinkedHashMap();
        term20598 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20599 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20606 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20599, term20599.getClass(), "tagName", "IoSfuKDFRe");
        setBooleanField(term20599, term20599.getClass(), "isBlock", false);
        setBooleanField(term20599, term20599.getClass(), "formatAsBlock", true);
        setBooleanField(term20599, term20599.getClass(), "canContainBlock", false);
        setBooleanField(term20599, term20599.getClass(), "canContainInline", true);
        setBooleanField(term20599, term20599.getClass(), "empty", true);
        setBooleanField(term20599, term20599.getClass(), "selfClosing", false);
        setBooleanField(term20599, term20599.getClass(), "preserveWhitespace", true);
        setBooleanField(term20599, term20599.getClass(), "formList", false);
        setBooleanField(term20599, term20599.getClass(), "formSubmit", false);
        setField(term20598, term20598.getClass(), "tag", term20599);
        setField(term20598, term20598.getClass(), "classNames", term20602);
        setField(term20598, term20598.getClass(), "parentNode", null);
        setField(term20598, term20598.getClass(), "childNodes", term20604);
        setField(term20606, term20606.getClass(), "attributes", term20607);
        setField(term20598, term20598.getClass(), "attributes", term20606);
        setField(term20598, term20598.getClass(), "baseUri", "sUEeHQTWkA");
        setIntField(term20598, term20598.getClass(), "siblingIndex", -469968304);
        term20596 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "elementSiblingIndex", argTypes, term3330, args);
        assertTrue(recursiveEquals(term3330, term20598));
        assertTrue(recursiveEquals(retValue, term20596));
    }

};


