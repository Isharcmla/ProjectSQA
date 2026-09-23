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

public class Element_nodeName_117995585294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;
     Object term18126;

    public Element_nodeName_117995585294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term152 = new HashMap();
        Set<Object> term18180 =  ((Map) term152).keySet();
        HashSet term151 = new HashSet((Collection<? extends Object>) term18180);
        ArrayList term166 = new ArrayList();
        ((ArrayList) term166).add((Object)null);
        ((ArrayList) term166).add((Object)null);
        ((ArrayList) term166).add((Object)null);
        ((ArrayList) term166).add((Object)null);
        LinkedHashMap term171 = new LinkedHashMap();
        term130 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term131 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term170 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term131, term131.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term131, term131.getClass(), "isBlock", false);
        setBooleanField(term131, term131.getClass(), "formatAsBlock", false);
        setBooleanField(term131, term131.getClass(), "canContainBlock", true);
        setBooleanField(term131, term131.getClass(), "canContainInline", true);
        setBooleanField(term131, term131.getClass(), "empty", false);
        setBooleanField(term131, term131.getClass(), "selfClosing", false);
        setBooleanField(term131, term131.getClass(), "preserveWhitespace", true);
        setField(term130, term130.getClass(), "tag", term131);
        setField(term130, term130.getClass(), "classNames", term151);
        setField(term130, term130.getClass(), "parentNode", null);
        setField(term130, term130.getClass(), "childNodes", term166);
        setField(term170, term170.getClass(), "attributes", term171);
        setField(term130, term130.getClass(), "attributes", term170);
        setField(term130, term130.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term130, term130.getClass(), "siblingIndex", 568599855);
        HashMap term18131 = new HashMap();
        Set<Object> term18213 =  ((Map) term18131).keySet();
        HashSet term18130 = new HashSet((Collection<? extends Object>) term18213);
        ArrayList term18132 = new ArrayList();
        ((ArrayList) term18132).add((Object)null);
        ((ArrayList) term18132).add((Object)null);
        ((ArrayList) term18132).add((Object)null);
        ((ArrayList) term18132).add((Object)null);
        LinkedHashMap term18135 = new LinkedHashMap();
        term18126 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term18127 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18134 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18127, term18127.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term18127, term18127.getClass(), "isBlock", false);
        setBooleanField(term18127, term18127.getClass(), "formatAsBlock", false);
        setBooleanField(term18127, term18127.getClass(), "canContainBlock", true);
        setBooleanField(term18127, term18127.getClass(), "canContainInline", true);
        setBooleanField(term18127, term18127.getClass(), "empty", false);
        setBooleanField(term18127, term18127.getClass(), "selfClosing", false);
        setBooleanField(term18127, term18127.getClass(), "preserveWhitespace", true);
        setField(term18126, term18126.getClass(), "tag", term18127);
        setField(term18126, term18126.getClass(), "classNames", term18130);
        setField(term18126, term18126.getClass(), "parentNode", null);
        setField(term18126, term18126.getClass(), "childNodes", term18132);
        setField(term18134, term18134.getClass(), "attributes", term18135);
        setField(term18126, term18126.getClass(), "attributes", term18134);
        setField(term18126, term18126.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term18126, term18126.getClass(), "siblingIndex", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term130, args);
        assertTrue(recursiveEquals(term130, term18126));
        assertTrue(recursiveEquals(retValue, "MjGYSRKTNF"));
    }

};


