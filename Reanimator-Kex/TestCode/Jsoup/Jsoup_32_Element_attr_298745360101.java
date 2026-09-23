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

public class Element_attr_298745360101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;
     Object term10486;
     Object term10430;

    public Element_attr_298745360101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term682 = new HashMap();
        Set<Object> term10516 =  ((Map) term682).keySet();
        HashSet term681 = new HashSet((Collection<? extends Object>) term10516);
        ArrayList term698 = new ArrayList();
        ((ArrayList) term698).add((Object)null);
        ((ArrayList) term698).add((Object)null);
        LinkedHashMap term703 = new LinkedHashMap();
        term660 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term661 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term702 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term661, term661.getClass(), "tagName", "hoicvmsovO");
        setBooleanField(term661, term661.getClass(), "isBlock", false);
        setBooleanField(term661, term661.getClass(), "formatAsBlock", true);
        setBooleanField(term661, term661.getClass(), "canContainBlock", false);
        setBooleanField(term661, term661.getClass(), "canContainInline", false);
        setBooleanField(term661, term661.getClass(), "empty", false);
        setBooleanField(term661, term661.getClass(), "selfClosing", false);
        setBooleanField(term661, term661.getClass(), "preserveWhitespace", true);
        setField(term660, term660.getClass(), "tag", term661);
        setField(term660, term660.getClass(), "classNames", term681);
        setField(term660, term660.getClass(), "parentNode", null);
        setField(term660, term660.getClass(), "childNodes", term698);
        setField(term702, term702.getClass(), "attributes", term703);
        setField(term660, term660.getClass(), "attributes", term702);
        setField(term660, term660.getClass(), "baseUri", "IgRJUzaCwW");
        setIntField(term660, term660.getClass(), "siblingIndex", -1955890973);
        HashMap term10491 = new HashMap();
        Set<Object> term10557 =  ((Map) term10491).keySet();
        HashSet term10490 = new HashSet((Collection<? extends Object>) term10557);
        ArrayList term10492 = new ArrayList();
        ((ArrayList) term10492).add((Object)null);
        ((ArrayList) term10492).add((Object)null);
        LinkedHashMap term10495 = new LinkedHashMap();
        term10486 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10487 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10494 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10487, term10487.getClass(), "tagName", "hoicvmsovO");
        setBooleanField(term10487, term10487.getClass(), "isBlock", false);
        setBooleanField(term10487, term10487.getClass(), "formatAsBlock", true);
        setBooleanField(term10487, term10487.getClass(), "canContainBlock", false);
        setBooleanField(term10487, term10487.getClass(), "canContainInline", false);
        setBooleanField(term10487, term10487.getClass(), "empty", false);
        setBooleanField(term10487, term10487.getClass(), "selfClosing", false);
        setBooleanField(term10487, term10487.getClass(), "preserveWhitespace", true);
        setField(term10486, term10486.getClass(), "tag", term10487);
        setField(term10486, term10486.getClass(), "classNames", term10490);
        setField(term10486, term10486.getClass(), "parentNode", null);
        setField(term10486, term10486.getClass(), "childNodes", term10492);
        setField(term10494, term10494.getClass(), "attributes", term10495);
        setField(term10486, term10486.getClass(), "attributes", term10494);
        setField(term10486, term10486.getClass(), "baseUri", "IgRJUzaCwW");
        setIntField(term10486, term10486.getClass(), "siblingIndex", -1955890973);
        HashMap term10452 = new HashMap();
        Set<Object> term10598 =  ((Map) term10452).keySet();
        HashSet term10451 = new HashSet((Collection<? extends Object>) term10598);
        ArrayList term10457 = new ArrayList();
        ((ArrayList) term10457).add((Object)null);
        ((ArrayList) term10457).add((Object)null);
        LinkedHashMap term10462 = new LinkedHashMap();
        term10430 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10431 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10461 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10431, term10431.getClass(), "tagName", "hoicvmsovO");
        setBooleanField(term10431, term10431.getClass(), "isBlock", false);
        setBooleanField(term10431, term10431.getClass(), "formatAsBlock", true);
        setBooleanField(term10431, term10431.getClass(), "canContainBlock", false);
        setBooleanField(term10431, term10431.getClass(), "canContainInline", false);
        setBooleanField(term10431, term10431.getClass(), "empty", false);
        setBooleanField(term10431, term10431.getClass(), "selfClosing", false);
        setBooleanField(term10431, term10431.getClass(), "preserveWhitespace", true);
        setField(term10430, term10430.getClass(), "tag", term10431);
        setField(term10430, term10430.getClass(), "classNames", term10451);
        setField(term10430, term10430.getClass(), "parentNode", null);
        setField(term10430, term10430.getClass(), "childNodes", term10457);
        setField(term10461, term10461.getClass(), "attributes", term10462);
        setField(term10430, term10430.getClass(), "attributes", term10461);
        setField(term10430, term10430.getClass(), "baseUri", "IgRJUzaCwW");
        setIntField(term10430, term10430.getClass(), "siblingIndex", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "JUmudUmaaV";
        args[1] = "KoyGrUJeJW";
        Object retValue = callMethod(klass, "attr", argTypes, term660, args);
        assertTrue(recursiveEquals(term660, term10486));
        assertTrue(recursiveEquals(retValue, term10430));
    }

};


