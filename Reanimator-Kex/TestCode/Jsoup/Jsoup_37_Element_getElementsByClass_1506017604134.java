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

public class Element_getElementsByClass_1506017604134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3804;
     Object term22619;
     Object term22614;

    public Element_getElementsByClass_1506017604134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3828 = new HashMap();
        Set<Object> term22644 =  ((Map) term3828).keySet();
        HashSet term3827 = new HashSet((Collection<? extends Object>) term22644);
        ArrayList term3836 = new ArrayList();
        ((ArrayList) term3836).add((Object)null);
        ((ArrayList) term3836).add((Object)null);
        LinkedHashMap term3841 = new LinkedHashMap();
        term3804 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3805 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3840 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3805, term3805.getClass(), "tagName", "CVRGEomOth");
        setBooleanField(term3805, term3805.getClass(), "isBlock", true);
        setBooleanField(term3805, term3805.getClass(), "formatAsBlock", false);
        setBooleanField(term3805, term3805.getClass(), "canContainBlock", true);
        setBooleanField(term3805, term3805.getClass(), "canContainInline", true);
        setBooleanField(term3805, term3805.getClass(), "empty", true);
        setBooleanField(term3805, term3805.getClass(), "selfClosing", false);
        setBooleanField(term3805, term3805.getClass(), "preserveWhitespace", false);
        setBooleanField(term3805, term3805.getClass(), "formList", true);
        setBooleanField(term3805, term3805.getClass(), "formSubmit", false);
        setField(term3804, term3804.getClass(), "tag", term3805);
        setField(term3804, term3804.getClass(), "classNames", term3827);
        setField(term3804, term3804.getClass(), "parentNode", null);
        setField(term3804, term3804.getClass(), "childNodes", term3836);
        setField(term3840, term3840.getClass(), "attributes", term3841);
        setField(term3804, term3804.getClass(), "attributes", term3840);
        setField(term3804, term3804.getClass(), "baseUri", "GsWxOwXvSu");
        setIntField(term3804, term3804.getClass(), "siblingIndex", -602026508);
        HashMap term22624 = new HashMap();
        Set<Object> term22675 =  ((Map) term22624).keySet();
        HashSet term22623 = new HashSet((Collection<? extends Object>) term22675);
        ArrayList term22626 = new ArrayList();
        ((ArrayList) term22626).add((Object)null);
        ((ArrayList) term22626).add((Object)null);
        LinkedHashMap term22629 = new LinkedHashMap();
        term22619 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term22620 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term22628 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22620, term22620.getClass(), "tagName", "CVRGEomOth");
        setBooleanField(term22620, term22620.getClass(), "isBlock", true);
        setBooleanField(term22620, term22620.getClass(), "formatAsBlock", false);
        setBooleanField(term22620, term22620.getClass(), "canContainBlock", true);
        setBooleanField(term22620, term22620.getClass(), "canContainInline", true);
        setBooleanField(term22620, term22620.getClass(), "empty", true);
        setBooleanField(term22620, term22620.getClass(), "selfClosing", false);
        setBooleanField(term22620, term22620.getClass(), "preserveWhitespace", false);
        setBooleanField(term22620, term22620.getClass(), "formList", true);
        setBooleanField(term22620, term22620.getClass(), "formSubmit", false);
        setField(term22619, term22619.getClass(), "tag", term22620);
        setField(term22619, term22619.getClass(), "classNames", term22623);
        setField(term22619, term22619.getClass(), "parentNode", null);
        setField(term22619, term22619.getClass(), "childNodes", term22626);
        setField(term22628, term22628.getClass(), "attributes", term22629);
        setField(term22619, term22619.getClass(), "attributes", term22628);
        setField(term22619, term22619.getClass(), "baseUri", "GsWxOwXvSu");
        setIntField(term22619, term22619.getClass(), "siblingIndex", -602026508);
        ArrayList term22615 = new ArrayList();
        term22614 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term22614, term22614.getClass(), "contents", term22615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bKBSncrMEZ";
        Object retValue = callMethod(klass, "getElementsByClass", argTypes, term3804, args);
        assertTrue(recursiveEquals(term3804, term22619));
        assertTrue(recursiveEquals(retValue, term22614));
    }

};


