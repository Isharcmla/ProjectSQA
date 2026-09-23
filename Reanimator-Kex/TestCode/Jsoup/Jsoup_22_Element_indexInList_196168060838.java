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
import java.util.LinkedList;

public class Element_indexInList_196168060838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3423;
     Object term3486;

    public Element_indexInList_196168060838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3445 = new HashMap();
        Set<Object> term3540 =  ((Map) term3445).keySet();
        HashSet term3444 = new HashSet((Collection<? extends Object>) term3540);
        ArrayList term3457 = new ArrayList();
        ((ArrayList) term3457).add((Object)null);
        LinkedHashMap term3462 = new LinkedHashMap();
        term3423 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3424 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3461 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3424, term3424.getClass(), "tagName", "BDIRCxAWLA");
        setBooleanField(term3424, term3424.getClass(), "isBlock", false);
        setBooleanField(term3424, term3424.getClass(), "formatAsBlock", false);
        setBooleanField(term3424, term3424.getClass(), "canContainBlock", true);
        setBooleanField(term3424, term3424.getClass(), "canContainInline", true);
        setBooleanField(term3424, term3424.getClass(), "empty", false);
        setBooleanField(term3424, term3424.getClass(), "selfClosing", true);
        setBooleanField(term3424, term3424.getClass(), "preserveWhitespace", true);
        setField(term3423, term3423.getClass(), "tag", term3424);
        setField(term3423, term3423.getClass(), "classNames", term3444);
        setField(term3423, term3423.getClass(), "parentNode", null);
        setField(term3423, term3423.getClass(), "childNodes", term3457);
        setField(term3461, term3461.getClass(), "attributes", term3462);
        setField(term3423, term3423.getClass(), "attributes", term3461);
        setField(term3423, term3423.getClass(), "baseUri", "HpZXWDPhlg");
        setIntField(term3423, term3423.getClass(), "siblingIndex", -469968304);
        HashMap term3500 = new HashMap();
        Set<Object> term3551 =  ((Map) term3500).keySet();
        HashSet term3499 = new HashSet((Collection<? extends Object>) term3551);
        ArrayList term3505 = new ArrayList();
        ((ArrayList) term3505).add((Object)null);
        ((ArrayList) term3505).add((Object)null);
        ((ArrayList) term3505).add((Object)null);
        LinkedHashMap term3510 = new LinkedHashMap();
        Object term3489 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3490 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3509 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3490, term3490.getClass(), "tagName", "");
        setBooleanField(term3490, term3490.getClass(), "isBlock", false);
        setBooleanField(term3490, term3490.getClass(), "formatAsBlock", false);
        setBooleanField(term3490, term3490.getClass(), "canContainBlock", false);
        setBooleanField(term3490, term3490.getClass(), "canContainInline", false);
        setBooleanField(term3490, term3490.getClass(), "empty", false);
        setBooleanField(term3490, term3490.getClass(), "selfClosing", false);
        setBooleanField(term3490, term3490.getClass(), "preserveWhitespace", false);
        setField(term3489, term3489.getClass(), "tag", term3490);
        setField(term3489, term3489.getClass(), "classNames", term3499);
        setField(term3489, term3489.getClass(), "parentNode", null);
        setField(term3489, term3489.getClass(), "childNodes", term3505);
        setField(term3509, term3509.getClass(), "attributes", term3510);
        setField(term3489, term3489.getClass(), "attributes", term3509);
        setField(term3489, term3489.getClass(), "baseUri", "NFlvfJCVPO");
        setIntField(term3489, term3489.getClass(), "siblingIndex", -1145578966);
        term3486 = new LinkedList();
        ((LinkedList) term3486).add(term3489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term3423;
        args[1] = term3486;
        callMethod(klass, "indexInList", argTypes, null, args);
    }

};


