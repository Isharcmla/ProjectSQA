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

public class Element_parents_123931108476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term982;
     Object term9453;
     Object term9387;

    public Element_parents_123931108476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1004 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1004, term1004.getClass(), "tagName", null);
        setBooleanField(term1004, term1004.getClass(), "isBlock", false);
        setBooleanField(term1004, term1004.getClass(), "canContainBlock", true);
        setBooleanField(term1004, term1004.getClass(), "canContainInline", true);
        setBooleanField(term1004, term1004.getClass(), "optionalClosing", true);
        setBooleanField(term1004, term1004.getClass(), "empty", false);
        setBooleanField(term1004, term1004.getClass(), "preserveWhitespace", false);
        setField(term1004, term1004.getClass(), "ancestors", null);
        ArrayList term1002 = new ArrayList();
        ((ArrayList) term1002).add(term1004);
        HashMap term1014 = new HashMap();
        Set<Object> term9478 =  ((Map) term1014).keySet();
        HashSet term1013 = new HashSet((Collection<? extends Object>) term9478);
        ArrayList term1034 = new ArrayList();
        LinkedHashMap term1039 = new LinkedHashMap();
        term982 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term983 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1038 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term983, term983.getClass(), "tagName", "iNwOJRBEjp");
        setBooleanField(term983, term983.getClass(), "isBlock", true);
        setBooleanField(term983, term983.getClass(), "canContainBlock", false);
        setBooleanField(term983, term983.getClass(), "canContainInline", true);
        setBooleanField(term983, term983.getClass(), "optionalClosing", false);
        setBooleanField(term983, term983.getClass(), "empty", true);
        setBooleanField(term983, term983.getClass(), "preserveWhitespace", false);
        setField(term983, term983.getClass(), "ancestors", term1002);
        setField(term982, term982.getClass(), "tag", term983);
        setField(term982, term982.getClass(), "classNames", term1013);
        setField(term982, term982.getClass(), "parentNode", null);
        setField(term982, term982.getClass(), "childNodes", term1034);
        setField(term1038, term1038.getClass(), "attributes", term1039);
        setField(term982, term982.getClass(), "attributes", term1038);
        setField(term982, term982.getClass(), "baseUri", "EYtfuJaxiM");
        Object term9459 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9459, term9459.getClass(), "tagName", null);
        setBooleanField(term9459, term9459.getClass(), "isBlock", false);
        setBooleanField(term9459, term9459.getClass(), "canContainBlock", true);
        setBooleanField(term9459, term9459.getClass(), "canContainInline", true);
        setBooleanField(term9459, term9459.getClass(), "optionalClosing", true);
        setBooleanField(term9459, term9459.getClass(), "empty", false);
        setBooleanField(term9459, term9459.getClass(), "preserveWhitespace", false);
        setField(term9459, term9459.getClass(), "ancestors", null);
        ArrayList term9457 = new ArrayList();
        ((ArrayList) term9457).add(term9459);
        HashMap term9461 = new HashMap();
        Set<Object> term9499 =  ((Map) term9461).keySet();
        HashSet term9460 = new HashSet((Collection<? extends Object>) term9499);
        ArrayList term9462 = new ArrayList();
        LinkedHashMap term9465 = new LinkedHashMap();
        term9453 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9454 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9464 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9454, term9454.getClass(), "tagName", "iNwOJRBEjp");
        setBooleanField(term9454, term9454.getClass(), "isBlock", true);
        setBooleanField(term9454, term9454.getClass(), "canContainBlock", false);
        setBooleanField(term9454, term9454.getClass(), "canContainInline", true);
        setBooleanField(term9454, term9454.getClass(), "optionalClosing", false);
        setBooleanField(term9454, term9454.getClass(), "empty", true);
        setBooleanField(term9454, term9454.getClass(), "preserveWhitespace", false);
        setField(term9454, term9454.getClass(), "ancestors", term9457);
        setField(term9453, term9453.getClass(), "tag", term9454);
        setField(term9453, term9453.getClass(), "classNames", term9460);
        setField(term9453, term9453.getClass(), "parentNode", null);
        setField(term9453, term9453.getClass(), "childNodes", term9462);
        setField(term9464, term9464.getClass(), "attributes", term9465);
        setField(term9453, term9453.getClass(), "attributes", term9464);
        setField(term9453, term9453.getClass(), "baseUri", "EYtfuJaxiM");
        ArrayList term9388 = new ArrayList();
        term9387 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term9387, term9387.getClass(), "contents", term9388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parents", argTypes, term982, args);
        assertTrue(recursiveEquals(term982, term9453));
        assertTrue(recursiveEquals(retValue, term9387));
    }

};


