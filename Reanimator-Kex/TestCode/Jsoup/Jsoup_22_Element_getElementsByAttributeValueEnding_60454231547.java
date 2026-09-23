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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsByAttributeValueEnding_60454231547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4491;

    public Element_getElementsByAttributeValueEnding_60454231547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4513 = new HashMap();
        Set<Object> term4588 =  ((Map) term4513).keySet();
        HashSet term4512 = new HashSet((Collection<? extends Object>) term4588);
        ArrayList term4525 = new ArrayList();
        ((ArrayList) term4525).add((Object)null);
        ((ArrayList) term4525).add((Object)null);
        ((ArrayList) term4525).add((Object)null);
        ((ArrayList) term4525).add((Object)null);
        ((ArrayList) term4525).add((Object)null);
        ((ArrayList) term4525).add((Object)null);
        ((ArrayList) term4525).add((Object)null);
        LinkedHashMap term4530 = new LinkedHashMap();
        term4491 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4492 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4529 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4492, term4492.getClass(), "tagName", "fVdTcjgHdw");
        setBooleanField(term4492, term4492.getClass(), "isBlock", true);
        setBooleanField(term4492, term4492.getClass(), "formatAsBlock", true);
        setBooleanField(term4492, term4492.getClass(), "canContainBlock", false);
        setBooleanField(term4492, term4492.getClass(), "canContainInline", true);
        setBooleanField(term4492, term4492.getClass(), "empty", false);
        setBooleanField(term4492, term4492.getClass(), "selfClosing", false);
        setBooleanField(term4492, term4492.getClass(), "preserveWhitespace", false);
        setField(term4491, term4491.getClass(), "tag", term4492);
        setField(term4491, term4491.getClass(), "classNames", term4512);
        setField(term4491, term4491.getClass(), "parentNode", null);
        setField(term4491, term4491.getClass(), "childNodes", term4525);
        setField(term4529, term4529.getClass(), "attributes", term4530);
        setField(term4491, term4491.getClass(), "attributes", term4529);
        setField(term4491, term4491.getClass(), "baseUri", "bwlLFAfNWx");
        setIntField(term4491, term4491.getClass(), "siblingIndex", -1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "JWodNQzjjV";
        args[1] = "CAgxWjhxNf";
        callMethod(klass, "getElementsByAttributeValueEnding", argTypes, term4491, args);
    }

};


