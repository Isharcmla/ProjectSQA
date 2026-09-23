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

public class Element_getElementsByTag_957731678133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3510;
     Object term21584;
     Object term21579;

    public Element_getElementsByTag_957731678133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3532 = new HashMap();
        Set<Object> term21608 =  ((Map) term3532).keySet();
        HashSet term3531 = new HashSet((Collection<? extends Object>) term21608);
        ArrayList term3550 = new ArrayList();
        ((ArrayList) term3550).add((Object)null);
        ((ArrayList) term3550).add((Object)null);
        ((ArrayList) term3550).add((Object)null);
        ((ArrayList) term3550).add((Object)null);
        ((ArrayList) term3550).add((Object)null);
        ((ArrayList) term3550).add((Object)null);
        ((ArrayList) term3550).add((Object)null);
        ((ArrayList) term3550).add((Object)null);
        LinkedHashMap term3555 = new LinkedHashMap();
        term3510 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3511 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3554 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3511, term3511.getClass(), "tagName", "KarbTXFmUU");
        setBooleanField(term3511, term3511.getClass(), "isBlock", true);
        setBooleanField(term3511, term3511.getClass(), "formatAsBlock", true);
        setBooleanField(term3511, term3511.getClass(), "canContainBlock", false);
        setBooleanField(term3511, term3511.getClass(), "canContainInline", true);
        setBooleanField(term3511, term3511.getClass(), "empty", true);
        setBooleanField(term3511, term3511.getClass(), "selfClosing", true);
        setBooleanField(term3511, term3511.getClass(), "preserveWhitespace", true);
        setField(term3510, term3510.getClass(), "tag", term3511);
        setField(term3510, term3510.getClass(), "classNames", term3531);
        setField(term3510, term3510.getClass(), "parentNode", null);
        setField(term3510, term3510.getClass(), "childNodes", term3550);
        setField(term3554, term3554.getClass(), "attributes", term3555);
        setField(term3510, term3510.getClass(), "attributes", term3554);
        setField(term3510, term3510.getClass(), "baseUri", "OUeBWNTQDh");
        setIntField(term3510, term3510.getClass(), "siblingIndex", 1962444399);
        HashMap term21589 = new HashMap();
        Set<Object> term21639 =  ((Map) term21589).keySet();
        HashSet term21588 = new HashSet((Collection<? extends Object>) term21639);
        ArrayList term21590 = new ArrayList();
        ((ArrayList) term21590).add((Object)null);
        ((ArrayList) term21590).add((Object)null);
        ((ArrayList) term21590).add((Object)null);
        ((ArrayList) term21590).add((Object)null);
        ((ArrayList) term21590).add((Object)null);
        ((ArrayList) term21590).add((Object)null);
        ((ArrayList) term21590).add((Object)null);
        ((ArrayList) term21590).add((Object)null);
        LinkedHashMap term21593 = new LinkedHashMap();
        term21584 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21585 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21592 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21585, term21585.getClass(), "tagName", "KarbTXFmUU");
        setBooleanField(term21585, term21585.getClass(), "isBlock", true);
        setBooleanField(term21585, term21585.getClass(), "formatAsBlock", true);
        setBooleanField(term21585, term21585.getClass(), "canContainBlock", false);
        setBooleanField(term21585, term21585.getClass(), "canContainInline", true);
        setBooleanField(term21585, term21585.getClass(), "empty", true);
        setBooleanField(term21585, term21585.getClass(), "selfClosing", true);
        setBooleanField(term21585, term21585.getClass(), "preserveWhitespace", true);
        setField(term21584, term21584.getClass(), "tag", term21585);
        setField(term21584, term21584.getClass(), "classNames", term21588);
        setField(term21584, term21584.getClass(), "parentNode", null);
        setField(term21584, term21584.getClass(), "childNodes", term21590);
        setField(term21592, term21592.getClass(), "attributes", term21593);
        setField(term21584, term21584.getClass(), "attributes", term21592);
        setField(term21584, term21584.getClass(), "baseUri", "OUeBWNTQDh");
        setIntField(term21584, term21584.getClass(), "siblingIndex", 1962444399);
        ArrayList term21580 = new ArrayList();
        term21579 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term21579, term21579.getClass(), "contents", term21580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gltJarNuUk";
        Object retValue = callMethod(klass, "getElementsByTag", argTypes, term3510, args);
        assertTrue(recursiveEquals(term3510, term21584));
        assertTrue(recursiveEquals(retValue, term21579));
    }

};


