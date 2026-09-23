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

public class Element_getElementsByIndexGreaterThan_364627238146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5138;
     Object term5201;
     Object term28996;
     Object term28991;

    public Element_getElementsByIndexGreaterThan_364627238146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5160 = new HashMap();
        Set<Object> term29018 =  ((Map) term5160).keySet();
        HashSet term5159 = new HashSet((Collection<? extends Object>) term29018);
        ArrayList term5172 = new ArrayList();
        ((ArrayList) term5172).add((Object)null);
        ((ArrayList) term5172).add((Object)null);
        ((ArrayList) term5172).add((Object)null);
        ((ArrayList) term5172).add((Object)null);
        ((ArrayList) term5172).add((Object)null);
        ((ArrayList) term5172).add((Object)null);
        LinkedHashMap term5177 = new LinkedHashMap();
        term5138 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5139 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5176 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5139, term5139.getClass(), "tagName", "sEphiduvkv");
        setBooleanField(term5139, term5139.getClass(), "isBlock", false);
        setBooleanField(term5139, term5139.getClass(), "formatAsBlock", false);
        setBooleanField(term5139, term5139.getClass(), "canContainBlock", true);
        setBooleanField(term5139, term5139.getClass(), "canContainInline", true);
        setBooleanField(term5139, term5139.getClass(), "empty", true);
        setBooleanField(term5139, term5139.getClass(), "selfClosing", false);
        setBooleanField(term5139, term5139.getClass(), "preserveWhitespace", true);
        setField(term5138, term5138.getClass(), "tag", term5139);
        setField(term5138, term5138.getClass(), "classNames", term5159);
        setField(term5138, term5138.getClass(), "parentNode", null);
        setField(term5138, term5138.getClass(), "childNodes", term5172);
        setField(term5176, term5176.getClass(), "attributes", term5177);
        setField(term5138, term5138.getClass(), "attributes", term5176);
        setField(term5138, term5138.getClass(), "baseUri", "bEmHScVZaQ");
        setIntField(term5138, term5138.getClass(), "siblingIndex", -2027534003);
        term5201 = new Integer(1063420942);
        HashMap term29001 = new HashMap();
        Set<Object> term29039 =  ((Map) term29001).keySet();
        HashSet term29000 = new HashSet((Collection<? extends Object>) term29039);
        ArrayList term29002 = new ArrayList();
        ((ArrayList) term29002).add((Object)null);
        ((ArrayList) term29002).add((Object)null);
        ((ArrayList) term29002).add((Object)null);
        ((ArrayList) term29002).add((Object)null);
        ((ArrayList) term29002).add((Object)null);
        ((ArrayList) term29002).add((Object)null);
        LinkedHashMap term29005 = new LinkedHashMap();
        term28996 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28997 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term29004 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28997, term28997.getClass(), "tagName", "sEphiduvkv");
        setBooleanField(term28997, term28997.getClass(), "isBlock", false);
        setBooleanField(term28997, term28997.getClass(), "formatAsBlock", false);
        setBooleanField(term28997, term28997.getClass(), "canContainBlock", true);
        setBooleanField(term28997, term28997.getClass(), "canContainInline", true);
        setBooleanField(term28997, term28997.getClass(), "empty", true);
        setBooleanField(term28997, term28997.getClass(), "selfClosing", false);
        setBooleanField(term28997, term28997.getClass(), "preserveWhitespace", true);
        setField(term28996, term28996.getClass(), "tag", term28997);
        setField(term28996, term28996.getClass(), "classNames", term29000);
        setField(term28996, term28996.getClass(), "parentNode", null);
        setField(term28996, term28996.getClass(), "childNodes", term29002);
        setField(term29004, term29004.getClass(), "attributes", term29005);
        setField(term28996, term28996.getClass(), "attributes", term29004);
        setField(term28996, term28996.getClass(), "baseUri", "bEmHScVZaQ");
        setIntField(term28996, term28996.getClass(), "siblingIndex", -2027534003);
        ArrayList term28992 = new ArrayList();
        term28991 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term28991, term28991.getClass(), "contents", term28992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5201;
        Object retValue = callMethod(klass, "getElementsByIndexGreaterThan", argTypes, term5138, args);
        assertTrue(recursiveEquals(term5138, term28996));
        assertTrue(recursiveEquals(term5201, 1063420942));
        assertTrue(recursiveEquals(retValue, term28991));
    }

};


