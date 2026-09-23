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

public class Element_getElementById_402338892133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3700;
     Object term22105;

    public Element_getElementById_402338892133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3724 = new HashMap();
        Set<Object> term22129 =  ((Map) term3724).keySet();
        HashSet term3723 = new HashSet((Collection<? extends Object>) term22129);
        ArrayList term3732 = new ArrayList();
        ((ArrayList) term3732).add((Object)null);
        ((ArrayList) term3732).add((Object)null);
        ((ArrayList) term3732).add((Object)null);
        ((ArrayList) term3732).add((Object)null);
        ((ArrayList) term3732).add((Object)null);
        ((ArrayList) term3732).add((Object)null);
        ((ArrayList) term3732).add((Object)null);
        ((ArrayList) term3732).add((Object)null);
        LinkedHashMap term3737 = new LinkedHashMap();
        term3700 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3701 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3736 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3701, term3701.getClass(), "tagName", "ZwZIDwYcSW");
        setBooleanField(term3701, term3701.getClass(), "isBlock", false);
        setBooleanField(term3701, term3701.getClass(), "formatAsBlock", true);
        setBooleanField(term3701, term3701.getClass(), "canContainBlock", false);
        setBooleanField(term3701, term3701.getClass(), "canContainInline", false);
        setBooleanField(term3701, term3701.getClass(), "empty", true);
        setBooleanField(term3701, term3701.getClass(), "selfClosing", false);
        setBooleanField(term3701, term3701.getClass(), "preserveWhitespace", false);
        setBooleanField(term3701, term3701.getClass(), "formList", true);
        setBooleanField(term3701, term3701.getClass(), "formSubmit", true);
        setField(term3700, term3700.getClass(), "tag", term3701);
        setField(term3700, term3700.getClass(), "classNames", term3723);
        setField(term3700, term3700.getClass(), "parentNode", null);
        setField(term3700, term3700.getClass(), "childNodes", term3732);
        setField(term3736, term3736.getClass(), "attributes", term3737);
        setField(term3700, term3700.getClass(), "attributes", term3736);
        setField(term3700, term3700.getClass(), "baseUri", "orEuhCStGM");
        setIntField(term3700, term3700.getClass(), "siblingIndex", 767834723);
        HashMap term22110 = new HashMap();
        Set<Object> term22160 =  ((Map) term22110).keySet();
        HashSet term22109 = new HashSet((Collection<? extends Object>) term22160);
        ArrayList term22111 = new ArrayList();
        ((ArrayList) term22111).add((Object)null);
        ((ArrayList) term22111).add((Object)null);
        ((ArrayList) term22111).add((Object)null);
        ((ArrayList) term22111).add((Object)null);
        ((ArrayList) term22111).add((Object)null);
        ((ArrayList) term22111).add((Object)null);
        ((ArrayList) term22111).add((Object)null);
        ((ArrayList) term22111).add((Object)null);
        LinkedHashMap term22114 = new LinkedHashMap();
        term22105 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term22106 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term22113 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22106, term22106.getClass(), "tagName", "ZwZIDwYcSW");
        setBooleanField(term22106, term22106.getClass(), "isBlock", false);
        setBooleanField(term22106, term22106.getClass(), "formatAsBlock", true);
        setBooleanField(term22106, term22106.getClass(), "canContainBlock", false);
        setBooleanField(term22106, term22106.getClass(), "canContainInline", false);
        setBooleanField(term22106, term22106.getClass(), "empty", true);
        setBooleanField(term22106, term22106.getClass(), "selfClosing", false);
        setBooleanField(term22106, term22106.getClass(), "preserveWhitespace", false);
        setBooleanField(term22106, term22106.getClass(), "formList", true);
        setBooleanField(term22106, term22106.getClass(), "formSubmit", true);
        setField(term22105, term22105.getClass(), "tag", term22106);
        setField(term22105, term22105.getClass(), "classNames", term22109);
        setField(term22105, term22105.getClass(), "parentNode", null);
        setField(term22105, term22105.getClass(), "childNodes", term22111);
        setField(term22113, term22113.getClass(), "attributes", term22114);
        setField(term22105, term22105.getClass(), "attributes", term22113);
        setField(term22105, term22105.getClass(), "baseUri", "orEuhCStGM");
        setIntField(term22105, term22105.getClass(), "siblingIndex", 767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HhEaSXWvrY";
        Object retValue = callMethod(klass, "getElementById", argTypes, term3700, args);
        assertTrue(recursiveEquals(term3700, term22105));
        assertTrue(recursiveEquals(retValue, null));
    }

};


