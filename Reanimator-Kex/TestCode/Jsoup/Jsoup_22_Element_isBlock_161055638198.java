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

public class Element_isBlock_161055638198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484;
     Object term18784;

    public Element_isBlock_161055638198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term506 = new HashMap();
        Set<Object> term18806 =  ((Map) term506).keySet();
        HashSet term505 = new HashSet((Collection<? extends Object>) term18806);
        ArrayList term520 = new ArrayList();
        ((ArrayList) term520).add((Object)null);
        LinkedHashMap term525 = new LinkedHashMap();
        term484 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term485 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term524 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term485, term485.getClass(), "tagName", "aKnKipADSo");
        setBooleanField(term485, term485.getClass(), "isBlock", true);
        setBooleanField(term485, term485.getClass(), "formatAsBlock", true);
        setBooleanField(term485, term485.getClass(), "canContainBlock", false);
        setBooleanField(term485, term485.getClass(), "canContainInline", true);
        setBooleanField(term485, term485.getClass(), "empty", true);
        setBooleanField(term485, term485.getClass(), "selfClosing", true);
        setBooleanField(term485, term485.getClass(), "preserveWhitespace", false);
        setField(term484, term484.getClass(), "tag", term485);
        setField(term484, term484.getClass(), "classNames", term505);
        setField(term484, term484.getClass(), "parentNode", null);
        setField(term484, term484.getClass(), "childNodes", term520);
        setField(term524, term524.getClass(), "attributes", term525);
        setField(term484, term484.getClass(), "attributes", term524);
        setField(term484, term484.getClass(), "baseUri", "nGKItKLYNC");
        setIntField(term484, term484.getClass(), "siblingIndex", -1922583790);
        HashMap term18789 = new HashMap();
        Set<Object> term18827 =  ((Map) term18789).keySet();
        HashSet term18788 = new HashSet((Collection<? extends Object>) term18827);
        ArrayList term18790 = new ArrayList();
        ((ArrayList) term18790).add((Object)null);
        LinkedHashMap term18793 = new LinkedHashMap();
        term18784 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term18785 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18792 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18785, term18785.getClass(), "tagName", "aKnKipADSo");
        setBooleanField(term18785, term18785.getClass(), "isBlock", true);
        setBooleanField(term18785, term18785.getClass(), "formatAsBlock", true);
        setBooleanField(term18785, term18785.getClass(), "canContainBlock", false);
        setBooleanField(term18785, term18785.getClass(), "canContainInline", true);
        setBooleanField(term18785, term18785.getClass(), "empty", true);
        setBooleanField(term18785, term18785.getClass(), "selfClosing", true);
        setBooleanField(term18785, term18785.getClass(), "preserveWhitespace", false);
        setField(term18784, term18784.getClass(), "tag", term18785);
        setField(term18784, term18784.getClass(), "classNames", term18788);
        setField(term18784, term18784.getClass(), "parentNode", null);
        setField(term18784, term18784.getClass(), "childNodes", term18790);
        setField(term18792, term18792.getClass(), "attributes", term18793);
        setField(term18784, term18784.getClass(), "attributes", term18792);
        setField(term18784, term18784.getClass(), "baseUri", "nGKItKLYNC");
        setIntField(term18784, term18784.getClass(), "siblingIndex", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term484, args);
        assertTrue(recursiveEquals(term484, term18784));
    }

};


