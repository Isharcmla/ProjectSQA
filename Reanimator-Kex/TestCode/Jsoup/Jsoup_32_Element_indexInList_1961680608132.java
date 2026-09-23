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
import java.util.LinkedList;

public class Element_indexInList_1961680608132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3421;
     Object term3486;
     Object term21072;
     Object term21084;

    public Element_indexInList_1961680608132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3443 = new HashMap();
        Set<Object> term21095 =  ((Map) term3443).keySet();
        HashSet term3442 = new HashSet((Collection<? extends Object>) term21095);
        ArrayList term3457 = new ArrayList();
        ((ArrayList) term3457).add((Object)null);
        LinkedHashMap term3462 = new LinkedHashMap();
        term3421 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3422 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3461 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3422, term3422.getClass(), "tagName", "lBOokzEPfe");
        setBooleanField(term3422, term3422.getClass(), "isBlock", false);
        setBooleanField(term3422, term3422.getClass(), "formatAsBlock", false);
        setBooleanField(term3422, term3422.getClass(), "canContainBlock", false);
        setBooleanField(term3422, term3422.getClass(), "canContainInline", false);
        setBooleanField(term3422, term3422.getClass(), "empty", false);
        setBooleanField(term3422, term3422.getClass(), "selfClosing", false);
        setBooleanField(term3422, term3422.getClass(), "preserveWhitespace", false);
        setField(term3421, term3421.getClass(), "tag", term3422);
        setField(term3421, term3421.getClass(), "classNames", term3442);
        setField(term3421, term3421.getClass(), "parentNode", null);
        setField(term3421, term3421.getClass(), "childNodes", term3457);
        setField(term3461, term3461.getClass(), "attributes", term3462);
        setField(term3421, term3421.getClass(), "attributes", term3461);
        setField(term3421, term3421.getClass(), "baseUri", "NFlvfJCVPO");
        setIntField(term3421, term3421.getClass(), "siblingIndex", 679763016);
        term3486 = new LinkedList();
        HashMap term21077 = new HashMap();
        Set<Object> term21116 =  ((Map) term21077).keySet();
        HashSet term21076 = new HashSet((Collection<? extends Object>) term21116);
        ArrayList term21078 = new ArrayList();
        ((ArrayList) term21078).add((Object)null);
        LinkedHashMap term21081 = new LinkedHashMap();
        term21072 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21073 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21080 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21073, term21073.getClass(), "tagName", "lBOokzEPfe");
        setBooleanField(term21073, term21073.getClass(), "isBlock", false);
        setBooleanField(term21073, term21073.getClass(), "formatAsBlock", false);
        setBooleanField(term21073, term21073.getClass(), "canContainBlock", false);
        setBooleanField(term21073, term21073.getClass(), "canContainInline", false);
        setBooleanField(term21073, term21073.getClass(), "empty", false);
        setBooleanField(term21073, term21073.getClass(), "selfClosing", false);
        setBooleanField(term21073, term21073.getClass(), "preserveWhitespace", false);
        setField(term21072, term21072.getClass(), "tag", term21073);
        setField(term21072, term21072.getClass(), "classNames", term21076);
        setField(term21072, term21072.getClass(), "parentNode", null);
        setField(term21072, term21072.getClass(), "childNodes", term21078);
        setField(term21080, term21080.getClass(), "attributes", term21081);
        setField(term21072, term21072.getClass(), "attributes", term21080);
        setField(term21072, term21072.getClass(), "baseUri", "NFlvfJCVPO");
        setIntField(term21072, term21072.getClass(), "siblingIndex", 679763016);
        term21084 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term3421;
        args[1] = term3486;
        Object retValue = callMethod(klass, "indexInList", argTypes, null, args);
        assertTrue(recursiveEquals(term3421, term21072));
        assertTrue(recursiveEquals(term3486, term21084));
        assertTrue(recursiveEquals(retValue, null));
    }

};


