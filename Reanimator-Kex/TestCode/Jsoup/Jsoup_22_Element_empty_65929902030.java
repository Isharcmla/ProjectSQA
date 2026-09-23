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

public class Element_empty_65929902030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2709;

    public Element_empty_65929902030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2731 = new HashMap();
        Set<Object> term2786 =  ((Map) term2731).keySet();
        HashSet term2730 = new HashSet((Collection<? extends Object>) term2786);
        ArrayList term2747 = new ArrayList();
        ((ArrayList) term2747).add((Object)null);
        ((ArrayList) term2747).add((Object)null);
        LinkedHashMap term2752 = new LinkedHashMap();
        term2709 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2710 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2751 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2710, term2710.getClass(), "tagName", "FjOiNAfBOc");
        setBooleanField(term2710, term2710.getClass(), "isBlock", true);
        setBooleanField(term2710, term2710.getClass(), "formatAsBlock", false);
        setBooleanField(term2710, term2710.getClass(), "canContainBlock", false);
        setBooleanField(term2710, term2710.getClass(), "canContainInline", true);
        setBooleanField(term2710, term2710.getClass(), "empty", false);
        setBooleanField(term2710, term2710.getClass(), "selfClosing", false);
        setBooleanField(term2710, term2710.getClass(), "preserveWhitespace", true);
        setField(term2709, term2709.getClass(), "tag", term2710);
        setField(term2709, term2709.getClass(), "classNames", term2730);
        setField(term2709, term2709.getClass(), "parentNode", null);
        setField(term2709, term2709.getClass(), "childNodes", term2747);
        setField(term2751, term2751.getClass(), "attributes", term2752);
        setField(term2709, term2709.getClass(), "attributes", term2751);
        setField(term2709, term2709.getClass(), "baseUri", "EKjQdtKxAM");
        setIntField(term2709, term2709.getClass(), "siblingIndex", -244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "empty", argTypes, term2709, args);
    }

};


