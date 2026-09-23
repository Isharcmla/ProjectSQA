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

public class Element_elementSiblingIndex_119094446436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3260;

    public Element_elementSiblingIndex_119094446436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3282 = new HashMap();
        Set<Object> term3335 =  ((Map) term3282).keySet();
        HashSet term3281 = new HashSet((Collection<? extends Object>) term3335);
        ArrayList term3296 = new ArrayList();
        ((ArrayList) term3296).add((Object)null);
        LinkedHashMap term3301 = new LinkedHashMap();
        term3260 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3261 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3300 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3261, term3261.getClass(), "tagName", "dAldIGYAXV");
        setBooleanField(term3261, term3261.getClass(), "isBlock", false);
        setBooleanField(term3261, term3261.getClass(), "formatAsBlock", false);
        setBooleanField(term3261, term3261.getClass(), "canContainBlock", true);
        setBooleanField(term3261, term3261.getClass(), "canContainInline", true);
        setBooleanField(term3261, term3261.getClass(), "empty", true);
        setBooleanField(term3261, term3261.getClass(), "selfClosing", false);
        setBooleanField(term3261, term3261.getClass(), "preserveWhitespace", true);
        setField(term3260, term3260.getClass(), "tag", term3261);
        setField(term3260, term3260.getClass(), "classNames", term3281);
        setField(term3260, term3260.getClass(), "parentNode", null);
        setField(term3260, term3260.getClass(), "childNodes", term3296);
        setField(term3300, term3300.getClass(), "attributes", term3301);
        setField(term3260, term3260.getClass(), "attributes", term3300);
        setField(term3260, term3260.getClass(), "baseUri", "GNEmuHPNcU");
        setIntField(term3260, term3260.getClass(), "siblingIndex", -1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "elementSiblingIndex", argTypes, term3260, args);
    }

};


