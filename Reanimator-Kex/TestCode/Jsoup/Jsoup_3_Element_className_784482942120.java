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

public class Element_className_784482942120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5804;
     Object term50692;

    public Element_className_784482942120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5826 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5826, term5826.getClass(), "tagName", null);
        setBooleanField(term5826, term5826.getClass(), "isBlock", true);
        setBooleanField(term5826, term5826.getClass(), "canContainBlock", false);
        setBooleanField(term5826, term5826.getClass(), "canContainInline", true);
        setBooleanField(term5826, term5826.getClass(), "optionalClosing", true);
        setBooleanField(term5826, term5826.getClass(), "empty", true);
        setBooleanField(term5826, term5826.getClass(), "preserveWhitespace", false);
        setField(term5826, term5826.getClass(), "ancestors", null);
        Object term5833 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5833, term5833.getClass(), "tagName", null);
        setBooleanField(term5833, term5833.getClass(), "isBlock", true);
        setBooleanField(term5833, term5833.getClass(), "canContainBlock", false);
        setBooleanField(term5833, term5833.getClass(), "canContainInline", false);
        setBooleanField(term5833, term5833.getClass(), "optionalClosing", true);
        setBooleanField(term5833, term5833.getClass(), "empty", true);
        setBooleanField(term5833, term5833.getClass(), "preserveWhitespace", true);
        setField(term5833, term5833.getClass(), "ancestors", null);
        Object term5840 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5840, term5840.getClass(), "tagName", null);
        setBooleanField(term5840, term5840.getClass(), "isBlock", true);
        setBooleanField(term5840, term5840.getClass(), "canContainBlock", false);
        setBooleanField(term5840, term5840.getClass(), "canContainInline", true);
        setBooleanField(term5840, term5840.getClass(), "optionalClosing", false);
        setBooleanField(term5840, term5840.getClass(), "empty", true);
        setBooleanField(term5840, term5840.getClass(), "preserveWhitespace", false);
        setField(term5840, term5840.getClass(), "ancestors", null);
        ArrayList term5824 = new ArrayList();
        ((ArrayList) term5824).add(term5826);
        ((ArrayList) term5824).add(term5826);
        ((ArrayList) term5824).add(term5833);
        ((ArrayList) term5824).add(term5840);
        ((ArrayList) term5824).add(term5840);
        HashMap term5850 = new HashMap();
        Set<Object> term50719 =  ((Map) term5850).keySet();
        HashSet term5849 = new HashSet((Collection<? extends Object>) term50719);
        ArrayList term5855 = new ArrayList();
        ((ArrayList) term5855).add((Object)null);
        ((ArrayList) term5855).add((Object)null);
        ((ArrayList) term5855).add((Object)null);
        ((ArrayList) term5855).add((Object)null);
        LinkedHashMap term5860 = new LinkedHashMap();
        term5804 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5805 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5859 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5805, term5805.getClass(), "tagName", "YcTbglHiUq");
        setBooleanField(term5805, term5805.getClass(), "isBlock", false);
        setBooleanField(term5805, term5805.getClass(), "canContainBlock", true);
        setBooleanField(term5805, term5805.getClass(), "canContainInline", true);
        setBooleanField(term5805, term5805.getClass(), "optionalClosing", false);
        setBooleanField(term5805, term5805.getClass(), "empty", true);
        setBooleanField(term5805, term5805.getClass(), "preserveWhitespace", true);
        setField(term5805, term5805.getClass(), "ancestors", term5824);
        setField(term5804, term5804.getClass(), "tag", term5805);
        setField(term5804, term5804.getClass(), "classNames", term5849);
        setField(term5804, term5804.getClass(), "parentNode", null);
        setField(term5804, term5804.getClass(), "childNodes", term5855);
        setField(term5859, term5859.getClass(), "attributes", term5860);
        setField(term5804, term5804.getClass(), "attributes", term5859);
        setField(term5804, term5804.getClass(), "baseUri", "QjvDwgKJGz");
        Object term50698 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50698, term50698.getClass(), "tagName", null);
        setBooleanField(term50698, term50698.getClass(), "isBlock", true);
        setBooleanField(term50698, term50698.getClass(), "canContainBlock", false);
        setBooleanField(term50698, term50698.getClass(), "canContainInline", true);
        setBooleanField(term50698, term50698.getClass(), "optionalClosing", true);
        setBooleanField(term50698, term50698.getClass(), "empty", true);
        setBooleanField(term50698, term50698.getClass(), "preserveWhitespace", false);
        setField(term50698, term50698.getClass(), "ancestors", null);
        Object term50699 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50699, term50699.getClass(), "tagName", null);
        setBooleanField(term50699, term50699.getClass(), "isBlock", true);
        setBooleanField(term50699, term50699.getClass(), "canContainBlock", false);
        setBooleanField(term50699, term50699.getClass(), "canContainInline", false);
        setBooleanField(term50699, term50699.getClass(), "optionalClosing", true);
        setBooleanField(term50699, term50699.getClass(), "empty", true);
        setBooleanField(term50699, term50699.getClass(), "preserveWhitespace", true);
        setField(term50699, term50699.getClass(), "ancestors", null);
        Object term50700 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50700, term50700.getClass(), "tagName", null);
        setBooleanField(term50700, term50700.getClass(), "isBlock", true);
        setBooleanField(term50700, term50700.getClass(), "canContainBlock", false);
        setBooleanField(term50700, term50700.getClass(), "canContainInline", true);
        setBooleanField(term50700, term50700.getClass(), "optionalClosing", false);
        setBooleanField(term50700, term50700.getClass(), "empty", true);
        setBooleanField(term50700, term50700.getClass(), "preserveWhitespace", false);
        setField(term50700, term50700.getClass(), "ancestors", null);
        ArrayList term50696 = new ArrayList();
        ((ArrayList) term50696).add(term50698);
        ((ArrayList) term50696).add(term50698);
        ((ArrayList) term50696).add(term50699);
        ((ArrayList) term50696).add(term50700);
        ((ArrayList) term50696).add(term50700);
        HashMap term50702 = new HashMap();
        Set<Object> term50740 =  ((Map) term50702).keySet();
        HashSet term50701 = new HashSet((Collection<? extends Object>) term50740);
        ArrayList term50703 = new ArrayList();
        ((ArrayList) term50703).add((Object)null);
        ((ArrayList) term50703).add((Object)null);
        ((ArrayList) term50703).add((Object)null);
        ((ArrayList) term50703).add((Object)null);
        LinkedHashMap term50706 = new LinkedHashMap();
        term50692 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term50693 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term50705 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term50693, term50693.getClass(), "tagName", "YcTbglHiUq");
        setBooleanField(term50693, term50693.getClass(), "isBlock", false);
        setBooleanField(term50693, term50693.getClass(), "canContainBlock", true);
        setBooleanField(term50693, term50693.getClass(), "canContainInline", true);
        setBooleanField(term50693, term50693.getClass(), "optionalClosing", false);
        setBooleanField(term50693, term50693.getClass(), "empty", true);
        setBooleanField(term50693, term50693.getClass(), "preserveWhitespace", true);
        setField(term50693, term50693.getClass(), "ancestors", term50696);
        setField(term50692, term50692.getClass(), "tag", term50693);
        setField(term50692, term50692.getClass(), "classNames", term50701);
        setField(term50692, term50692.getClass(), "parentNode", null);
        setField(term50692, term50692.getClass(), "childNodes", term50703);
        setField(term50705, term50705.getClass(), "attributes", term50706);
        setField(term50692, term50692.getClass(), "attributes", term50705);
        setField(term50692, term50692.getClass(), "baseUri", "QjvDwgKJGz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "className", argTypes, term5804, args);
        assertTrue(recursiveEquals(term5804, term50692));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


