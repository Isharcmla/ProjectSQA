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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_lastElementSibling_936429029100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3331;

    public Element_lastElementSibling_936429029100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3351 = new ArrayList();
        HashMap term3356 = new HashMap();
        Set<Object> term46135 =  ((Map) term3356).keySet();
        HashSet term3355 = new HashSet((Collection<? extends Object>) term46135);
        ArrayList term3366 = new ArrayList();
        ((ArrayList) term3366).add((Object)null);
        ((ArrayList) term3366).add((Object)null);
        ((ArrayList) term3366).add((Object)null);
        ((ArrayList) term3366).add((Object)null);
        ((ArrayList) term3366).add((Object)null);
        ((ArrayList) term3366).add((Object)null);
        LinkedHashMap term3371 = new LinkedHashMap();
        term3331 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3332 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3370 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3332, term3332.getClass(), "tagName", "mKaHyMybrK");
        setBooleanField(term3332, term3332.getClass(), "isBlock", false);
        setBooleanField(term3332, term3332.getClass(), "canContainBlock", false);
        setBooleanField(term3332, term3332.getClass(), "canContainInline", true);
        setBooleanField(term3332, term3332.getClass(), "optionalClosing", true);
        setBooleanField(term3332, term3332.getClass(), "empty", true);
        setBooleanField(term3332, term3332.getClass(), "preserveWhitespace", false);
        setField(term3332, term3332.getClass(), "ancestors", term3351);
        setField(term3331, term3331.getClass(), "tag", term3332);
        setField(term3331, term3331.getClass(), "classNames", term3355);
        setField(term3331, term3331.getClass(), "parentNode", null);
        setField(term3331, term3331.getClass(), "childNodes", term3366);
        setField(term3370, term3370.getClass(), "attributes", term3371);
        setField(term3331, term3331.getClass(), "attributes", term3370);
        setField(term3331, term3331.getClass(), "baseUri", "UuYWMTqWTV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lastElementSibling", argTypes, term3331, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


