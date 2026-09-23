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

public class Element_select_2024628612110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1409;
     Object term12986;
     Object term12981;

    public Element_select_2024628612110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1431 = new HashMap();
        Set<Object> term13010 =  ((Map) term1431).keySet();
        HashSet term1430 = new HashSet((Collection<? extends Object>) term13010);
        ArrayList term1445 = new ArrayList();
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        LinkedHashMap term1450 = new LinkedHashMap();
        term1409 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1410 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1449 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1410, term1410.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term1410, term1410.getClass(), "isBlock", false);
        setBooleanField(term1410, term1410.getClass(), "formatAsBlock", false);
        setBooleanField(term1410, term1410.getClass(), "canContainBlock", false);
        setBooleanField(term1410, term1410.getClass(), "canContainInline", false);
        setBooleanField(term1410, term1410.getClass(), "empty", false);
        setBooleanField(term1410, term1410.getClass(), "selfClosing", false);
        setBooleanField(term1410, term1410.getClass(), "preserveWhitespace", false);
        setField(term1409, term1409.getClass(), "tag", term1410);
        setField(term1409, term1409.getClass(), "classNames", term1430);
        setField(term1409, term1409.getClass(), "parentNode", null);
        setField(term1409, term1409.getClass(), "childNodes", term1445);
        setField(term1449, term1449.getClass(), "attributes", term1450);
        setField(term1409, term1409.getClass(), "attributes", term1449);
        setField(term1409, term1409.getClass(), "baseUri", "DbiCVtPPCT");
        setIntField(term1409, term1409.getClass(), "siblingIndex", -1685132342);
        HashMap term12991 = new HashMap();
        Set<Object> term13041 =  ((Map) term12991).keySet();
        HashSet term12990 = new HashSet((Collection<? extends Object>) term13041);
        ArrayList term12992 = new ArrayList();
        ((ArrayList) term12992).add((Object)null);
        ((ArrayList) term12992).add((Object)null);
        ((ArrayList) term12992).add((Object)null);
        ((ArrayList) term12992).add((Object)null);
        ((ArrayList) term12992).add((Object)null);
        ((ArrayList) term12992).add((Object)null);
        LinkedHashMap term12995 = new LinkedHashMap();
        term12986 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term12987 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term12994 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term12987, term12987.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term12987, term12987.getClass(), "isBlock", false);
        setBooleanField(term12987, term12987.getClass(), "formatAsBlock", false);
        setBooleanField(term12987, term12987.getClass(), "canContainBlock", false);
        setBooleanField(term12987, term12987.getClass(), "canContainInline", false);
        setBooleanField(term12987, term12987.getClass(), "empty", false);
        setBooleanField(term12987, term12987.getClass(), "selfClosing", false);
        setBooleanField(term12987, term12987.getClass(), "preserveWhitespace", false);
        setField(term12986, term12986.getClass(), "tag", term12987);
        setField(term12986, term12986.getClass(), "classNames", term12990);
        setField(term12986, term12986.getClass(), "parentNode", null);
        setField(term12986, term12986.getClass(), "childNodes", term12992);
        setField(term12994, term12994.getClass(), "attributes", term12995);
        setField(term12986, term12986.getClass(), "attributes", term12994);
        setField(term12986, term12986.getClass(), "baseUri", "DbiCVtPPCT");
        setIntField(term12986, term12986.getClass(), "siblingIndex", -1685132342);
        ArrayList term12982 = new ArrayList();
        term12981 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term12981, term12981.getClass(), "contents", term12982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzFopsaDuG";
        Object retValue = callMethod(klass, "select", argTypes, term1409, args);
        assertTrue(recursiveEquals(term1409, term12986));
        assertTrue(recursiveEquals(retValue, term12981));
    }

};


