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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_getElementsByClass_1506017604103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3649;
     Object term46858;
     Object term46853;

    public Element_getElementsByClass_1506017604103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3671 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3671, term3671.getClass(), "tagName", null);
        setBooleanField(term3671, term3671.getClass(), "isBlock", true);
        setBooleanField(term3671, term3671.getClass(), "canContainBlock", true);
        setBooleanField(term3671, term3671.getClass(), "canContainInline", true);
        setBooleanField(term3671, term3671.getClass(), "optionalClosing", false);
        setBooleanField(term3671, term3671.getClass(), "empty", false);
        setBooleanField(term3671, term3671.getClass(), "preserveWhitespace", false);
        setField(term3671, term3671.getClass(), "ancestors", null);
        ArrayList term3669 = new ArrayList();
        ((ArrayList) term3669).add(term3671);
        HashMap term3681 = new HashMap();
        Set<Object> term46885 =  ((Map) term3681).keySet();
        HashSet term3680 = new HashSet((Collection<? extends Object>) term46885);
        ArrayList term3693 = new ArrayList();
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        LinkedHashMap term3698 = new LinkedHashMap();
        term3649 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3650 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3697 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3650, term3650.getClass(), "tagName", "qphdrqUtNx");
        setBooleanField(term3650, term3650.getClass(), "isBlock", false);
        setBooleanField(term3650, term3650.getClass(), "canContainBlock", false);
        setBooleanField(term3650, term3650.getClass(), "canContainInline", true);
        setBooleanField(term3650, term3650.getClass(), "optionalClosing", true);
        setBooleanField(term3650, term3650.getClass(), "empty", true);
        setBooleanField(term3650, term3650.getClass(), "preserveWhitespace", true);
        setField(term3650, term3650.getClass(), "ancestors", term3669);
        setField(term3649, term3649.getClass(), "tag", term3650);
        setField(term3649, term3649.getClass(), "classNames", term3680);
        setField(term3649, term3649.getClass(), "parentNode", null);
        setField(term3649, term3649.getClass(), "childNodes", term3693);
        setField(term3697, term3697.getClass(), "attributes", term3698);
        setField(term3649, term3649.getClass(), "attributes", term3697);
        setField(term3649, term3649.getClass(), "baseUri", "MqICFYzDJj");
        Object term46864 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46864, term46864.getClass(), "tagName", null);
        setBooleanField(term46864, term46864.getClass(), "isBlock", true);
        setBooleanField(term46864, term46864.getClass(), "canContainBlock", true);
        setBooleanField(term46864, term46864.getClass(), "canContainInline", true);
        setBooleanField(term46864, term46864.getClass(), "optionalClosing", false);
        setBooleanField(term46864, term46864.getClass(), "empty", false);
        setBooleanField(term46864, term46864.getClass(), "preserveWhitespace", false);
        setField(term46864, term46864.getClass(), "ancestors", null);
        ArrayList term46862 = new ArrayList();
        ((ArrayList) term46862).add(term46864);
        HashMap term46866 = new HashMap();
        Set<Object> term46916 =  ((Map) term46866).keySet();
        HashSet term46865 = new HashSet((Collection<? extends Object>) term46916);
        ArrayList term46867 = new ArrayList();
        ((ArrayList) term46867).add((Object)null);
        ((ArrayList) term46867).add((Object)null);
        ((ArrayList) term46867).add((Object)null);
        ((ArrayList) term46867).add((Object)null);
        ((ArrayList) term46867).add((Object)null);
        ((ArrayList) term46867).add((Object)null);
        ((ArrayList) term46867).add((Object)null);
        ((ArrayList) term46867).add((Object)null);
        ((ArrayList) term46867).add((Object)null);
        LinkedHashMap term46870 = new LinkedHashMap();
        term46858 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term46859 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term46869 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term46859, term46859.getClass(), "tagName", "qphdrqUtNx");
        setBooleanField(term46859, term46859.getClass(), "isBlock", false);
        setBooleanField(term46859, term46859.getClass(), "canContainBlock", false);
        setBooleanField(term46859, term46859.getClass(), "canContainInline", true);
        setBooleanField(term46859, term46859.getClass(), "optionalClosing", true);
        setBooleanField(term46859, term46859.getClass(), "empty", true);
        setBooleanField(term46859, term46859.getClass(), "preserveWhitespace", true);
        setField(term46859, term46859.getClass(), "ancestors", term46862);
        setField(term46858, term46858.getClass(), "tag", term46859);
        setField(term46858, term46858.getClass(), "classNames", term46865);
        setField(term46858, term46858.getClass(), "parentNode", null);
        setField(term46858, term46858.getClass(), "childNodes", term46867);
        setField(term46869, term46869.getClass(), "attributes", term46870);
        setField(term46858, term46858.getClass(), "attributes", term46869);
        setField(term46858, term46858.getClass(), "baseUri", "MqICFYzDJj");
        ArrayList term46854 = new ArrayList();
        term46853 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term46853, term46853.getClass(), "contents", term46854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YgQvdcBQKw";
        Object retValue = callMethod(klass, "getElementsByClass", argTypes, term3649, args);
        assertTrue(recursiveEquals(term3649, term46858));
        assertTrue(recursiveEquals(retValue, term46853));
    }

};


