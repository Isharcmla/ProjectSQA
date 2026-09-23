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

public class Element_getElementsByAttributeValueNot_1833376123139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4171;
     Object term24800;
     Object term24795;

    public Element_getElementsByAttributeValueNot_1833376123139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4193 = new HashMap();
        Set<Object> term24820 =  ((Map) term4193).keySet();
        HashSet term4192 = new HashSet((Collection<? extends Object>) term24820);
        ArrayList term4211 = new ArrayList();
        ((ArrayList) term4211).add((Object)null);
        ((ArrayList) term4211).add((Object)null);
        ((ArrayList) term4211).add((Object)null);
        ((ArrayList) term4211).add((Object)null);
        ((ArrayList) term4211).add((Object)null);
        ((ArrayList) term4211).add((Object)null);
        LinkedHashMap term4216 = new LinkedHashMap();
        term4171 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4172 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4215 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4172, term4172.getClass(), "tagName", "weddIktxOA");
        setBooleanField(term4172, term4172.getClass(), "isBlock", true);
        setBooleanField(term4172, term4172.getClass(), "formatAsBlock", false);
        setBooleanField(term4172, term4172.getClass(), "canContainBlock", false);
        setBooleanField(term4172, term4172.getClass(), "canContainInline", true);
        setBooleanField(term4172, term4172.getClass(), "empty", true);
        setBooleanField(term4172, term4172.getClass(), "selfClosing", false);
        setBooleanField(term4172, term4172.getClass(), "preserveWhitespace", true);
        setField(term4171, term4171.getClass(), "tag", term4172);
        setField(term4171, term4171.getClass(), "classNames", term4192);
        setField(term4171, term4171.getClass(), "parentNode", null);
        setField(term4171, term4171.getClass(), "childNodes", term4211);
        setField(term4215, term4215.getClass(), "attributes", term4216);
        setField(term4171, term4171.getClass(), "attributes", term4215);
        setField(term4171, term4171.getClass(), "baseUri", "UDlkdccCRn");
        setIntField(term4171, term4171.getClass(), "siblingIndex", -1016503459);
        HashSet term24802 = new HashSet();
        ArrayList term24803 = new ArrayList();
        ((ArrayList) term24803).add((Object)null);
        ((ArrayList) term24803).add((Object)null);
        ((ArrayList) term24803).add((Object)null);
        ((ArrayList) term24803).add((Object)null);
        ((ArrayList) term24803).add((Object)null);
        ((ArrayList) term24803).add((Object)null);
        term24800 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24801 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24804 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24801, term24801.getClass(), "tagName", null);
        setBooleanField(term24801, term24801.getClass(), "isBlock", true);
        setBooleanField(term24801, term24801.getClass(), "formatAsBlock", false);
        setBooleanField(term24801, term24801.getClass(), "canContainBlock", false);
        setBooleanField(term24801, term24801.getClass(), "canContainInline", true);
        setBooleanField(term24801, term24801.getClass(), "empty", true);
        setBooleanField(term24801, term24801.getClass(), "selfClosing", false);
        setBooleanField(term24801, term24801.getClass(), "preserveWhitespace", true);
        setField(term24800, term24800.getClass(), "tag", term24801);
        setField(term24800, term24800.getClass(), "classNames", term24802);
        setField(term24800, term24800.getClass(), "parentNode", null);
        setField(term24800, term24800.getClass(), "childNodes", term24803);
        setField(term24804, term24804.getClass(), "attributes", null);
        setField(term24800, term24800.getClass(), "attributes", term24804);
        setField(term24800, term24800.getClass(), "baseUri", "");
        setIntField(term24800, term24800.getClass(), "siblingIndex", -1016503459);
        HashSet term24448 = new HashSet();
        ArrayList term24449 = new ArrayList();
        ((ArrayList) term24449).add((Object)null);
        ((ArrayList) term24449).add((Object)null);
        ((ArrayList) term24449).add((Object)null);
        ((ArrayList) term24449).add((Object)null);
        ((ArrayList) term24449).add((Object)null);
        ((ArrayList) term24449).add((Object)null);
        Object term24439 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24440 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24452 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24440, term24440.getClass(), "tagName", null);
        setBooleanField(term24440, term24440.getClass(), "isBlock", true);
        setBooleanField(term24440, term24440.getClass(), "formatAsBlock", false);
        setBooleanField(term24440, term24440.getClass(), "canContainBlock", false);
        setBooleanField(term24440, term24440.getClass(), "canContainInline", true);
        setBooleanField(term24440, term24440.getClass(), "empty", true);
        setBooleanField(term24440, term24440.getClass(), "selfClosing", false);
        setBooleanField(term24440, term24440.getClass(), "preserveWhitespace", true);
        setField(term24439, term24439.getClass(), "tag", term24440);
        setField(term24439, term24439.getClass(), "classNames", term24448);
        setField(term24439, term24439.getClass(), "parentNode", null);
        setField(term24439, term24439.getClass(), "childNodes", term24449);
        setField(term24452, term24452.getClass(), "attributes", null);
        setField(term24439, term24439.getClass(), "attributes", term24452);
        setField(term24439, term24439.getClass(), "baseUri", "");
        setIntField(term24439, term24439.getClass(), "siblingIndex", -1016503459);
        ArrayList term24796 = new ArrayList();
        ((ArrayList) term24796).add(term24439);
        term24795 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term24795, term24795.getClass(), "contents", term24796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "McpzErOcYb";
        args[1] = "jqrVEUvYEz";
        Object retValue = callMethod(klass, "getElementsByAttributeValueNot", argTypes, term4171, args);
        assertTrue(recursiveEquals(term4171, term24800));
        assertTrue(recursiveEquals(retValue, term24795));
    }

};


