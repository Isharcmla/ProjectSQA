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

public class Element_getElementsByAttributeValueNot_1833376123138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4259;
     Object term24884;
     Object term24879;

    public Element_getElementsByAttributeValueNot_1833376123138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4283 = new HashMap();
        Set<Object> term24904 =  ((Map) term4283).keySet();
        HashSet term4282 = new HashSet((Collection<? extends Object>) term24904);
        ArrayList term4301 = new ArrayList();
        ((ArrayList) term4301).add((Object)null);
        ((ArrayList) term4301).add((Object)null);
        ((ArrayList) term4301).add((Object)null);
        ((ArrayList) term4301).add((Object)null);
        ((ArrayList) term4301).add((Object)null);
        ((ArrayList) term4301).add((Object)null);
        LinkedHashMap term4306 = new LinkedHashMap();
        term4259 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4260 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4305 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4260, term4260.getClass(), "tagName", "weddIktxOA");
        setBooleanField(term4260, term4260.getClass(), "isBlock", false);
        setBooleanField(term4260, term4260.getClass(), "formatAsBlock", true);
        setBooleanField(term4260, term4260.getClass(), "canContainBlock", false);
        setBooleanField(term4260, term4260.getClass(), "canContainInline", true);
        setBooleanField(term4260, term4260.getClass(), "empty", true);
        setBooleanField(term4260, term4260.getClass(), "selfClosing", false);
        setBooleanField(term4260, term4260.getClass(), "preserveWhitespace", false);
        setBooleanField(term4260, term4260.getClass(), "formList", true);
        setBooleanField(term4260, term4260.getClass(), "formSubmit", false);
        setField(term4259, term4259.getClass(), "tag", term4260);
        setField(term4259, term4259.getClass(), "classNames", term4282);
        setField(term4259, term4259.getClass(), "parentNode", null);
        setField(term4259, term4259.getClass(), "childNodes", term4301);
        setField(term4305, term4305.getClass(), "attributes", term4306);
        setField(term4259, term4259.getClass(), "attributes", term4305);
        setField(term4259, term4259.getClass(), "baseUri", "UDlkdccCRn");
        setIntField(term4259, term4259.getClass(), "siblingIndex", -1016503459);
        HashSet term24886 = new HashSet();
        ArrayList term24887 = new ArrayList();
        ((ArrayList) term24887).add((Object)null);
        ((ArrayList) term24887).add((Object)null);
        ((ArrayList) term24887).add((Object)null);
        ((ArrayList) term24887).add((Object)null);
        ((ArrayList) term24887).add((Object)null);
        ((ArrayList) term24887).add((Object)null);
        term24884 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24885 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24888 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24885, term24885.getClass(), "tagName", null);
        setBooleanField(term24885, term24885.getClass(), "isBlock", false);
        setBooleanField(term24885, term24885.getClass(), "formatAsBlock", true);
        setBooleanField(term24885, term24885.getClass(), "canContainBlock", false);
        setBooleanField(term24885, term24885.getClass(), "canContainInline", true);
        setBooleanField(term24885, term24885.getClass(), "empty", true);
        setBooleanField(term24885, term24885.getClass(), "selfClosing", false);
        setBooleanField(term24885, term24885.getClass(), "preserveWhitespace", false);
        setBooleanField(term24885, term24885.getClass(), "formList", true);
        setBooleanField(term24885, term24885.getClass(), "formSubmit", false);
        setField(term24884, term24884.getClass(), "tag", term24885);
        setField(term24884, term24884.getClass(), "classNames", term24886);
        setField(term24884, term24884.getClass(), "parentNode", null);
        setField(term24884, term24884.getClass(), "childNodes", term24887);
        setField(term24888, term24888.getClass(), "attributes", null);
        setField(term24884, term24884.getClass(), "attributes", term24888);
        setField(term24884, term24884.getClass(), "baseUri", "");
        setIntField(term24884, term24884.getClass(), "siblingIndex", -1016503459);
        HashSet term24522 = new HashSet();
        ArrayList term24523 = new ArrayList();
        ((ArrayList) term24523).add((Object)null);
        ((ArrayList) term24523).add((Object)null);
        ((ArrayList) term24523).add((Object)null);
        ((ArrayList) term24523).add((Object)null);
        ((ArrayList) term24523).add((Object)null);
        ((ArrayList) term24523).add((Object)null);
        Object term24511 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24512 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24526 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24512, term24512.getClass(), "tagName", null);
        setBooleanField(term24512, term24512.getClass(), "isBlock", false);
        setBooleanField(term24512, term24512.getClass(), "formatAsBlock", true);
        setBooleanField(term24512, term24512.getClass(), "canContainBlock", false);
        setBooleanField(term24512, term24512.getClass(), "canContainInline", true);
        setBooleanField(term24512, term24512.getClass(), "empty", true);
        setBooleanField(term24512, term24512.getClass(), "selfClosing", false);
        setBooleanField(term24512, term24512.getClass(), "preserveWhitespace", false);
        setBooleanField(term24512, term24512.getClass(), "formList", true);
        setBooleanField(term24512, term24512.getClass(), "formSubmit", false);
        setField(term24511, term24511.getClass(), "tag", term24512);
        setField(term24511, term24511.getClass(), "classNames", term24522);
        setField(term24511, term24511.getClass(), "parentNode", null);
        setField(term24511, term24511.getClass(), "childNodes", term24523);
        setField(term24526, term24526.getClass(), "attributes", null);
        setField(term24511, term24511.getClass(), "attributes", term24526);
        setField(term24511, term24511.getClass(), "baseUri", "");
        setIntField(term24511, term24511.getClass(), "siblingIndex", -1016503459);
        ArrayList term24880 = new ArrayList();
        ((ArrayList) term24880).add(term24511);
        term24879 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term24879, term24879.getClass(), "contents", term24880);
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
        Object retValue = callMethod(klass, "getElementsByAttributeValueNot", argTypes, term4259, args);
        assertTrue(recursiveEquals(term4259, term24884));
        assertTrue(recursiveEquals(retValue, term24879));
    }

};


