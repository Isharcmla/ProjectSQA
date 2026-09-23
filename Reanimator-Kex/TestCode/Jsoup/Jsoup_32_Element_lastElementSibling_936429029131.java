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
import java.lang.NullPointerException;
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

public class Element_lastElementSibling_936429029131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3337;

    public Element_lastElementSibling_936429029131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3359 = new HashMap();
        Set<Object> term20983 =  ((Map) term3359).keySet();
        HashSet term3358 = new HashSet((Collection<? extends Object>) term20983);
        ArrayList term3371 = new ArrayList();
        ((ArrayList) term3371).add((Object)null);
        LinkedHashMap term3376 = new LinkedHashMap();
        term3337 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3338 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3375 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3338, term3338.getClass(), "tagName", "BDIRCxAWLA");
        setBooleanField(term3338, term3338.getClass(), "isBlock", false);
        setBooleanField(term3338, term3338.getClass(), "formatAsBlock", false);
        setBooleanField(term3338, term3338.getClass(), "canContainBlock", true);
        setBooleanField(term3338, term3338.getClass(), "canContainInline", true);
        setBooleanField(term3338, term3338.getClass(), "empty", false);
        setBooleanField(term3338, term3338.getClass(), "selfClosing", true);
        setBooleanField(term3338, term3338.getClass(), "preserveWhitespace", true);
        setField(term3337, term3337.getClass(), "tag", term3338);
        setField(term3337, term3337.getClass(), "classNames", term3358);
        setField(term3337, term3337.getClass(), "parentNode", null);
        setField(term3337, term3337.getClass(), "childNodes", term3371);
        setField(term3375, term3375.getClass(), "attributes", term3376);
        setField(term3337, term3337.getClass(), "attributes", term3375);
        setField(term3337, term3337.getClass(), "baseUri", "HpZXWDPhlg");
        setIntField(term3337, term3337.getClass(), "siblingIndex", -1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lastElementSibling", argTypes, term3337, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


