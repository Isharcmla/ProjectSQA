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

public class Element_getElementsMatchingText_140832982560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5857;

    public Element_getElementsMatchingText_140832982560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5881 = new HashMap();
        Set<Object> term5944 =  ((Map) term5881).keySet();
        HashSet term5880 = new HashSet((Collection<? extends Object>) term5944);
        ArrayList term5893 = new ArrayList();
        ((ArrayList) term5893).add((Object)null);
        ((ArrayList) term5893).add((Object)null);
        ((ArrayList) term5893).add((Object)null);
        ((ArrayList) term5893).add((Object)null);
        ((ArrayList) term5893).add((Object)null);
        ((ArrayList) term5893).add((Object)null);
        ((ArrayList) term5893).add((Object)null);
        ((ArrayList) term5893).add((Object)null);
        ((ArrayList) term5893).add((Object)null);
        LinkedHashMap term5898 = new LinkedHashMap();
        term5857 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5858 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5897 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5858, term5858.getClass(), "tagName", "EEYmuwyVDP");
        setBooleanField(term5858, term5858.getClass(), "isBlock", false);
        setBooleanField(term5858, term5858.getClass(), "formatAsBlock", false);
        setBooleanField(term5858, term5858.getClass(), "canContainBlock", false);
        setBooleanField(term5858, term5858.getClass(), "canContainInline", false);
        setBooleanField(term5858, term5858.getClass(), "empty", true);
        setBooleanField(term5858, term5858.getClass(), "selfClosing", false);
        setBooleanField(term5858, term5858.getClass(), "preserveWhitespace", false);
        setBooleanField(term5858, term5858.getClass(), "formList", true);
        setBooleanField(term5858, term5858.getClass(), "formSubmit", true);
        setField(term5857, term5857.getClass(), "tag", term5858);
        setField(term5857, term5857.getClass(), "classNames", term5880);
        setField(term5857, term5857.getClass(), "parentNode", null);
        setField(term5857, term5857.getClass(), "childNodes", term5893);
        setField(term5897, term5897.getClass(), "attributes", term5898);
        setField(term5857, term5857.getClass(), "attributes", term5897);
        setField(term5857, term5857.getClass(), "baseUri", "awDQVEVIKi");
        setIntField(term5857, term5857.getClass(), "siblingIndex", -1963434938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HJwNgUzZZR";
        callMethod(klass, "getElementsMatchingText", argTypes, term5857, args);
    }

};


