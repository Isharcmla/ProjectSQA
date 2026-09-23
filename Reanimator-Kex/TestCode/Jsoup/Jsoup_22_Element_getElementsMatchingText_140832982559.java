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

public class Element_getElementsMatchingText_140832982559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5797;

    public Element_getElementsMatchingText_140832982559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5819 = new HashMap();
        Set<Object> term5882 =  ((Map) term5819).keySet();
        HashSet term5818 = new HashSet((Collection<? extends Object>) term5882);
        ArrayList term5831 = new ArrayList();
        ((ArrayList) term5831).add((Object)null);
        ((ArrayList) term5831).add((Object)null);
        ((ArrayList) term5831).add((Object)null);
        ((ArrayList) term5831).add((Object)null);
        ((ArrayList) term5831).add((Object)null);
        ((ArrayList) term5831).add((Object)null);
        ((ArrayList) term5831).add((Object)null);
        ((ArrayList) term5831).add((Object)null);
        ((ArrayList) term5831).add((Object)null);
        LinkedHashMap term5836 = new LinkedHashMap();
        term5797 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5798 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5835 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5798, term5798.getClass(), "tagName", "EEYmuwyVDP");
        setBooleanField(term5798, term5798.getClass(), "isBlock", true);
        setBooleanField(term5798, term5798.getClass(), "formatAsBlock", true);
        setBooleanField(term5798, term5798.getClass(), "canContainBlock", false);
        setBooleanField(term5798, term5798.getClass(), "canContainInline", true);
        setBooleanField(term5798, term5798.getClass(), "empty", false);
        setBooleanField(term5798, term5798.getClass(), "selfClosing", true);
        setBooleanField(term5798, term5798.getClass(), "preserveWhitespace", true);
        setField(term5797, term5797.getClass(), "tag", term5798);
        setField(term5797, term5797.getClass(), "classNames", term5818);
        setField(term5797, term5797.getClass(), "parentNode", null);
        setField(term5797, term5797.getClass(), "childNodes", term5831);
        setField(term5835, term5835.getClass(), "attributes", term5836);
        setField(term5797, term5797.getClass(), "attributes", term5835);
        setField(term5797, term5797.getClass(), "baseUri", "awDQVEVIKi");
        setIntField(term5797, term5797.getClass(), "siblingIndex", -893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HJwNgUzZZR";
        callMethod(klass, "getElementsMatchingText", argTypes, term5797, args);
    }

};


