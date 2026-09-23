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

public class Element_getAllElements_5458509113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4982;
     Object term49256;
     Object term49251;

    public Element_getAllElements_5458509113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5004 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5004, term5004.getClass(), "tagName", null);
        setBooleanField(term5004, term5004.getClass(), "isBlock", false);
        setBooleanField(term5004, term5004.getClass(), "canContainBlock", false);
        setBooleanField(term5004, term5004.getClass(), "canContainInline", false);
        setBooleanField(term5004, term5004.getClass(), "optionalClosing", true);
        setBooleanField(term5004, term5004.getClass(), "empty", true);
        setBooleanField(term5004, term5004.getClass(), "preserveWhitespace", true);
        setField(term5004, term5004.getClass(), "ancestors", null);
        Object term5011 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5011, term5011.getClass(), "tagName", null);
        setBooleanField(term5011, term5011.getClass(), "isBlock", true);
        setBooleanField(term5011, term5011.getClass(), "canContainBlock", false);
        setBooleanField(term5011, term5011.getClass(), "canContainInline", false);
        setBooleanField(term5011, term5011.getClass(), "optionalClosing", true);
        setBooleanField(term5011, term5011.getClass(), "empty", true);
        setBooleanField(term5011, term5011.getClass(), "preserveWhitespace", true);
        setField(term5011, term5011.getClass(), "ancestors", null);
        Object term5018 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5018, term5018.getClass(), "tagName", null);
        setBooleanField(term5018, term5018.getClass(), "isBlock", false);
        setBooleanField(term5018, term5018.getClass(), "canContainBlock", false);
        setBooleanField(term5018, term5018.getClass(), "canContainInline", false);
        setBooleanField(term5018, term5018.getClass(), "optionalClosing", true);
        setBooleanField(term5018, term5018.getClass(), "empty", true);
        setBooleanField(term5018, term5018.getClass(), "preserveWhitespace", true);
        setField(term5018, term5018.getClass(), "ancestors", null);
        Object term5025 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5025, term5025.getClass(), "tagName", null);
        setBooleanField(term5025, term5025.getClass(), "isBlock", true);
        setBooleanField(term5025, term5025.getClass(), "canContainBlock", true);
        setBooleanField(term5025, term5025.getClass(), "canContainInline", true);
        setBooleanField(term5025, term5025.getClass(), "optionalClosing", true);
        setBooleanField(term5025, term5025.getClass(), "empty", true);
        setBooleanField(term5025, term5025.getClass(), "preserveWhitespace", false);
        setField(term5025, term5025.getClass(), "ancestors", null);
        ArrayList term5002 = new ArrayList();
        ((ArrayList) term5002).add(term5004);
        ((ArrayList) term5002).add(term5004);
        ((ArrayList) term5002).add(term5011);
        ((ArrayList) term5002).add(term5018);
        ((ArrayList) term5002).add(term5025);
        HashMap term5035 = new HashMap();
        Set<Object> term49272 =  ((Map) term5035).keySet();
        HashSet term5034 = new HashSet((Collection<? extends Object>) term49272);
        ArrayList term5057 = new ArrayList();
        ((ArrayList) term5057).add((Object)null);
        ((ArrayList) term5057).add((Object)null);
        ((ArrayList) term5057).add((Object)null);
        ((ArrayList) term5057).add((Object)null);
        ((ArrayList) term5057).add((Object)null);
        ((ArrayList) term5057).add((Object)null);
        ((ArrayList) term5057).add((Object)null);
        ((ArrayList) term5057).add((Object)null);
        LinkedHashMap term5062 = new LinkedHashMap();
        term4982 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4983 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5061 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4983, term4983.getClass(), "tagName", "pDqgDbJoFw");
        setBooleanField(term4983, term4983.getClass(), "isBlock", true);
        setBooleanField(term4983, term4983.getClass(), "canContainBlock", true);
        setBooleanField(term4983, term4983.getClass(), "canContainInline", false);
        setBooleanField(term4983, term4983.getClass(), "optionalClosing", true);
        setBooleanField(term4983, term4983.getClass(), "empty", true);
        setBooleanField(term4983, term4983.getClass(), "preserveWhitespace", false);
        setField(term4983, term4983.getClass(), "ancestors", term5002);
        setField(term4982, term4982.getClass(), "tag", term4983);
        setField(term4982, term4982.getClass(), "classNames", term5034);
        setField(term4982, term4982.getClass(), "parentNode", null);
        setField(term4982, term4982.getClass(), "childNodes", term5057);
        setField(term5061, term5061.getClass(), "attributes", term5062);
        setField(term4982, term4982.getClass(), "attributes", term5061);
        setField(term4982, term4982.getClass(), "baseUri", "EBYHwsuWAU");
        HashSet term49258 = new HashSet();
        ArrayList term49259 = new ArrayList();
        ((ArrayList) term49259).add((Object)null);
        ((ArrayList) term49259).add((Object)null);
        ((ArrayList) term49259).add((Object)null);
        ((ArrayList) term49259).add((Object)null);
        ((ArrayList) term49259).add((Object)null);
        ((ArrayList) term49259).add((Object)null);
        ((ArrayList) term49259).add((Object)null);
        ((ArrayList) term49259).add((Object)null);
        term49256 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term49257 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term49260 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term49257, term49257.getClass(), "tagName", null);
        setBooleanField(term49257, term49257.getClass(), "isBlock", true);
        setBooleanField(term49257, term49257.getClass(), "canContainBlock", true);
        setBooleanField(term49257, term49257.getClass(), "canContainInline", false);
        setBooleanField(term49257, term49257.getClass(), "optionalClosing", true);
        setBooleanField(term49257, term49257.getClass(), "empty", true);
        setBooleanField(term49257, term49257.getClass(), "preserveWhitespace", false);
        setField(term49257, term49257.getClass(), "ancestors", null);
        setField(term49256, term49256.getClass(), "tag", term49257);
        setField(term49256, term49256.getClass(), "classNames", term49258);
        setField(term49256, term49256.getClass(), "parentNode", null);
        setField(term49256, term49256.getClass(), "childNodes", term49259);
        setField(term49260, term49260.getClass(), "attributes", null);
        setField(term49256, term49256.getClass(), "attributes", term49260);
        setField(term49256, term49256.getClass(), "baseUri", "");
        HashSet term49192 = new HashSet();
        ArrayList term49193 = new ArrayList();
        ((ArrayList) term49193).add((Object)null);
        ((ArrayList) term49193).add((Object)null);
        ((ArrayList) term49193).add((Object)null);
        ((ArrayList) term49193).add((Object)null);
        ((ArrayList) term49193).add((Object)null);
        ((ArrayList) term49193).add((Object)null);
        ((ArrayList) term49193).add((Object)null);
        ((ArrayList) term49193).add((Object)null);
        Object term49184 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term49185 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term49196 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term49185, term49185.getClass(), "tagName", null);
        setBooleanField(term49185, term49185.getClass(), "isBlock", true);
        setBooleanField(term49185, term49185.getClass(), "canContainBlock", true);
        setBooleanField(term49185, term49185.getClass(), "canContainInline", false);
        setBooleanField(term49185, term49185.getClass(), "optionalClosing", true);
        setBooleanField(term49185, term49185.getClass(), "empty", true);
        setBooleanField(term49185, term49185.getClass(), "preserveWhitespace", false);
        setField(term49185, term49185.getClass(), "ancestors", null);
        setField(term49184, term49184.getClass(), "tag", term49185);
        setField(term49184, term49184.getClass(), "classNames", term49192);
        setField(term49184, term49184.getClass(), "parentNode", null);
        setField(term49184, term49184.getClass(), "childNodes", term49193);
        setField(term49196, term49196.getClass(), "attributes", null);
        setField(term49184, term49184.getClass(), "attributes", term49196);
        setField(term49184, term49184.getClass(), "baseUri", "");
        ArrayList term49252 = new ArrayList();
        ((ArrayList) term49252).add(term49184);
        term49251 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term49251, term49251.getClass(), "contents", term49252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllElements", argTypes, term4982, args);
        assertTrue(recursiveEquals(term4982, term49256));
        assertTrue(recursiveEquals(retValue, term49251));
    }

};


