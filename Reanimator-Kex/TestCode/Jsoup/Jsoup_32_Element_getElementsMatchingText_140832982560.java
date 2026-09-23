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
     Object term5745;

    public Element_getElementsMatchingText_140832982560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5767 = new HashMap();
        Set<Object> term5830 =  ((Map) term5767).keySet();
        HashSet term5766 = new HashSet((Collection<? extends Object>) term5830);
        ArrayList term5779 = new ArrayList();
        ((ArrayList) term5779).add((Object)null);
        ((ArrayList) term5779).add((Object)null);
        ((ArrayList) term5779).add((Object)null);
        ((ArrayList) term5779).add((Object)null);
        ((ArrayList) term5779).add((Object)null);
        ((ArrayList) term5779).add((Object)null);
        ((ArrayList) term5779).add((Object)null);
        ((ArrayList) term5779).add((Object)null);
        ((ArrayList) term5779).add((Object)null);
        LinkedHashMap term5784 = new LinkedHashMap();
        term5745 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5746 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5783 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5746, term5746.getClass(), "tagName", "EEYmuwyVDP");
        setBooleanField(term5746, term5746.getClass(), "isBlock", true);
        setBooleanField(term5746, term5746.getClass(), "formatAsBlock", true);
        setBooleanField(term5746, term5746.getClass(), "canContainBlock", false);
        setBooleanField(term5746, term5746.getClass(), "canContainInline", true);
        setBooleanField(term5746, term5746.getClass(), "empty", false);
        setBooleanField(term5746, term5746.getClass(), "selfClosing", true);
        setBooleanField(term5746, term5746.getClass(), "preserveWhitespace", true);
        setField(term5745, term5745.getClass(), "tag", term5746);
        setField(term5745, term5745.getClass(), "classNames", term5766);
        setField(term5745, term5745.getClass(), "parentNode", null);
        setField(term5745, term5745.getClass(), "childNodes", term5779);
        setField(term5783, term5783.getClass(), "attributes", term5784);
        setField(term5745, term5745.getClass(), "attributes", term5783);
        setField(term5745, term5745.getClass(), "baseUri", "awDQVEVIKi");
        setIntField(term5745, term5745.getClass(), "siblingIndex", -1963434938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HJwNgUzZZR";
        callMethod(klass, "getElementsMatchingText", argTypes, term5745, args);
    }

};


