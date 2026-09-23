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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsByAttribute_599263456136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3826;
     Object term23102;
     Object term23097;

    public Element_getElementsByAttribute_599263456136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3848 = new HashMap();
        Set<Object> term23126 =  ((Map) term3848).keySet();
        HashSet term3847 = new HashSet((Collection<? extends Object>) term23126);
        ArrayList term3862 = new ArrayList();
        ((ArrayList) term3862).add((Object)null);
        ((ArrayList) term3862).add((Object)null);
        ((ArrayList) term3862).add((Object)null);
        ((ArrayList) term3862).add((Object)null);
        ((ArrayList) term3862).add((Object)null);
        ((ArrayList) term3862).add((Object)null);
        ((ArrayList) term3862).add((Object)null);
        ((ArrayList) term3862).add((Object)null);
        ((ArrayList) term3862).add((Object)null);
        LinkedHashMap term3867 = new LinkedHashMap();
        term3826 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3827 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3866 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3827, term3827.getClass(), "tagName", "yeSXGqQExb");
        setBooleanField(term3827, term3827.getClass(), "isBlock", true);
        setBooleanField(term3827, term3827.getClass(), "formatAsBlock", true);
        setBooleanField(term3827, term3827.getClass(), "canContainBlock", true);
        setBooleanField(term3827, term3827.getClass(), "canContainInline", false);
        setBooleanField(term3827, term3827.getClass(), "empty", true);
        setBooleanField(term3827, term3827.getClass(), "selfClosing", false);
        setBooleanField(term3827, term3827.getClass(), "preserveWhitespace", false);
        setField(term3826, term3826.getClass(), "tag", term3827);
        setField(term3826, term3826.getClass(), "classNames", term3847);
        setField(term3826, term3826.getClass(), "parentNode", null);
        setField(term3826, term3826.getClass(), "childNodes", term3862);
        setField(term3866, term3866.getClass(), "attributes", term3867);
        setField(term3826, term3826.getClass(), "attributes", term3866);
        setField(term3826, term3826.getClass(), "baseUri", "EusenEbIoF");
        setIntField(term3826, term3826.getClass(), "siblingIndex", -157887805);
        HashMap term23107 = new HashMap();
        Set<Object> term23157 =  ((Map) term23107).keySet();
        HashSet term23106 = new HashSet((Collection<? extends Object>) term23157);
        ArrayList term23108 = new ArrayList();
        ((ArrayList) term23108).add((Object)null);
        ((ArrayList) term23108).add((Object)null);
        ((ArrayList) term23108).add((Object)null);
        ((ArrayList) term23108).add((Object)null);
        ((ArrayList) term23108).add((Object)null);
        ((ArrayList) term23108).add((Object)null);
        ((ArrayList) term23108).add((Object)null);
        ((ArrayList) term23108).add((Object)null);
        ((ArrayList) term23108).add((Object)null);
        LinkedHashMap term23111 = new LinkedHashMap();
        term23102 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term23103 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term23110 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term23103, term23103.getClass(), "tagName", "yeSXGqQExb");
        setBooleanField(term23103, term23103.getClass(), "isBlock", true);
        setBooleanField(term23103, term23103.getClass(), "formatAsBlock", true);
        setBooleanField(term23103, term23103.getClass(), "canContainBlock", true);
        setBooleanField(term23103, term23103.getClass(), "canContainInline", false);
        setBooleanField(term23103, term23103.getClass(), "empty", true);
        setBooleanField(term23103, term23103.getClass(), "selfClosing", false);
        setBooleanField(term23103, term23103.getClass(), "preserveWhitespace", false);
        setField(term23102, term23102.getClass(), "tag", term23103);
        setField(term23102, term23102.getClass(), "classNames", term23106);
        setField(term23102, term23102.getClass(), "parentNode", null);
        setField(term23102, term23102.getClass(), "childNodes", term23108);
        setField(term23110, term23110.getClass(), "attributes", term23111);
        setField(term23102, term23102.getClass(), "attributes", term23110);
        setField(term23102, term23102.getClass(), "baseUri", "EusenEbIoF");
        setIntField(term23102, term23102.getClass(), "siblingIndex", -157887805);
        ArrayList term23098 = new ArrayList();
        term23097 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term23097, term23097.getClass(), "contents", term23098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SScVQYSvWH";
        Object retValue = callMethod(klass, "getElementsByAttribute", argTypes, term3826, args);
        assertTrue(recursiveEquals(term3826, term23102));
        assertTrue(recursiveEquals(retValue, term23097));
    }

};


