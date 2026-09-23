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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_preserveWhitespace_1910416067116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5348;
     Object term49711;

    public Element_preserveWhitespace_1910416067116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5370 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5370, term5370.getClass(), "tagName", null);
        setBooleanField(term5370, term5370.getClass(), "isBlock", false);
        setBooleanField(term5370, term5370.getClass(), "canContainBlock", true);
        setBooleanField(term5370, term5370.getClass(), "canContainInline", false);
        setBooleanField(term5370, term5370.getClass(), "optionalClosing", false);
        setBooleanField(term5370, term5370.getClass(), "empty", true);
        setBooleanField(term5370, term5370.getClass(), "preserveWhitespace", false);
        setField(term5370, term5370.getClass(), "ancestors", null);
        Object term5377 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5377, term5377.getClass(), "tagName", null);
        setBooleanField(term5377, term5377.getClass(), "isBlock", false);
        setBooleanField(term5377, term5377.getClass(), "canContainBlock", false);
        setBooleanField(term5377, term5377.getClass(), "canContainInline", false);
        setBooleanField(term5377, term5377.getClass(), "optionalClosing", false);
        setBooleanField(term5377, term5377.getClass(), "empty", false);
        setBooleanField(term5377, term5377.getClass(), "preserveWhitespace", false);
        setField(term5377, term5377.getClass(), "ancestors", null);
        Object term5384 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5384, term5384.getClass(), "tagName", null);
        setBooleanField(term5384, term5384.getClass(), "isBlock", true);
        setBooleanField(term5384, term5384.getClass(), "canContainBlock", false);
        setBooleanField(term5384, term5384.getClass(), "canContainInline", false);
        setBooleanField(term5384, term5384.getClass(), "optionalClosing", true);
        setBooleanField(term5384, term5384.getClass(), "empty", true);
        setBooleanField(term5384, term5384.getClass(), "preserveWhitespace", true);
        setField(term5384, term5384.getClass(), "ancestors", null);
        Object term5391 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5391, term5391.getClass(), "tagName", null);
        setBooleanField(term5391, term5391.getClass(), "isBlock", false);
        setBooleanField(term5391, term5391.getClass(), "canContainBlock", true);
        setBooleanField(term5391, term5391.getClass(), "canContainInline", true);
        setBooleanField(term5391, term5391.getClass(), "optionalClosing", true);
        setBooleanField(term5391, term5391.getClass(), "empty", false);
        setBooleanField(term5391, term5391.getClass(), "preserveWhitespace", true);
        setField(term5391, term5391.getClass(), "ancestors", null);
        Object term5398 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5398, term5398.getClass(), "tagName", null);
        setBooleanField(term5398, term5398.getClass(), "isBlock", true);
        setBooleanField(term5398, term5398.getClass(), "canContainBlock", true);
        setBooleanField(term5398, term5398.getClass(), "canContainInline", false);
        setBooleanField(term5398, term5398.getClass(), "optionalClosing", false);
        setBooleanField(term5398, term5398.getClass(), "empty", true);
        setBooleanField(term5398, term5398.getClass(), "preserveWhitespace", true);
        setField(term5398, term5398.getClass(), "ancestors", null);
        ArrayList term5368 = new ArrayList();
        ((ArrayList) term5368).add(term5370);
        ((ArrayList) term5368).add(term5377);
        ((ArrayList) term5368).add(term5384);
        ((ArrayList) term5368).add(term5391);
        ((ArrayList) term5368).add(term5398);
        ((ArrayList) term5368).add(term5370);
        HashMap term5408 = new HashMap();
        Set<Object> term49741 =  ((Map) term5408).keySet();
        HashSet term5407 = new HashSet((Collection<? extends Object>) term49741);
        ArrayList term5413 = new ArrayList();
        LinkedHashMap term5418 = new LinkedHashMap();
        term5348 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5349 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5417 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5349, term5349.getClass(), "tagName", "VGiXZZTWRO");
        setBooleanField(term5349, term5349.getClass(), "isBlock", false);
        setBooleanField(term5349, term5349.getClass(), "canContainBlock", true);
        setBooleanField(term5349, term5349.getClass(), "canContainInline", true);
        setBooleanField(term5349, term5349.getClass(), "optionalClosing", true);
        setBooleanField(term5349, term5349.getClass(), "empty", false);
        setBooleanField(term5349, term5349.getClass(), "preserveWhitespace", false);
        setField(term5349, term5349.getClass(), "ancestors", term5368);
        setField(term5348, term5348.getClass(), "tag", term5349);
        setField(term5348, term5348.getClass(), "classNames", term5407);
        setField(term5348, term5348.getClass(), "parentNode", null);
        setField(term5348, term5348.getClass(), "childNodes", term5413);
        setField(term5417, term5417.getClass(), "attributes", term5418);
        setField(term5348, term5348.getClass(), "attributes", term5417);
        setField(term5348, term5348.getClass(), "baseUri", "ujxmmZZcbT");
        Object term49717 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49717, term49717.getClass(), "tagName", null);
        setBooleanField(term49717, term49717.getClass(), "isBlock", false);
        setBooleanField(term49717, term49717.getClass(), "canContainBlock", true);
        setBooleanField(term49717, term49717.getClass(), "canContainInline", false);
        setBooleanField(term49717, term49717.getClass(), "optionalClosing", false);
        setBooleanField(term49717, term49717.getClass(), "empty", true);
        setBooleanField(term49717, term49717.getClass(), "preserveWhitespace", false);
        setField(term49717, term49717.getClass(), "ancestors", null);
        Object term49718 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49718, term49718.getClass(), "tagName", null);
        setBooleanField(term49718, term49718.getClass(), "isBlock", false);
        setBooleanField(term49718, term49718.getClass(), "canContainBlock", false);
        setBooleanField(term49718, term49718.getClass(), "canContainInline", false);
        setBooleanField(term49718, term49718.getClass(), "optionalClosing", false);
        setBooleanField(term49718, term49718.getClass(), "empty", false);
        setBooleanField(term49718, term49718.getClass(), "preserveWhitespace", false);
        setField(term49718, term49718.getClass(), "ancestors", null);
        Object term49719 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49719, term49719.getClass(), "tagName", null);
        setBooleanField(term49719, term49719.getClass(), "isBlock", true);
        setBooleanField(term49719, term49719.getClass(), "canContainBlock", false);
        setBooleanField(term49719, term49719.getClass(), "canContainInline", false);
        setBooleanField(term49719, term49719.getClass(), "optionalClosing", true);
        setBooleanField(term49719, term49719.getClass(), "empty", true);
        setBooleanField(term49719, term49719.getClass(), "preserveWhitespace", true);
        setField(term49719, term49719.getClass(), "ancestors", null);
        Object term49720 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49720, term49720.getClass(), "tagName", null);
        setBooleanField(term49720, term49720.getClass(), "isBlock", false);
        setBooleanField(term49720, term49720.getClass(), "canContainBlock", true);
        setBooleanField(term49720, term49720.getClass(), "canContainInline", true);
        setBooleanField(term49720, term49720.getClass(), "optionalClosing", true);
        setBooleanField(term49720, term49720.getClass(), "empty", false);
        setBooleanField(term49720, term49720.getClass(), "preserveWhitespace", true);
        setField(term49720, term49720.getClass(), "ancestors", null);
        Object term49721 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49721, term49721.getClass(), "tagName", null);
        setBooleanField(term49721, term49721.getClass(), "isBlock", true);
        setBooleanField(term49721, term49721.getClass(), "canContainBlock", true);
        setBooleanField(term49721, term49721.getClass(), "canContainInline", false);
        setBooleanField(term49721, term49721.getClass(), "optionalClosing", false);
        setBooleanField(term49721, term49721.getClass(), "empty", true);
        setBooleanField(term49721, term49721.getClass(), "preserveWhitespace", true);
        setField(term49721, term49721.getClass(), "ancestors", null);
        ArrayList term49715 = new ArrayList();
        ((ArrayList) term49715).add(term49717);
        ((ArrayList) term49715).add(term49718);
        ((ArrayList) term49715).add(term49719);
        ((ArrayList) term49715).add(term49720);
        ((ArrayList) term49715).add(term49721);
        ((ArrayList) term49715).add(term49717);
        HashMap term49723 = new HashMap();
        Set<Object> term49762 =  ((Map) term49723).keySet();
        HashSet term49722 = new HashSet((Collection<? extends Object>) term49762);
        ArrayList term49724 = new ArrayList();
        LinkedHashMap term49727 = new LinkedHashMap();
        term49711 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term49712 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term49726 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term49712, term49712.getClass(), "tagName", "VGiXZZTWRO");
        setBooleanField(term49712, term49712.getClass(), "isBlock", false);
        setBooleanField(term49712, term49712.getClass(), "canContainBlock", true);
        setBooleanField(term49712, term49712.getClass(), "canContainInline", true);
        setBooleanField(term49712, term49712.getClass(), "optionalClosing", true);
        setBooleanField(term49712, term49712.getClass(), "empty", false);
        setBooleanField(term49712, term49712.getClass(), "preserveWhitespace", false);
        setField(term49712, term49712.getClass(), "ancestors", term49715);
        setField(term49711, term49711.getClass(), "tag", term49712);
        setField(term49711, term49711.getClass(), "classNames", term49722);
        setField(term49711, term49711.getClass(), "parentNode", null);
        setField(term49711, term49711.getClass(), "childNodes", term49724);
        setField(term49726, term49726.getClass(), "attributes", term49727);
        setField(term49711, term49711.getClass(), "attributes", term49726);
        setField(term49711, term49711.getClass(), "baseUri", "ujxmmZZcbT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "preserveWhitespace", argTypes, term5348, args);
        assertTrue(recursiveEquals(term5348, term49711));
        assertTrue(recursiveEquals(retValue, false));
    }

};


