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

public class Element_ownText_35132743867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6483;

    public Element_ownText_35132743867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6505 = new HashMap();
        Set<Object> term6549 =  ((Map) term6505).keySet();
        HashSet term6504 = new HashSet((Collection<? extends Object>) term6549);
        ArrayList term6510 = new ArrayList();
        ((ArrayList) term6510).add((Object)null);
        LinkedHashMap term6515 = new LinkedHashMap();
        term6483 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6484 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6514 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6484, term6484.getClass(), "tagName", "YSrFKQQwXE");
        setBooleanField(term6484, term6484.getClass(), "isBlock", false);
        setBooleanField(term6484, term6484.getClass(), "formatAsBlock", false);
        setBooleanField(term6484, term6484.getClass(), "canContainBlock", false);
        setBooleanField(term6484, term6484.getClass(), "canContainInline", false);
        setBooleanField(term6484, term6484.getClass(), "empty", false);
        setBooleanField(term6484, term6484.getClass(), "selfClosing", true);
        setBooleanField(term6484, term6484.getClass(), "preserveWhitespace", false);
        setField(term6483, term6483.getClass(), "tag", term6484);
        setField(term6483, term6483.getClass(), "classNames", term6504);
        setField(term6483, term6483.getClass(), "parentNode", null);
        setField(term6483, term6483.getClass(), "childNodes", term6510);
        setField(term6514, term6514.getClass(), "attributes", term6515);
        setField(term6483, term6483.getClass(), "attributes", term6514);
        setField(term6483, term6483.getClass(), "baseUri", "EAIAAStlTz");
        setIntField(term6483, term6483.getClass(), "siblingIndex", 1598895173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ownText", argTypes, term6483, args);
    }

};


